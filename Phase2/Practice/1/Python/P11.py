print("Enter the numbers")
l = list(map(int, input().split()))
print("Even numbers from the list:")
even = [x for x in l if x%2==0]
print(even)
print("Odd numbers from the list:")
odd = [x for x in l if x%2!=0]
print(odd)