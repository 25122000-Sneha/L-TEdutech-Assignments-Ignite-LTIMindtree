print("Enter the no donors available")
n = int(input())
l = []
for i in range(1,n+1):
    print("Enter details of donor",i)
    name = input()
    email = input()
    phone = input()
    bloodgrp = input()
    d = {"name":name, "email":email, "phone":phone, "bloodgrp": bloodgrp }
    l.append(d)
print("Enter the required blood grp")
reqd_bloodgrp = input()

flag = 0
for di in l:
    if di["bloodgrp"] == reqd_bloodgrp:
        print("Details of matched donor")
        flag +=1
        print(di["name"])
        print(di["email"])
        print(di["phone"])
        print(di["bloodgrp"])

if flag == 0:
    print("No donor with reqd blood grp")