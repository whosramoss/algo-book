function caesarCipherEncryptor(str: string, key: number): string {
    const newLetters: string[] = [];
    const newKey = key % 26;

    for (const letter of str) {
        const newLetter = getNewLetter(letter, newKey);
        newLetters.push(newLetter);
    }

    return newLetters.join('');
}

function getNewLetter(letter: string, key: number): string {
    const newCharCode = letter.charCodeAt(0) + key;
    return newCharCode <= 122 ? String.fromCharCode(newCharCode) : String.fromCharCode(96 + newCharCode % 122);
}

console.log(caesarCipherEncryptor('xyz', 2));
