package com.project.yk_homefree.login

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.project.yk_homefree.MainActivity
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivityLoginBinding
import com.project.yk_homefree.fragments.HomeFragment

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private var mbinding: ActivityLoginBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.signinButton.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }

        initLoginButton()
        initEmailAndPasswordEditText()

    }

    private fun initLoginButton() {

        binding.loginButton.setOnClickListener {

            val email = binding.idEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "로그인에 실패했습니다. 이메일 또는 비밀번호를 확인해주세요", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
        }
    }

    private fun initEmailAndPasswordEditText() {
        val emailEditText = binding.idEditText
        val passwordEditText = binding.passwordEditText

        emailEditText.addTextChangedListener {
            val enable = emailEditText.text.isNotEmpty()  && passwordEditText.text.isNotEmpty()
            binding.loginButton.isEnabled = enable
        }

        passwordEditText.addTextChangedListener {
            val enable = emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()
            binding.loginButton.isEnabled = enable
        }
    }
}