package com.project.yk_homefree.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivitySigninBinding
import com.project.yk_homefree.signin_expert.SigninExpertActivity1

class SigninActivity : AppCompatActivity() {

    private var binding: ActivitySigninBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding?.expertButton?.setOnClickListener {
            val intent = Intent(this, SigninExpertActivity1::class.java)
            startActivity(intent)
        }
    }
}