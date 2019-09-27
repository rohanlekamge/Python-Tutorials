#3

secret = 'westminster'
turns = 6
guesses = ''

print("Let's Play Guess the Word")
print("You Have 6 Turns to Guess the Word")

length = len(secret)
print(" _ "*length)

while turns >= 1:
    turns = turns - 1
    guess = input("\n\nGuess the Word:")
    guesses = guesses + guess

    for guess in secret:
        if guess in guesses:
            print('', guess, '', end='')
        else:
            print(' _ ', end='')
                
print("\nyou're Out of Guesses")
print("End of The Game")
                
    
