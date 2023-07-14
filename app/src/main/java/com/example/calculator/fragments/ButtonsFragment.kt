package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.callbacks.OnButtonsFragmentClicked
import com.example.calculator.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding
    private var result = StringBuilder()

    var onButtonsFragmentClick: OnButtonsFragmentClicked? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        numbersListener()
        operationsListener()
    }

    private fun numbersListener() {
        with(binding) {
            btn0.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(0))
            }

            btn1.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(1))
            }

            btn2.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(2))
            }

            btn3.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(3))
            }

            btn4.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(4))

            }

            btn5.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(5))
            }

            btn6.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(6))
            }

            btn7.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(7))
            }

            btn8.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(8))
            }

            btn9.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(9))
            }
        }
    }

    private fun operationsListener() {
        with(binding) {
            btnPlus.setOnClickListener {

            }

            btnMinus.setOnClickListener {

            }

            btnMultiply.setOnClickListener {

            }

            btnDivide.setOnClickListener {

            }

            btnDelete.setOnClickListener {

            }

            btnDot.setOnClickListener {

            }
        }
    }

    private fun add(number1: Double, number2: Double) {

    }
}