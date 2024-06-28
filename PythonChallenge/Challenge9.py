# Return the number of vowels in a string

vowels = ['A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u']


def count(string):
    num = 0
    for i in string:
        if i in vowels:
            num += 1
    return num


print(count("Testify Academy"))