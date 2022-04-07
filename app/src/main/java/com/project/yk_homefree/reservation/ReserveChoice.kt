package com.project.yk_homefree.reservation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.yk_homefree.databinding.ActivityReserveChoiceBinding
import com.project.yk_homefree.reservation.reserve_once.ReserveOnce
import com.project.yk_homefree.reservation.reserve_regularly.ReserveRegularly

class ReserveChoice : AppCompatActivity() {

    private var mbinding: ActivityReserveChoiceBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityReserveChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.onceClick.setOnClickListener {
            val intent = Intent(this, ReserveOnce::class.java)
            startActivity(intent)
        }

        binding.regularlyClick.setOnClickListener {
            val intent = Intent(this, ReserveRegularly::class.java)
            startActivity(intent)
        }
    }
}