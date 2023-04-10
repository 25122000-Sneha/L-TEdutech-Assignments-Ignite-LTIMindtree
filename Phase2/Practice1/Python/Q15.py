print("Enter the numbers")
l = list(map(int, input().split()))
print("Even numbers from the list:")
even_list = [x for x in l if x%2==0]
print(even_list)
print("Odd numbers from the list:")
odd_list = [x for x in l if x%2!=0]
print(odd_list)