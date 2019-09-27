gender = input("Enter Your Gender: ")
while gender != "Male" or gender != "Female":
    gender = input("Enter Your Gender: ")
height = int(input("Enter Your Height: "))
weight = int(input("Enter Your Weight: "))
if gender == Male:
    if height >= 62 and height <= 78:
        heightok = height
    if weight >= 130 and weight <= 250:
        weightok = weight
elif gender == Female:
    if height >= 60 and height <= 72:
        heightok = height
    if weight >= 110 and weight <= 185:
        weightok = weight


#1
print("Geomatrical Figure Calculations")
print("1. Circle\n2. Triangle\n3. Ellipse\n4. Trapezium")
x = int(input("Enter the Number: "))
if x == 1:
    r = int(input("\nEnter the Radius: "))
    A = (22/7)*r*r
    C = 2*(22/7)*r
    print("Area: ",A,"Circumstances: ",C,"\n")
elif x == 2:
    b = int(input("\nEnter the Base: "))
    h = int(input("\nEnter the Height: "))
    A = 1/2*b*h
    print("Area: ",A,"\n")
elif x == 3:
    a = int(input("\nEnter the Length: "))
    b = int(input("\nEnter the Length: "))
    A = (22/7)*a*b
    print("Area: ",A,"\n")
elif x == 4:
    a = int(input("\nEnter the Length: "))
    b = int(input("\nEnter the Length: "))
    h = int(input("\nEnter the Height: "))
    A = 1/2*(a+b)*h
    print("Area: ",A,"\n")
else:
    print("Invalid Choice\n")


#2


#3


#4

    
