# 10 Days of Statistics


Solutions to HackerRank's [10 Days of Statistics](https://www.hackerrank.com/domains/tutorials/10-days-of-statistics/) challenge. Each entry describes the task and shows the solution.

- [Day 0: Mean, Median, and Mode](#day-0-mean-median-and-mode)
- [Day 0: Weighted Mean](#day-0-weighted-mean)
- [Day 1: Quartiles](#day-1-quartiles)
- [Day 1: Interquartile Range](#day-1-interquartile-range)
- [Day 1: Standard Deviation](#day-1-standard-deviation)
- [Day 4: Binomial Distribution I](#day-4-binomial-distribution-i)
- [Day 4: Binomial Distribution II](#day-4-binomial-distribution-ii)
- [Day 4: Geometric Distribution I](#day-4-geometric-distribution-i)
- [Day 4: Geometric Distribution II](#day-4-geometric-distribution-ii)
- [Day 5: Poisson Distribution I](#day-5-poisson-distribution-i)
- [Day 5: Poisson Distribution II](#day-5-poisson-distribution-ii)
- [Day 5: Normal Distribution I](#day-5-normal-distribution-i)
- [Day 5: Normal Distribution II](#day-5-normal-distribution-ii)
- [Day 6: The Central Limit Theorem I](#day-6-the-central-limit-theorem-i)
- [Day 6: The Central Limit Theorem II](#day-6-the-central-limit-theorem-ii)
- [Day 6: The Central Limit Theorem III](#day-6-the-central-limit-theorem-iii)
- [Day 7: Pearson Correlation Coefficient I](#day-7-pearson-correlation-coefficient-i)
- [Day 7: Spearman's Rank Correlation Coefficient](#day-7-spearmans-rank-correlation-coefficient)
- [Day 8: Least Square Regression Line](#day-8-least-square-regression-line)
- [Day 9: Multiple Linear Regression](#day-9-multiple-linear-regression)

---

### Day 0: Mean, Median, and Mode

$$mean= \mu = { \sum_{i=1}^n x_{i}\over n}$$

$$\quad n = \textrm{number of values in data set}$$

$$median = \left\{ 
  \begin{array}{ c l }
    X[\frac{n}{2}] & \quad \textrm{if n is even}\\
    {(X[\frac{n-1}{2}] + X[\frac{n+1}{2}])\over 2}& \quad \textrm{if n is odd}
  \end{array}
\right.$$

$$X = \textrm{ordered list of values in data set}$$

$$mode = \textrm{a number that appears most frequently in a data set}$$

```python
N = int(input())
sample = sorted(list(map(float, input().strip().split())))
if N == len(sample):
	
	# mean
	sum_ = 0
	for i in sample:
		sum_ += i
	mean = sum_/N
	
	# median
	if N%2 == 0:
		median = (sample[int(N/2-0.5)] + sample[int(N/2+0.5)])/2
	else:
		median = sample[int(N/2+0.5)]
	
	# mode
	mode = []
	count = {}
	for i in sample:
		if i in count:
			count[i] += 1
		else:
			count[i] = 1
	for key in count.keys():
		if count[key] == max(count.values()):
			mode.append(key)
		
	print(round(mean, 1))
	print(round(median, 1))
	print(mode[0])
```
---

### Day 0: Weighted Mean

$$\textrm{Weighted Mean} = m_w = {\sum_{i=1}^n (x_i \times w_i)\over \sum_{i=1}^n w_i}$$



```python
def weightedMean(X, W):
	global n
	XW_sum = 0
	W_sum = 0
	for i in range(n):
		XW_sum += X[i] * W[i]
		W_sum += W[i]
	print(round((XW_sum/W_sum), 1))

if __name__ == '__main__':
	n = int(input().strip())
	vals = list(map(int, input().rstrip().split()))
	weights = list(map(int, input().rstrip().split()))
	weightedMean(vals, weights)
```
---

### Day 1: Quartiles

$$\textrm{Lower Quartile} =Q_1 = median(X_{1}^{n/2})$$

$$\textrm{Middle Quartile} =Q_2 = median(X_{1}^{n})$$

$$\textrm{Upper Quartile} =Q_3 = median(X_{n/2}^{n})$$

$$X = \textrm{ordered list of values in data set}\\
X_i^j  = \textrm{range of X values in between i and j}\\
whereas\; i < j,\; 1 \leq i \leq n,\; 1 \leq j \leq n$$


```python
import os

def medium(arr):
	n = len(arr)
	if n%2 == 0:
		Q = (arr[int((n-1)*0.5)] + arr[int((n+1)*0.5)])/2
	else:
		Q = arr[int(n*0.5)]
	if Q - int(Q) == 0:
		return int(Q)
	else:
		return Q

def quartiles(arr):
	n = len(arr)
	Q2 = medium(arr)
	Q1 = medium(arr[:n//2])
	Q3 = medium(arr[int(n/2+0.5):])
	return Q1, Q2, Q3

if __name__ == '__main__':
	fptr = open(os.environ['OUTPUT_PATH'], 'w')
	n = int(input().strip())
	data = list(sorted(map(int, input().rstrip().split())))
	res = quartiles(data)
	fptr.write('\n'.join(map(str, res)))
	fptr.write('\n')
	fptr.close()
```
---

### Day 1: Standard Deviation

$$\textrm{Standard Deviation} = \sigma = \sqrt{\sum_{i=1}^n (x_i - \mu)^2\over n}$$


```python
def mean(arr):
	global n
	sum_ = 0
	for i in range(n):
		sum_ += arr[i]
	return n, sum_/n

def stdDev(arr):
	n, mean_ = mean(arr)
	std = 0
	for i in range(n):
		std += ((mean_ - arr[i])**2)
	print((std/n)**0.5)

if __name__ == '__main__':
	n = int(input().strip())
	vals = list(map(int, input().rstrip().split()))
	stdDev(vals)
```
---

### Day 1: Interquartile Range

$$\textrm{Interquartile Range} = Q3 - Q1$$


```python
def median(arr):
	N = len(arr)
	if N%2==0:
		med = (arr[int((N-1)*0.5)] + arr[int((N+1)*0.5)])/2
	else:
		med = arr[int(N*0.5)]
	return float(med)

def interQuartile(values, freqs):
	global n
	value_list = []
	for i in range(n):
		for _ in range(freqs[i]):
			value_list.append(values[i])
	value_list.sort()
	n = len(value_list)
	print(round(\
	median(value_list[int((n+1)*0.5):]) - median(value_list[:n//2]), 1))

if __name__ == '__main__':
	n = int(input().strip())
	val = list(map(int, input().rstrip().split()))
	freq = list(map(int, input().rstrip().split()))
	interQuartile(val, freq)
```
---

### Day 4: Binomial Distribution I

$$b(x,n,p) ={n! \over x!(n-x)!} \cdot p^x \cdot q^{(n-x)}$$

$$b(x \geq r, n, p) = \sum_{i=r}^n b(x=i,n,p)$$

```python
p1, n = map(float, input().split())

# p for boys
gap = 1/(1 + (n/p1))
x = 3
n = 6

def fact(x):
	a = 1
	for i in range(1, x+1):
		a *= i
	return a

def comb(n, r):
	return float(fact(n)/(fact(r)*fact(n-r)))

def bino(x, n, p):
	q = 1 - p
	return (comb(n, x)*(p**x)*(q**(n-x)))

print(round(sum([bino(i, n, gap) for i in range(x, n+1)]), 3))
```
---

### Day 4: Binomial Distribution II

$$P(i < x \leq j)= b(i \leq x \leq j, n, p) = \sum_{i=r}^j b(x=i,n,p)$$


```python
p, n = map(int, input().split())

p /= 100

def fact(x):
    if x == 0:
        a = 1
    else:
        a = 1
        for i in range(1, x+1):
            a *= i
    return a

def comb(n, r):
    return float(fact(n)/(fact(r)*fact(n-r)))

def bino(x, n, p):
    q = 1 - p
    return (comb(n, x)*(p**x)*(q**(n-x)))

def prob(from_, to_):
    print(round(sum([bino(i, n, p) for i in range(from_, to_+1)]), 3))

# no more than 2 rejects
prob(0, 2)

# at least 2 rejects
prob(2, n)
```
---

### Day 4: Geometric Distribution I

$$g(n,p) = q^{n-1} \cdot p$$

$$whereas,\;q = 1-p$$


```python
p1, p2 = map(int, input().split())
p0 = int(input())

p = p1/p2

def geo(n, p):
    return round((p*((1-p)**(n-1))), 3)

print(geo(p0, p))
```
---

### Day 4: Geometric Distribution II

$$P(x \leq j)= g(n \leq j, p) = \sum_{i=1}^j g(n=i,p)$$

```python
p1, p2 = map(int, input().split())
p0 = int(input())

p = p1/p2

def geo(n, p):
    return round(sum([(p*((1-p)**(i-1))) for i in range(1, n+1)]), 3)

print(geo(p0, p))
```
---

### Day 5: Poisson Distribution I

$$P(k, \lambda) = {\lambda^k e^{-\lambda}\over k!}$$


```python
import math
mean = float(input())
X = int(input())

def fact(x):
    if x == 0:
        n = 1
    else:
        n = 1
        for i in range(1, x+1):
            n *= i
    return n

def pois(X, mean):
    return round(((mean**X)*(math.exp(-mean)))/fact(X), 3)

print(pois(X, mean))
```
---

### Day 5: Poisson Distribution II

$$E[X^2] = \lambda + \lambda^2$$


```python
X, Y = map(float, input().split())

#def C_A(X):
print(round(160 + (40*(X+X**2)), 3))
    
#def C_B(Y):
print(round(128 + (40*(Y+Y**2)), 3))
```
---

### Day 5: Normal Distribution I

$$P(X \leq x) = F_X(x) = {1\over2}\Big(1 + erf\Big({x-\mu\over{\sigma \sqrt2}}\Big)\Big)$$

$$P(a \leq X \leq b) = F_X(b) - F_X(a)$$


```python
import math

# read input
mean, std = map(float, input().split())
X1 = float(input())
X2, X3 = map(float, input().split())

'''
# pdf: normal distribution
def norm(x, mean, std):
    con1 = math.exp(-((x - mean)**2)/(2*(std**2)))
    return con1/(std*math.sqrt(2*math.pi))
'''

# cdf: normal distribution
def norm(x, mean, std):
    return ((1 + math.erf((x - mean)/(math.sqrt(2)*std)))*0.5)

# Q01
print(round(norm(X1, mean, std), 3))

# Q02
print(round((norm(X3, mean, std) - norm(X2, mean, std)), 3))
```
---

### Day 5: Normal Distribution II

$$P(X \leq x) = F_X(x)$$

$$P(X > x) = 1 - P(X \leq x)= 1 - F_X(x)$$

```python
import math

mu, std = map(float, input().split())
X1 = float(input())
X2 = float(input())

# cdf: normal distribution
def norm(x, mean, std):
    return ((1 + math.erf((x - mean)/(math.sqrt(2)*std)))*0.5)*100

# X > X1
print(round(100 - norm(X1, mu, std), 2))

# X >= X2
print(round(100 - norm(X2, mu, std), 2))

# X < X2
print(round(norm(X2, mu, std), 2))
```
---

### Day 6: The Central Limit Theorem I

$$\mu^\prime = n \times \mu$$

$$\sigma^\prime = \sqrt n \times \sigma$$

$$F_X(x, \mu^\prime, \sigma^\prime) =  {1\over2}\Big(1 + erf\Big({x-\mu^\prime\over{\sigma^\prime \sqrt2}}\Big)\Big)$$


```python
import math

# read inputs
max_ = int(input())
box = int(input())
mu = int(input())
std = int(input())

# cdf: normal distribution
def norm(x, mean, std):
    return ((1 + math.erf((x - mean)/(math.sqrt(2)*std)))*0.5)

mu_ = box*mu
std_ = math.sqrt(box)*std

print(round(norm(max_, mu_, std_), 4))
```
---

### Day 6: The Central Limit Theorem II

$$\mu^\prime = n \times \mu$$

$$\sigma^\prime = \sqrt n \times \sigma$$

$$F_X(x, \mu^\prime, \sigma^\prime) =  {1\over2}\Big(1 + erf\Big({x-\mu^\prime\over{\sigma^\prime \sqrt2}}\Big)\Big)$$


```python
import math

# read all inputs
max_tic = int(input())
tic = int(input())
mu = float(input())
std = float(input())

# CDF: normal distribution
def norm(x, mean, std):
    return ((1 + math.erf((x - mean)/(math.sqrt(2)*std)))*0.5)

mu_ = tic * mu
std_ = math.sqrt(tic) * std

print(round(norm(max_tic, mu_, std_), 4))
```
---

### Day 6: The Central Limit Theorem III

$$\textrm{Confidence Interval} = \bar x \pm z {\sigma\over\sqrt n}$$


```python
# read inputs
sample = int(input())
mu = int(input())
std = int(input())
inte = float(input())
z = float(input())

# lower limit
print(round(mu - z*(std/(sample)**0.5), 2))

# higher limit
print(round(mu + z*(std/(sample)**0.5), 2))
```
---

### Day 7: Pearson Correlation Coefficient I

$$\mu_X = {\sum_{i=1}^n x_i\over n}, similarly\;\mu_Y$$

$$\sigma_X = \sqrt{\sum_{i=1}^n (x_i - \mu)^2\over n}, similarly\;\sigma_Y$$

$$\rho_{X,Y} = {\Sigma(x_i-\mu_X)\cdot(y_i-\mu_Y)\over{n\cdot \sigma_X\cdot \sigma_Y}}$$


```python
import math

# Read inputs 
n = int(input())
X = list(map(float, input().split()))
Y = list(map(float, input().split()))

# check n == len(X) == len(Y)

# mean
def mean(a):
    return sum(a)/len(a)

# standard deviation
def std(a):
    global n
    mu = mean(a)
    sum_ = 0.0
    for i in range(n):
        sum_ += ((a[i] - mu)**2)
    return math.sqrt(sum_/n)

# corr(X, Y)
def corr(arr1, arr2):
    global n
    mean1 = mean(arr1)
    mean2 = mean(arr2)
    conv = 0.0
    for i in range(n):
        conv += (arr1[i] - mean1) * (arr2[i] - mean2)
    print(round(conv/(n*std(arr1)*std(arr2)), 3))

corr(X, Y)
```
---

### Day 7: Spearman's Rank Correlation Coefficient

$$r_x \textrm{: rank of X values in descending order}$$

$$r_y \textrm{: rank of Y values in descending order}$$

$$N \textrm{: number of values in X or Y, }N_X = N_Y$$

$$1\leq r_x,r_y \leq N$$

$$r_{xy} = 1-{6\Sigma(r_x - r_y)^2\over{N(N^2-1)}}$$


```python
# Read inputs
n = int(input())
X = list(map(float, input().split()))
Y = list(map(float, input().split()))

# Ranking
def rank(arr):
    return [sorted(arr).index(x)+1 for x in arr]

# Spearman's rank correlation
def corr(arr1, arr2):
    global n
    r_arr1 = rank(arr1)
    r_arr2 = rank(arr2)
    sum_ = 0.0
    for i in range(n):
        sum_ += (r_arr1[i] - r_arr2[i])**2
    print(round(1-((6*sum_)/(n*((n**2)-1))), 3))

corr(X, Y)
```
---

### Day 8: Least Square Regression Line

$$a = {n\Sigma(x_iy_j)-(\Sigma x_i)(\Sigma y_j)\over{n\Sigma(x^2_i)-\Sigma(x_i)^2}}$$

$$b = {\Sigma(x_i-\mu_X)\cdot(y_i-\mu_Y)\over{n\cdot \sigma_X^2}}$$

$$\hat{Y} = a + bX$$


```python
import math

# Read inputs into array
n = 5
X, Y = list(), list()
for _ in range(n):
    x, y = map(int, input().split())
    X.append(x)
    Y.append(y)

# mean
def mean(a):
    return sum(a)/len(a)

# standard deviation
def std(a):
    global n
    mu = mean(a)
    sum_ = 0.0
    for i in range(n):
        sum_ += ((a[i] - mu)**2)
    return math.sqrt(sum_/n)

# corr(X, Y)
def corr(arr1, arr2):
    global n
    mean1 = mean(arr1)
    mean2 = mean(arr2)
    conv = 0.0
    for i in range(n):
        conv += (arr1[i] - mean1) * (arr2[i] - mean2)
    return conv/(n*std(arr1)*std(arr2))

# fit the best-fit line using least squares and find the value of y
def liner(X, Y, x1):
    b = corr(X,Y)*(std(Y)/std(X))
    a = mean(Y) - (b*mean(X))
    print(round(a + (b*x1), 3))

liner(X, Y, 80)
```
---

### Day 9: Multiple Linear Regression


```python
from sklearn import linear_model

# Set data
features, rows = map(int, input().split())
X, Y = [], []

# Get the parameters X and Y for discovery the variables a and b
for i in range(rows):
    x = [0]
    elements = list(map(float, input().split()))
    for j in range(len(elements)):
        if j < features:
            x.append(elements[j])
        else:
            Y.append(elements[j])
    X.append(x)

# Set the model LinearRegression
model = linear_model.LinearRegression()
model.fit(X, Y)
a = model.intercept_
b = model.coef_

# Get the parameters X for discovery the Y
new_rows = int(input())
new_X = []
for i in range(new_rows):
    x = [0]
    elements = list(map(float, input().split()))
    for j in range(len(elements)):
        x.append(elements[j])
    new_X.append(x)

# Gets the result and show on the screen
result = model.predict(new_X)
for i in range(len(result)):
    print(round(result[i],2))
```
---

