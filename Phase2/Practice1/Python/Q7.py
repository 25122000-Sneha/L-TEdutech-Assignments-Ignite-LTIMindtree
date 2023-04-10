print("Number of students:")
n = int(input())
print("Number of teams:")
t = int(input())
students_per_team = n//t
remaining_students = n%t
print(f"The number of students in each team, left out is ({students_per_team},{remaining_students})")
