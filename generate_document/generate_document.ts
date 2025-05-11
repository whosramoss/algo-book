function generateDocument(characters: string, document: string): boolean {
    const charCount: Record<string, number> = {};

    for (const c of characters) {
        charCount[c] = (charCount[c] || 0) + 1;
    }

    for (const c of document) {
        if (!charCount[c] || charCount[c] === 0) {
            return false;
        }
        charCount[c] -= 1;
    }

    return true;
}

console.log(generateDocument("abc", "cab"));
