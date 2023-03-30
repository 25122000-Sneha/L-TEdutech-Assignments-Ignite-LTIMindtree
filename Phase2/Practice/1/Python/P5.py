n = int(input())
times = 0
while(n!=0):
    digit = n%10
    if digit==4:
        times+=1
    n = n//10
print(times)
    