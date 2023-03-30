l = list(map(int, input().split()))
freqL =[0 for x in l]
for i in range(len(l)):
    freqL[i] = 1
    for j in range(i+1, len(l)):
        if l[i] == l[j]:
            freqL[i] += 1
            l[j] = -1
for i in range(len(l)):
    if((l[i] != -1) and (freqL[i]>1)):
        print(l[i])