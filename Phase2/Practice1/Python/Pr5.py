tup = tuple(map(int, input().split(",")))
k = int(input())
l = list(tup)
l.sort()

reqd_list = []
for i in range(k):
    reqd_list.append(l[i])
l.reverse()
for i in range(k):
    reqd_list.append(l[i])

reqd_list.sort()
print(tuple(reqd_list))



