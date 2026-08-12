---
name: length_after_transformations
level: medium
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
class Solution:
  def lengthAfterTransformations(self, s: str, t: int) -> int:
    MOD = 10**9 + 7
    count = [0] * 26
    for ch in s:
      count[ord(ch) - ord('a')] += 1

    for _ in range(t):
      new_count = [0] * 26
      for i in range(26):
        if i == 25: 
          new_count[0] = (new_count[0] + count[i]) % MOD 
          new_count[1] = (new_count[1] + count[i]) % MOD 
        else:
          new_count[i + 1] = (new_count[i + 1] + count[i]) % MOD
      count = new_count

    return sum(count) % MOD
      
        
s = Solution()
print(s.lengthAfterTransformations("abcyy", 2))  
print(s.lengthAfterTransformations("azbk", 1))   
```
---

### Typescript


```typescript
class Solution {
  lengthAfterTransformations(s: string, t: number): number {
    const MOD = 1_000_000_007;
    let count = new Array(26).fill(0);
    for (let ch of s) {
      count[ch.charCodeAt(0) - 97]++;
    }

    for (let step = 0; step < t; step++) {
      const newCount = new Array(26).fill(0);
      for (let i = 0; i < 26; i++) {
        if (i === 25) {
          newCount[0] = (newCount[0] + count[i]) % MOD;
          newCount[1] = (newCount[1] + count[i]) % MOD;
        } else {
          newCount[i + 1] = (newCount[i + 1] + count[i]) % MOD;
        }
      }
      count = newCount;
    }

    return count.reduce((acc, val) => (acc + val) % MOD, 0);
  }
}

const s = new Solution();
console.log(s.lengthAfterTransformations("abcyy", 2)); // 7
console.log(s.lengthAfterTransformations("azbk", 1));  // 5
```
