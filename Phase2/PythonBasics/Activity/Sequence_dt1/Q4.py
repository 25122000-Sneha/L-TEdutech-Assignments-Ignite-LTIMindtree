if __name__=="__main__":
    #Fill your code here.
    l1 = list(map(int, input().split(",")))
    l2 = list(map(int, input().split(",")))
    set1 = set(l1)
    set2 = set(l2)
    if set1 == set2:
        print("invalid set")
    else:
        set3 = set1.symmetric_difference(set2)
        new_list = list(set3)
        new_list.sort()
        sorted_list = ",".join(str(x) for x in new_list)
        print("{",sorted_list,"}")

