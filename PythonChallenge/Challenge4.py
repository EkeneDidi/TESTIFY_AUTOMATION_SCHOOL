# Print a table containing multiplication tables.

print('5 and 10 Multiplication tables')


def multiples_of(number):
    for i in range(1, 18):
        for j in range(1, number + 1):
            multiplication_table = i * j
        print(multiplication_table)


multiples_of(5)
print('-------')
multiples_of(10)