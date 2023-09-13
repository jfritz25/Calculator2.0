# Project_01 - Calculator App
<span style="font-size: smaller;"><strong>Ashley Steitz and Jacob Fritz worked on this as partners</strong></span>

---
<span style="font-size: smaller;"><strong> Description </strong> </span>
In our efforts to complete Project 01 we implemented an interactive Ui (User Interface) that allows the user to select numbers 0-9 in addition
to symbols such as '*' for Multiplication, 'X' for Division, '+' for Addition, '=' for Total, 'C' for Clear, and '+/-' for Negation.

To begin we have added a new personalized logo that represents the function of the app (+/-) as a calculator
Once the app is opened the user is greeted in a vertical landscape. However if the user rotates the phone counter-clockwise they are greeted with a new layout 
which includes 5 new operators along the right side of the screen:
- Sin
- Cosine
- Tangent
- Log base 10
- ln

These new operators were integrated using the previous scalable approach for the user to build up their computation by:
- Implementing a dual stack approach to populate 2 arrays
  - Number_Stack
  - Operator_Stack
- Popping off the items off the stacks and adding into an array
- Then using an iterative approach to search and build up the computation using a P.E.M.D.A.S approach

Finally, when the button is called the data is logged for debugging included a tag to the app "Calculator" and the message stating what button was pressed (ex. "Button 0 pressed").

## Functionality
'**' indicates tested in GIF  
The following **required** functionality is completed:
<br>
<span style="font-size: smaller;"><strong> tested prior to change of C button as mentioned in the inscribe post made by Ashley Steitz </strong></span>

I will be using (V) for a vertical orientation and (H) for a horizontal orientation
* [(H) 7 + 666] The user sees: 673
* ** [98 / 2 * 3 + 3 - 1 =] The user sees: 149 **demonstrated** 
* [(V) 7 + 4 (H) + 3 cos + 6 =] The user sees: 16.0100075
* [(H) 5 sin + 6 (V) - 2 * 3 =] The user sees: -0.95892427
* [(H) 20 tan + 5 - 200 =] The user sees: -194.591917
* [(H) 3 ln + 9 = ] The user sees: 10.09866122
* [(H) 90 Log 10 * 5 =] The user sees: 9.7712125 **demonstrated**
* [(V) 5 + 2 (H) ln 6 + 8 =] The user sees: 19.69314718
* [(H) 5 + 6 (V) * 7 * 8 / 9 =] The user sees: 42.33333
* [(V) 34 (H) cos + 5 sin / 3 (V) + 3 =] The user sees: 1.8317883 **demonstrated**
---
## Video Walkthrough
See Calculator Demo gif on Github
Here's a walkthrough of implemented user stories:

<img src='https://raw.github.iu.edu/jamfritz/Calculator/master/app/src/main/java/com/example/calculator/Calculator%20Demo.gif?token=GHSAT0AAAAAAAAAT6M5WZYLE4KCR2XN2GZKZH43KMA' title='Video Walkthrough' width='50%' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes
UI Challenges:
- Obtaining the rounded edges using on the buttons
- Moving the activity_main.xml for the landscape view into the layout folder
- Migraitng to a repo that holds all the data
- Needed to adjust the font when horizontal due to buttons getting smushed
- Adjusting the bottom row to have a weight of 0.5 in order for the layout to match the on that is provided
  - For me the challenge came from having the android:radius = "3dp" rather than the needed app:cornerRadius = "3dp" approach
- Setting a style sheet to contain most of the styling factors to limit the code in the driver xml file
- Figuring out the format of having a rowButton _LinearLayout_ to encapsulate the Buttons in the activity_main.xml to have the buttons sit next to eachother
Describe any challenges encountered while building the app.

BACKEND Challenges:
- Implementing P.E.M.D.A.S into our original implementation of a stack approach
- Introducing decimals into the visual representation
- Keeping the values consistent in their visuals (ex. 3.0 is seen as 3) if you were working with decimals at any point
- Looking into how to handle % in the middle of an expression (value / 100) vs. comparing to the iPhone's implementation
- Accounting for longer int(s) / double(s) by concatenating them and adding them to the respective arrays
- Iterating through the array and completing (* and /) before (+ and -)

## License

    Copyright [2023] [Ashley Steitz, Jacob Fritz]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
