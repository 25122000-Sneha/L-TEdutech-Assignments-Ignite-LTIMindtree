tup = tuple(map(int, input().split(",")))
new_tup = ()
for i in range(len(tup)-1):
    val = tup[i] * tup[i+1]
    new_tup += (val,)
print(new_tup)