function runLengthEncoding(str: string): string {
    let currentRunLength = 1;
    let encodedString: string[] = [];

    for (let i = 1; i < str.length; i++) {
        const previousCharacter = str[i - 1];
        const currentCharacter = str[i];

        if (currentCharacter !== previousCharacter || currentRunLength === 9) {
            encodedString.push(currentRunLength.toString());
            encodedString.push(previousCharacter);
            currentRunLength = 0;
        }

        currentRunLength++;
    }

    encodedString.push(currentRunLength.toString());
    encodedString.push(str[str.length - 1]);

    return encodedString.join('');
}

console.log(runLengthEncoding("aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"));
