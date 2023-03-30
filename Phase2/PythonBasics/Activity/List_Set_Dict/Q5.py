if __name__=="__main__":
    #Fill your code here.
    veh = int(input())
    max_veh = int(input())
    l = []
    count = 0
    for i in range(veh):
        regno = input()
        chassisno= input()
        engineno = input()
        owner = input()
        address = input()
        if(count < max_veh):
            d = {"regno" : regno, "chassisno" : chassisno, "engineno" : engineno, "owner" : owner, "address" : address}
            l.append(d)
            count+=1
    print("Reg.no: chassis no: engine no: owner name: address:")
    for x in l:
        print(x["regno"], x["chassisno"], x["engineno"], x["owner"], x["address"])