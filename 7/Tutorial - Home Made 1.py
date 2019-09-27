#2

turns = 6
secret = 'westminster'
guesses = ''

print("Let's Play Guess the Word")
print("You Have 6 Turns to Guess the Word")

while turns > 0:
    guess = input("\nGuess a Letter: ")
    turns = turns - 1
    guesses = guesses + guess
    
    for guess in secret:
        if guess in guesses:
            print('',guess,'',end='')
        else:
            print(' _ ', end='')
        
print("\r")
print("End of Game")
print()
