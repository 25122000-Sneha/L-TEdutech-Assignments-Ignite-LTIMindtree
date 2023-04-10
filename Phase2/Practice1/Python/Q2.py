def power(a, b, n):
    count = 0
    while count!=n:
        print(a,"**",b,"=",a**b)
        a += 1
        count+=1



print("Enter the value of a")
a = int(input())
print("Enter the value of b")
b = int(input())
print("Enter the value of n")
n = int(input())
if b<0 or n<0:
    print("Invalid Input")
else:
    power(a,b,n)