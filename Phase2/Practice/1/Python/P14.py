l = list(map(int, input().split()))
swap = l[0]
l[0] = l[len(l)-1]
l[len(l)-1] = swap
print(l)
