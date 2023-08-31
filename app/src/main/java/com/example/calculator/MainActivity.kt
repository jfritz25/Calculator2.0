package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private var calculatedVar = 0.0
    private val compuStack = ArrayDeque<Double>()
    private var currentOperator = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        val button0 = findViewById<Button>(R.id.button0)
        button0.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button0)
            val cur = textView.text
            val toAdd = "0"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button1)
            val cur = textView.text
            val toAdd = "1"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button2)
            val cur = textView.text
            val toAdd = "2"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button3)
            val cur = textView.text
            val toAdd = "3"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button4)
            val cur = textView.text
            val toAdd = "4"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button5)
            val cur = textView.text
            val toAdd = "5"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button6)
            val cur = textView.text
            val toAdd = "6"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button7)
            val cur = textView.text
            val toAdd = "7"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button8)
            val cur = textView.text
            val toAdd = "8"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener{
            val textView = findViewById<TextView>(R.id.button9)
            val cur = textView.text
            val toAdd = "9"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val buttonC = findViewById<Button>(R.id.buttonClear)
        buttonC.setOnClickListener{
            val textView = findViewById<TextView>(R.id.buttonClear)
            textView.text = ""
            if (!compuStack.isEmpty()){
                compuStack.pop()
            }
        }
        val buttonAdd = findViewById<Button>(R.id.buttonAddition)
        buttonAdd.setOnClickListener{
            val textView = findViewById<TextView>(R.id.buttonAddition)
            val toAdd = "+"
            textView.text = toAdd
            if (compuStack.isEmpty()){
                compuStack.push(calculatedVar)
                currentOperator = "+"
            }
            else{
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+"){
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "-"){
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "x"){
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else{
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        buttonSubtract.setOnClickListener{
            val textView = findViewById<TextView>(R.id.buttonSubtract)
            val toAdd = "-"
            textView.text = toAdd
            if (compuStack.isEmpty()){
                compuStack.push(calculatedVar)
                currentOperator = "-"
            }
            else{
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+"){
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "-"){
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "x"){
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else{
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }

        val buttonMultiply = findViewById<Button>(R.id.buttonX)
        buttonMultiply.setOnClickListener{
            val textView = findViewById<TextView>(R.id.buttonX)
            val toAdd = "x"
            textView.text = toAdd
            if (compuStack.isEmpty()){
                compuStack.push(calculatedVar)
                currentOperator = "x"
            }
            else{
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+"){
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "-"){
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "x"){
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else{
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        buttonDivide.setOnClickListener{
            val textView = findViewById<TextView>(R.id.buttonDivide)
            val toAdd = "/"
            textView.text = toAdd
            if (compuStack.isEmpty()){
                compuStack.push(calculatedVar)
                currentOperator = "/"
            }
            else{
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+"){
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "-"){
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else if (currentOperator == "x"){
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
                else{
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
//        val buttonDecimal = findViewById<Button>(R.id.buttonDecimal)
//        button0.setOnClickListener{
//            val textView = findViewById<TextView>(R.id.buttonDecimal)
//            val cur = textView.text
//            val toAdd = "."
//            val zero = 0
//            textView.text = "$cur $toAdd"
//            calculatedVar = "$cur $toAdd $zero".toDouble()
//        }

    }
}