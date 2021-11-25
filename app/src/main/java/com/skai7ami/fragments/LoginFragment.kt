package com.skai7ami.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.skai7ami.fragments.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener {
            Toast.makeText(view!!.context, "Logado", Toast.LENGTH_SHORT).show()
        }

        binding.btnSignup.setOnClickListener {
            val fragmentTransaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayoutContainer, SignupFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        return binding.root
    }


}