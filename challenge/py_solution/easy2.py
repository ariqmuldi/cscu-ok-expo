# The two errors are in line 5, must be in numbers, and the str function
def sum_of_list(numbers):
    total = 0
    for number in numbers:
        total += number
    return total

numbers = [1, 2, 3, 4, 5]
print("The sum of the list is: " + str(sum_of_list(numbers)))