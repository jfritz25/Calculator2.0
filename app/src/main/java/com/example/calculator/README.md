# Project_01 - Calculator App
###**Jacob Fritz and Ashley Steitz worked on this as partners**
---
In our efforts to complete Project 01 we implemented an interactive Ui (User Interface) that allows the user to select numbers 0-9 in addition
to symbols such as '*' for Multiplication, 'X' for Division, '+' for Addition, '=' for Total, 'C' for Clear, and '+/-' for Negation.

We have integrated a scalable approach for the user to build up their computation by:
- Implementing a dual stack approach to populate 2 arrays
  - Number_Stack 
  - Operator_Stack
- Popping off the items off the stacks and adding into an array
- Then using an iterative approach to search and build up the computation using a P.E.M.D.A.S approach


---
> # Testcases
## Testcase 1 - Only Multiplication and Division
Input => 4*8/3/2*4 =
Output_iPhone => 21.333
Output_OurCalculator => 21.333

## Testcase 2 - Using addition, subtraction, multiplication, division, and taking the percent
Input => 4+8-3/2+4%*5 =
Output_iPhone =>
Output_OurCalculator =>

## Testcase 3 - Addition
Input => 4+8+3+2+4 =
Output_iPhone => 21
Output_OurCalculator => 21

## Testcase 4 - Subtraction
Input => 1-2-7-9-5 =
Output_iPhone => -22
Output_OurCalculator => -22


## Testcase 5 - Multiply
Input => 4*8*3*2*4 =
Output_IPhone => 768
Output_OurCalculator => 768


## Testcase 6 - Dividing
Input => 4/8/3/2/4 =
Output_iPhone =>
Output_OurCalculator =>

## Testcase 7 - A random mix
Input => 4*8/3/2(+/-)*4 =
Output_iPhone =>
Output_OurCalculator =>

## Testcase 8 - Mixin' it Up
Input => 4*8/3/2*4 =
Output_iPhone =>
Output_OurCalculator =>

## Testcase 9 - clearing the number 3 then continuing with last computation
Input => 4%8+3C2*4 =
Output_iPhone =>
Output_OurCalculator =>

## Testcase 10 - Clearing all before the last computation
Input => 4*8/3CC2*4 =
Output_iPhone =>
Output_OurCalculator =>

## Testcase 11 - Using Decimal
Input => 4*8.5/3/2*4 =
Output_iPhone =>
Output_OurCalculator =>



