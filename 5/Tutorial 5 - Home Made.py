#1
number = int(input("Enter the Number: "))
print()
for i in range(1,11):
    final = number * i
    print(number,"*",i,"=",final)
print()
print()

#2
total = 0
for i in range(1,6):
    total = total + i
print("Total is: ",total)
print()
print()

#3-1
print("Odd Numbers Between 0 and 50 \n")
for i in range(0,50):
    if i % 2 != 0:
        print(i)
print()
print()

#3-2
print("Odd Numbers Between 0 and 50 \n")
for i in range(0,50):
    if i % 2 == 0:
        continue
    print(i)
print()
print()


#4
number = int(input("How many Stars Required: "))
for i in range(0,number):
    i="*"
    print(i)


#5-A
double = 0
import random
for m in range(0,100):
    diceOne = random.randint(1,6)
    diceTwo = random.randint(1,6)
    if diceOne == diceTwo:
        double = double + 1
print("Out of 100 you rolled",double,"doubles \n")
print()


#5-B
count = 0
double = 0
import random
while count < 100:
    diceOne = random.randint(1,6)
    diceTwo = random.randint(1,6)
    if diceOne == diceTwo:
        double = double + 1
    count = count + 1
print("Out  of 100 you rolled",double,"doubles \n")
print()

#6
for number in range(3):
    print("-------------------------------------------")
    print("Outer loop iteration " + str(number))
    # Inner loop

    for another_number in range(4):
        print("****************************")
        print("In inner loop iteration " + str(another_number)) 
print()


#7-A
for x in range(1,4):  # print 3 rows
    for y in range(1,4):  # 3 asterisks in each row
        print('*', end='')
print()


#7-B
for i in range(0,3): 
    for j in range(0,i+1):
        print("*", end="")
    print('\r')
print()


#8-A [no]

    
#8-B
n = input("Please enter an integer: ")
try:
    n = int(n)
except ValueError:
    print("Requires a valid integer!")
print()


#8-C
while True:
    n = input("Please enter an integer: ")
    try:
        n = int(n)
        break
    except ValueError:
        print("Requires a valid integer! Please try again.")
print("You successfully entered an integer.") 
print()


#9-A
while True:
    try:
        number1 = int(input("Enter Number: "))
        number2 = int(input("Enter Number: "))
        answer = number1 / number2
        break
    except ZeroDivisionError:
        print("Cannot divide by zero")
print("\nAnswer is ",answer,"\n")
print()



#9
while True:
    try:
        number1 = int(input("Enter Number: "))
        number2 = int(input("Enter Number: "))
        answer = number1 / number2
    except ZeroDivisionError:
        print("Cannot divide by zero")
        continue
    else:
        break
print("\nAnswer is ",answer,"\n")
