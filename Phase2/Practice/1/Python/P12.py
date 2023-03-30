l = list(map(int, input().split()))
print("Initial Value:",tuple(l))
zeroes_tup = ()
num_tup = ()
for x in l:
    if x==0:
        zeroes_tup += (x,)
    else:
        num_tup += (x,)
num_tup += zeroes_tup
print("Final Value:",num_tup) 
