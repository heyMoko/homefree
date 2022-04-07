package com.project.yk_homefree.signin_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivitySigninExpert1Binding
import com.project.yk_homefree.databinding.ActivitySigninUser1Binding
import com.project.yk_homefree.signin_expert.SigninExpertActivity2

class SigninUserActivity1 : AppCompatActivity() {
    private var binding: ActivitySigninUser1Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninUser1Binding.inflate(layoutInflater)
        setContentView(binding!!.root)

        checking()
        nextBtnAction()

    }

    private fun checkedChange(compoundButton: CompoundButton) {
        when(compoundButton.id) {

            R.id.agree_button_total -> {
                if (binding?.agreeButtonTotal?.isChecked == true) {
                    binding!!.check1.isChecked = true
                    binding!!.check2.isChecked = true
                    binding!!.check3.isChecked = true
                    binding!!.check4.isChecked = true
                    binding!!.check5.isChecked = true
                    binding!!.check6.isChecked = true
                } else {
                    binding!!.check1.isChecked = false
                    binding!!.check2.isChecked = false
                    binding!!.check3.isChecked = false
                    binding!!.check4.isChecked = false
                    binding!!.check5.isChecked = false
                    binding!!.check6.isChecked = false
                }
            }
            else -> {
                binding?.agreeButtonTotal?.isChecked = (
                        binding?.check1?.isChecked == true
                                && binding?.check2?.isChecked == true
                                && binding?.check3?.isChecked == true
                                && binding?.check4?.isChecked == true
                                && binding?.check5?.isChecked == true
                                && binding?.check6?.isChecked == true
                        )

            }

        }
    }

    private fun checking() {
        binding?.agreeButtonTotal?.setOnClickListener { checkedChange(binding!!.agreeButtonTotal) }
        binding?.check1?.setOnClickListener { checkedChange(binding!!.check1) }
        binding?.check2?.setOnClickListener { checkedChange(binding!!.check2) }
        binding?.check3?.setOnClickListener { checkedChange(binding!!.check3) }
        binding?.check4?.setOnClickListener { checkedChange(binding!!.check4) }
        binding?.check5?.setOnClickListener { checkedChange(binding!!.check5) }
        binding?.check6?.setOnClickListener { checkedChange(binding!!.check6) }

        if (binding?.check1?.isChecked == true && binding?.check2?.isChecked == true && binding?.check3?.isChecked == true) {
            binding?.signinUser1NextBtn?.isClickable = true
        } else {
            return
        }
    }

    private fun nextBtnAction() {
        binding?.signinUser1NextBtn?.setOnClickListener {
            if (binding?.check1?.isChecked == true && binding?.check2?.isChecked == true && binding?.check3?.isChecked == true) {
                val intent = Intent(this, SigninUserActivity2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "약관 동의를 진행해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
