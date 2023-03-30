n = int(input())
l = list(map(int, input().split()))
even = 0
odd = 0
for x in l:
    if x%2 == 0:
        even += 1
    else:
        odd += 1
print(even, odd)
