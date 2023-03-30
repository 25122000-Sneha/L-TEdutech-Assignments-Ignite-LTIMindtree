if __name__=="__main__":
    #Fill your code here.
    print("Enter the no donors available")
    no = int(input())
    l = []
    for i in range(no):
        print("Enter the details of donor ",(i+1))
        n = input()
        e = input()
        ph = input()
        bg = input()
        d = {"name" : n, "email" : e, "phone" : ph, "bloodgrp" : bg}
        l.append(d)
    #print(l)
    print("Enter the required blood group")
    reqdbg = input()
    flag = 0
    for d in l:
        if d["bloodgrp"] == reqdbg:
            flag += 1
            print("Details of matched donor")
            print(d["name"])
            print(d["email"])
            print(d["phone"])
            print(d["bloodgrp"])
    if(flag == 0):
        print("No donor with required blood group")
    