package com.project.yk_homefree.reservation.reserve_once

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivityOnceInfoBinding

class OnceInfo : AppCompatActivity() {
    private var mbinding: ActivityOnceInfoBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityOnceInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        nextBtnEvent()
    }

    private fun nextBtnEvent() {
        binding.nextBtn.setOnClickListener {
            if (binding.petYes.isChecked || binding.petNo.isChecked) {
                val intent = Intent(this, OnceInfo2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "필수항목을 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
}