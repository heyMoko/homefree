package com.project.yk_homefree.signin_expert

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivitySigninExpert3Binding
import com.project.yk_homefree.login.LoginActivity

class SigninExpertActivity3 : AppCompatActivity() {

    private var mBinding: ActivitySigninExpert3Binding? = null
    private val binding get() = mBinding!!

    companion object {
        const val IMAGE_REQUEST_CODE = 1001
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivitySigninExpert3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val spannableString = SpannableString("정리수납 전문가 자격증을\n업로드해 주세요!")
        val boldspan = StyleSpan(Typeface.BOLD)

        spannableString.setSpan(boldspan, 0, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.signinExpert3Tv.text = spannableString
        binding.photoImageView.setOnClickListener {
            pickImageGallery()
        }

        binding.signinExpert3NextBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
            binding.photoImageView.setImageURI(data?.data)
        }
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}