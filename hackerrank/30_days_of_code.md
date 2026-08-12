# 30 Days of Code

Python solutions for [30 Days of Code by HackerRank](https://www.hackerrank.com/domains/tutorials/30-days-of-code). Each entry describes the task and shows the solution.

- [Day 0: Hello, World!](#day-0-hello-world)
- [Day 1: Data Types](#day-1-data-types)
- [Day 2: Operators](#day-2-operators)
- [Day 3: Intro to Conditional Statements](#day-3-intro-to-conditional-statements)
- [Day 4: Class vs. Instance](#day-4-class-vs-instance)
- [Day 5: Loops](#day-5-loops)
- [Day 6: Let's Review](#day-6-lets-review)
- [Day 7: Arrays](#day-7-arrays)
- [Day 8: Dictionaries and Maps](#day-8-dictionaries-and-maps)
- [Day 9: Recursion](#day-9-recursion)
- [Day 10: Binary Numbers](#day-10-binary-numbers)
- [Day 11: 2D Arrays](#day-11-2d-arrays)
- [Day 12: Inheritance](#day-12-inheritance)
- [Day 13: Abstract Classes](#day-13-abstract-classes)
- [Day 14: Scope](#day-14-scope)
- [Day 15: Linked List](#day-15-linked-list)
- [Day 16: Exceptions - String to Integer](#day-16-exceptions---string-to-integer)
- [Day 17: More Exceptions](#day-17-more-exceptions)
- [Day 18: Queues and Stacks](#day-18-queues-and-stacks)
- [Day 19: Interfaces](#day-19-interfaces)
- [Day 20: Sorting](#day-20-sorting)
- [Day 21: Generics](#day-21-generics)
- [Day 22: Binary Search Trees](#day-22-binary-search-trees)
- [Day 23: BST Level-Order Traversal](#day-23-bst-level-order-traversal)
- [Day 24: More Linked Lists](#day-24-more-linked-lists)
- [Day 25: Running Time and Complexity](#day-25-running-time-and-complexity)
- [Day 26: Nested Logic](#day-26-nested-logic)
- [Day 27: Testing](#day-27-testing)
- [Day 28: RegEx, Patterns, and Intro to Databases](#day-28-regex-patterns-and-intro-to-databases)
- [Day 29: Bitwise AND](#day-29-bitwise-and)

---

### Day 0: Hello, World!

Print `Hello, World.` on one line, then print the string read from stdin on a new line.

```python
print("Hello, World. \n" + input())
```
---

### Day 1: Data Types

Read an integer, a double, and a string, then print each one summed or concatenated with a preset value of the same type.

```python
i = 4
d = 4.0
s = 'HackerRank '

i2 = None
d2 = None
s2 = None

i2 = int(input())
d2 = float(input())
s2 = str(input())

print(i + i2)
print(d + d2)
print(s + s2)
```
---

### Day 2: Operators

Given a meal cost, a tip percentage, and a tax percentage, print the total cost rounded to the nearest integer.

```python
meal_cost = float(input())
tip_percent = int(input())
tax_percent = int(input())

tip = meal_cost * tip_percent / 100
tax = meal_cost * tax_percent / 100
total = meal_cost + tip + tax

print("The total meal cost is " + str(round(total)) + " dollars.")
```
---

### Day 3: Intro to Conditional Statements

Print `Weird` when n is odd or when it is even and greater than 20, and `Not Weird` otherwise.

```python
N = int(input())

if N % 2 != 0:
    print("Weird")
else:
    if N <= 5:
        print("Not Weird")
    elif N <= 20:
        print("Weird")
    else:
        print("Not Weird")
```
---

### Day 4: Class vs. Instance

Build a `Person` class that validates the initial age, reports the age bracket, and can advance the age by one year.

```python
class Person:
    def __init__(self, initialAge):
        if initialAge > 0:
            self.age = initialAge
        else:
            print("Age is not valid, setting age to 0.")
            self.age = 0

    def amIOld(self):
        if self.age < 13:
            print("You are young.")
        elif self.age < 18:
            print("You are a teenager.")
        else:
            print("You are old.")

    def yearPasses(self):
        self.age += 1


t = int(input())
for i in range(0, t):
    age = int(input())
    p = Person(age)
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()
    p.amIOld()
    print("")
```
---

### Day 5: Loops

Print the first ten multiples of n, one per line, in the form `n x i = result`.

```python
N = int(input())

for i in range(1, 11):
    print(str(N) + " x " + str(i) + " = " + str(N * i))
```
---

### Day 6: Let's Review

For each string, print the characters at even indices, then the characters at odd indices, separated by a space.

```python
NumberOfStrings = int(input())

for i in range(0, NumberOfStrings):
    string = input()
    print(string[::2],string[1::2])
```
---

### Day 7: Arrays

Read an array of integers and print the elements in reverse order on a single line.

```python
input()

arr = str(input()).split(" ")
arr.reverse()

for num in arr:
    print(num + " ", end="")
```
---

### Day 8: Dictionaries and Maps

Build a phone book from name and number pairs, then answer lookups, printing `Not found` for names that are absent.

```python
n = int(input())
phonebook = dict()
for i in range(n):
    line = input()
    line = line.split()
    phonebook[line[0]] = phonebook.get(line[0],line[1])

while 1:
    try:
        q = input()
        if q in phonebook:
            print(str(q) + "=" + str(phonebook[q]))
        else:
            print("Not found")
    except:
        break
```
---

### Day 9: Recursion

Compute the factorial of a number recursively, without using loops.

```python
def factorial(num):
    return 1 if num == 1 else factorial(num - 1) * num


print(factorial(int(input())))
```
---

### Day 10: Binary Numbers

Convert a number to binary and print the length of its longest run of consecutive ones.

```python
num = int(input())

result = 0
maximum = 0

while num > 0:
    if num % 2 == 1:
        result += 1
        if result > maximum:
            maximum = result

    else:
        result = 0

    num //= 2

print(maximum)
```
---

### Day 11: 2D Arrays

Find the largest hourglass sum in a 6 by 6 matrix.

```python
arr = []

for _ in range(6):
    tmp = [int(x) for x in str(input()).split(" ")]
    arr.append(tmp)

maximum = -9 * 7

for i in range(6):
    for j in range(6):
        if j + 2 < 6 and i + 2 < 6:
            result = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            if result > maximum:
                maximum = result

print(maximum)
```
---

### Day 12: Inheritance

Extend a `Person` class with a `Student` subclass that averages the test scores and converts the average into a letter grade.

```python
class Person:
    def __init__(self, firstName, lastName, idNumber):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber

    def printPerson(self):
        print("Name:", self.lastName + ",", self.firstName)
        print("ID:", self.idNumber)


class Student(Person):
    def __init__(self, firstName, lastName, idNumber, testScores):
        super().__init__(firstName, lastName, idNumber)
        self.testScores = testScores

    def calculate(self):
        total = 0

        for testScore in self.testScores:
            total += testScore

        avg = total / len(self.testScores)

        if 90 <= avg <= 100:
            return 'O'
        if 80 <= avg < 90:
            return 'E'
        if 70 <= avg < 80:
            return 'A'
        if 55 <= avg < 70:
            return 'P'
        if 40 <= avg < 55:
            return 'D'
        return 'T'


line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input())
scores = list(map(int, input().split()))
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())
```
---

### Day 13: Abstract Classes

Declare an abstract `Book` class with an abstract `display` method, then implement it in a `MyBook` subclass that also holds a price.

```python
from abc import ABCMeta, abstractmethod


class Book(object, metaclass=ABCMeta):
    def __init__(self, title, author):
        self.title = title
        self.author = author

    @abstractmethod
    def display(self): pass


class MyBook(Book):
    def __init__(self, title, author, price):
        super().__init__(title, author)
        self.price = price

    def display(self):
        print("Title: " + self.title + "\nAuthor: " + self.author + "\nPrice: " + str(self.price))


title = input()
author = input()
price = int(input())
new_novel = MyBook(title, author, price)
new_novel.display()
```
---

### Day 14: Scope

Use a private instance variable to hold the array, then compute the maximum absolute difference between any two of its elements.

```python
class Difference:
    def __init__(self, a):
        self.__elements = a

    def computeDifference(self):
        maximum = 0

        for i in range(len(self.__elements)):
            for j in range(len(self.__elements)):
                absolute = abs(self.__elements[i] - self.__elements[j])
                if absolute > maximum:
                    maximum = absolute

        self.maximumDifference = maximum


_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
```
---

### Day 15: Linked List

Insert nodes at the tail of a singly linked list, then print the list from head to tail.

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:
    def display(self, head):
        current = head
        while current:
            print(current.data, end=' ')
            current = current.next

    def insert(self, head, data):
        if head is None:
            head = Node(data)
        else:
            curr = head
            while curr.next:
                curr = curr.next
            curr.next = Node(data)
        return head


mylist = Solution()
T = int(input())
head = None
for i in range(T):
    data = int(input())
    head = mylist.insert(head, data)
mylist.display(head)
```
---

### Day 16: Exceptions - String to Integer

Convert a string to an integer, printing `Bad String` when the conversion raises an error.

```python
try:
    print(int(input().strip()))
except ValueError:
    print("Bad String")
```
---

### Day 17: More Exceptions

Raise a custom exception when either argument is negative, and catch it in the caller.

```python
class Calculator:
    def power(self, n, p):
        if n < 0 or p < 0:
            raise Exception("n and p should be non-negative")
        return pow(n, p)


myCalculator = Calculator()
T = int(input())
for i in range(T):
    n, p = map(int, input().split())
    try:
        ans = myCalculator.power(n, p)
        print(ans)
    except Exception as e:
        print(e)
```
---

### Day 18: Queues and Stacks

Push every character onto a stack and enqueue it into a queue, then compare both halves to decide whether the word is a palindrome.

```python
class Solution:
    def __init__(self):
        self.stack = []
        self.queue = []

    def popCharacter(self):
        return self.stack.pop()

    def pushCharacter(self, char):
        self.stack.append(char)

    def dequeueCharacter(self):
        char = self.queue[0]
        self.queue = self.queue[1:]
        return char

    def enqueueCharacter(self, char):
        self.queue.append(char)


s = input()
obj = Solution()
l = len(s)

for i in range(l):
    obj.pushCharacter(s[i])
    obj.enqueueCharacter(s[i])

isPalindrome = True
'''
pop the top character from stack
dequeue the first character from queue
compare both the characters
'''
for i in range(l // 2):
    if obj.popCharacter() != obj.dequeueCharacter():
        isPalindrome = False
        break

if isPalindrome:
    print("The word, " + s + ", is a palindrome.")
else:
    print("The word, " + s + ", is not a palindrome.")
```
---

### Day 19: Interfaces

Implement an interface-style base class and provide a `divisorSum` method that sums all divisors of n.

```python
class AdvancedArithmetic(object):
    def divisorSum(n):
        raise NotImplementedError


class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        s = 0
        for i in range(1,n+1):
            if (n%i == 0):
                s+=i
        return s


n = int(input())

myCalculator = Calculator()
s = my_calculator.divisorSum(n)
print("I implemented: " + type(my_calculator).__bases__[0].__name__)
print(s)
```
---

### Day 20: Sorting

Run a bubble sort while counting the swaps, then print the swap count along with the first and last elements.

```python
n = int(input())
arr = [int(x) for x in input().split(" ")]

num_swaps = 0

for i in range(n):
    for j in range(n - 1):
        if arr[j] > arr[j + 1]:
            tmp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = tmp
            num_swaps += 1

    if num_swaps == 0:
        break

print("Array is sorted in " + str(num_swaps) + " swaps.")
print("First Element: " + str(arr[0]))
print("Last Element: " + str(arr[len(arr) - 1]))
```
---

### Day 21: Generics

Write a single function that prints the elements of an array regardless of the element type.

```python
from typing import TypeVar

Element = TypeVar("Element")


def printArray(array: [Element]):
    for element in array:
        print(element)


vInt = [1, 2, 3]
vString = ["Hello", "World"]

printArray(vInt)
printArray(vString)
```
---

### Day 22: Binary Search Trees

Insert values into a binary search tree and return its height, counting edges rather than nodes.

```python
class Node:
    def __init__(self, data):
        self.right = self.left = None
        self.data = data


class Solution:
    def insert(self, root, data):
        if root is None:
            return Node(data)
        else:
            if data <= root.data:
                cur = self.insert(root.left, data)
                root.left = cur
            else:
                cur = self.insert(root.right, data)
                root.right = cur
        return root

    def getHeight(self, root):
        return -1 if root is None else 1 + max(self.getHeight(root.left), self.getHeight(root.right))


T = int(input())
myTree = Solution()
root = None
for i in range(T):
    data = int(input())
    root = myTree.insert(root, data)
height = myTree.getHeight(root)
print(height)
```
---

### Day 23: BST Level-Order Traversal

Traverse a binary search tree level by level using a queue, printing the values in breadth-first order.

```python
class Node:
    def __init__(self, data):
        self.right = self.left = None
        self.data = data


class Solution:
    def insert(self, root, data):
        if root is None:
            return Node(data)
        else:
            if data <= root.data:
                cur = self.insert(root.left, data)
                root.left = cur
            else:
                cur = self.insert(root.right, data)
                root.right = cur
        return root

    def levelOrder(self, root):
        queue = [root]
        while len(queue) is not 0:
            curr = queue[0]
            queue = queue[1:]
            print(str(curr.data) + " ", end="")

            if curr.left is not None:
                queue.append(curr.left)
            if curr.right is not None:
                queue.append(curr.right)


T = int(input())
myTree = Solution()
root = None
for i in range(T):
    data = int(input())
    root = myTree.insert(root, data)
myTree.levelOrder(root)
```
---

### Day 24: More Linked Lists

Remove duplicate nodes from a sorted linked list, then print the remaining values.

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:
    def insert(self, head, data):
        p = Node(data)
        if head is None:
            head = p
        elif head.next is None:
            head.next = p
        else:
            start = head
            while start.next is not None:
                start = start.next
            start.next = p
        return head

    def display(self, head):
        current = head
        while current:
            print(current.data, end=" ")
            current = current.next

    def removeDuplicates(self, head):
        curr = head
        while curr is not None and curr.next is not None:
            while curr.next is not None and curr.data is curr.next.data:
                curr.next = curr.next.next
            curr = curr.next
        return head


mylist = Solution()
T = int(input())
head = None
for i in range(T):
    data = int(input())
    head = mylist.insert(head, data)
head = mylist.removeDuplicates(head)
mylist.display(head)
```
---

### Day 25: Running Time and Complexity

Test each number for primality by checking divisors only up to its square root.

```python
from math import sqrt

T = int(input())


def isPrime(n):
    for i in range(2, int(sqrt(n) + 1)):
        if n % i is 0:
            return False
    return True


for _ in range(T):
    n = int(input())
    
    if n >= 2 and isPrime(n):
        print("Prime")
    else:
        print("Not prime")
```
---

### Day 26: Nested Logic

Compare a returned date against the expected date and compute the library fine using nested conditions on year, month, and day.

```python
actually = list(map(int, input().split()))
da, ma, ya = actually

expected = list(map(int, input().split()))
de, me, ye = expected

fine = 0

if ya > ye:
    fine = 10000
elif ya == ye:
    if ma > me:
        fine = (ma - me) * 500
    elif ma == me and da > de:
        fine = (da - de) * 15

print(fine)
```
---

### Day 27: Testing

Write test cases that cover an empty sequence, a sequence of unique values, and a sequence with exactly two equal minimums.

```python
def minimum_index(seq):
    if len(seq) == 0:
        raise ValueError("Cannot get the minimum value index from an empty sequence")
    min_idx = 0
    for i in range(1, len(seq)):
        if seq[i] < seq[min_idx]:
            min_idx = i
    return min_idx


'''
Solution Part - Day27: Testing. (2021-07-27 updated)
'''
class TestDataEmptyArray:
    def get_array():
        return []
    
class TestDataUniqueValues:
    def get_array():
        return [1,2,3]
    def get_expected_result():
        return 0
class TestDataExactlyTwoDifferentMinimums:
    def get_array():
        return [1,1,3]
    def get_expected_result():
        return 0
'''
'''

def TestWithEmptyArray():
    try:
        seq = TestDataEmptyArray.get_array()
        result = minimum_index(seq)
    except ValueError as e:
        pass
    else:
        assert False


def TestWithUniqueValues():
    seq = TestDataUniqueValues.get_array()
    assert len(seq) >= 2

    assert len(list(set(seq))) == len(seq)

    expected_result = TestDataUniqueValues.get_expected_result()
    result = minimum_index(seq)
    assert result == expected_result


def TestiWithExactyTwoDifferentMinimums():
    seq = TestDataExactlyTwoDifferentMinimums.get_array()
    assert len(seq) >= 2
    tmp = sorted(seq)
    assert tmp[0] == tmp[1] and (len(tmp) == 2 or tmp[1] < tmp[2])

    expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result()
    result = minimum_index(seq)
    assert result == expected_result

TestWithEmptyArray()
TestWithUniqueValues()
TestiWithExactyTwoDifferentMinimums()
print("OK")
```
---

### Day 28: RegEx, Patterns, and Intro to Databases

Filter the entries whose email ends in `@gmail.com` and print the matching names in alphabetical order.

```python
import re

arr = []

n = int(input())

for i in range(n):
    data = str(input()).split(" ")
    name = data[0]
    email = data[1]

    if re.search(".+@gmail\.com$", email):
        arr.append(name)

arr.sort()

for name in arr:
    print(name)
```
---

### Day 29: Bitwise AND

For the set of integers 1 to n, find the largest value of `a & b` that stays below k.

```python
import math
import os
import random
import re
import sys

def bitwiseAnd(N, K):
    return (K-1 if ((K-1) | K) <= N else K-2)
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        first_multiple_input = input().rstrip().split()

        count = int(first_multiple_input[0])

        lim = int(first_multiple_input[1])

        res = bitwiseAnd(count, lim)

        fptr.write(str(res) + '\n')

    fptr.close()
```
---
