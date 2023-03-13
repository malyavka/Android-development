package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginScreenBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login_screen,
            container,
            false
        )
        binding.loginButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        binding.signupButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        return binding.root
    }
}
