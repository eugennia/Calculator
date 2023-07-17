package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.callbacks.OnButtonsFragmentClicked
import com.example.calculator.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private var fragmentButtonsBinding: FragmentButtonsBinding? = null
    private var result = StringBuilder()

    var onButtonsFragmentClick: OnButtonsFragmentClicked? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentButtonsBinding.inflate(inflater, container, false)
        fragmentButtonsBinding = binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        numbersListener()
        operationsListener()
    }

    private fun numbersListener() {
        with(fragmentButtonsBinding) {
            this?.btn0?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(0))
            }

            this?.btn1?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(1))
            }

            this?.btn2?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(2))
            }

            this?.btn3?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(3))
            }

            this?.btn4?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(4))
            }

            this?.btn5?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(5))
            }

            this?.btn6?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(6))
            }

            this?.btn7?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(7))
            }

            this?.btn8?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(8))
            }

            this?.btn9?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(9))
            }
        }
    }

    private fun operationsListener() {
        with(fragmentButtonsBinding) {
            this?.btnPlus?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append("+"))
            }

            this?.btnMinus?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append("-"))
            }

            this?.btnMultiply?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append("×"))

            }

            this?.btnDivide?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append("÷"))
            }

            this?.btnDelete?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.delete(0, result.length))
            }

            this?.btnDot?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append("."))
            }
        }
    }

    private fun add(number1: Double, number2: Double) {

    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentButtonsBinding = null
    }
}