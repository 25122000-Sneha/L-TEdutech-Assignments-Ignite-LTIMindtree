l = list(map(int, input().split()))
count = 0
for x in l:
    if(isinstance(x, tuple)):
        break
    count += 1
print(count)