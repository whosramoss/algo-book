# 10 Days of JavaScript

Solutions to HackerRank's [10 Days of JavaScript](https://www.hackerrank.com/domains/tutorials/10-days-of-javascript/) challenge. Each entry describes the task and shows the solution. 

- [Day 0: Hello, World!](#day-0-hello-world)
- [Day 0: Data Types](#day-0-data-types)
- [Day 1: Arithmetic Operators](#day-1-arithmetic-operators)
- [Day 1: Functions](#day-1-functions)
- [Day 1: Let and Const](#day-1-let-and-const)
- [Day 2: Conditional Statements If-Else](#day-2-conditional-statements-if-else)
- [Day 2: Conditional Statements Switch](#day-2-conditional-statements-switch)
- [Day 2: Loops](#day-2-loops)
- [Day 3: Arrays](#day-3-arrays)
- [Day 3: Try, Catch, and Finally](#day-3-try-catch-and-finally)
- [Day 3: Throw](#day-3-throw)
- [Day 4: Create a Rectangle Object](#day-4-create-a-rectangle-object)
- [Day 4: Count Objects](#day-4-count-objects)
- [Day 4: Classes](#day-4-classes)
- [Day 5: Template Literals](#day-5-template-literals)
- [Day 5: Arrow Functions](#day-5-arrow-functions)
- [Day 5: Inheritance](#day-5-inheritance)
- [Day 6: Bitwise Operators](#day-6-bitwise-operators)
- [Day 6: JavaScript Dates](#day-6-javascript-dates)
- [Day 7: Regular Expressions I](#day-7-regular-expressions-i)
- [Day 7: Regular Expressions II](#day-7-regular-expressions-ii)
- [Day 7: Regular Expressions III](#day-7-regular-expressions-iii)
- [Day 8: Create a Button](#day-8-create-a-button)
- [Day 8: Buttons Container](#day-8-buttons-container)
- [Day 9: Binary Calculator](#day-9-binary-calculator)

---

### Day 0: Hello, World!

Print `Hello, World!` on one line, then print the value of the function parameter on a new line.

```javascript
function greeting(parameterVariable) {
  console.log('Hello, World!');
  console.log(parameterVariable);
}
```
---

### Day 0: Data Types

Given string representations of a number and a decimal, convert them with `Number` and sum them against preset values, then concatenate two strings.

```javascript
function performOperation(secondInteger, secondDecimal, secondString) {
  const firstInteger = 4;
  const firstDecimal = 4.0;
  const firstString = 'HackerRank ';

  console.log(firstInteger + Number(secondInteger));
  console.log(firstDecimal + Number(secondDecimal));
  console.log(firstString.concat(secondString));
}
```
---

### Day 1: Arithmetic Operators

Return the area and the perimeter of a rectangle from its length and width.

```javascript
function getArea(length, width) {
  const area = length * width;
  return area;
}

function getPerimeter(length, width) {
  const perimeter = 2 * (length + width);
  return perimeter;
}
```
---

### Day 1: Functions

Compute the factorial of a number recursively.

```javascript
function factorial(n) {
  if (n < 2) {
    return 1;
  }

  return n * factorial(n - 1);
}
```
---

### Day 1: Let and Const

Declare `PI` as a constant and use it to print the area and perimeter of a circle from a radius read at runtime.

```javascript
function main() {
  const PI = Math.PI;
  const r = parseFloat(readLine());

  const area = PI * Math.pow(r, 2);
  console.log(area);

  const perimeter = 2 * PI * r;
  console.log(perimeter);
}
```
---

### Day 2: Conditional Statements If-Else

Map a score from 0 to 30 onto a letter grade using a chain of if-else branches.

```javascript
function getGrade(score) {
  let grade;

  if (score > 25 && score <= 30) {
    grade = 'A';
  } else if (score > 20 && score <= 25) {
    grade = 'B';
  } else if (score > 15 && score <= 20) {
    grade = 'C';
  } else if (score > 10 && score <= 15) {
    grade = 'D';
  } else if (score > 5 && score <= 10) {
    grade = 'E';
  } else if (score > 0 && score <= 5) {
    grade = 'F';
  }

  return grade;
}
```
---

### Day 2: Conditional Statements Switch

Use a `switch` on the first character of a string to return a letter category.

```javascript
function getLetter(s) {
  let letter;

  switch (s.charAt(0)) {
    case 'a' || 'e' || 'o' || 'i' || 'u':
      letter = 'A';
      break;
    case 'b' || 'c' || 'd' || 'f' || 'g':
      letter = 'B';
      break;
    case 'h' || 'j' || 'k' || 'l' || 'm':
      letter = 'C';
      break;
    default:
      letter = 'D';
      break;
  }

  return letter;
}
```
---

### Day 2: Loops

Print every vowel of a string in order, then every consonant, one character per line.

```javascript
function vowelsAndConsonants(s) {
  const vowels = ['a', 'e', 'i', 'o', 'u'];

  for (let i = 0; i < s.length; i++) {
    if (vowels.indexOf(s[i]) > -1) {
      console.log(s[i]);
    }
  }

  for (let j = 0; j < s.length; j++) {
    if (vowels.indexOf(s[j]) < 0) {
      console.log(s[j]);
    }
  }
}
```
---

### Day 3: Arrays

Return the second largest number in an array, ignoring duplicates.

```javascript
function getSecondLargest(nums) {
  const sortedArray = nums.sort((a, b) => a - b);
  const uniqueSortedArray = [...new Set(sortedArray)];

  return uniqueSortedArray[uniqueSortedArray.length - 2];
}
```
---

### Day 3: Try, Catch, and Finally

Reverse a string inside a `try` block and handle the thrown error when the input is not a string.

```javascript
function reverseString(s) {
  try {
    const splitString = s.split('');
    const reverseArray = splitString.reverse();
    const joinArray = reverseArray.join('');
    console.log(joinArray);
  } catch (error) {
    console.log(error.message);
    console.log(s);
  }
}
```
---

### Day 3: Throw

Return `YES` for a positive number, and throw a specific `Error` for zero and for negative values.

```javascript
function isPositive(a) {
  if (a > 0) {
    return 'YES';
  } else if (a === 0) {
    throw new Error('Zero Error');
  } else if (a < 0) {
    throw new Error('Negative Error');
  }
}
```
---

### Day 4: Create a Rectangle Object

Build a constructor function that returns an object carrying the rectangle's length, width, perimeter, and area.

```javascript
function Rectangle(a, b) {
  this.length = a;
  this.width = b;
  this.perimeter = 2 * (a + b);
  this.area = a * b;
}
```
---

### Day 4: Count Objects

Count how many objects in an array have equal `x` and `y` properties.

```javascript
function getCount(objects) {
  let count = 0;

  for (const index in objects) {
    if (objects[index].x == objects[index].y) {
      count++;
    }
  }

  return count;
}
```
---

### Day 4: Classes

Implement a `Polygon` class whose constructor takes the side lengths and whose `perimeter` method returns their sum.

```javascript
class Polygon {
  constructor(heights) {
    let polygonPerimeter = 0;

    for (const index in heights) {
      polygonPerimeter += heights[index];
    }

    this.myPerimeter = polygonPerimeter;
  }

  perimeter() {
    return this.myPerimeter;
  }
}
```
---

### Day 5: Template Literals

Given a rectangle's area and perimeter through a tagged template literal, solve for the two side lengths and return them in ascending order.

```javascript
function sides(literals, ...expressions) {
  const area = expressions[0];
  const perimeter = expressions[1];

  const s1 = (perimeter + Math.sqrt(perimeter * perimeter - 16 * area)) / 4;
  const s2 = (perimeter - Math.sqrt(perimeter * perimeter - 16 * area)) / 4;

  return [s1, s2].sort((a, b) => a - b);
}
```
---

### Day 5: Arrow Functions

Map over an array so even numbers are doubled and odd numbers are tripled.

```javascript
function modifyArray(nums) {
  return nums.map((num) => {
    if (num % 2 === 0) {
      return 2 * num;
    } else {
      return 3 * num;
    }
  });
}
```
---

### Day 5: Inheritance

Add an `area` method to `Rectangle.prototype` and create a `Square` class that extends `Rectangle`.

```javascript
Rectangle.prototype.area = function () {
  return this.w * this.h;
};

class Square extends Rectangle {
  constructor(s) {
    super(s);
    this.h = s;
    this.w = s;
  }
}
```
---

### Day 6: Bitwise Operators

For the set of integers 1 to n, find the largest value of `a & b` that stays below k, where a is less than b.

```javascript
function getMaxLessThanK(n, k) {
  let maximum = 0;
  let current = -1;

  for (let i = 1; i < k; i++) {
    for (let j = i + 1; j <= n; j++) {
      current = i & j;

      if (current < k && current > maximum) {
        maximum = current;
      }
    }
  }

  return maximum;
}
```
---

### Day 6: JavaScript Dates

Return the weekday name for a given date string.

```javascript
function getDayName(dateString) {
  const dayNames = [
    'Sunday',
    'Monday',
    'Tuesday',
    'Wednesday',
    'Thursday',
    'Friday',
    'Saturday',
  ];
  const date = new Date(dateString);

  return dayNames[date.getDay()];
}
```
---

### Day 7: Regular Expressions I

Match a string that starts and ends with the same vowel, using a backreference.

```javascript
function regexVar() {
  const re = RegExp(/^([aeiou]).*\1$/);

  return re;
}
```
---

### Day 7: Regular Expressions II

Match a string that starts with a salutation such as `Mr.`, `Mrs.`, `Ms.`, `Dr.`, or `Er.` followed by one or more letters.

```javascript
function regexVar() {
  const re = /^(Mr\.|Dr\.|Er\.|Ms\.|Mrs\.)\s?[a-zA-Z]+$/;

  return re;
}
```
---

### Day 7: Regular Expressions III

Match every occurrence of a number in a string with a global flag.

```javascript
function regexVar() {
  const re = RegExp('\\d+', 'g');

  return re;
}
```
---

### Day 8: Create a Button

Build a button that starts at `0` and increments its own label on every click.

HTML

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css/button.css" type="text/css" />
    <title>Button</title>
  </head>
  <body>
    <button class="button" id="btn">0</button>
    <script src="js/button.js" type="text/javascript"></script>
  </body>
</html>
```

CSS

```css
.button {
  width: 96px;
  height: 48px;
  font-size: 24px;
}
```

JavaScript

```javascript
const btn = document.getElementById('btn');

btn.addEventListener('click', function () {
  const currentValue = this.innerHTML;
  this.innerHTML = parseInt(currentValue) + 1;
});
```
---

### Day 8: Buttons Container

Build a three by three grid of buttons where clicking the center button rotates the surrounding values clockwise.

HTML

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css/buttonsGrid.css" type="text/css" />
    <title>Buttons Grid</title>
  </head>
  <body>
    <div id="btns" class="buttonContainer">
      <button id="btn1" class="buttonClass">1</button>
      <button id="btn2" class="buttonClass">2</button>
      <button id="btn3" class="buttonClass">3</button>
      <button id="btn4" class="buttonClass">4</button>
      <button id="btn5" class="buttonClass">5</button>
      <button id="btn6" class="buttonClass">6</button>
      <button id="btn7" class="buttonClass">7</button>
      <button id="btn8" class="buttonClass">8</button>
      <button id="btn9" class="buttonClass">9</button>
    </div>
    <script src="js/buttonsGrid.js" type="text/javascript"></script>
  </body>
</html>
```

CSS

```css
.buttonContainer {
  width: 75%;
}

.buttonContainer > .buttonClass {
  width: 30%;
  height: 48px;
  font-size: 24px;
}
```

JavaScript

```javascript
const b = document.getElementById('btn5');
const arr = [1, 2, 3, 6, 9, 8, 7, 4];

b.onclick = function () {
  arr.unshift(arr.pop());

  document.getElementById('btn1').innerHTML = arr[0];
  document.getElementById('btn2').innerHTML = arr[1];
  document.getElementById('btn3').innerHTML = arr[2];
  document.getElementById('btn6').innerHTML = arr[3];
  document.getElementById('btn9').innerHTML = arr[4];
  document.getElementById('btn8').innerHTML = arr[5];
  document.getElementById('btn7').innerHTML = arr[6];
  document.getElementById('btn4').innerHTML = arr[7];
};
```
---

### Day 9: Binary Calculator

Build a calculator that takes binary operands and operators, evaluates the expression in decimal, and renders the result back in binary.

HTML

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Binary Calculator</title>
    <link rel="stylesheet" href="./css/binaryCalculator.css" />
  </head>
  <body>
    <div id="res"></div>
    <div id="btns">
      <button id="btn0" onClick="input(0)" class="bin">0</button>
      <button id="btn1" onClick="input(1)" class="bin">1</button>

      <button id="btnClr" class="sysBtn" onClick="reset()">C</button>
      <button id="btnEql" class="sysBtn" onClick="render()">=</button>

      <button id="btnSum" class="operators" onClick="input('+')">+</button>
      <button id="btnSub" class="operators" onClick="input('-')">-</button>
      <button id="btnMul" class="operators" onClick="input('*')">*</button>
      <button id="btnDiv" class="operators" onClick="input('/')">/</button>
    </div>
    <script src="./js/binaryCalculator.js"></script>
  </body>
</html>
```

CSS

```css
body {
  width: 33vw;
}

#res {
  border: solid;
  background-color: lightgray;
  height: 48px;
  font-size: 20px;
}

.bin {
  background-color: lightgreen;
  color: brown;
}

.sysBtn {
  background-color: darkgreen;
  color: white;
}

.operators {
  background-color: black;
  color: red;
}

button {
  width: 25%;
  height: 36px;
  font-size: 18px;
  float: left;
  margin: 0px;
}
```

JavaScript

```javascript
const res = document.getElementById('res');
const reset = () => (res.innerHTML = '');
const input = (a) => (res.innerHTML += a);

function render() {
  let code = res.innerHTML;

  if (!code) return;

  const matches = code.match(/[0-1]+/g);

  if (matches) {
    for (const match of matches) {
      code = code.replace(match, parseInt(Number(match), 2));
    }
  }

  try {
    eval(`code=(${code})`);
  } catch (e) {
    console.error(e);
  }

  res.innerHTML = Math.round(code).toString(2);
}
```
---
