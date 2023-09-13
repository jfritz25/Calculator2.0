package com.example.calculator

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import android.util.Log;
import kotlin.collections.ArrayList
// Jacob Fritz and Ashley Steitz
class MainActivity : AppCompatActivity() {
    /**
     * MainActivity's AppCompactActivity() function defines the needed global
     * variables throughout the project
     * save and allocate the items to their proper data structure.
     * @param calculatedVar the numerical value (stored as a double
     * @param compuStack the stack to store th numbers entered by user
     * @param operStack the stack to store th operators entered by user
     * @param lastClicked last clicked button stored in case of clearing
     * @param currCompStack used to store the most current operator
     * @param currOperStack used to store the most current operator
     * @return no return - just used for global references
     */
    var calculatedVar = 0.0                // used to compute the value
    var compuStack = ArrayDeque<Double>() // set as double in case a decimal is included
    var operStack = ArrayDeque<String>() // set as string because operators are stored as a str "+","-",etc.
    var lastClicked = ""                // used for tracking the last value entered to see if the number is part of a larger number or start of an opr.
    var currCompStack = ArrayDeque<Double>()
    var currOperStack = ArrayDeque<String>()

    override fun onSaveInstanceState(outState: Bundle) {
        /**
         * Overriding the onSaveInstanceState function is necessary to
         * save and allocate the items to their proper data structure.
         * @param outState passes in the user given data
         * @return nothing is returned but rather computed and stored for retrevial
         */
        super.onSaveInstanceState(outState)
        var calculatedVar = calculatedVar             // used to compute the value
        val compuStack = compuStack.toDoubleArray() // set as double in case a decimal is included
        val operStack = ArrayList(operStack) // set as string because operators are stored as a str "+","-",etc.
        var lastClicked = lastClicked             // used for tracking the last value entered to see if the number is part of a larger number or start of an opr.
        val currCompStack = currCompStack.toDoubleArray()
        val currOperStack = ArrayList(currOperStack)
        outState.putDouble("cv", calculatedVar)
        outState.putDoubleArray("cs", compuStack)
        outState.putStringArrayList("os", operStack)
        outState.putString("lc", lastClicked)
        outState.putDoubleArray("ccs", currCompStack)
        outState.putStringArrayList("cos",currOperStack)
        val textView = findViewById<TextView>(R.id.mainText)
        outState.putString("mt", textView.text.toString())

    }


