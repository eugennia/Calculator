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
    private var userInput = StringBuilder()
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
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(0))
            }

            this?.btn1?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(1))
            }

            this?.btn2?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(2))
            }

            this?.btn3?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(3))
            }

            this?.btn4?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(4))
            }

            this?.btn5?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(5))
            }

            this?.btn6?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(6))
            }

            this?.btn7?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(7))
            }

            this?.btn8?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(8))
            }

            this?.btn9?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append(9))
            }
        }
    }

    private fun operationsListener() {
        with(fragmentButtonsBinding) {
            this?.btnPlus?.setOnClickListener {
                if (isLastInputNumber())
                    onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append("+"))
                var calculation = userInput.split("+")
                var calculationResult = calculation[0].toDouble() + calculation[1].toDouble()
                onButtonsFragmentClick?.onButtonFragmentClicked(result.append(calculationResult.toString()))
            }

            this?.btnMinus?.setOnClickListener {
                if (isLastInputNumber())
                    onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append("-"))
            }

            this?.btnMultiply?.setOnClickListener {
                if (isLastInputNumber())
                    onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append("×"))
            }

            this?.btnDivide?.setOnClickListener {
                if (isLastInputNumber())
                    onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append("÷"))
            }

            this?.btnDelete?.setOnClickListener {
                onButtonsFragmentClick?.onButtonFragmentClicked(userInput.delete(0, userInput.length))
            }

            this?.btnDot?.setOnClickListener {
                if (isLastInputNumber())
                    onButtonsFragmentClick?.onButtonFragmentClicked(userInput.append("."))
            }
        }
    }

    private fun add(number1: Double, number2: Double) {

    }

    private fun isLastInputNumber(): Boolean {
        if (
            userInput.last().toString() != "+" &&
            userInput.last().toString() != "-" &&
            userInput.last().toString() != "×" &&
            userInput.last().toString() != "÷" &&
            userInput.last().toString() != "."
        ) {
            return true
        }
        return false
    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentButtonsBinding = null
    }
}