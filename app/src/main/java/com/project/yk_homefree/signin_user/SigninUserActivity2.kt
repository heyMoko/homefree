package com.project.yk_homefree.signin_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivitySigninUser2Binding
import com.project.yk_homefree.login.LoginActivity

class SigninUserActivity2 : AppCompatActivity() {

    private var mbinding: ActivitySigninUser2Binding? = null
    private val binding get() = mbinding!!
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivitySigninUser2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        signin()
        initEmailAndPasswordEditText()

    }

    private fun signin() {

        binding.signinUser2SigninBtn.setOnClickListener {

            val email = binding.idEdittext.text.toString()
            val password = binding.pwEdittext.text.toString()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "회원가입에 실패했습니다. 입력하신 정보를 다시 확인해주세요", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
        }
    }

    private fun initEmailAndPasswordEditText() {
        val emailEditText = binding.idEdittext
        val passwordEditText = binding.pwEdittext
        val checkEditText = binding.pwckEdittext
        val nameEditText = binding.nameEdittext
        val phoneEditText = binding.phoneEdittext
        val authEditText = binding.authEdittext
        val birthEditText = binding.birthEdittext
        val boy = binding.boy
        val girl = binding.girl

        emailEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }

        passwordEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }

        checkEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }

        nameEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }

        phoneEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }

        authEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }

        birthEditText.addTextChangedListener {
            val enable =
                emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty() && checkEditText.text.isNotEmpty() && nameEditText.text.isNotEmpty()
                        && phoneEditText.text.isNotEmpty() && authEditText.text.isNotEmpty() && birthEditText.text.isNotEmpty()
            binding.signinUser2SigninBtn.isEnabled = enable
        }


    }

}