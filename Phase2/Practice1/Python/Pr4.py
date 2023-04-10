l = list(map(int, input().split(", ")))
newlist = []
for num in l:
    tup = (num, num**3)
    newlist.append(tup)
print(newlist)
