package com.project.yk_homefree.reservation.reserve_regularly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.ActivityOnceInfo2Binding
import com.project.yk_homefree.databinding.ActivityRegularlyInfoBinding

class RegularlyInfo : AppCompatActivity() {
    private var mbinding: ActivityRegularlyInfoBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mbinding = ActivityRegularlyInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}