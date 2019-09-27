#1 Display all odd numbers between 0 and 100
c = 1
while c > 0 and c < 100:
    print(c)
    c = c + 2

#2
dividend = int(input("Input Number 1: "))
divisor = int(input("Input Number 2: "))  
while divisor != 0:
    dividend = int(input("Input Number 1: "))
    divisor = int(input("Input Number 2: "))
    quotient = dividend/divisor
    print("Quotient : ",quotient)


#3 Find the Factorial of A Given Number
factorial = 1
print("Calculating Fractorial\n")
number = int(input("Enter the Number: "))
while number <= 0:
    print("Enter a Positive Number")
    number = int(input("Enter the Number: "))
while number >= 2:
    factorial = factorial * number * (number - 1)
    number = number - 2
print("Factorial: ",factorial,"\n")


#4
numCopies = int(input("Enter Number of Copies to be Print: "))
print("Enter the number of copies to be printed: ",numCopies)
if numCopies <= 99:
    tCost = numCopies * 0.30
    print("Price per copy is: $0.30")
elif numCopies <= 499:
    tCost = numCopies * 0.28
    print("Price per copy is: $0.28")
elif numCopies <= 749:
    tCost = numCopies * 0.27
    print("Price per copy is: $0.27")
elif numCopies <= 1000:
    tCost = numCopies * 0.26
    print("Price per copy is: $0.26")
elif numCopies > 1000:
    tCost = numCopies * 0.25
    print("Price per copy is: $0.25")
print("Total Cost is: $",tCost)

