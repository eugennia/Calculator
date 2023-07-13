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
    private var result: Double? = null

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
            }

            btn1.setOnClickListener {
                btn1.text = result?.toString() + "1"
            }

            btn2.setOnClickListener {
                btn2.text = result?.toString() + "2"
            }

            btn3.setOnClickListener {
                btn3.text = result?.toString() + "3"
            }

            btn4.setOnClickListener {
                btn4.text = result?.toString() + "4"
            }

            btn5.setOnClickListener {
                btn5.text = result?.toString() + "1"
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