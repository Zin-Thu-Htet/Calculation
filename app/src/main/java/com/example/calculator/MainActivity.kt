package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            var add = num1 + num2
            resultcount.setText("$add")
        }
        btnsub.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            var sub = num1 - num2
            resultcount.setText("$sub")
        }
        btnmul.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            var mul = num1 * num2
            resultcount.setText("$mul")
        }
        btndiv.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            var div = num1 / num2
            resultcount.setText("$div")
        }
    }
}
