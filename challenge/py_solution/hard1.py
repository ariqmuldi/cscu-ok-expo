# Errors are in line 10, add memo parameter and needs to return memom[n]
def fibonacci(n, memo={}):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    if n in memo:
        return memo[n]

    memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo)
    return memo[n]

print(fibonacci(10)) # Correct answer should be 55.