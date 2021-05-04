package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var operator : String
    lateinit var number1 : String
    lateinit var number2 : String
    lateinit var numbers : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numbers = findViewById(R.id.tvInput)

        findViewById<Button>(R.id.btnZero).setOnClickListener { setText("0") }
        findViewById<Button>(R.id.btnOne).setOnClickListener { setText("1") }
        findViewById<Button>(R.id.btnTwo).setOnClickListener { setText("2") }
        findViewById<Button>(R.id.btnThree).setOnClickListener { setText("3") }
        findViewById<Button>(R.id.btnFour).setOnClickListener { setText("4") }
        findViewById<Button>(R.id.btnFive).setOnClickListener { setText("5") }
        findViewById<Button>(R.id.btnSix).setOnClickListener { setText("6") }
        findViewById<Button>(R.id.btnSeven).setOnClickListener { setText("7") }
        findViewById<Button>(R.id.btnEight).setOnClickListener { setText("8") }
        findViewById<Button>(R.id.btnNine).setOnClickListener { setText("9") }

        findViewById<Button>(R.id.btnSubtract).setOnClickListener { setText("-") }
        findViewById<Button>(R.id.btnAdd).setOnClickListener { setText("+") }
        findViewById<Button>(R.id.btnDivide).setOnClickListener { setText("/") }
        findViewById<Button>(R.id.btnMultiply).setOnClickListener { setText("*") }
        findViewById<Button>(R.id.btnDecimal).setOnClickListener { setText(".") }







    }


    // операторы
    fun onOperator(view: View) {
        when (view.id) {
            R.id.btnSubtract -> operator = "-"
            R.id.btnAdd -> operator = "+"
            R.id.btnDivide -> operator = "/"
            R.id.btnMultiply -> operator = "*"

        }
    }




    // числа
    fun onDigit(view: View) {

    }


    // числа с точкой
    fun onDecimalPoint(view: View) {}


    // очистка
    fun onClear(view: View) {
        numbers.setText(null)
        number1 = ""
        number2 = ""
        operator = ""
    }



    // решение
    fun onEqual(view: View) {
        var value : Double
        if (operator.equals("+")){
            value = number1.toDouble() + number2.toDouble()
            numbers.setText(value.toString())
        }
        if (operator.equals("-")){
            value = number1.toDouble() - number2.toDouble()
            numbers.setText(value.toString())
        }
        if (operator.equals("/")){
            value = number1.toDouble() / number2.toDouble()
            numbers.setText(value.toString())
        }
        if (operator.equals("*")){
            value = number1.toDouble() * number2.toDouble()
            numbers.setText(value.toString())
        }
    }


    fun setText(string: String){
        findViewById<TextView>(R.id.tvInput).append(string)
    }
}