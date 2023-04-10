x = int(input())
y = int(input())
print("Before Swapping the numbers : ",x,y)
x = x ^ y
y = x ^ y
x = x ^ y
print("After Swapping the numbers : ",x,y)