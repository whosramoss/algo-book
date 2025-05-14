def findThreeDigitEvenNumbers(digits):
  res = set()
  n = len(digits)

  for i in range(n):
    if digits[i] == 0:
      continue
    for j in range(n):
      if j == i:
        continue  
      for k in range(n):
        if k == i or k == j:
          continue
        if digits[k] % 2 != 0:
          continue
        num = digits[i] * 100 + digits[j] * 10 + digits[k]
        res.add(num)

  return sorted(res)


print(findThreeDigitEvenNumbers([2, 1, 3, 0]))  # [102,120,130,132,210,230,302,310,312,320]
