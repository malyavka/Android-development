package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.WelcomeScreenLayoutBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding: WelcomeScreenLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Inflate layout
        binding = WelcomeScreenLayoutBinding.inflate(inflater)

        binding.welcomeButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }
        return binding.root
    }
}
