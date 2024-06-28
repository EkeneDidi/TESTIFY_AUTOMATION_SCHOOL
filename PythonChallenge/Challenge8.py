# Return a Boolean if a number is divisible by 10

def divisible_by_ten(number):
    value = number % 10 == 0
    return value


print(divisible_by_ten(98))