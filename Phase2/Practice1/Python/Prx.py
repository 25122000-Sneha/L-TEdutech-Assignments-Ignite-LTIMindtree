l = list(map(int, input().split()))
dupl=[]
freq_list = []
for i in range(len(l)):
    freq_list.append(0)
for i in range(len(l)):
    freq_list[i] = 1
    for j in range(i+1, len(l)):
        if l[i] == l[j]:
            freq_list[i] += 1
            l[j] = "a"

for i in range(len(l)):
    if l[i] != "a" and freq_list[i]>1:
        dupl.append(l[i])
print(dupl)

