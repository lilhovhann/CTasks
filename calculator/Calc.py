a = float(input("enter first number: "))
operation = input("enter operation (+,-,/,*) ")
b = float(input("enter second number here: "))

if operation == '+':
    print (a+b)
elif operation == '-':
    print (a-b)
elif operation == '*':
    print (a*b)
elif operation == '/':
    print (a/b)
elif operation != '+' or operation !='-' or operation != '*' or operation != '/':
    print ("try one of these symbols: +,-,*,/")
   







