print("Enter the numbers")
l = list(map(int, input().split()))
even = [num for num in l if num%2==0]
odd = [num for num in l if num%2!=0]
print(even)
print(odd)