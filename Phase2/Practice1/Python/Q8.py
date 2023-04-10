n = int(input())
n1 = int(input())
n2 = int(input())
n3 = int(input())

d1 = abs(n-n1)
d2 = abs(n-n2)
d3 = abs(n-n3)
min_diff = min(d1,d2,d3)
if n1==n or n2==n or n3==n:
    print(n)
elif min_diff==d1 and d1==d2:
    print(max(n1,n2))
elif min_diff==d2 and d2==d3:
    print(max(n2,n3))
elif min_diff==d3 and d3==d1:
    print(max(n1,n3))
else:
    if min_diff==d1:
        print(n1)
    elif min_diff==d2:
        print(n2)
    elif min_diff==d3:
        print(n3)
