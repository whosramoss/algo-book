# Exponential recursive => O (2 ^ n) time | O(n) space
def get_nth_fib1(n):
  if n == 1:
    return 0
  if n == 2:
    return 1
  return get_nth_fib1(n - 2) + get_nth_fib1(n - 1)

# Recursive with memoization => O(n) time | O(n) space
def get_nth_fib2(n, memoize = { 1:0, 2:1 }):
  if n in memoize:
    return memoize[n]
  else:
    memoize[n] = get_nth_fib2(n - 2, memoize) + get_nth_fib2(n - 1, memoize)
    return memoize[n]

# Iterative => O(n) time | O(1) space
def get_nth_fib3(n):
  if n == 2:
    return 1
  elif n == 1:
    return 0
  
  last_two_fibs = [0, 1]
  for _ in range(2, n):
    fib = last_two_fibs[0] + last_two_fibs[1]
    last_two_fibs[0] = last_two_fibs[1]
    last_two_fibs[1] = fib

  return fib

print(get_nth_fib1(6))
print(get_nth_fib2(6))
print(get_nth_fib3(6))