    @SuppressLint("SetTextI18n")
    /**
     * This is where the majority of the logic for the buttons comes in. Each follows the same format of creating stacks
     * that are used when we create an instance of the button and set the stacks used for the operators and values.
     * Depending on the item in the bundle, the button is created and the associative action is executed
     * We assign the pressed button to view found in the .xml and then call the onCreate function defrined
     * referencing the savedInstanceState.
     * We then call Log.d for debuging purposes and log the message as the button called and the tag for calculator
     *
     * @param savedInstanceState passes in the user given data
     * @return the computed values are displayed in the text view
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        var pulledText = ""
        if (savedInstanceState != null) {
            calculatedVar = savedInstanceState.getDouble("cv")
            compuStack = ArrayDeque<Double>(
                savedInstanceState.getDoubleArray("cs")!!.toCollection(ArrayList())
            )
            operStack =
                savedInstanceState.getStringArrayList("os")?.let { ArrayDeque<String>(it) }!! //here
            lastClicked = savedInstanceState.getString("lc").toString()
            currCompStack = ArrayDeque<Double>(
                savedInstanceState.getDoubleArray("ccs")!!.toCollection(ArrayList())
            )
            currOperStack =
                savedInstanceState.getStringArrayList("cos")?.let { ArrayDeque<String>(it) }!!
            pulledText = savedInstanceState.getString("mt").toString()

        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main)  // uses the layout from the activity_main.xml file
        val textView = findViewById<TextView>(R.id.mainText)
        textView.text = pulledText
        // when the 0 button is clicked
        val button0 = findViewById<Button>(R.id.button0)
        button0.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "0"

            // add this to the stack and if there was an opperator collected then add that to the string
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                // converted to double becuase the stack of type double
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            }
            // used to add values if 0 is part of a number (ex 0, 100, 809)
            else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                // lastClicked is now 0
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button0 Pressed")
        }

        // same process is followed for Button 1  as Button 0
        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "1"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button1 Pressed")
        }
        // same process is followed for Button 2  as Button 0
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "2"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button2 Pressed")
        }
        // same process is followed for Button 3 as Button 0
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "3"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button3 Pressed")
        }
        // same process is followed for Button 4  as Button 0
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "4"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button4 Pressed")
        }
        // same process is followed for Button 5  as Button 0
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "5"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button5 Pressed")
        }
        // same process is followed for Button 6  as Button 0
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "6"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button6 Pressed")
        }
        // same process is followed for Button 7  as Button 0
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "7"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button7 Pressed")
        }
        // same process is followed for Button 8  as Button 0
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "8"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button8 Pressed")
        }
        // same process is followed for Button 9  as Button 0
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = textView.text
            val toAdd = "9"
            if (lastClicked in arrayOf("*", "+", "-", "/")) {
                textView.text = "$toAdd"
                calculatedVar = "$toAdd".toDouble()
                lastClicked = toAdd
            } else {
                textView.text = "$cur$toAdd"
                calculatedVar = "$cur$toAdd".toDouble()
                lastClicked = toAdd
            }
            Log.d("Calculator", "Button9 Pressed")
        }
        // for C we take the last item and store it in-case the user mis-enters the content and wanted to only clear the value
        val buttonC = findViewById<Button>(R.id.buttonC)
        buttonC.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)

            // this indicates the user pressed C x2 and wants to RESTART their computation so we clear BOTH stacks and set the value to 0 in text and computations

            // clears the stack
            textView.text = ""
            while (!compuStack.isEmpty()) {
                compuStack.pop()
            }
            while (!operStack.isEmpty()) {
                operStack.pop()
            }
            while (!currOperStack.isEmpty()) {
                currOperStack.pop()
            }
            while (!currCompStack.isEmpty()) {
                currCompStack.pop()
            }
            Log.d("Calculator", "ButtonC Pressed")
            lastClicked = "C"
        }
        // This is when the last value pressed was an OPERATOR
        // when "+" was last clicked
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            // this want to push the last computation is a + then set last to a +
            if (lastClicked == "=") {
                // push the last value the user wanted to compute
                compuStack.push(calculatedVar)
                // then push the '+' operator
                operStack.push("+")
                // set the last clicked item string to be "+"
                lastClicked = "+"
            }
            // now we check if the last item clicked was a diff operator (maybe a user mis-clicking) -> we want to swap them so we
            else if (lastClicked in arrayOf("*", "+", "-", "/")) {
                // pop the last operator
                operStack.pop()
                // replace with the new operator
                operStack.push("+")
                lastClicked = "+"
            } else {
                // this is typically the first pressed item or after a clear
                if (currCompStack.size >= 1) {
                    val rightSide = if (currCompStack.size == 1) {
                        calculatedVar
                    } else {
                        currCompStack.pop()
                    }
                    val leftSide = currCompStack.pop()
                    val op = currOperStack.pop()
                    if (op == "/") {
                        currCompStack.clear()
                        currCompStack.push(leftSide / rightSide)
                        textView.text = (leftSide / rightSide).toString()
                    } else if (op == "*") {
                        currCompStack.clear()
                        currCompStack.push(leftSide * rightSide)
                        textView.text = (leftSide * rightSide).toString()
                    } else if (op == "+") {
                        currCompStack.clear()
                        currCompStack.push(leftSide + rightSide)
                        textView.text = (leftSide + rightSide).toString()
                    } else {
                        currCompStack.clear()
                        currCompStack.push(leftSide - rightSide)
                        textView.text = (leftSide - rightSide).toString()
                    }
                }
                if (currCompStack.isEmpty()) {
                    currCompStack.push(calculatedVar)
                }
                compuStack.push(calculatedVar)
                currOperStack.push("+")
                operStack.push("+")
                lastClicked = "+"
            }
            Log.d("Calculator", "Button+ Pressed")
        }
        // this process is the same as the "+" operation
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        buttonSubtract.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            if (lastClicked == "=") {
                compuStack.push(calculatedVar)
                operStack.push("-")
                lastClicked = "-"
            } else if (lastClicked in arrayOf("*", "+", "-", "/")) {
                operStack.pop()
                operStack.push("-")
                lastClicked = "-"
            } else {
                if (currCompStack.size >= 1) {
                    val rightSide = if (currCompStack.size == 1) {
                        calculatedVar
                    } else {
                        currCompStack.pop()
                    }
                    val leftSide = currCompStack.pop()
                    val op = currOperStack.pop()
                    if (op == "/") {
                        currCompStack.clear()
                        currCompStack.push(leftSide / rightSide)
                        textView.text = (leftSide / rightSide).toString()
                    } else if (op == "*") {
                        currCompStack.clear()
                        currCompStack.push(leftSide * rightSide)
                        textView.text = (leftSide * rightSide).toString()
                    } else if (op == "+") {
                        currCompStack.clear()
                        currCompStack.push(leftSide + rightSide)
                        textView.text = (leftSide + rightSide).toString()
                    } else {
                        currCompStack.clear()
                        currCompStack.push(leftSide - rightSide)
                        textView.text = (leftSide - rightSide).toString()
                    }
                }
                if (currCompStack.isEmpty()) {
                    currCompStack.push(calculatedVar)
                }
                compuStack.push(calculatedVar)
                currOperStack.push("-")
                operStack.push("-")
                lastClicked = "-"
            }
            Log.d("Calculator", "Button- Pressed")
        }

        // this process is the same as the "+" operation
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            if (lastClicked == "=") {
                compuStack.push(calculatedVar)
                operStack.push("*")
                lastClicked = "*"
            } else if (lastClicked in arrayOf("*", "+", "-", "/")) {
                operStack.pop()
                operStack.push("*")
                lastClicked = "*"
            } else {
                if (currCompStack.size >= 1) {
                    val rightSide = if (currCompStack.size == 1) {
                        calculatedVar
                    } else {
                        currCompStack.pop()
                    }
                    val leftSide = currCompStack.pop()
                    val op = currOperStack.pop()
                    if (op == "/") {
                        currCompStack.clear()
                        currCompStack.push(leftSide / rightSide)
                        textView.text = (leftSide / rightSide).toString()
                    } else if (op == "*") {
                        currCompStack.clear()
                        currCompStack.push(leftSide * rightSide)
                        textView.text = (leftSide * rightSide).toString()
                    } else if (op == "+") {
                        currCompStack.clear()
                        currCompStack.push(leftSide + rightSide)
                        textView.text = (leftSide + rightSide).toString()
                    } else {
                        currCompStack.clear()
                        currCompStack.push(leftSide - rightSide)
                        textView.text = (leftSide - rightSide).toString()
                    }
                }
                if (currCompStack.isEmpty()) {
                    currCompStack.push(calculatedVar)
                }
                compuStack.push(calculatedVar)
                operStack.push("*")
                currOperStack.push("*")
                lastClicked = "*"
            }
            Log.d("Calculator", "Button* Pressed")
        }
        // this process is the same as the "+" operation
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        buttonDivide.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            if (lastClicked == "=") {
                compuStack.push(calculatedVar)
                operStack.push("/")
                lastClicked = "/"
            } else if (lastClicked in arrayOf("*", "+", "-", "/")) {
                operStack.pop()
                operStack.push("/")
                lastClicked = "/"
            } else {
                if (currCompStack.size >= 1) {
                    val rightSide = if (currCompStack.size == 1) {
                        calculatedVar
                    } else {
                        currCompStack.pop()
                    }
                    val leftSide = currCompStack.pop()
                    val op = currOperStack.pop()
                    if (op == "/") {
                        currCompStack.clear()
                        currCompStack.push(leftSide / rightSide)
                        textView.text = (leftSide / rightSide).toString()
                    } else if (op == "*") {
                        currCompStack.clear()
                        currCompStack.push(leftSide * rightSide)
                        textView.text = (leftSide * rightSide).toString()
                    } else if (op == "+") {
                        currCompStack.clear()
                        currCompStack.push(leftSide + rightSide)
                        textView.text = (leftSide + rightSide).toString()
                    } else {
                        currCompStack.clear()
                        currCompStack.push(leftSide - rightSide)
                        textView.text = (leftSide - rightSide).toString()
                    }
                }
                if (currCompStack.isEmpty()) {
                    currCompStack.push(calculatedVar)
                }
                compuStack.push(calculatedVar)
                operStack.push("/")
                currOperStack.push("/")
                lastClicked = "/"
            }
            Log.d("Calculator", "Button/ Pressed")
        }
        // this process takes the current value and converts it into a string
        val buttonDecimal = findViewById<Button>(R.id.buttonDecimal)

        buttonDecimal.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            val cur = calculatedVar.toInt().toString()
            // if the decimal was pressed x2, x3, etc. only add "." once
            val toAdd = if (cur.last().toString() == ".") {
                ""
            } else {
                "."
            }
            // used for concatinating the decimal value into the string to be displayed in the textView
            val zero = 0
            textView.text = "$cur$toAdd"
            calculatedVar = "$cur$toAdd$zero".toDouble()
            lastClicked = "."
            Log.d("Calculator", "Button. Pressed")
        }

        // this button takes the value and multiplies it by (-1) then converts it back into a string for the textViw
        val buttonNegate = findViewById<Button>(R.id.buttonNegate)
        buttonNegate.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var cur = calculatedVar.toString()
            // if the calculated value is positive we need to make it negative
            val toAdd = if (calculatedVar > 0) {
                "-"
            } else {
                ""
            }
            val zero = 0
            textView.text = if (toAdd == "-") {
                // add to start of string
                "$toAdd$cur"
            } else {
                // then grab current value
                cur = cur.substring(1)
                cur
            }
            // if the value is a decimal then we adjust the string to accomidate the decimal value
            calculatedVar = if (textView.text.last().toString() == ".") {
                cur = calculatedVar.toString()
                "$toAdd$cur$zero".toDouble()
            }
            // add the string value to textView
            else {
                textView.text.toString().toDouble()
            }
            lastClicked = "N"
            Log.d("Calculator", "Button+/- Pressed")
        }
        /*
            The bulk of this logic comes from taking a stack approach and needing to load into an array
            this then allows us to iterate over searching for opperotors that complete the computations in a (* and /) first approach and (+ and -) second apprach

            We know that when the user hit's "=" we need to stop and look over the items we pushed onto the stack and their order ...
         */
        val buttonEquals = findViewById<Button>(R.id.buttonEquals)
        buttonEquals.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)

            // corner case if the user hits "." as their last item to replace as a 0
            var toAdd = ""
            toAdd = if (textView.text.last().toString() == ".") {
                "0"
            } else {
                ""
            }

            // takes the last calculated item and pushes to stack
            compuStack.push(calculatedVar)
            if (lastClicked != "=") {
                // if stack is empty then we display this value
                if (compuStack.isEmpty()) {
                    textView.text = calculatedVar.toString()
                }
                // otherwise we need to keep this value in mind moving forward
                else if (compuStack.size == 1) {
                    val curr = textView.text
                    textView.text = "$curr$toAdd"
                }
                // now we make a list to store all values in this stack
                else {
                    val compuList = mutableListOf<String>()
                    while (!compuStack.isEmpty() || !operStack.isEmpty()) {
                        // we keep popping items and checking if they are numbers or symbols
                        val num = compuStack.pop()
                        if (!operStack.isEmpty()) {
                            val oper = operStack.pop()
                            compuList.add(num.toString())
                            compuList.add(oper)
                        } else {
                            compuList.add(num.toString())
                        }
                    }
                    // reverse is used to look at the items in the order received by user
                    compuList.reverse()

                    // go over the list to determine the
                    while (compuList.size != 1) {
                        // checks for multiplication or division first for P.E.M.D.A.S
                        while (compuList.contains("*") or compuList.contains("/")) {
                            // checks the list starting at * and / respectively
                            // indexA == Multiplication
                            // indexS == Division
                            var indexA = compuList.indexOf("*")
                            var indexS = compuList.indexOf("/")

                            // checks the positions and gathers the numbers in the adjacent indices (-1 and +1)
                            if (indexA > 0) {
                                if (indexS > 0) {
                                    // multiplication happens first
                                    if (indexA < indexS) {
                                        // convert to a double to compute the value
                                        var value =
                                            compuList[indexA - 1].toDouble() * compuList[indexA + 1].toDouble()
                                        // clears the previous sapce
                                        compuList.subList(indexA - 1, indexA + 2).clear()
                                        // replace the previous spot with the new string value
                                        compuList.add(indexA - 1, value.toString())
                                    }
                                    // same process but division happens first
                                    else {
                                        var value =
                                            compuList[indexS - 1].toDouble() / compuList[indexS + 1].toDouble()
                                        compuList.subList(indexS - 1, indexS + 2).clear()
                                        compuList.add(indexS - 1, value.toString())
                                    }
                                }
                                // this is where if the indexS is at 0 so we look at indexA
                                else {
                                    // take the value, do multiplication, then output to string and add to the computation list
                                    var value =
                                        compuList[indexA - 1].toDouble() * compuList[indexA + 1].toDouble()
                                    compuList.subList(indexA - 1, indexA + 2).clear()
                                    compuList.add(indexA - 1, value.toString())
                                }
                            }
                            // same process but indexS is > 0 and indexA is first
                            else if (indexS > 0) {
                                // take the value, do division, then output to string and add to the computation list
                                var value =
                                    compuList[indexS - 1].toDouble() / compuList[indexS + 1].toDouble()
                                compuList.subList(indexS - 1, indexS + 2).clear()
                                compuList.add(indexS - 1, value.toString())

                            }
                        }
                        // same process is repeated but
                        // indexA == Addition
                        // indexS == Subtraction
                        while (compuList.contains("+") or compuList.contains("-")) {
                            var indexA = compuList.indexOf("+")
                            var indexS = compuList.indexOf("-")
                            if (indexA > 0) {
                                if (indexS > 0) {
                                    if (indexA < indexS) {
                                        var value =
                                            compuList[indexA - 1].toDouble() + compuList[indexA + 1].toDouble()
                                        compuList.subList(indexA - 1, indexA + 2).clear()
                                        compuList.add(indexA - 1, value.toString())
                                    } else {
                                        var value =
                                            compuList[indexS - 1].toDouble() - compuList[indexS + 1].toDouble()
                                        compuList.subList(indexS - 1, indexS + 2).clear()
                                        compuList.add(indexS - 1, value.toString())
                                    }
                                } else {
                                    var value =
                                        compuList[indexA - 1].toDouble() + compuList[indexA + 1].toDouble()
                                    compuList.subList(indexA - 1, indexA + 2).clear()
                                    compuList.add(indexA - 1, value.toString())
                                }
                            } else if (indexS > 0) {
                                var value =
                                    compuList[indexS - 1].toDouble() - compuList[indexS + 1].toDouble()
                                compuList.subList(indexS - 1, indexS + 2).clear()
                                compuList.add(indexS - 1, value.toString())

                            }
                        }
                    }

                    // to get the value to calculate we start with a double in-case of a decimal value being computed (or division / %)
                    calculatedVar = compuList[0].toDouble()

                    // If string in the expression in list has a decimal then we look at the position and set it to a float
                    if (compuList[0].contains(".0")) {
                        var leading =
                            compuList[0].substring(0, compuList[0].indexOf(".")).toDouble()
                        // checks if the value is a decimal (ex 0.4 or 0.9999) then set text val to a str
                        if (kotlin.math.abs(leading) < kotlin.math.abs(compuList[0].toDouble())) {
                            textView.text = compuList[0]
                        }
                        // otherwise we keep it appearing as an int (ex 1.0 or 3.0) then set text val to a str
                        else {
                            textView.text = compuList[0].toDouble().toInt().toString()
                        }

                    }
                    // if doesn't contain a decimal, display val as is
                    else {
                        textView.text = compuList[0]
                    }

                }
                lastClicked = "="
                Log.d("Calculator", "Button= Pressed")
            }
        }
