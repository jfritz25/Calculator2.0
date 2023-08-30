package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private var calculatedVar = 0.0
    private val compuStack = ArrayDeque<Double>()
    private var currentOperator = ""

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        val button0 = findViewById<Button>(R.id.button0)
        button0.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "0"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "1"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "2"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "3"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "4"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "5"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "6"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "7"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "8"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "9"
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd".toDouble()
        }
        val buttonC = findViewById<Button>(R.id.buttonC)
        buttonC.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            textView.text = ""
            if (!compuStack.isEmpty()) {
                compuStack.pop()
            }
        }
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var toAdd = ""
            toAdd = if (textView.text.last().toString() == ".") {
                "0+"
            } else {
                "+"
            }
            textView.text = toAdd
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
                currentOperator = "+"
            } else if (compuStack.size == 1) {
            } else {
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+") {
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "-") {
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "x") {
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else {
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        buttonSubtract.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var toAdd = ""
            toAdd = if (textView.text.last().toString() == ".") {
                "0-"
            } else {
                "-"
            }
            textView.text = toAdd
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
                currentOperator = "-"
            } else if (compuStack.size == 1) {
            } else {
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+") {
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "-") {
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "x") {
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else {
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }

        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var toAdd = ""
            toAdd = if (textView.text.last().toString() == ".") {
                "0*"
            } else {
                "*"
            }
            textView.text = toAdd
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
                currentOperator = "x"
            } else if (compuStack.size == 1) {
            } else {
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+") {
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "-") {
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "x") {
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else {
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        buttonDivide.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var toAdd = ""
            toAdd = if (textView.text.last().toString() == ".") {
                "0/"
            } else {
                "/"
            }
            textView.text = toAdd
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
                currentOperator = "/"
            } else if (compuStack.size == 1) {
            } else {
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+") {
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "-") {
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "x") {
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else {
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
        val buttonDecimal = findViewById<Button>(R.id.buttonDecimal)
        buttonDecimal.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = if (cur.last().toString() == ".") {
                ""
            } else {
                "."
            }
            val zero = 0
            textView.text = "$cur $toAdd"
            calculatedVar = "$cur $toAdd $zero".toDouble()
        }
        val buttonNegate = findViewById<Button>(R.id.buttonNegate)
        buttonNegate.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var cur = textView.text
            val toAdd = if (calculatedVar > 0) {
                "-"
            } else {
                ""
            }
            val zero = 0
            textView.text = if (toAdd == "-") {
                "$toAdd $cur"
            } else {
                cur = cur.substring(1)
                cur
            }
            calculatedVar = if (textView.text.last().toString() == ".") {
                "$toAdd $cur $zero".toDouble()
            } else {
                textView.text.toString().toDouble()
            }
        }
        val buttonEquals = findViewById<Button>(R.id.buttonEquals)
        buttonEquals.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var toAdd = ""
            toAdd = if (textView.text.last().toString() == ".") {
                "0"
            } else {
                ""
            }
            textView.text = toAdd
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
            } else if (compuStack.size == 1) {
                val curr = textView.text
                textView.text = "$curr $toAdd"
            } else {
                val rightSide = compuStack.pop()
                val leftSide = compuStack.pop()
                if (currentOperator == "+") {
                    calculatedVar = leftSide + rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "-") {
                    calculatedVar = leftSide - rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else if (currentOperator == "x") {
                    calculatedVar = leftSide * rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                } else {
                    calculatedVar = leftSide / rightSide
                    compuStack.push(calculatedVar)
                    textView.text = "$calculatedVar"
                }
            }
        }
    }
}
