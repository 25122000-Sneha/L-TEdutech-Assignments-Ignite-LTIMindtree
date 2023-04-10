l = [1,2,4,9,(5,6),9]
count = 0
for num in l:
    if isinstance(num, tuple):
        break
    count += 1
print(count)