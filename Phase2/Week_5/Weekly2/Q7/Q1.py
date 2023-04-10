m = int(input())
n = int(input())
l = []
for i in range(m, n+1):
    tup = (i, i**2)
    l.append(tup)

print(l)