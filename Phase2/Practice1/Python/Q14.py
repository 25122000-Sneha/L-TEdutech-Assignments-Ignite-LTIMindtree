l = int(input())
b = int(input())

l1 = l//8
b1 = b//8
whole = l1*b1

part_l = 0
part_b = 0
if l%8!=0:
    part_l+=1
if b%8!=0:
    part_b+=1
if part_l:
    l1+=1
if part_b:
    b1+=1
part = l1*b1 - whole
print(whole)
print(part)