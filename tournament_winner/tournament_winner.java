import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> scores = new HashMap<>();
        String currentBestTeam = "";
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            List<String> competition = competitions.get(i);
            int result = results.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winningTeam = (result == 1) ? homeTeam : awayTeam;

            scores.put(winningTeam, scores.getOrDefault(winningTeam, 0) + 3);

            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }

        return currentBestTeam;
    }

    public static void main(String[] args) {
        List<List<String>> competitions = Arrays.asList(
            Arrays.asList("HTML", "Java"),
            Arrays.asList("Java", "Python"),
            Arrays.asList("Python", "HTML"),
            Arrays.asList("C#", "Python"),
            Arrays.asList("Java", "C#"),
            Arrays.asList("C#", "HTML")
        );

        List<Integer> results = Arrays.asList(0, 1, 1, 1, 0, 1);

        System.out.println(tournamentWinner(competitions, results));
    }
}