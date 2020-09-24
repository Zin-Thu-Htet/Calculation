package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.viewmodel.Calviewemodel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countViewModel = ViewModelProvider(this).get(Calviewemodel::class.java)
        btnadd.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            countViewModel.setCount(num1,num2)
            resultcount.text = countViewModel.getCount().toString()
        }
        btnsub.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            countViewModel.setCount1(num1,num2)
            resultcount.text = countViewModel.getCount1().toString()
        }
        btnmul.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            countViewModel.setCount2(num1,num2)
            resultcount.text = countViewModel.getCount2().toString()
        }
        btndiv.setOnClickListener {
            var num1: Int = editText.text.toString().toInt()
            var num2: Int = editText2.text.toString().toInt()
            countViewModel.setCount3(num1,num2)
            resultcount.text=countViewModel.getCount3().toString()
        }
    }
}
