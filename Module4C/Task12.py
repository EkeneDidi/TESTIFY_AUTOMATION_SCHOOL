
#Declare a global variable with name as language and the value as "Python"
#Create a function, in the function declare a variable with name as language and value as "Java", then print out the variable in the function
#Print out the variable name into the console
#Invoke the function



#Declare a global variable with name as language and the value as "Python"
language = "Python"

#Create a function, in the function declare a variable with name as language and value as "Java"
def hello():
    language = "Java"

    #then print out the variable in the function
    print("Local Variable: ", language)

#Print out the variable name into the console
print("Global Variable: ", language)

#Invoke the function
hello()