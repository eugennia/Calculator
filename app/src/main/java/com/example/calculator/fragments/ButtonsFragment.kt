package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.R
import com.example.calculator.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater)
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener {

        }

        binding.btnMinus.setOnClickListener {

        }

        binding.btnMultiply.setOnClickListener {

        }

        binding.btnDivide.setOnClickListener {

        }

        binding.btnDelete.setOnClickListener {

        }

        binding.btnDot.setOnClickListener {

        }
    }
}