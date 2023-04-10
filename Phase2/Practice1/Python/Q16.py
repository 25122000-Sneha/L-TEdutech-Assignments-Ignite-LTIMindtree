tup = tuple(map(int, input().split()))
print("Initial Value:",tup)
zeroes_tup = ()
num_tup = ()
for x in tup:
    if x==0:
        zeroes_tup += (x,)
    else:
        num_tup += (x,)
num_tup += zeroes_tup
print("Final value:",num_tup)
