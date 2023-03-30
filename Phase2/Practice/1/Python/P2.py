n = int(input())
print("Enter x and y indicates x/y of an hour")
x = int(input())
y = int(input())
total_secs = (x/y)*3600
times = total_secs//n
print("The light will flash",int(times+1),"times")