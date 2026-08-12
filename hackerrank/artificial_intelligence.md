# Artificial Intelligence

Python solutions for HackerRank's [Artificial Intelligence](https://www.hackerrank.com/domains/ai) domain, covering bot building, probability and statistics foundations, and statistics with machine learning. Each entry states the problem, links to the original challenge, and shows the solution.

- [Bot Saves Princess](#bot-saves-princess)
- [Bot Saves Princess 2](#bot-saves-princess-2)
- [BotClean](#botclean)
- [BotClean Stochastic](#botclean-stochastic)
- [BotClean Large](#botclean-large)
- [BotClean Partially Observable](#botclean-partially-observable)
- [Maze Escape](#maze-escape)
- [Basic Probability Puzzles 1](#basic-probability-puzzles-1)
- [Basic Probability Puzzles 2](#basic-probability-puzzles-2)
- [Basic Probability Puzzles 3](#basic-probability-puzzles-3)
- [Basic Probability Puzzles 4](#basic-probability-puzzles-4)
- [Basic Probability Puzzles 5](#basic-probability-puzzles-5)
- [Basic Probability Puzzles 6](#basic-probability-puzzles-6)
- [Basic Probability Puzzles 7](#basic-probability-puzzles-7)
- [Basic Statistics Warmup](#basic-statistics-warmup)
- [Computing the Correlation](#computing-the-correlation)
- [Correlation and Regression Lines 1](#correlation-and-regression-lines-1)
- [Correlation and Regression Lines 2](#correlation-and-regression-lines-2)
- [Correlation and Regression Lines 3](#correlation-and-regression-lines-3)
- [Correlation and Regression Lines 4](#correlation-and-regression-lines-4)
- [Multiple Linear Regression: Predicting House Prices](#multiple-linear-regression-predicting-house-prices)
- [Polynomial Regression: Office Prices](#polynomial-regression-office-prices)

---

### Bot Saves Princess

Princess Peach is trapped in one of the four corners of a square grid, and the bot starts at the center. Print the sequence of moves (`LEFT`, `RIGHT`, `UP`, `DOWN`) that reaches her in as few steps as possible.

[reference](https://www.hackerrank.com/challenges/saveprincess)

```python
def displayPathtoPrincess(n,grid):
    pos_col = {}
    pos_row = {}
    not_find = True

    for i in range(n):
        line = len(grid[i])
        for j in range(line):
            if grid[i][j] == 'm':
                pos_row['m'] = i
                pos_col['m'] = j
            elif grid[i][j] == 'p':
                pos_row['p'] = i
                pos_col['p'] = j

    while (not_find):
        if pos_row['m'] < pos_row['p']:
            pos_row['m'] = pos_row['m'] + 1
            print ('DOWN')
        elif pos_row['m'] > pos_row['p']:
            pos_row['m'] = pos_row['m'] - 1
            print ('UP')

        if pos_col['m'] < pos_col['p']:
            pos_col['m'] = pos_col['m'] + 1
            print ('RIGHT')
        elif pos_col['m'] > pos_col['p']:
            pos_col['m'] = pos_col['m'] - 1
            print ('LEFT')
        
        if pos_col['m'] == pos_col['p'] and pos_row['m'] == pos_row['m']:
            not_find = False

#print all the moves here
m = int(input())
grid = [] 
for i in range(0, m): 
    grid.append(input().strip())

displayPathtoPrincess(m,grid)
```
---

### Bot Saves Princess 2

Same rescue as before, but the bot and the princess start at arbitrary positions and the program is called once per turn. Print only the next move the bot should make.

[reference](https://www.hackerrank.com/challenges/saveprincess2)

```python
def nextMove(n,r,c,grid):
    pos_col_m = c
    pos_row_m = r
    pos_col_p = pos_row_p = 0

    for i in range(n):
        line = len(grid[i])
        for j in range(line):
            if grid[i][j] == 'p':
                pos_row_p = i
                pos_col_p = j

    # Verify the positions of the bot with the princess
    if pos_row_m < pos_row_p:
        pos_row_m = pos_row_m + 1
        return 'DOWN'
    elif pos_row_m > pos_row_p:
        pos_row_m = pos_row_m - 1
        return 'UP'

    if pos_col_m < pos_col_p:
        pos_col_m = pos_col_m + 1
        return 'RIGHT'
    elif pos_col_m > pos_col_p:
        pos_col_m = pos_col_m - 1
        return 'LEFT'
        
# Set the data
n = int(input())
r,c = [int(i) for i in input().strip().split()]
grid = []
for i in range(0, n):
    grid.append(input())

# print the first move here
print(nextMove(n,r,c,grid))
```
---

### BotClean

A cleaning bot sits on a 5 by 5 grid holding dirty (`d`) and clean (`-`) cells. Print the next action so the bot walks to the nearest dirty cell and cleans every one of them.

[reference](https://www.hackerrank.com/challenges/botclean)

```python
import math

# Update cost that bot need to arrive the dirty
def update_position(posr, posc, dirties):
    nearest_dirt = []
    for i in range(len(dirties)):
        # Euclidean distance
        result = math.sqrt(((dirties[i][0] - posr) ** 2) + ((dirties[i][1] - posc) ** 2))
        nearest_dirt.append(result)
    return [x for (y,x) in sorted(zip(nearest_dirt,dirties))]

# Set the bot in your new position
def next_move(posr, posc, board):
    dirties = []
    for i in range(len(board)):
        for j in range(len(board[i])):
            if board[i][j] == 'd':
                dirties.append([i, j])

    next_dirt = update_position(posr, posc, dirties)
    if next_dirt[0][1] < posc:
        print('LEFT')
    elif next_dirt[0][1]  > posc:
        print('RIGHT')
    elif next_dirt[0][0] < posr:
        print('UP')
    elif next_dirt[0][0] > posr:
        print('DOWN')
    else:
        print('CLEAN')

# Set the data
if __name__ == "__main__":
    pos = [int(i) for i in input().strip().split()]
    board = [[j for j in input().strip()] for i in range(5)]
    next_move(pos[0], pos[1], board)
```
---

### BotClean Stochastic

The same cleaning task in a stochastic environment: the grid holds a single dirty cell, and as soon as it is cleaned another one appears anywhere on the board. The bot has 200 moves to clean as many cells as it can.

[reference](https://www.hackerrank.com/challenges/botcleanr)

```python
def nextMove(posr, posc, board):
    dirty_row = dirty_col = 0
    for i in range(len(board)):
        for j in range(len(board[i])):
            if board[i][j] == 'd':
                dirty_row = i
                dirty_col = j

    if dirty_col < posc:
        print('LEFT')
    elif dirty_col  > posc:
        print('RIGHT')
    elif dirty_row < posr:
        print('UP')
    elif dirty_row > posr:
        print('DOWN')
    else:
        print('CLEAN')

# Set data
if __name__ == "__main__":
    pos = [int(i) for i in input().strip().split()]
    board = [[j for j in input().strip()] for i in range(5)]
    nextMove(pos[0], pos[1], board)
```
---

### BotClean Large

The cleaning bot now works on a grid of arbitrary dimensions. Given its position and the board, print the next operation it should perform.

[reference](https://www.hackerrank.com/challenges/botcleanlarge)

```python
import math

# Update cost that bot need to arrive the dirty
def update_position(posr, posc, dirties):
    nearest_dirt = []
    for i in range(len(dirties)):
        # Euclidean distance
        result = math.sqrt(((dirties[i][0] - posr) ** 2) + ((dirties[i][1] - posc) ** 2))
        nearest_dirt.append(result)
    return [x for (y,x) in sorted(zip(nearest_dirt,dirties))]

# Set the bot in your new position
def next_move(posx, posy, dimx, dimy, board):
    dirties = []
    for i in range(dimx):
        for j in range(dimy):
            if board[i][j] == 'd':
                dirties.append([i, j])

    next_dirt = update_position(posx, posy, dirties)
    if next_dirt[0][0] < posx:
        print('UP')
    elif next_dirt[0][0] > posx:
        print('DOWN')
    elif next_dirt[0][1] < posy:
        print('LEFT')
    elif next_dirt[0][1]  > posy:
        print('RIGHT')
    else:
        print('CLEAN')

# Set data
if __name__ == "__main__":
    pos = [int(i) for i in input().strip().split()]
    dim = [int(i) for i in input().strip().split()]
    board = [[j for j in input().strip()] for i in range(dim[0])]
    next_move(pos[0], pos[1], dim[0], dim[1], board)
```
---

### BotClean Partially Observable

The environment is only partially observable: the bot sees just the eight cells adjacent to it. It has to persist what it has already seen between turns to decide where to go next.

[reference](https://www.hackerrank.com/challenges/botcleanv2)

```python
import os
import math

# Get board saved in memory
def get_info_file():
    temp_memory_board = []
    filename = "file-bot/board.txt"
    if os.path.isfile(filename):
        with open(filename, "r") as f:
            memory_board = f.read().split('\n')
            for i in range(len(memory_board)):
                temp_row_memory = []
                for j in range(len(memory_board[i])):
                    temp_row_memory.append(memory_board[i][j])
                temp_memory_board.append(temp_row_memory)
    return temp_memory_board

# Save the board in bot's memory
def save_info_file(board, filename):
    os.makedirs(os.path.dirname(filename), exist_ok=True)
    with open(filename, "w") as f:
        for i in range(len(board)):
            columns = "\n" if i > 0 else ""
            for j in range(len(board[i])):
                if board[i][j] == "b":
                    columns = columns + "-"
                else:    
                    columns = columns + board[i][j]
            f.write(columns)

# Save and read the file that contains the bot's memory
def update_info_file(board):
    filename = "file-bot/board.txt"
    if os.path.isfile(filename):
        with open(filename, "r") as f:
            new_memory_board = []
            memory_board = f.read().split('\n')
            for i in range(len(memory_board)):
                new_row_memory = []
                for j in range(len(memory_board[i])):
                    if ((memory_board[i][j] == 'o' and board[i][j] == '-') or 
                        (memory_board[i][j] == 'd' and board[i][j] == '-') or
                        (memory_board[i][j] == 'd' and board[i][j] == 'b')):
                        new_row_memory.append('-')
                    elif memory_board[i][j] == 'o' and board[i][j] == 'd':
                        new_row_memory.append('d')
                    else:
                        new_row_memory.append(memory_board[i][j])
                new_memory_board.append(new_row_memory)
            save_info_file(new_memory_board, filename)
    else:
        save_info_file(board, filename)
            
# Update cost that bot need to arrive the dirty
def update_position(posr, posc, dirties):
    nearest_dirt = []
    for i in range(len(dirties)):
        # Euclidean distance
        result = math.sqrt(((dirties[i][0] - posr) ** 2) + ((dirties[i][1] - posc) ** 2))
        nearest_dirt.append(result)
    return [x for (y,x) in sorted(zip(nearest_dirt,dirties))]

# Find certain elements on the board
def get_element_board(board, element):
    dirties = []
    for i in range(len(board)):
        for j in range(len(board[i])):
            if board[i][j] in element:
                dirties.append([i, j])
    return dirties

# Set next action the bot
def next_move(posx, posy, board):
    # Save board in bot's memory  
    update_info_file(board)
    elements = get_element_board(board, ['d'])
    if len(elements) == 0:
        elements = get_element_board(get_info_file(), ['o','d'])

    next_dirt = update_position(posx, posy, elements)
    if (len(next_dirt) > 0):
        if next_dirt[0][1]  > posy:
            print('RIGHT')
        elif next_dirt[0][1] < posy:
            print('LEFT')
        elif next_dirt[0][0] < posx:
            print('UP')
        elif next_dirt[0][0] > posx:
            print('DOWN')
        else:
            print('CLEAN')

# Start application
if __name__ == "__main__":
    # Set data
    pos = [int(i) for i in input().strip().split()] 
    board = [[j for j in input().strip()] for i in range(5)]  
    next_move(pos[0], pos[1], board)
```
---

### Maze Escape

A bot is trapped in a maze and has to find its way out. Two bots that cannot see each other start at random points, and the first one to escape wins.

[reference](https://www.hackerrank.com/challenges/maze-escape)

```python
import os
import math

# Set next action the bot
def next_move(player, board):
    print("Player: {}".format(player))
    move = ''
    # Start
    for i in range(len(board)):
        for j in range(len(board[i])):
            if i == 0 and j == 1 and board[i][j] == '-':
                move = 'UP'
            if i == 0 and j == 1 and board[i][j] == '#':
                move = 'RIGHT'
    
    print(move)

# Start application
if __name__ == "__main__":
    # Set data
    player = int(input())
    board = [[j for j in input().strip()] for i in range(3)]  
    next_move(player, board)
```
---

### Basic Probability Puzzles 1

In a single toss of two fair six-sided dice, find the probability that their sum is at most 9.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-1)

```python
probability = 1/6
values = 6
result = 0

# First dice
for i in range(1, values + 1):
    # Second dice
    for j in range(1, values + 1):
        # Verify if each die will be different and their sum is 6
        if (i + j) <= 9:
            result += probability ** 2

# Final probability found
print (result)
```
---

### Basic Probability Puzzles 2

For a single toss of two fair dice, find the probability that the two values differ and sum to 6.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-2)

```python
probability = 1/6
values = 6
result = 0

# First dice
for i in range(1, values + 1):
    # Second dice
    for j in range(1, values + 1):
        # Verify if each die will be different and their sum is 6
        if i != j and (i + j) == 6:
            result += probability ** 2

# Final probability found
print (result)
```
---

### Basic Probability Puzzles 3

Three urns hold different mixes of red and black balls: X has 4 red and 3 black, Y has 5 red and 4 black, Z has 4 red and 4 black. Drawing one ball from each, find the probability of getting two red balls and one black ball.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-3)

```python
x_prob_red = 4/7
x_prob_black = 3/7

y_prob_red = 5/9
y_prob_black = 4/9

z_prob_red = 1/2
z_prob_black = 1/2

# We have multiplied the possibilities
first_combination   = x_prob_red * y_prob_red * z_prob_black
second_combination  = x_prob_black * y_prob_red * z_prob_red
third_combination   = x_prob_red * y_prob_black * z_prob_red

# Result = 0.40476190476190477 = 17/42
print (first_combination + second_combination + third_combination)
```
---

### Basic Probability Puzzles 4

Bag 1 holds 4 red and 5 black balls, bag 2 holds 3 red and 7 black. Drawing one ball from bag 1 and two from bag 2, find the probability of getting two black balls and one red ball.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-4)

```python
first_combination   = (5/9) * (7/10) * (3/9)
second_combination  = (5/9) * (3/10) * (7/9)
third_combination   = (4/9) * (7/10) * (6/9)

# Result = 0.4511111111111111 = 7/15
print (first_combination + second_combination + third_combination)
```
---

### Basic Probability Puzzles 5

Ten people sit down around a round table. Find the probability that two particular people end up next to each other.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-5)

```python
print (2/9)
```
---

### Basic Probability Puzzles 6

Bag X holds 5 white and 4 black balls, bag Y holds 7 white and 6 black. One ball moves from X to Y without its color being observed. Find the probability that a ball then drawn from Y is black.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-6)

```python
print ((6/14 * 5/9) + (7/14 * 4/9))
```
---

### Basic Probability Puzzles 7

Three plants produce 500, 1000 and 2000 units per day with defect rates of 0.005, 0.008 and 0.010. Given that a randomly selected unit is defective, find the probability that it came from plant A.

[reference](https://www.hackerrank.com/challenges/basic-probability-puzzles-7)

No solution recorded for this challenge yet.

---

### Basic Statistics Warmup

Given an array of integers, print the mean, the median, the mode (smallest value when tied), the standard deviation, and the bounds of the 95 percent confidence interval for the mean.

[reference](https://www.hackerrank.com/challenges/stat-warmup)

```python
import numpy as np
import math as m
import statistics as stpy
from scipy import stats

# Define function
def mean_confidence_interval(length, mean, stdev):
    return 1.96 * (stdev / m.sqrt(length))

# Input
total = int(input())
numbers = list(map(int, input().split()))

# Set statistics values
mean = np.mean(numbers)
median = np.median(numbers)
mode = int(stats.mode(numbers)[0])
stdev = stpy.pstdev(numbers)
confidence_interval = mean_confidence_interval(total, mean, stdev)
min_confidence = round(mean - confidence_interval, 1)
max_confidence = round(mean + confidence_interval, 1)

# Show the final result
print(round(mean,1))
print(round(median,1))
print(mode)
print(round(stdev,1))
print("{} {}".format(min_confidence, max_confidence))
```
---

### Computing the Correlation

Given the scores of N students in Mathematics, Physics and Chemistry, compute the Pearson correlation coefficient for each pair of subjects.

[reference](https://www.hackerrank.com/challenges/computing-the-correlation)

```python
import math as m

# Define functions
def pearson(first_data, second_data, n):
    # Numerator part
    sum_firt_data       = sum(first_data)
    sum_second_data     = sum(second_data)
    sum_data            = sum([x*y for x,y in zip(first_data, second_data)])

    # Denominator part
    sum_first_data_squared      = sum([x**2 for x in first_data])
    sum_first_data_mult_squared = sum_firt_data ** 2
    sum_secon_data_squared      = sum([y**2 for y in second_data])
    sum_secon_data_mult_squared = sum_second_data ** 2

    numerator       = (n * sum_data) - (sum_firt_data * sum_second_data)
    den_first_data  = m.sqrt((n * sum_first_data_squared) - sum_first_data_mult_squared)
    den_second_data = m.sqrt((n * sum_secon_data_squared) - sum_secon_data_mult_squared)

    return round(numerator / (den_first_data * den_second_data), 2)


# Set data
n = int(input())
mathematics = []
physics     = []
chemistry   = []
for i in range(n):
    elements = list(map(float, input().split()))
    mathematics.append(elements[0])
    physics.append(elements[1])
    chemistry.append(elements[2])

# Show the correlation
print (pearson(mathematics, physics, float(n)))
print (pearson(physics, chemistry, float(n)))
print (pearson(mathematics, chemistry, float(n)))
```
---

### Correlation and Regression Lines 1

Given the physics and history scores of ten students, compute Karl Pearson's correlation coefficient between them, to three decimal places.

[reference](https://www.hackerrank.com/challenges/correlation-and-regression-lines-6)

```python
import math as m

# Define functions
def mean(data):
    return sum(data) / len(data)

def var(data):
    sum = 0
    for i in range(len(data)):
        sum = sum + (data[i] - mean(data)) ** 2
    return sum

def cov(dt1, dt2):
    sum = 0
    for i in range(len(dt1)):
        sum += (dt1[i] - mean(dt1)) * (dt2[i] - mean(dt2))
    return sum

# Set data
physics = [15.0, 12.0, 8.0, 8.0, 7.0, 7.0, 7.0, 6.0, 5.0, 3.0]
history = [10.0, 25.0, 17.0, 11.0, 13.0, 17.0, 20.0, 13.0, 9.0, 15.0]

mean_physics = mean(physics)
mean_history = mean(history)

var_physics = var(physics)
var_history = var(history)

cov = cov(physics, history)
std = m.sqrt(var_physics * var_history)

# Correlation
r = cov / std
print(round(r, 3))
```
---

### Correlation and Regression Lines 2

Using the same ten scores, compute the slope of the regression line that treats Physics as the independent variable, to three decimal places.

[reference](https://www.hackerrank.com/challenges/correlation-and-regression-lines-7)

```python
def mean(data):
    return sum(data) / len(data)

# Set data
physics = [15.0, 12.0, 8.0, 8.0, 7.0, 7.0, 7.0, 6.0, 5.0, 3.0]
history = [10.0, 25.0, 17.0, 11.0, 13.0, 17.0, 20.0, 13.0, 9.0, 15.0]

mean_physics = mean(physics)
mean_history = mean(history)

var_physics = sum([(p - mean_physics) ** 2 for p in physics])
sum_phy_his = 0
for i in range(len(physics)):
    sum_phy_his += (physics[i] - mean_physics) * (history[i] - mean_history)

# slope = Σ(x - mean(x)) * (y - mean(y)) / Σ (x - mean(x))²
slope = sum_phy_his / var_physics
print(round(slope, 3))
```
---

### Correlation and Regression Lines 3

Using the same ten scores, predict the probable History score of a student who scores 10 in Physics, to one decimal place.

[reference](https://www.hackerrank.com/challenges/correlation-and-regression-lines-8)

```python
def mean(data):
    return sum(data) / len(data)

# Set data
physics = [15.0, 12.0, 8.0, 8.0, 7.0, 7.0, 7.0, 6.0, 5.0, 3.0]
history = [10.0, 25.0, 17.0, 11.0, 13.0, 17.0, 20.0, 13.0, 9.0, 15.0]

mean_physics = mean(physics)
mean_history = mean(history)

var_physics = sum([(p - mean_physics) ** 2 for p in physics])
sum_phy_his = 0
for i in range(len(physics)):
    sum_phy_his += (physics[i] - mean_physics) * (history[i] - mean_history)

# b = Σ(x - mean(x)) * (y - mean(y)) / Σ (x - mean(x))²
b = sum_phy_his / var_physics

# physics is x, variable independent
# history is y, variable dependent
# a = mean(y) - b * mean(x)
a = mean_history - b * mean_physics

# Y = b * X + a
result = b * 10 + a
print(round(result,1))
```
---

### Correlation and Regression Lines 4

A bivariate distribution has regression lines `4x - 5y + 33 = 0` (y on x) and `20x - 9y - 107 = 0` (x on y). Estimate x when y is 7, to one decimal place.

[reference](https://www.hackerrank.com/challenges/correlation-and-regression-lines-4)

```python
y = 7

# 20x – 9y – 107 = 0
val_x = (9 * y + 107) / 20

# Result: 8.5
print (round(val_x, 1))
```
---

### Multiple Linear Regression: Predicting House Prices

Each house is described by F normalized features and a price per square foot. Fit the observed rows and estimate the price of the houses whose pricing is missing.

[reference](https://www.hackerrank.com/challenges/predicting-house-prices)

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

### Polynomial Regression: Office Prices

Office prices depend on their features in a non-linear way. Fit a polynomial model over the observed rows and predict the price of the remaining offices.

[reference](https://www.hackerrank.com/challenges/predicting-office-space-price)

```python
from sklearn import linear_model
from sklearn.preprocessing import PolynomialFeatures
import numpy as np

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

# Set Polynomial Features
poly = PolynomialFeatures(degree=3)

# Set the model LinearRegression
model = linear_model.LinearRegression()
model.fit(poly.fit_transform(np.array(X)), Y)

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
result = model.predict(poly.fit_transform(np.array(new_X)))
for i in range(len(result)):
    print(round(result[i],2))
```
---
