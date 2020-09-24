package com.example.calculator.viewmodel

import androidx.lifecycle.ViewModel

class Calviewemodel : ViewModel() {
    private var add: Int = 0

    fun getCount(): Int = add

    fun setCount(num1: Int, num2: Int): Int {
        add = num1 + num2
        return add
    }

    private var sub: Int = 0

    fun getCount1(): Int = sub

    fun setCount1(num1: Int, num2: Int): Int {
        sub = num1 - num2
        return sub
    }

    private var mul: Int = 0

    fun getCount2(): Int = mul

    fun setCount2(num1: Int, num2: Int): Int {
        mul = num1 * num2
        return mul
    }

    private var div: Int = 0

    fun getCount3(): Int = div

    fun setCount3(num1: Int, num2: Int): Int {
        div = num1/num2
        return div
    }
}