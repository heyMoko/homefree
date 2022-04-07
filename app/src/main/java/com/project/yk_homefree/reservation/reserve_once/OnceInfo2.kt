package com.project.yk_homefree.reservation.reserve_once

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivityOnceInfo2Binding

class OnceInfo2 : AppCompatActivity() {
    private var mbinding: ActivityOnceInfo2Binding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityOnceInfo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}