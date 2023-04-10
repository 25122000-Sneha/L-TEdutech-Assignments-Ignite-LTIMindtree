n = int(input())
print("Enter x and y indicates x/y of an hour")
x = int(input())
y = int(input())
times = ((x/y)*3600)//n 
print("The light will flash",int(times+1),"times")