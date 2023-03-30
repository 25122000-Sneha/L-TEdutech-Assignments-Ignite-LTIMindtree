set1 = set(map(int, input().split(",")))
if __name__=="__main__":
    #Fill your code here.
    set1 = set(map(int, input().split(",")))
    set2 = set(map(int, input().split(",")))
    if(set1 == set2):
        print("invalid set")
    else:
        new_list= sorted(set1.symmetric_difference(set2))
        new_str = ",".join([str(each) for each in new_list])
        print("{"+new_str+"}")
        