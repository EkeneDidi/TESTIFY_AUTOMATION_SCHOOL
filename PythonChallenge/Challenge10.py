# Create a function that filters out negative numbers

numbers = [-8, -10, 9, 6, 7, -94, -70, -31]


def positive_num(number):
    return [num for num in numbers if num >= 0]


print(positive_num(numbers))