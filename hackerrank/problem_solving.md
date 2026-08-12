# Problem Solving

Python solutions for HackerRank's [Problem Solving Basic](https://www.hackerrank.com/skills-verification/problem_solving_basic) and [Problem Solving Intermediate](https://www.hackerrank.com/skills-verification/problem_solving_intermediate) skills certification, covering both the Basic and Intermediate levels. Each entry describes the task and shows the solution.

## Basic

- [Active Traders](#active-traders)
- [Balanced System Files Partition](#balanced-system-files-partition)
- [Longest Subarray](#longest-subarray)
- [Maximum Cost of Laptop Count](#maximum-cost-of-laptop-count)
- [Nearly Similar Rectangles](#nearly-similar-rectangles)
- [Parallel Processing](#parallel-processing)
- [Password Decryption](#password-decryption)
- [Road Repair](#road-repair)
- [String Anagram](#string-anagram)
- [Subarray Sums](#subarray-sums)
- [Unexpected Demand](#unexpected-demand)
- [Usernames Changes](#usernames-changes)
- [Vowel Substring](#vowel-substring)

## Intermediate

- [Bitwise AND](#bitwise-and)
- [Equalizing Array Elements](#equalizing-array-elements)
- [File Renaming](#file-renaming)
- [Hotel Construction](#hotel-construction)
- [Largest Area](#largest-area)
- [Maximum Subarray Value](#maximum-subarray-value)
- [Nice Teams](#nice-teams)
- [Sorted Sums](#sorted-sums)
- [Task of Pairing](#task-of-pairing)
- [User Friendly Password System](#user-friendly-password-system)

---

### Active Traders

Count how often each customer appears and return, in alphabetical order, the names accounting for at least 5 percent of all transactions.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

from collections import defaultdict

#
# Complete the 'mostActive' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts STRING_ARRAY customers as parameter.
#

def mostActive(customers):
    d = defaultdict(int)
    for c in customers:
        d[c] += 1
    return sorted([c for c, cnt in d.items() if cnt / len(customers) >= 0.05])
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    customers_count = int(input().strip())

    customers = []

    for _ in range(customers_count):
        customers_item = input()
        customers.append(customers_item)

    result = mostActive(customers)

    fptr.write('\n'.join(result))
    fptr.write('\n')

    fptr.close()
```
---

### Balanced System Files Partition

Cut one edge of a tree of files so the two resulting parts have sizes as close as possible, and return the smallest achievable difference.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'mostBalancedPartition' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY parent
#  2. INTEGER_ARRAY files_size
#

def mostBalancedPartition(parent, files_size):
    n = len(parent)
    children = [[] for _ in range(n)]
    for i in range(1, n):
        children[parent[i]].append(i)
    size_sums = [None for _ in range(n)]
    
    def size_sums_rec(i):
        size_sums[i] = files_size[i] + sum(size_sums_rec(c) for c in children[i])
        return size_sums[i]
        
    size_sums_rec(0)
    return min(abs(size_sums[0] - 2 * ss) for ss in size_sums[1:])

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    parent_count = int(input().strip())

    parent = []

    for _ in range(parent_count):
        parent_item = int(input().strip())
        parent.append(parent_item)

    files_size_count = int(input().strip())

    files_size = []

    for _ in range(files_size_count):
        files_size_item = int(input().strip())
        files_size.append(files_size_item)

    result = mostBalancedPartition(parent, files_size)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Longest Subarray

Find the length of the longest subarray whose elements differ by at most 1.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the 'longestSubarray' function below.
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.

def longestSubarray(arr):
    n = len(arr)
    ans = 0
    # O(n^2) is okay because of constraints.
    for i in range(n):
        w = []
        cnt = 0
        for j in range(i, n):
            if arr[j] in w:
                cnt += 1
                continue
            if len(w) == 0:
                w.append(arr[j])
            elif len(w) == 1:
                if abs(w[0] - arr[j]) > 1:
                    break
                else:
                    w.append(arr[j])
            else:
                break
            cnt += 1
        ans = max(ans, cnt)
    return ans
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = []

    for _ in range(arr_count):
        arr_item = int(input().strip())
        arr.append(arr_item)

    result = longestSubarray(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Maximum Cost of Laptop Count

Accumulate costs while skipping items labelled illegal, and return the highest total reached by any full daily batch.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the 'maxCost' function below.

# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY cost
#  2. STRING_ARRAY labels
#  3. INTEGER dailyCount


def maxCost(cost, labels, dailyCount):
    ans = 0
    cur_cnt = 0
    cur_cost = 0
    for c, l in zip(cost, labels):
        cur_cost += c
        if l == "illegal":
            continue
        cur_cnt += 1
        if cur_cnt == dailyCount:
            ans = max(ans, cur_cost)
            cur_cnt = 0
            cur_cost = 0
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    cost_count = int(input().strip())

    cost = []

    for _ in range(cost_count):
        cost_item = int(input().strip())
        cost.append(cost_item)

    labels_count = int(input().strip())

    labels = []

    for _ in range(labels_count):
        labels_item = input()
        labels.append(labels_item)

    dailyCount = int(input().strip())

    result = maxCost(cost, labels, dailyCount)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Nearly Similar Rectangles

Reduce each rectangle's sides by their greatest common divisor, then count the pairs that share the same ratio.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

from collections import defaultdict

#
# Complete the 'nearlySimilarRectangles' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
#

def nearlySimilarRectangles(sides):
    gcd = lambda a, b: gcd(b, a % b) if b > 0 else a
    d = defaultdict(int)
    for w, h in sides:
        z = gcd(w, h)
        d[(w // z, h // z)] += 1
    return sum((x * (x - 1)) // 2 for x in d.values())
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    sides_rows = int(input().strip())
    sides_columns = int(input().strip())

    sides = []

    for _ in range(sides_rows):
        sides.append(list(map(int, input().rstrip().split())))

    result = nearlySimilarRectangles(sides)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Parallel Processing

Split the files by whether their size divides evenly across the cores, then use the limited parallel slots on the largest of those to minimize total time.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'minTime' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY files
#  2. INTEGER numCores
#  3. INTEGER limit
#

def minTime(files, numCores, limit):
    x = []
    y = []
    for f in files:
        if f % numCores == 0:
            x.append(f)
        else:
            y.append(f)
    x.sort(reverse=True)
    return (sum(x[:limit]) // numCores) + sum(x[limit:]) + sum(y)
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    files_count = int(input().strip())

    files = []

    for _ in range(files_count):
        files_item = int(input().strip())
        files.append(files_item)

    numCores = int(input().strip())

    limit = int(input().strip())

    result = minTime(files, numCores, limit)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Password Decryption

Undo the encryption steps in reverse: restore the characters replaced by zeros, then swap back the pairs marked by asterisks.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'decryptPassword' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def decryptPassword(s):
    s = list(s)
    i = 0
    while i < len(s) and s[i].isdigit() and s[i] != "0":
        i += 1
    for j, k in enumerate([l for l in range(i, len(s)) if s[l] == "0"]):
        s[k] = s[i - j - 1]
    for j in range(i, len(s)):
        if s[j] == "*":
            s[j - 1], s[j - 2] = s[j - 2], s[j - 1]
    return "".join(s[i:]).replace("*", "")

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = decryptPassword(s)

    fptr.write(result + '\n')

    fptr.close()
```
---

### Road Repair

Sort both crews and jobs, then pair them in order so the total travel distance is minimal.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'getMinCost' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY crew_id
#  2. INTEGER_ARRAY job_id
#

def getMinCost(crew_id, job_id):
    crew_id.sort()
    job_id.sort()
    return sum(abs(c - j) for c, j in zip(crew_id, job_id))
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    crew_id_count = int(input().strip())

    crew_id = []

    for _ in range(crew_id_count):
        crew_id_item = int(input().strip())
        crew_id.append(crew_id_item)

    job_id_count = int(input().strip())

    job_id = []

    for _ in range(job_id_count):
        job_id_item = int(input().strip())
        job_id.append(job_id_item)

    result = getMinCost(crew_id, job_id)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### String Anagram

Index the dictionary by sorted letters, then report for each query how many dictionary words are anagrams of it.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

from collections import defaultdict

#
# Complete the 'stringAnagram' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. STRING_ARRAY dictionary
#  2. STRING_ARRAY query
#

def stringAnagram(dictionary, query):
    d = defaultdict(int)
    for w in dictionary:
        d["".join(sorted(w))] += 1
    ans = []
    for w in query:
        w = "".join(sorted(w))
        ans.append(d[w] if w in d else 0)
    return ans
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    dictionary_count = int(input().strip())

    dictionary = []

    for _ in range(dictionary_count):
        dictionary_item = input()
        dictionary.append(dictionary_item)

    query_count = int(input().strip())

    query = []

    for _ in range(query_count):
        query_item = input()
        query.append(query_item)

    result = stringAnagram(dictionary, query)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
```
---

### Subarray Sums

Answer range-sum queries with prefix sums, using a second prefix array to account for the value substituted for each zero.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'findSum' function below.
#
# The function is expected to return a LONG_INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY numbers
#  2. 2D_INTEGER_ARRAY queries
#

def findSum(numbers, queries):
    a = [0]
    b = [0]
    for x in numbers:
        a.append(a[-1] + x)
        b.append(b[-1] + (x == 0))
    return [a[r] - a[l - 1] + x * (b[r] - b[l - 1]) for l, r, x in queries]
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    numbers_count = int(input().strip())

    numbers = []

    for _ in range(numbers_count):
        numbers_item = int(input().strip())
        numbers.append(numbers_item)

    queries_rows = int(input().strip())
    queries_columns = int(input().strip())

    queries = []

    for _ in range(queries_rows):
        queries.append(list(map(int, input().rstrip().split())))

    result = findSum(numbers, queries)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
```
---

### Unexpected Demand

Fill the smallest orders first to maximize how many can be satisfied within the available stock.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'filledOrders' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY order
#  2. INTEGER k
#

def filledOrders(order, k):
    order.sort()
    ans = 0
    for x in order:
        if x <= k:
            ans += 1
            k -= x
        else:
            break
    return ans
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    order_count = int(input().strip())

    order = []

    for _ in range(order_count):
        order_item = int(input().strip())
        order.append(order_item)

    k = int(input().strip())

    result = filledOrders(order, k)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Usernames Changes

Answer `YES` when a username has any character greater than the one after it, meaning a swap can produce a smaller string.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'possibleChanges' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts STRING_ARRAY usernames as parameter.
#

def possibleChanges(usernames):
    ans = []
    for u in usernames:
        if len(u) <= 1:
            ans.append("NO")
        for i in range(len(u) - 1):
            if u[i] > u[i + 1]:
                ans.append("YES")
                break
        else:
            ans.append("NO")
    return ans
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    usernames_count = int(input().strip())

    usernames = []

    for _ in range(usernames_count):
        usernames_item = input()
        usernames.append(usernames_item)

    result = possibleChanges(usernames)

    fptr.write('\n'.join(result))
    fptr.write('\n')

    fptr.close()
```
---

### Vowel Substring

Slide a window of length k across the string and return the window holding the most vowels, or `Not found!` when there are none.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'findSubstring' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER k
#

def findSubstring(s, k):
    vowels = ["a", "e", "i", "o", "u"]
    cur = best = sum([c in vowels for c in s[:k]])
    ans = 0
    for i in range(k, len(s)):
        cur += s[i] in vowels
        cur -= s[i - k] in vowels
        if cur > best:
            best = cur
            ans = i - k + 1
    if best > 0:
        return s[ans:(ans+k)]
    else:
        return "Not found!"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    k = int(input().strip())

    result = findSubstring(s, k)

    fptr.write(result + '\n')

    fptr.close()
```
---

### Bitwise AND

Group equal values, then count the pairs whose bitwise AND is an exact power of two.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

from collections import defaultdict

#
# Complete the 'countPairs' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def countPairs(arr):
    po2 = lambda x: x > 0 and not (x & (x - 1))
    d = defaultdict(int)
    for x in arr:
        d[x] += 1
    d = list(d.items())
    ans = 0
    for i in range(len(d)):
        a, a_cnt = d[i]
        for j in range(i, len(d)):
            b, b_cnt = d[j]
            if po2(a & b):
                if a == b:
                    ans += (a_cnt * (a_cnt - 1)) // 2
                else:
                    ans += a_cnt * b_cnt
    return ans          

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = []

    for _ in range(arr_count):
        arr_item = int(input().strip())
        arr.append(arr_item)

    result = countPairs(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Equalizing Array Elements

Repeatedly divide each element by d, tracking how many values reach each intermediate result and at what cost, to find the cheapest way to get `threshold` equal elements.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

from collections import defaultdict


#
# Complete the 'minOperations' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY arr
#  2. INTEGER threshold
#  3. INTEGER d
#

def minOperations(arr, threshold, d):
    # dp[i] := [count of i values, number of steps]
    dp = defaultdict(lambda: [0, 0])
    arr.sort()
    ans = sys.maxsize
    for x in arr:
        steps = 0
        while True:
            dp[x][0] += 1
            dp[x][1] += steps
            if dp[x][0] >= threshold:
                ans = min(ans, dp[x][1])
            if x == 0:
                break
            x //= d
            steps += 1
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = []

    for _ in range(arr_count):
        arr_item = int(input().strip())
        arr.append(arr_item)

    threshold = int(input().strip())

    d = int(input().strip())

    result = minOperations(arr, threshold, d)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### File Renaming

Count how many times the new name appears as a subsequence of the old name, using a rolling dynamic programming table.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'renameFile' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. STRING newName
#  2. STRING oldName
#

def renameFile(newName, oldName):
    n = len(newName)
    m = len(oldName)
    dp = [1 for j in range(m + 1)]
    for i in range(1, n + 1):
        dpp = [0 for _ in range(m + 1)]
        for j in range(i, m + 1):
            dpp[j] = dpp[j - 1]
            if newName[i - 1] == oldName[j - 1]:
                dpp[j] += dp[j - 1]
        dp = dpp
    return dp[-1] % (10**9 + 7)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    newName = input()

    oldName = input()

    result = renameFile(newName, oldName)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Hotel Construction

Count the triples of cities in a tree that sit at equal distance from one another, using a breadth-first search from each candidate.

```python
#!/bin/python3

import math
import os
import random
import re
import sys

from itertools import product

#
# Complete the 'numberOfWays' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY roads as parameter.
#

def numberOfWays(roads):
    n = len(roads) + 1
    adj = [[] for _ in range(n)]
    for i, j in roads:
        adj[i - 1].append(j - 1)
        adj[j - 1].append(i - 1)
    ans = 0
    
    def dfs(x, d):
        dist[x] = d
        for y in adj[x]:
            if dist[y] == -1:
                dfs(y, d + 1)
    
    # Brute force.
    for i in range(n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                dist = [-1 for _ in range(n)]
                dfs(i, 0)
                if dist[j] != dist[k]:
                    continue
                dist = [-1 for _ in range(n)]
                dfs(j, 0)
                if dist[i] == dist[k]:
                    ans += 1
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    roads_rows = int(input().strip())
    roads_columns = int(input().strip())

    roads = []

    for _ in range(roads_rows):
        roads.append(list(map(int, input().rstrip().split())))

    result = numberOfWays(roads)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Largest Area

Track the widest horizontal and vertical gaps with a segment tree as each cut is applied, and report the largest rectangle area after every cut.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'getMaxArea' function below.
#
# The function is expected to return a LONG_INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER w
#  2. INTEGER h
#  3. BOOLEAN_ARRAY isVertical
#  4. INTEGER_ARRAY distance
#

class Node:
    def __init__(self, parent, l, r, op=max):
        self.parent = parent
        self.l = l
        self.r = r
        self.lc = None
        self.rc = None
        self.val = r - l
        self.op = op
    
    def split(self, x):
        # No balancing, but doesn't seem to give timeouts.
        assert self.l <= x <= self.r
        if x == self.l or x == self.r:
            # Split lies on borders.
            return
        if self.lc:
            if x == self.lc.r:
                # Split lies on mid split.
                return
            if x < self.lc.r:
                self.lc.split(x)
            else:
                self.rc.split(x)
            self.val = self.op(self.lc.val, self.rc.val)
        else:
            self.lc = Node(parent=self, l=self.l, r=x)
            self.rc = Node(parent=self, l=x, r=self.r)
            self.val = self.op(x - self.l, self.r - x)
        
def getMaxArea(w, h, isVertical, distance):
    w_root = Node(parent=None, l=0, r=w)
    h_root = Node(parent=None, l=0, r=h)
    ans = []
    for iv, d in zip(isVertical, distance):
        if iv:
            w_root.split(d)
        else:
            h_root.split(d)
        ans.append(w_root.val * h_root.val)
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    w = int(input().strip())

    h = int(input().strip())

    isVertical_count = int(input().strip())

    isVertical = []

    for _ in range(isVertical_count):
        isVertical_item = int(input().strip()) != 0
        isVertical.append(isVertical_item)

    distance_count = int(input().strip())

    distance = []

    for _ in range(distance_count):
        distance_item = int(input().strip())
        distance.append(distance_item)

    result = getMaxArea(w, h, isVertical, distance)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
```
---

### Maximum Subarray Value

Build prefix sums for the even and odd positions, then maximize the squared difference between them over every subarray.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'maxSubarrayValue' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def maxSubarrayValue(arr):
    # Gets timeouts.
    even = [0]
    odd = [0]
    for i in range(len(arr)):
        if i % 2 == 0:
            even.append(even[-1] + arr[i])
            odd.append(odd[-1])
        else:
            even.append(even[-1])
            odd.append(odd[-1] + arr[i])
    ans = 0
    for i in range(len(arr)):
        for j in range(i + 1, len(arr) + 1):
            a = even[j] - even[i]
            b = odd[j] - odd[i]
            ans = max(ans, (a - b)**2)
    return ans
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = []

    for _ in range(arr_count):
        arr_item = int(input().strip())
        arr.append(arr_item)

    result = maxSubarrayValue(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Nice Teams

Sort the skill levels and greedily match each of the weaker half against a partner at least `minDiff` above it, maximizing the number of teams.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'maxPairs' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY skillLevel
#  2. INTEGER minDiff
#

def maxPairs(skillLevel, minDiff):
    skillLevel.sort()
    n = len(skillLevel)
    i = 0
    x = []
    for j in range(n // 2):
        while i < n and skillLevel[i] - skillLevel[j] < minDiff:
            i += 1
        if i >= n:
            break
        x.append(i)
    x = x[:(n // 2)]
    ans = 0
    k = n - 1
    for y in reversed(x):
        if y <= k:
            ans += 1
            k -= 1
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    skillLevel_count = int(input().strip())

    skillLevel = []

    for _ in range(skillLevel_count):
        skillLevel_item = int(input().strip())
        skillLevel.append(skillLevel_item)

    minDiff = int(input().strip())

    result = maxPairs(skillLevel, minDiff)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Sorted Sums

Use a Fenwick tree to maintain rank and suffix-sum information, so each prefix contributes its sorted weighted sum incrementally.

```python
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'sortedSum' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

class FWT:
    def __init__(self, size):
        self.size = size
        self.arr = [0 for _ in range(self.size)]
    
    def add(self, x, val):
        if x == 0:
            self.arr[0] += val
            return
        while x < self.size:
            self.arr[x] += val
            x += x & (-x)
    
    def rank(self, x):
        if x < 0:
            return 0
        res = self.arr[0]
        while x > 0:
            res += self.arr[x]
            x &= x - 1
        return res

def sortedSum(a):
    A_LIMIT = 10**6
    M = 10**9 + 7
    # pre.rank(x) := How many digits are before x.
    pre = FWT(A_LIMIT + 1)
    # post.rank(x) := How much of the total sum is after x.
    post = FWT(A_LIMIT + 1)
    cur_fn = ans = total = 0
    for i in range(len(a)):
        pos = pre.rank(a[i]) + 1
        # The part of f(n) which will also be added because
        # it gets shifted one to the right.
        greater = total - post.rank(a[i])
        cur_fn = (cur_fn + pos * a[i] + greater) % M
        ans = (ans + cur_fn) % M
        pre.add(a[i], 1)
        post.add(a[i], a[i])
        total += a[i]
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a_count = int(input().strip())

    a = []

    for _ in range(a_count):
        a_item = int(input().strip())
        a.append(a_item)

    result = sortedSum(a)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### Task of Pairing

Normalize each frequency down to at most two leftover items, then run a dynamic programming pass over movable and immovable states to maximize the number of pairs.

```python
#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'taskOfPairing' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts LONG_INTEGER_ARRAY freq as parameter.
#

def taskOfPairing(freq):
# Could break for n > sys.maxsize, but that's a lot.
    n = len(freq)
    inf = sys.maxsize
    if n == 1:
        return freq[0] // 2
    ans = 0
    # Normalize.
    for i in range(n):
        x = 0 if freq[i] <= 2 else ((freq[i] + 1) // 2) - 1
        ans += x
        freq[i] -= 2 * x
    # (#movable, #immovable)
    # dp := [(0, 0), (1, 0), (2, 0), (0, 1), (1, 1), (2, 1)]
    dp = [-inf] * 6
    dp[freq[0]] = 0
    if freq[0] == 2:
        dp[0] = 1
    for i in range(1, n):
        dpp = [-inf] * 6
        f = freq[i]
        # Case: Do nothing.
        dpp[f] = max(dp)
        # Case: Just get one from prev.
        dpp[f + 3] = max(dp[1], dp[2], dp[4], dp[5])
        if f >= 1:
            # Case: Prev has at least one movable or immovable. Combine once.
            dpp[f - 1] = max(dp[1:]) + 1
            # Case: Prev has movable and immovable. Combine with immovable and get movable.
            dpp[f - 1 + 3] = max(dpp[f - 1 + 3], max(dp[4], dp[5]) + 1)
        if f >= 2:
            # Case: Combine own two.
            dpp[f - 2] = max(dp) + 1
            # Case: Combine own two and try to get movable from prev.
            dpp[f - 2 + 3] = max(dp[1], dp[2], dp[4], dp[5]) + 1
        dp = dpp
    return ans + max(dp)
            
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    freq_count = int(input().strip())

    freq = []

    for _ in range(freq_count):
        freq_item = int(input().strip())
        freq.append(freq_item)

    result = taskOfPairing(freq)

    fptr.write(str(result) + '\n')

    fptr.close()
```
---

### User Friendly Password System

Precompute the polynomial hash of the password plus every single-character insertion, so each authorization attempt is a constant-time set lookup.

```python
#!/bin/python3

import math
import os
import random
import re
import string
import sys



#
# Complete the 'authEvents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts 2D_STRING_ARRAY events as parameter.
#

P = 131
M = 10**9 + 7
PP = [P**i for i in range(11)]
APPENDS = [""] + list(string.ascii_letters) + [str(d) for d in range(10)]

def calc_hash(pw):
    cur_h = 0
    for i in range(len(pw)):
        cur_h += ord(pw[-(i+1)]) * PP[i]
    return cur_h % M

def authEvents(events):
    cur_h = None
    good_hashs = None
    ans = []
    for event, value in events:
        if event == "setPassword":
            good_hashs = set(calc_hash(value + x) for x in APPENDS)
        else:
            assert event == "authorize"
            ans.append(1 if int(value) in good_hashs else 0)
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    events_rows = int(input().strip())
    events_columns = int(input().strip())

    events = []

    for _ in range(events_rows):
        events.append(input().rstrip().split())

    result = authEvents(events)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
```
---
