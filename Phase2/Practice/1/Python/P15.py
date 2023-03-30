l = list(map(int, input().split()))
pos1 = int(input())
pos2 = int(input())
in1 = pos1 - 1
in2 = pos2 - 1
swap = l[in1]
l[in1] = l[in2]
l[in2] = swap
print(l)