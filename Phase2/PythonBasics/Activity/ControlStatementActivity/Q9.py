num = int(input())
if(num < 10):
    print("Invalid Input")
else:
    last_digit = num % 10
    digits = 0
    n = num
    while(num != 0):
            digits+=1
            num = num // 10
    first_digit = n // (10**(digits-1))
    diff = abs(first_digit - last_digit)
    print(diff)