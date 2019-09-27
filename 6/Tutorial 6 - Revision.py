# initiation phase

import random
hiddenNummber = random.randint(1,20)
guessesTaken = 0


# while loop with sentinel value

while guessesTaken < 5:
    guessedNumber = int(input("Enter the Guessed Number: "))
    if guessedNumber >= 1 and guessedNumber <= 20:
        guessesTaken = guessesTaken + 1
        if guessedNumber == hiddenNummber:
            break
        if guessedNumber < hiddenNummber:
            print("Your Guess is Too Low")
        else:
            print("Yor Guess is Too High")
    else:
        print("Please Enter a Valid Number\n")
        continue



# while loop terminated

if guessedNumber == hiddenNummber:
    print("You Got In",guessesTaken,"Guesses")
else:
    print("Not Guessed. The Correct Answer was:",hiddenNummber)
    
    

    
