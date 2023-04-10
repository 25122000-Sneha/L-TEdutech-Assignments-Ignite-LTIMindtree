test_list = [(5,6), (5,7), (5,8), (6,10), (7,13)]
new_list = []
for tup in test_list:
    elem = tup[0]
    for i in range(1, len(test_list)):
        current_tup = test_list[i]
        if(elem == current_tup[0]):
            tup += current_tup[1:]
    new_list.append(tup)
print(new_list)

