# The error is in the num % 2 condition and add the f string
def print_even_numbers(numbers):
    for num in numbers:
        if num % 2 == 0:
            print(f"{num} is even")
            
numbers = [1, 2, 3, 4, 5, 6]
print_even_numbers(numbers)