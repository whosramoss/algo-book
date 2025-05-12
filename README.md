<h1 align="center">Algo Book</h1>

<p align="center">
  This is a collection of solved algorithms to sharpen my programming skills,<br/> and each code can be compiled at site:
  <a  href="https://onecompiler.com/">onecompiler</a>.
</p>

<div align="center">
  <img src="https://img.shields.io/badge/Python-242424?style=for-the-badge&logo=python&logoColor=white" alt="Python">
  <img src="https://img.shields.io/badge/Java-242424?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Go-242424?style=for-the-badge&logo=go&logoColor=white" alt="golang">
  <img src="https://img.shields.io/badge/Typescript-242424?style=for-the-badge&logo=typescript&logoColor=fff" alt="TypeScript">
</div>
<br/>

<br/>

## About
Algo-Book is a curated collection of algorithms implemented in modern programming languages, designed to help developers and students understand, practice, and master algorithmic thinking. It includes classic algorithmic problems like sorting, searching, graph traversal, dynamic programming, and more — each with clean, well-documented code.

## Features:
- Ready-to-use implementations of common algorithms
- Clean, readable, and testable code

#### Algorithms:
| Name                                                                 | Easy | Files                                                                                                                                                                                                                                                                                     |
| -------------------------------------------------------------------- | ---- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Binary Search](./binary_search/readme.md)                           | Easy | [Python](./binary_search/binary_search.py) - [TypeScript](./binary_search/binary_search.ts) - [Java](./binary_search/binary_search.java) - [Go](./binary_search/binary_search.go)                                                                                                         |
| [Branch Sums](./branch_sums//readme.md)                              | Easy | [Python](./branch_sums/branch_sums.py) - [TypeScript](./branch_sums/branch_sums.ts) - [Java](./branch_sums/branch_sums.java) - [Go](./branch_sums/branch_sums.go)                                                                                                                         |
| [Bubble Sort](.//bubble_sort//readme.md)                             | Easy | [Python](./bubble_sort/bubble_sort.py) - [TypeScript](./bubble_sort/bubble_sort.ts) - [Java](./bubble_sort/bubble_sort.java) - [Go](./bubble_sort/bubble_sort.go)                                                                                                                         |
| [Caesar Cipher Encryptor](./caesar_cipher_encryptor/readme.md)       | Easy | [Python](./caesar_cipher_encryptor/caesar_cipher_encryptor.py) - [TypeScript](./caesar_cipher_encryptor/caesar_cipher_encryptor.ts) - [Java](./caesar_cipher_encryptor/caesar_cipher_encryptor.java) - [Go](./caesar_cipher_encryptor/caesar_cipher_encryptor.go)                         |
| [Class Photos](./class_photos/readme.md)                             | Easy | [Python](./class_photos/class_photos.py) - [TypeScript](./class_photos/class_photos.ts) - [Java](./class_photos/class_photos.java) - [Go](./class_photos/class_photos.go)                                                                                                                 |
| [Depth-First Search](./depth_fisrt_search/readme.md)                 | Easy | [Python](./depth_fisrt_search/depth_fisrt_search.py) - [TypeScript](./depth_fisrt_search/depth_fisrt_search.ts) - [Java](./depth_fisrt_search/depth_fisrt_search.java) - [Go](./depth_fisrt_search/depth_fisrt_search.go)                                                                 |
| [Find Closest Value in BST](./find_closest_value_in_bst/readme.md)   | Easy | [Python](./find_closest_value_in_bst/find_closest_value_in_bst.py) - [TypeScript](./find_closest_value_in_bst/find_closest_value_in_bst.ts) - [Java](./find_closest_value_in_bst/find_closest_value_in_bst.java) - [Go](./find_closest_value_in_bst/find_closest_value_in_bst.go)         |
| [Find Three Largest numbers](./find_three_largest_numbers/readme.md) | Easy | [Python](./find_three_largest_numbers/find_three_largest_numbers.py) - [TypeScript](./find_three_largest_numbers/find_three_largest_numbers.ts) - [Java](./find_three_largest_numbers/find_three_largest_numbers.java) - [Go](./find_three_largest_numbers/find_three_largest_numbers.go) |


## Big-O Notation
Big-O Notation describes the performance of an algorithm in terms of time or space complexity relative to the input size n. It gives an upper bound on the number of operations an algorithm will take. This helps compare and evaluate algorithms for efficiency.

#### Common Time Complexities (Fastest to Slowest):

```
O(1) > O(log n) > O(n) > O(n log n) > O(n²) > O(n³) > O(2ⁿ) > O(n!)
```

| Complexity | Name         | Description                                                                 | Example                                     | Performance                  |
|------------|--------------|-----------------------------------------------------------------------------|---------------------------------------------|------------------------------|
| O(1)       | Constant     | Execution time does **not** change with input size.                        | Accessing an element in an array by index   | ✅ Fastest possible complexity |
| O(log n)   | Logarithmic  | Each step reduces the input size by a constant factor.                     | Binary Search                               | ✅ Excellent for large inputs |
| O(n)       | Linear       | Time grows proportionally with input size.                                 | Looping through an array once               | ✅ Good for moderate inputs   |
| O(n log n) | Linearithmic | Involves a linear pass plus a logarithmic operation.                       | Merge Sort, Quick Sort                      | ⚠️ Acceptable for large datasets |
| O(n²)      | Quadratic    | Time grows with the square of the input size.                              | Bubble Sort, nested loops                   | ⚠️ Slows quickly with large n |
| O(n³)      | Cubic        | Triple nested loops; used in naive matrix operations.                      | Naive matrix multiplication                 | ⚠️ Impractical for large n    |
| O(2ⁿ)      | Exponential  | Time doubles with each additional input element.                           | Brute-force solutions to TSP                | 🚨 Infeasible for large inputs |
| O(n!)      | Factorial    | Time grows factorially with input size.                                    | Generating all permutations (e.g., brute-force TSP) | 🚨 Becomes unusable fast      |
## Contributing

If you want to contribute to `algo-book`, please make sure to review the [contribution guidelines](https://github.com/whosramoss/algo-book/blob/master/CONTRIBUTING.md). This project makes use of [GitHub issues](https://github.com/whosramoss/algo-book/issues) for
tracking requests and bugs.

## License

MIT License. [LICENSE](./LICENSE)

## Author

Gabriel Ramos ([@whosramoss](https://github.com/whosramoss))
