package com.project.yk_homefree.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.yk_homefree.adapter.ReservelistAdapter
import com.project.yk_homefree.databinding.FragmentHomeBinding
import com.project.yk_homefree.databinding.FragmentReservelistBinding

class ReserveListFragment: Fragment() {

    private var mBinding: FragmentReservelistBinding? = null
    private lateinit var reservelistAdapter: ReservelistAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentReservelistBinding.inflate(inflater, container, false)
        mBinding = binding

        reservelistAdapter = ReservelistAdapter()

        binding.reserveListRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.reserveListRecyclerView.adapter = reservelistAdapter

        return mBinding?.root

    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }

}