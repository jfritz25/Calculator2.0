package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
class MainActivity : AppCompatActivity() {
    private var calculatedVar = 0.0
    private val compuStack = ArrayDeque<Double>()
    private val operStack = ArrayDeque<String>()
    private var lastClicked = ""


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        val button0 = findViewById<Button>(R.id.button0)
        button0.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "0"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "1"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "2"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "3"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "4"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "5"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "6"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "7"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "8"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "9"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            else{
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
        }
        val buttonC = findViewById<Button>(R.id.buttonC)
        buttonC.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            textView.text = ""
            if (!compuStack.isEmpty()) {
                compuStack.pop()
            }
            lastClicked = "C"
        }
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)

            } else if (compuStack.size % 2 != 0) {
                operStack.push("+")
            }
            lastClicked = "+"
        }
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        buttonSubtract.setOnClickListener {
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
            } else if (compuStack.size % 2 != 0) {
                operStack.push("-")
            }
            lastClicked = "-"
        }


        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            if (compuStack.isEmpty()) {
                compuStack.push(calculatedVar)
            } else if (compuStack.size % 2 != 0) {
                operStack.push("*")
            }
            lastClicked = "*"
        }
            val buttonDivide = findViewById<Button>(R.id.buttonDivide)
            buttonDivide.setOnClickListener {
                if (compuStack.isEmpty()) {
                    compuStack.push(calculatedVar)
                } else if (compuStack.size % 2 != 0) {
                    operStack.push("/")
                }
                lastClicked = "/"
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
                    textView.text = "$cur$toAdd"
                    calculatedVar = "$cur$toAdd$zero".toDouble()
                    lastClicked = "."
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
                        "$toAdd$cur"
                    } else {
                        cur = cur.substring(1)
                        cur.toString()
                    }
                    calculatedVar = if (textView.text.last().toString() == ".") {
                        "$toAdd$cur$zero".toDouble()
                    } else {
                        textView.text.toString().toDouble()
                    }
                    lastClicked = "N"
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
                        textView.text = "$curr$toAdd"
                    } else {
                        var compuList = mutableListOf<String>()
                        while (!compuStack.isEmpty() and !operStack.isEmpty()) {
                            val num = compuStack.pop()
                            val oper = operStack.pop()
                            if (!operStack.isEmpty()) {
                                compuList.add(num.toString())
                                compuList.add(oper)
                            } else {
                                val num = compuStack.pop()
                                compuList.add(num.toString())
                            }
                        }
                        while (compuList.size != 1) {
                            while (compuList.contains("*") or compuList.contains("/")) {
                                var indexM = compuList.indexOf("*")
                                var indexD = compuList.indexOf("/")
                                if (indexM < indexD) {
                                    var value =
                                        compuList[indexM - 1].toDouble() * compuList[indexM + 1].toDouble()
                                    compuList.subList(indexM - 1, indexM + 2).clear()
                                    compuList.add(indexM - 1, value.toString())
                                } else {
                                    var value =
                                        compuList[indexD - 1].toDouble() / compuList[indexD + 1].toDouble()
                                    compuList.subList(indexD - 1, indexD + 2).clear()
                                    compuList.add(indexD - 1, value.toString())
                                }
                            }
                            while (compuList.contains("+") or compuList.contains("-")) {
                                var indexA = compuList.indexOf("+")
                                var indexS = compuList.indexOf("-")
                                if (indexA < indexS) {
                                    var value =
                                        compuList[indexA - 1].toDouble() + compuList[indexA + 1].toDouble()
                                    compuList.subList(indexA - 1, indexA + 2).clear()
                                    compuList.add(indexA - 1, value.toString())
                                } else {
                                    var value =
                                        compuList[indexS - 1].toDouble() / compuList[indexS + 1].toDouble()
                                    compuList.subList(indexS - 1, indexS + 2).clear()
                                    compuList.add(indexS - 1, value.toString())
                                }
                            }
                            textView.text = compuList[0]
                        }
                    }
                    lastClicked = "="
                }
                    val buttonPercent = findViewById<Button>(R.id.buttonPercent)
                    buttonPercent.setOnClickListener {
                        val textView = findViewById<TextView>(R.id.mainText)
                        var lastNum = compuStack.pop()
                        lastNum /= 100.0
                        textView.text = lastNum.toString()
                        compuStack.push(lastNum)
                        lastClicked = "%"
        }
    }
}
