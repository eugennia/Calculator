package com.example.calculator.activities

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.calculator.R
import com.example.calculator.fragments.ButtonsFragment
import com.example.calculator.fragments.ResultFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO fix
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val fragmentResult = ResultFragment()
        val fragmentButtons = ButtonsFragment()

        fragmentButtons.onButtonsFragmentClick = fragmentResult
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.result, fragmentResult).commit()
        fragmentManager.beginTransaction().replace(R.id.buttons, fragmentButtons).commit()
    }
}