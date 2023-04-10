n = int(input())
if n < 10:
    print("Invalid Input")
else:
    num = n
    last_digit = n%10
    digits = 0
    while(n!=0):
        digits+=1
        n = n//10
    first_digit = num // (10**(digits-1))
    diff = abs(first_digit - last_digit)
    print(diff)
