n = int(input())
if(n<10):
    print("Invalid Input")
else:
    digits = 0
    num = n
    while(num!=0):
        digits+=1
        num = num//10
    first_digit = n//(10**(digits-1))
    last_digit = n%10
    diff = abs(first_digit - last_digit)
    print(diff)