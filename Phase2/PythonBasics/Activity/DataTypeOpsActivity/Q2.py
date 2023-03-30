def power(a,b,n):
    if((b<0) or (n<0)):
        print("Invalid Input")
    else:
        for count in range(0, n):
            print(a,"**",b,"=",a**b)
            a+=1
        


if __name__=="__main__":
    #Fill your code here.
    print("Enter the value of a")
    a = int(input())
    print("Enter the value of b")
    b = int(input())
    print("Enter the value of n")
    n = int(input())
    power(a, b, n)

