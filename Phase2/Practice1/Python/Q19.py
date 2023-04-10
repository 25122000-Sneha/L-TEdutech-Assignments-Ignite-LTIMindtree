n = int(input())
d = {"pass" : {}, "fail" : {}}
for i in range(1, n+1):
    marks = int(input())
    if marks<40:
        d["fail"].update({i : marks})
    else :
        d["pass"][i] = marks
print(d)

if d["fail"] == {}:
    print("All are passed")
elif d["pass"] == {}:
    print("All are failed")
else:
    for roll,marks in d["fail"].items():
        print(f"Roll No: {roll} - Mark: {marks}")
    print("Students who passed in Final Exam")
    for roll,marks in d["pass"].items():
        print(f"Roll No: {roll} - Mark: {marks}")
