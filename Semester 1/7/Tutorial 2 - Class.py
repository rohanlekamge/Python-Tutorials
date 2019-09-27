#2

secret = 'westminster'
turns = 6
guesses = []

print("Let's Play Guess the Word")
print("You Have 6 Turns to Guess the Word!")

length = len(secret)
print(" _ "*length)

while turns >= 1:
    turns = turns - 1
    guess = input("\nGuess the Word:")
    if guess in secret:
        i = secret.index(guess)
        for x in range(len(secret)):
            if x == i:
                print(guess, end='')
            else:
                print(' _ ', end='')
        break
    
print("\nEnd of Game")
                
    
