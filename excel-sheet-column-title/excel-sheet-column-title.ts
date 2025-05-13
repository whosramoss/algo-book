function convertToTitle(columnNumber: number): string {
    let result = "";
    const totalLetters = 26;
    const asciiInitCode = 65;
    while (columnNumber > 0) {
        columnNumber--; 
        const charCode = (columnNumber % totalLetters) + asciiInitCode; 
        result = String.fromCharCode(charCode) + result;
        columnNumber = Math.floor(columnNumber / totalLetters);
    }

    return result;
}

console.log(convertToTitle(1));   // "A"
console.log(convertToTitle(28));  // "AB"
console.log(convertToTitle(701)); // "ZY"