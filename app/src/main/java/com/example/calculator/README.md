# Project_01 Calculator App
# Project_01 - Calculator App
<span style="font-size: smaller;"><strong>Ashley Steitz and Jacob Fritz worked on this as partners</strong></span>

---
In our efforts to complete Project 01 we implemented an interactive Ui (User Interface) that allows the user to select numbers 0-9 in addition
to symbols such as '*' for Multiplication, 'X' for Division, '+' for Addition, '=' for Total, 'C' for Clear, and '+/-' for Negation.

We have integrated a scalable approach for the user to build up their computation by:
- Implementing a dual stack approach to populate 2 arrays
  - Number_Stack
  - Operator_Stack
- Popping off the items off the stacks and adding into an array
- Then using an iterative approach to search and build up the computation using a P.E.M.D.A.S approach


## Functionality

The following **required** functionality is completed:

* [4*8/3/2*4] User sees: 21.333
* [4+8-3/2+4%*5] User sees: 10.7
* [4+8+3+2+4] User sees: 21
* [1-2-7-9-5] User sees: -22
* [4*8*3*2*4] User sees: 768
* [4/8/3/2/4] User sees: 0.020833
* [4*8/3/2(+/-)*4] User sees: -21.333
* [4*8/3/2*4] User sees: 1.3
* [4%8+3C2*4] User sees: 8
* [4*8.5/3/2*4] User sees: 22.66
* [4*8.5/3C/19*4] User sees: 7.15789
* [42*455] User sees: 19110
* [8%(+-)/9] User sees: -0.0888

---
## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='walkthrough.gif' title='Video Walkthrough' width='50%' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.

## License

    Copyright [2023] [Ashley Steitz]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
