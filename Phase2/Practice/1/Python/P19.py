r = int(input())
c = int(input())
l = []
for i in range(r):
    l1 = []
    for j in range(c):
        l1.append(int(input()))
    l.append(l1)
print(l)
max_product = 0
for i in range(len(l)):
    product = 1
    for j in range(len(l[i])):
        product *= l[i][j]
    if(product > max_product):
        max_product = product
print(max_product)

    