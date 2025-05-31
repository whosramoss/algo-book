# O(N) time where N is the number of competitions O(k) space where K is the number of teams 
def tournament_winner(competitions, results):
  current_best_team = ""
  scores = { current_best_team: 0 }
  HOME_TEAM_WON = 1

  for idx, competition in enumerate(competitions):
    result = results[idx]
    home_team, away_team = competition

    winning_team = home_team if result == HOME_TEAM_WON else away_team

    update_scores(winning_team, 3, scores)

    if scores[winning_team] > scores[current_best_team]:
      current_best_team = winning_team
    
  return current_best_team

def update_scores(team, points, scores):
  if team not in scores:
    scores[team] = 0

  scores[team] += points

competitions = [
  ["HTML", "Java"],
  ["Java", "Python"],
  ["Python", "HTML"],
  ["C#", "Python"],
  ["Java", "C#"],
  ["C#", "HTML"]
]

results = [0, 1, 1, 1, 0, 1]

print(tournament_winner(competitions, results))
