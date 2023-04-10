N = int(input())
l = list(map(str, input().split()))
n = int(input())
subl = list(map(str, input().split()))
str1 = ",".join(l)
str2 = ",".join(subl)
if str2 in str1:
    print("Yes")
else:
    print("No")