//        when clicked takes the value and divides it by 100 and displays it into the mainText  -> set's last clicked button to the %
        val buttonPercent = findViewById<Button>(R.id.buttonPercent)
        buttonPercent.setOnClickListener {
            val textView = findViewById<TextView>(R.id.mainText)
            var lastNum = calculatedVar
            lastNum /= 100.0
            textView.text = lastNum.toString()
            calculatedVar = lastNum
            lastClicked = "%"
            Log.d("Calculator", "Button% Pressed")

        }
        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val buttonSin = findViewById<Button>(R.id.buttonSin)
            buttonSin.setOnClickListener {
                val textView = findViewById<TextView>(R.id.mainText)
                var lastNum = calculatedVar
                lastNum = kotlin.math.sin(lastNum)
                textView.text = lastNum.toString()
                calculatedVar = lastNum
                lastClicked = "Sin"
                Log.d("Calculator", "ButtonSin Pressed")
            }

            val buttonCos = findViewById<Button>(R.id.buttonCos)
            buttonCos.setOnClickListener {
                val textView = findViewById<TextView>(R.id.mainText)
                var lastNum = calculatedVar
                lastNum = kotlin.math.cos(lastNum)
                textView.text = lastNum.toString()
                calculatedVar = lastNum
                lastClicked = "Cos"
                Log.d("Calculator", "ButtonCos Pressed")
            }
            val buttonTan = findViewById<Button>(R.id.buttonTan)
            buttonTan.setOnClickListener {
                val textView = findViewById<TextView>(R.id.mainText)
                var lastNum = calculatedVar
                lastNum = kotlin.math.cos(lastNum)
                textView.text = lastNum.toString()
                calculatedVar = lastNum
                lastClicked = "Tan"
                Log.d("Calculator", "ButtonTan Pressed")

            }
            val buttonLog10 = findViewById<Button>(R.id.buttonLog10)
            buttonLog10.setOnClickListener {
                val textView = findViewById<TextView>(R.id.mainText)
                var lastNum = calculatedVar
                lastNum = kotlin.math.log10(lastNum)
                textView.text = lastNum.toString()
                calculatedVar = lastNum
                lastClicked = "Log10"
                Log.d("Calculator", "ButtonLog10 Pressed")

            }
            val buttonln = findViewById<Button>(R.id.buttonLn)
            buttonln.setOnClickListener {
                val textView = findViewById<TextView>(R.id.mainText)
                var lastNum = calculatedVar
                lastNum = kotlin.math.ln(lastNum)
                textView.text = lastNum.toString()
                calculatedVar = lastNum
                lastClicked = "ln"
                Log.d("Calculator", "Buttonln Pressed")

            }
        }
    }
}
