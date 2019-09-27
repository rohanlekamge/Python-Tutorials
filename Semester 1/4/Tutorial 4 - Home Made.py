#Exercise 2 - Part A
hidenVal = 6
x = 5
print("Enter  an integer between 1 and 20")
while hidenVal != x:
    x = int(input("Guess the Number: "))
print("You are Correct \n")


#Exercise 2 - Part B
hidenVal = 6
import random
print("This will Generate an integer between 1 and 20")
x = random.randint(1,20)   
if x == hidenVal:
    print("Correct")
else:
    print("Wrong \n")


#Exercise 2 - Part C
hidenVal = 6
x = 5
print("Enter  an integer between 1 and 20")
while hidenVal != x:
    x = int(input("Guess the Number: "))
    if x < 6:
        print("Too Low")
    elif x > 6:
        print("Too High")
print("You are Correct \n")


#Exercise 3
hidenVal = 6
x = 5
counter = 1
print("Enter  an integer between 1 and 20")
while hidenVal != x:
    if counter <= 5:
        counter = counter + 1
        x = int(input("Guess the Number: "))
        if x < 6:
            print("Too Low")
        elif x > 6:
            print("Too High")
        
    else:
        print("\nYour Guess Limit is Reached \n")
        break
if x == hidenVal:
    print("You are Correct")
    print("You Took",counter - 1,"Guesses \n")



#Exercise 4
score = 0
count = 0
total = 0
while score != -9:
    score = int(input("Enter the Scores: "))
    total = total + score
    count = count + 1
if score == -9:
    average = total / count
    print("Average:",average,"\n")


#Exercise 5
score = 0   #check #check #check #check #check #check #check  
count = 0
total = 0
while True == True:
    if score != -9:
        score = int(input("Enter the Scores: "))
        total = total + score
        count = count + 1
    else:
        True == False
if score == -9:
    average = total / count
    print("Average:",average,"\n")





