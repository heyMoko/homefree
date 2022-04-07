package com.project.yk_homefree.reservation.reserve_regularly

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivityReserveChoiceBinding
import com.project.yk_homefree.databinding.ActivityReserveRegularlyBinding

class ReserveRegularly : AppCompatActivity() {

    private var mbinding: ActivityReserveRegularlyBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityReserveRegularlyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonEvent()

    }

    private fun buttonEvent() {
        binding.timeBtn1.setOnClickListener {
            if(binding.oneWeek.isChecked || binding.twoWeek.isChecked || binding.month.isChecked) {
                binding.timeBtn1.setBackgroundResource(R.drawable.loginbutton_design)
                binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
                binding.nextBtn.isEnabled = true
            }
        }
        binding.timeBtn2.setOnClickListener {
            if(binding.oneWeek.isChecked || binding.twoWeek.isChecked || binding.month.isChecked) {
                binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn2.setBackgroundResource(R.drawable.loginbutton_design)
                binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
                binding.nextBtn.isEnabled = true
            }
        }
        binding.timeBtn3.setOnClickListener {
            if(binding.oneWeek.isChecked || binding.twoWeek.isChecked || binding.month.isChecked) {
                binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn3.setBackgroundResource(R.drawable.loginbutton_design)
                binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
                binding.nextBtn.isEnabled = true
            }
        }
        binding.timeBtn4.setOnClickListener {
            if(binding.oneWeek.isChecked || binding.twoWeek.isChecked || binding.month.isChecked) {
                binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn4.setBackgroundResource(R.drawable.loginbutton_design)
                binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
                binding.nextBtn.isEnabled = true
            }
        }
        binding.timeBtn5.setOnClickListener {
            if(binding.oneWeek.isChecked || binding.twoWeek.isChecked || binding.month.isChecked) {
                binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn5.setBackgroundResource(R.drawable.loginbutton_design)
                binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
                binding.nextBtn.isEnabled = true
            }
        }
        binding.timeBtn6.setOnClickListener {
            if(binding.oneWeek.isChecked || binding.twoWeek.isChecked || binding.month.isChecked) {
                binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
                binding.timeBtn6.setBackgroundResource(R.drawable.loginbutton_design)
                binding.nextBtn.isEnabled = true

            }
        }
    }
}
