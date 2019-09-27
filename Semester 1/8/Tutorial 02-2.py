#1
n1 = int(input("Enter Number 1: "))
n2 = int(input("Enter Number 2: "))
n3 = int(input("Enter Number 3: "))
if n1 > n2:
    if n1 > n3:
        print("Largest Number: ",n1,"\n")
    else:
        print("Largest Number: ",n3,"\n")
elif n2 > n3:
    print("Largest Number: ",n2,"\n")
else:
    print("Largest Number: ",n3,"\n")
    



#2
total = 0
nDays = int(input("Input Number of Days: "))
tMiles = int(input("Input Total Miles: "))
if tMiles > 75:
    total = 34.5 * nDays + (tMiles - 75) * 0.25
else:
    total = nDays * 34.5
print("Rs.",total,"\n")



#3
month = int(input("Input Relevent Number for the Month: "))
if month == 12 or month <= 3:
    print("Winter\n")
elif month == 4 or month == 5:
    print("Spring\n")
elif month >= 6 and month <= 8:
    print("Summer\n")
elif month >= 11 and month <= 9:
    print("Autumn\n")
else:
    print("Error\n")
print()



#4
x = int(input("Enter the Number: "))
if x == 1:
    r = int(input("\nEnter the Radius: "))
    A = (22/7)*r*r*r*r*2
    C = 2*(22/7)*r
    print("Area: ",A,"Circumstances: ",C,"\n")
elif x == 2:
    b = int(input("\nEnter the Base: "))
    h = int(input("\nEnter the Height: "))
    print("Area: ",A,"\n")
elif x == 3:
    a = int(input("\nEnter the Length: "))
    b = int(input("\nEnter the Length: "))
    print("Area: ",A,"\n")
elif x == 4:
    a = int(input("\nEnter the Length: "))
    b = int(input("\nEnter the Length: "))
    h = int(input("\nEnter the Height: "))
    A = 1/2*(a+b)*h
    print("Area: ",A,"\n")
else:
    print("Invalid Choice\n")




#5
year = int(input("Enter the Year: "))
if year % 4== 0:
           print("Leap Year\n")
else:
           print("Not a Leap Year\n")



#6
wPay = 0
empNum = int(input("Enter the Employee Number: "))
pRate = int(input("Pay Rate Amount: "))
nHoursW = int(input("Number of Hours Worked: "))
if nHoursW > 60:
    print("Hours Work is Outranged")
elif pRate > 25:
    print("Hourly Rate Field is Outranged")
elif nHoursW > 35:
        wPay = (35*pRate) + (nHoursW - 35)/1.5 * pRate
else:
        wPay = nHoursW * pRate
print("\nEmployee Number: ",empNum,"\nPay Rate: ",pRate,"\nNumber of Hours Worked: ",nHoursW,"\nWork Pay: ",wPay,"\n")

