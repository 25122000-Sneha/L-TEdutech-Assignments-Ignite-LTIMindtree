print("Enter the total amount")
total = int(input())
print("Enter the number of days")
days = int(input())
print("Enter the cost of 1 litre of milk")
cost_per_litre = int(input())
print("Amount of milk Shruthi will buy for",days,"days is:")
sum = 0
for i in range(days):
    sum += int(input())
spent_amount = cost_per_litre*sum
remaining_amount = total - spent_amount 
print("Remaining amount with Shruthi is:",remaining_amount)
