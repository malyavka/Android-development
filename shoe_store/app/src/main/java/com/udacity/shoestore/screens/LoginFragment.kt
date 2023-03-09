package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.LoginScreenLayoutBinding

class LoginFragment : Fragment() {

    private lateinit var binding: LoginScreenLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginScreenLayoutBinding.inflate(layoutInflater)

        binding.loginButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_loginFragment_to_welcomeFragment)
        }
        return binding.root
    }
}
