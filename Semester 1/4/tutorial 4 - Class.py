count = 0
total = 0
status = True
while status:
    score = int(input("Enter the Score: "))
    count = count + 1
    total = total + score
    if score == -9:
        status = False
average = total/count
print("Average: ",average,"\n")




#Exercise 2 - Part A
hiddenVal = 6
x = 0
print("Enter  an integer between 1 and 20")
while x != hiddenVal:
    x = int(input("Guess the Number: "))
print("Your Guess is Correct \n")



#Exercise 2 - Part B
x = 0
import random
hiddenVal = random.randint(1,20)
while x != hiddenVal:
    print("Enter  an integer between 1 and 20")
    x = int(input("Guess the Number: "))
print("Your Guess is Correct \n")


#Exercise 2 - Part C
x = 0
import random
hiddenVal = random.randint(1,20)
while x != hiddenVal:
    print("Enter  an integer between 1 and 20")
    x = int(input("Guess the Number: "))
    if x < hiddenVal:
        print("Too Low")
    elif x > hiddenVal:
        print("Too High")
print("Your Guess is Correct \n")


#Exercise 3
counter = 2
import random
print("Enter  an integer between 1 and 20")
hiddenVal = random.randint(1,20)
x = int(input("Guess the Number: "))
while x != hiddenVal:
    if counter <=5:
        print("Enter  an integer between 1 and 20")
        x = int(input("Guess the Number: "))
        counter = counter + 1
        if x < hiddenVal:
            print("Too Low")
        elif x > hiddenVal:
            print("Too High")
    else:
        print("\nYour Guess Limit is Reached \n")
        break
if x == hiddenVal: 
    print("Your Guess is Correct \n")
    print("You Took",counter - 1,"Guesses \n")


#Exercise 4
score = 0
count = 0
total = 0
while score != -9:
    score = int(input("Enter the Score: "))
    count = count + 1
    total = total + score
average = total/count
print("Average: ",average,"\n")


#Exercise 5
count = 0
total = 0
status = True
while status:
    score = int(input("Enter the Score: "))
    count = count + 1
    total = total + score
    if score == -9:
        status = False
average = total/count
print("Average: ",average,"\n")
