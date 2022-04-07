package com.project.yk_homefree.reservation.reserve_once

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivityReserveChoiceBinding
import com.project.yk_homefree.databinding.ActivityReserveOnceBinding

class ReserveOnce : AppCompatActivity() {

    private var mbinding: ActivityReserveOnceBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityReserveOnceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonEvent()
        nextBtnEvent()
    }

    private fun calendarEvent() {
        binding.onceCalendar.date
    }

    private fun nextBtnEvent() {
        binding.nextBtn.setOnClickListener {
            val intent = Intent(this, OnceInfo::class.java)
            startActivity(intent)

        }
    }

    private fun buttonEvent() {
        binding.timeBtn1.setOnClickListener {
            binding.timeBtn1.setBackgroundResource(R.drawable.loginbutton_design)
            binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
            binding.nextBtn.isEnabled = true
        }
        binding.timeBtn2.setOnClickListener {
            binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn2.setBackgroundResource(R.drawable.loginbutton_design)
            binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
            binding.nextBtn.isEnabled = true
        }
        binding.timeBtn3.setOnClickListener {
            binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn3.setBackgroundResource(R.drawable.loginbutton_design)
            binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
            binding.nextBtn.isEnabled = true
        }
        binding.timeBtn4.setOnClickListener {
            binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn4.setBackgroundResource(R.drawable.loginbutton_design)
            binding.timeBtn5.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
            binding.nextBtn.isEnabled = true
        }
        binding.timeBtn5.setOnClickListener {
            binding.timeBtn1.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn2.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn3.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn4.setBackgroundResource(R.drawable.master_user_button_design)
            binding.timeBtn5.setBackgroundResource(R.drawable.loginbutton_design)
            binding.timeBtn6.setBackgroundResource(R.drawable.master_user_button_design)
            binding.nextBtn.isEnabled = true
        }
        binding.timeBtn6.setOnClickListener {
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
