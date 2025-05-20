def minimum_waiting_time(queries):
  queries.sort()
  total_waiting_time = 0

  for idx, duration in enumerate(queries):
    queries_left = len(queries) - (idx + 1)
    total_waiting_time += queries_left * duration

  return total_waiting_time

print(minimum_waiting_time([3, 2, 1, 2, 6]))