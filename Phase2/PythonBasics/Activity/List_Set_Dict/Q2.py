N = int(input())
l = list(map(str, input().split()))
n = int(input())
subl = list(map(str, input().split()))
listr = ", ".join(l)
substr = ", ".join(subl)
if substr in listr:
    print("Yes")
else:
    print("No")




