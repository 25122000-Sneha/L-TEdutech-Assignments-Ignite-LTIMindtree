l = int(input())
b = int(input())
part_l = 0
part_b = 0
l1 = l//8
if(l % 8 != 0):
    part_l = 1
b1=b//8
if(b % 8 != 0):
    part_b = 1
whole = l1*b1
if(part_l):
    l1+=1
if(part_b):
    b1+=1
part = (l1*b1) - whole
print(whole)
print(part)
