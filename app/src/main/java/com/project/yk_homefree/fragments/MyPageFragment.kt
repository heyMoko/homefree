package com.project.yk_homefree.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.project.yk_homefree.MainActivity
import com.project.yk_homefree.databinding.FragmentHomeBinding
import com.project.yk_homefree.databinding.FragmentMypageBinding

class MyPageFragment: Fragment() {

    private var mBinding: FragmentMypageBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentMypageBinding.inflate(inflater, container, false)
        mBinding = binding

        binding.signOutBtn.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return mBinding?.root


    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }

}