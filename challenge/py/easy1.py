def print_even_numbers(numbers):
    for num in numbers:
        if num % 2 == 1:
            print("{num} is even") # Make it print the even number!
            
numbers = [1, 2, 3, 4, 5, 6]
print_even_numbers(numbers)