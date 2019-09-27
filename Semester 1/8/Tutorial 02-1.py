#1 CONVERTS MINUTES IN TO YEARS AND DAYS
minutes = int(input("Minutes:"))
years = minutes/(365*24*60)
days = (minutes/(60*24))%365
print("Years:",years)
print("Days:",days)
print()


#2 CHECK THE ROADS IN NEWYORK
strNum = int(input("Input the Street Number:"))
if strNum % 2 == 1:
    print("West Bound")
else:
    print("East Bound")
print()


#3 RESIDENCE IN COLOMBO
age = int(input("Enter the Age:"))
resId = (input("Enter the Residence ID:"))
if age > 15 and resId == "colombo":
    print("accepted")
else:
    print("Not Accepted")
print()


#4 DISPLAYING GRADE
mark = int(input("Enter Your Mark:"))
if mark < 40:
    print("Failed")
elif mark <= 65:
    print("Average")
elif mark >=66 and mark <= 100:
    print("Outstanding")
else:
    print("Enter the Correct Marks")
    
