
tup = tuple(map(int, input().split()))
zero_tup = ()
new_tup = ()
for num in tup:
    if num == 0:
        zero_tup += (num,)
    else:
        new_tup += (num,)
new_tup += zero_tup
print("Initial Value:", tup)
print("Final value:", new_tup)


