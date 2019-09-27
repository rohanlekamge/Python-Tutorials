#1-a
n = int(input('Give me a number over 100:'))
if n <= 100:
 print(n, 'is not over 100')
print()

#1-b
n = int(input('What is your Age:'))
if n >= 21:
 print('Can Vote')
print()

#2-a
x = int(input('Give me a number: '))
if x < 0:
 print(x, 'is negative')
else:
 print(x, 'is positive')
print()

#2-b
x = int(input('Your Mark: '))
if x < 40:
    print('FAIL')
else:
    print('PASS')
print()

#2-c
y = int(input('Temperature: '))
if y > 19:
    print('Hot')
else:
    print('Cold')
print()

#2-d
z = int(input('Enter the Number: '))
if z%2==0:
    print('EVEN')
else:
    print('ODD')
print()
print()

#3-a
import random
secret_number = random.randint(0,3)
if secret_number == 1:
    print('HEAD')
else:
    print('TAIL')
print()
print()

#4-a
print("Type 1 to convert Celsius to Fahrenheit")
print("Type 2 to  convert Fahrenheit to Celsius")
x = int(input('Enter the Number: '))
if x == 1:
    c = int(input('Enter the Celsius Value: '))
    f = (9/5) * c + 32
    print('Fahrenheit:',f)
elif x == 2:
        f = int(input('Enter the Fahrenheit Value: '))
        c = (f-32) * 5 / 9
        print('Celsius:',c)
else:
    print('Invalid Option Entered')
print()
print()    

#4-b
x = int(input('Enter the Integer: '))
y = (input('Enter the Operation: '))
z = int(input('Enter the Integer: '))
if y == "+":
    answer = x + z
    print(answer)
elif y == '-':
    answer = x - z
    print(answer)
elif y == '*':
    answer = x * z
    print(answer)
elif y == '/' and z != 0:
    answer = x / z
    print(answer)
else:
    print('Error')
print()
print()


#4-c
print("Please Enter the Cost of the Meal")
x = int(input('Enter the Cost of the Meal: '))
print("What is your Satisfaction Level")
print("""
Totally Satisfied (1)
Satisfied (2)
Dissatisfied (3)""")
y = int(input('Please Enter the Relevent Number: '))
if y == 1:
    tip = (x/100)*20
elif y == 2:
    tip = (x/100)*15
elif y == 3:
    tip = (x/100)*10
else:
    print("Please Choose a Given Number")
print('Rs.',tip)
print()
print()


#5-b
m = int(input('Give me number between 1 and 10:'))
if m >= 1 and m < 11:
 print('Well done! You gave me:',m)
print()
print()

#5-d
if mark < 0 or mark > 100:
 print("Invalid mark")
elif mark >= 70:
 print("Exceptional result!")
elif mark >= 40:
 print("Satisfactory result!")
else:
 print("You have failed.")
print()
print()


#5-f
x = 10
if not x > 10:
 print("not returned True")
else:
 print("not returned False")
print()
print()


#6
print("Do You like Pyhton ?")
m = (input("""(YES/NO) :"""))
m = m.upper()
if m == "YES":
    print("you are on the right course")
elif m == "NO":
    print("you might change your mind")
else:
    print(" I did not understand")
print()
print()



