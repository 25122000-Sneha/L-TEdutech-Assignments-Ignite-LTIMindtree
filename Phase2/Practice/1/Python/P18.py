l = list(map(int, input().split()))
val = int(input())
for x in l:
    if(x>val):
        l.remove(x)
print(l)