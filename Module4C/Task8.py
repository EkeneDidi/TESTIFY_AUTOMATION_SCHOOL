
# Use for loop to iterate from 0 to 10
# For each iteration print out "Number ", i
# If the i value is equal to 2 add the continue
# If the i value is equal to 8 add the break statement

# For instruction 2, to print out Number and i, use the statement in your loop, print("Number", i)

# Use for loop to iterate from 0 to 10
# For each iteration print out "Number", i
number = 11
for i in range(number):
    print("Number", i)


# if the i value is equal to 2 add continue
print("\nContinue\n")
number = 11
for i in range(number):
    if i == 2:
        continue
    print("Number", i)

    # if the i value is equal to 8 add break statement
    print("\nBreak\n")
    if i == 8:
        break
    print("Number", i)