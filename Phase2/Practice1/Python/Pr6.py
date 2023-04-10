tup1 = tuple(map(int, input().split(",")))
tup2 = tuple(map(int, input().split(",")))
mod_tup = ()
for i in range(len(tup1)):
    mod_val = tup1[i] % tup2[i]
    mod_tup += (mod_val,)
print(mod_tup)