<h1 align="center">Algo Book</h1>

<p align="center">
  This is a collection of solved algorithms to sharpen my programming skills,<br/> and each code can be compiled at site:
  <a  href="https://onecompiler.com/">onecompiler</a>.
</p>


<br/>

## About

Algo-Book is a curated collection of algorithms implemented in modern programming languages, designed to help developers and students understand, practice, and master algorithmic thinking. It includes classic algorithmic problems like sorting, searching, graph traversal, dynamic programming, and more — each with clean, well-documented code.

## Features:

- Ready-to-use implementations of common algorithms
- Clean, readable, and testable code

## Algorithms:

- [leetcode](./leetcode/README.md)
- [hackerrank](./hackerrank/README.md)

## Big-O Notation

Big-O Notation describes the performance of an algorithm in terms of time or space complexity relative to the input size n. It gives an upper bound on the number of operations an algorithm will take. This helps compare and evaluate algorithms for efficiency.

#### Common Time Complexities (Fastest to Slowest):

```
O(1) > O(log n) > O(n) > O(n log n) > O(n²) > O(n³) > O(2ⁿ) > O(n!)
```

| Complexity | Name         | Description                                            | Example                                             | Performance                      |
| ---------- | ------------ | ------------------------------------------------------ | --------------------------------------------------- | -------------------------------- |
| O(1)       | Constant     | Execution time does **not** change with input size.    | Accessing an element in an array by index           | ✅ Fastest possible complexity   |
| O(log n)   | Logarithmic  | Each step reduces the input size by a constant factor. | Binary Search                                       | ✅ Excellent for large inputs    |
| O(n)       | Linear       | Time grows proportionally with input size.             | Looping through an array once                       | ✅ Good for moderate inputs      |
| O(n log n) | Linearithmic | Involves a linear pass plus a logarithmic operation.   | Merge Sort, Quick Sort                              | ⚠️ Acceptable for large datasets |
| O(n²)      | Quadratic    | Time grows with the square of the input size.          | Bubble Sort, nested loops                           | ⚠️ Slows quickly with large n    |
| O(n³)      | Cubic        | Triple nested loops; used in naive matrix operations.  | Naive matrix multiplication                         | ⚠️ Impractical for large n       |
| O(2ⁿ)      | Exponential  | Time doubles with each additional input element.       | Brute-force solutions to TSP                        | 🚨 Infeasible for large inputs   |
| O(n!)      | Factorial    | Time grows factorially with input size.                | Generating all permutations (e.g., brute-force TSP) | 🚨 Becomes unusable fast         |

#### Sort Algorithm with Time/Space Complexities (Fastest to Slowest):

| Algorithm          | Best Case   | Average Case | Worst Case | Space Complexity  
| ------------------ | ----------- | ------------ | ---------- | ------------ | 
| **Bubble Sort**    | O(n)        | O(n²)      | O(n²)      | O(1)     |
| **Selection Sort** | O(n²)       | O(n²)      | O(n²)      | O(1)     | 
| **Insertion Sort** | O(n)        | O(n²)      | O(n²)      | O(1)     | 
| **Merge Sort**     | O(n log n)  | O(n log n) | O(n log n) | O(n)     | 
| **Quick Sort**     | O(n log n)  | O(n log n) | O(n²)      | O(log n) | 
| **Heap Sort**      | O(n log n)  | O(n log n) | O(n log n) | O(1)     | 


## Author

([@whosramoss](https://github.com/whosramoss))
