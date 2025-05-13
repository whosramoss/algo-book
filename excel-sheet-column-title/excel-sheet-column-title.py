def convertToTitle(columnNumber: int) -> str:
    result = ""
    totalLetters = 26
    asciiInitCode = 65

    while columnNumber > 0:
        columnNumber -= 1
        charCode = (columnNumber % totalLetters) + asciiInitCode
        result = chr(charCode) + result
        columnNumber //= totalLetters

    return result

print(convertToTitle(1))    # "A"
print(convertToTitle(28))   # "AB"
print(convertToTitle(701))  # "ZY"
