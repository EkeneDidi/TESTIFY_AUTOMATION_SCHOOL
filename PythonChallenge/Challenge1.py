# Calculate the sum of numbers within an array

numbers = [9, 5, 2, 32, 6, 16]


def sum(number):
    total = 0
    for i in number:
        total += i
    return total


print('Sum of numbers is: ',sum(numbers))