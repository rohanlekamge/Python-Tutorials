#1
number = int(input("Enter the Number: "))
print()
for i in range(1,11):
    answer = number * i
    print(number,"*",i,"=",answer)
print("\n-------------------------------------------")
    

#2
total = 0
for i in range(0,5):
    number = int(input("Enter the Number: "))
    total = total + number
print("Total is: ", total)
print("-------------------------------------------")


#3
print(" odd numbers between 0 and 50")
for i in range(0,50):
    if i % 2 != 0:
        print(i)
print("-------------------------------------------")

#4
number = int(input("How many Stars are Required: "))
for i in range(0,number):
    print("*",end="")
print("\r")
print("-------------------------------------------")


#5
double = 0
import random
for i in range(0,100):
    diceOne = random.randint(1,6)
    diceTwo = random.randint(1,6)
    if diceOne == diceTwo:
        double = double + 1
print("Out of 100 You Rolled",double,"doubles\n")
print("-------------------------------------------")

#6
for number in range(3) :
    print("-------------------------------------------")
    print("Outer loop iteration " + str(number))
     # Inner loop
    for another_number in range(4):
        print("****************************")
        print("In inner loop iteration " + str(another_number))
print("-------------------------------------------")


#7-A
for x in range(1,4): # print 3 rows
    for y in range(1,4): # 3 asterisks in each row
        print('*', end='')
    print()
print("-------------------------------------------")


#7-B
for x in range(1,4): # print 3 rows
    for y in range(1,x+1): # 3 asterisks in each row
        y = "*"
        print(y, end='')
    print("\r")
print("-------------------------------------------")


#8-A (No)

#8-B
n = input("Please enter an integer: ")
try:
    n = int(n)
except ValueError:
    print("Requires a valid integer!")
print("-------------------------------------------")


#8-C
while True:
    n = input("Please enter an integer: ")
    try:
        n = int(n)
        break
    except ValueError:
        print("Requires a valid integer! Please try again.")
print("You successfully entered an integer.")
print("-------------------------------------------")


#9
while True:
    number1 = int(input("Enter Number: "))
    number2 = int(input("Enter Number: "))
    try:
        answer = number1 / number2
    except ZeroDivisionError:
        print("Cannot divide by zero\n")
        continue
    else:
        break
print("\nAnswer is: ", answer,"\n")
print("-------------------------------------------")




