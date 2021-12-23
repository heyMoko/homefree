package com.project.yk_homefree.fragments

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.yk_homefree.R
import com.project.yk_homefree.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {

    private var mBinding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        mBinding = binding

        val spannableString = SpannableString("안전한 청소업체\n홈프리를 만나보세요.")

        val redColor = ForegroundColorSpan(Color.parseColor("#152A76"))

        val boldspan = StyleSpan(Typeface.BOLD)

        spannableString.setSpan(redColor, 9, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(boldspan, 4, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.mainhomeTextView.text = spannableString

        return mBinding?.root

    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }
}