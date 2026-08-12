---
name: minimum_waiting_time
level: easy
---

# minimum_waiting_time

## 🇬🇧 English

Given a list of **query durations**,  
implement a function to calculate the **minimum total waiting time** if the queries are processed in the optimal order.

✅ You can process the queries in any order.  
✅ The optimal strategy is to process **shorter queries first** to minimize the waiting time for the rest.  
✅ The waiting time for a query is the sum of all previous queries’ durations.

### Input:

- A `list` of integers, where each integer represents the duration of a query.

### Output:

- Returns the integer representing the minimum total waiting time.

### Example:

```python
queries = [3, 2, 1, 2, 6]
result = minimum_waiting_time(queries)
# Output: 17
```

---

## 🇧🇷 Português

Dada uma lista de **durações de consultas**,  
implemente uma função para calcular o **tempo mínimo total de espera** se as consultas forem processadas na ordem ideal.

✅ Você pode processar as consultas em qualquer ordem.  
✅ A estratégia ideal é processar **primeiro as consultas mais curtas**, para minimizar o tempo de espera das demais.  
✅ O tempo de espera de uma consulta é a soma das durações de todas as consultas anteriores.

### Entrada:

- Uma `lista` de inteiros, onde cada inteiro representa a duração de uma consulta.

### Saída:

- Retorna o número inteiro representando o tempo mínimo total de espera.

### Exemplo:

```python
queries = [3, 2, 1, 2, 6]
resultado = minimum_waiting_time(queries)
# Saída: 17
```

## Response

### Python

```python
def minimum_waiting_time(queries):
  queries.sort()
  total_waiting_time = 0

  for idx, duration in enumerate(queries):
    queries_left = len(queries) - (idx + 1)
    total_waiting_time += queries_left * duration

  return total_waiting_time

print(minimum_waiting_time([3, 2, 1, 2, 6]))
```
---

### Typescript


```typescript
function minimumWaitingTime(queries: number[]): number {
    queries.sort((a, b) => a - b);
    let totalWaitingTime = 0;

    for (let i = 0; i < queries.length; i++) {
        const queriesLeft = queries.length - (i + 1);
        totalWaitingTime += queries[i] * queriesLeft;
    }

    return totalWaitingTime;
}

console.log(minimumWaitingTime([3, 2, 1, 2, 6]));
```
