function tournamentWinner(competitions: string[][], results: number[]): string {
    const scores: { [key: string]: number } = { "": 0 };
    let currentBestTeam = "";

    for (let i = 0; i < competitions.length; i++) {
        const [homeTeam, awayTeam] = competitions[i];
        const result = results[i];
        const winningTeam = result === 1 ? homeTeam : awayTeam;

        if (!(winningTeam in scores)) {
            scores[winningTeam] = 0;
        }
        scores[winningTeam] += 3;

        if (scores[winningTeam] > scores[currentBestTeam]) {
            currentBestTeam = winningTeam;
        }
    }

    return currentBestTeam;
}

const competitions = [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"],
    ["C#", "Python"],
    ["Java", "C#"],
    ["C#", "HTML"]
];
const results = [0, 1, 1, 1, 0, 1];

console.log(tournamentWinner(competitions, results));