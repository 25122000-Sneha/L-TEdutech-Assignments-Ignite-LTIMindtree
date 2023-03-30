n = int(input())
l = []
for i in range(n):
    l.append(int(input()))
d = {"pass": {}, "fail": {}}
for i in range(1, len(l)+1):
    if l[i-1] < 40:
        d["fail"].update({i : l[i-1]})
    else:
        d["pass"].update({i : l[i-1]})
#print(d)
if d["fail"] == {}:
    print("All are passed")
elif d["pass"] == {}:
    print("All are failed")
else:
    print("Student who failed in Final Exam")
    for k,v in d["fail"].items():
        print("Roll No:",k,"- Mark:",v)
    print("Student who passed in Final Exam")
    for k,v in d["pass"].items():
        print("Roll No:",k,"- Mark:",v)

'''
5
78
39
45
35
89
'''
'''
6
41
67
45
80
89
67
'''
'''
6
39
37
35
30
29
17
'''