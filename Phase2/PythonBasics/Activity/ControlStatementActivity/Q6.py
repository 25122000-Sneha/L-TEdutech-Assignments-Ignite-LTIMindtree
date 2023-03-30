num = int(input())
count = 0
while(num != 0):
    digit = num%10
    if(digit == 4):
        count+=1
    num = num//10
print(count)