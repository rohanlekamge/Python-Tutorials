#1-a
total = 10
print(total)
print(type(total))
print()

#1-b-1
total = '10'
print(total)
print(type(total))
greet = 'Hello'
both = greet + total
print(both)             #this is one way to do this
print()

#1-b-2
total = 10
print(total)
print(type(total))
greet = 'Hello'
total = str(total)
both = greet + total
print(both)             #this is another way to do this
print()

#1-c-1
a = "10"
b = "99"
c = a + b
print(c)
print(type(c))
c = int(c)
print(c)
print(type(c))
print()

#1-c-2
a = 10
b = 99
c = a + b
print(c)
print(type(c))
print()
print()


#2-a
name = input('Please Enter Your Name:\n')
print('Hello', name)
print()
age = input('Pleas Enter Your Age:\n')
age = int(age)
print('Your Age Is', age)
print()
print()


#3
print('test\\test2\\answers.txt')
print()
print()


#4
the_text = input('Enter some text.\n')    #get some text!

#print - version 1
print('This is what you entered: ')
print(the_text)
print()

#print - version 2
print('This is what you entered:', the_text)
print()

#print - version 3 - To supress printing of a new line, use end=' '
print('This is what you entered:', end=' ')
print(the_text) 

#5
print("A",end = '')
print("B",end = '')
print("C",end = '')
print("D",end = '')
print()
print()


#6-1
noPets = int(input('Number Of Pets User Has:'))
print('Number Of Pets User Has:', noPets)
print()

#6-2
running_total = 0
running_total = running_total + 5
running_total = running_total + 8
running_total = running_total + 2
running_total = running_total + 3
print('Total:',running_total)
print()

#6-3
total = 0
a = int(input('Number 1:'))
b = int(input('Number 2:'))
total = a+b
print('Total',total)
print()

#6-4
a = int(input('Cost of the Item:'))
b = int(input('Cash Paid:'))
change = b-a
print('Change:',change)
print()

#6-5
a = int(input('Enter Number 1:'))
b = int(input('Enter Number 2:'))
c = int(input('Enter Number 3:'))
avg = (a+b+c)/3
print('Average:',avg)
print()
print()

#7
cen = int(input('Centigrade:'))
far = (9/5)* cen + 32
print('Fahrenheit:',far)
print()
print()

#8
l = int(input('Length:'))
h = int(input('Height:'))
w = int(input('Width:'))
a = l*h*w
print('Area:',a)
print()
print()


#9
met = int(input('Meters:'))
cen = met*1000
print('Centimeters:',cen,'cm')
print()
print()



