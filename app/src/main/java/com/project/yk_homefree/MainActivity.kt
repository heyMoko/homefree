package com.project.yk_homefree

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.firebase.auth.FirebaseAuth
import com.project.yk_homefree.databinding.ActivityMainBinding
import com.project.yk_homefree.databinding.ActivitySigninExpert3Binding
import com.project.yk_homefree.login.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_once_info)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        if (auth.currentUser == null) {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // navigation host 가져오기
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment

        // navigation controller
        val navController = navHostFragment.navController

        // 바텀 네비게이션 뷰와 네비게이션을 묶어준다.
        NavigationUI.setupWithNavController(mBinding.myBottomNav, navController)


    }

}