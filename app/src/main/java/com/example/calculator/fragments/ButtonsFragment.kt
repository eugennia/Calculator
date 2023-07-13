package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.R
import com.example.calculator.callbacks.OnButtonsFragmentClicked
import com.example.calculator.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding
    private var result: Double? = null

    private var onButtonsFragmentClick: OnButtonsFragmentClicked? = null

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
        numbersListener()
    }

    fun numbersListener() {
        with(binding) {
            btn0.setOnClickListener {
                btn0.text = result?.toString() + "0"
                onButtonsFragmentClick?.onButtonFragmentClicked()
            }

            btn1.setOnClickListener {
                btn1.text = result?.toString() + "1"
                onButtonsFragmentClick?.onButtonFragmentClicked()
            }

            btn2.setOnClickListener {
                btn2.text = result?.toString() + "2"
                onButtonsFragmentClick?.onButtonFragmentClicked()
            }

            btn3.setOnClickListener {
                btn3.text = result?.toString() + "3"
                onButtonsFragmentClick?.onButtonFragmentClicked()
            }

            btn4.setOnClickListener {
                btn4.text = result?.toString() + "4"
                onButtonsFragmentClick?.onButtonFragmentClicked()

            }

            btn5.setOnClickListener {
                btn5.text = result?.toString() + "5"
                onButtonsFragmentClick?.onButtonFragmentClicked()
            }
        }
    }

    fun operationsListener() {
        binding.btnPlus.setOnClickListener {
            add(1.0, 2.0)
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

    private fun add(number1: Double, number2: Double) {

    }
}