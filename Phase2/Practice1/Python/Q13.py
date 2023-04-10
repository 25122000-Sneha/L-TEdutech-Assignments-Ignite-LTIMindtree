a, b, n = map(int,input().split())
c = a
d = b
for i in range(n):
    if i%2==0:
        c = c*2
    else:
        d = d*2
print(c+d)