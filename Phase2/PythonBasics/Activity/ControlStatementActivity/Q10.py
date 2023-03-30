a, b, N = map(int, input().split())
ri = a
ra = b
for i in range(N):
    if(i%2==0):
        ri = (ri*2)
    else:
        ra= (ra*2)
total = ri + ra
print(total)