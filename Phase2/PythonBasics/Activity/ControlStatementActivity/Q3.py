n = int(input())
n1 = int(input())
n2 = int(input())
n3 = int(input())
d1 = abs(n - n1)
d2 = abs(n - n2)
d3 = abs(n - n3)
min_diff = min(d1, d2, d3)
if n1==n or n2==n or n3==n:
    floor = n
elif d1==d2 :
    floor = max(n1, n2)
elif d2==d3:
    floor = max(n2, n3)
elif d3==d1:
    floor = max(n3, n1)
else:
    if min_diff == d1:
        floor = n1
    elif min_diff == d2:
        floor = n2
    elif min_diff == d3:
        floor = n3 
print(floor)