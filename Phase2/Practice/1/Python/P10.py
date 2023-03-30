a, b, n = map(int, input().split())
ri = a
ra = b
for i in range(n):
    if(i%2==0):
        ri = ri*2
    else:
        ra = ra*2
score = ri + ra
print(score)
