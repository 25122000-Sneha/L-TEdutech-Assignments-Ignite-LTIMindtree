'''d = {9:"nine", 8:"eight", 10:"ten", 1:"one", 2:"two", 4:"four"}
key_list = list(d.keys())
key_list.sort()
new_d = {}
for i in key_list:
    new_d.update({i : d[i]})
print(new_d)'''

d = {'a': 100, 'b':200, 'c':300}
sum = 0
for k in d:
    sum += d[k]
print(sum)
