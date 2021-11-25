package com.skai7ami.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.skai7ami.fragments.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater, container, false)

        binding.btnBack.setOnClickListener {
            fragmentManager!!.popBackStack()
        }

        return binding.root
    }
}