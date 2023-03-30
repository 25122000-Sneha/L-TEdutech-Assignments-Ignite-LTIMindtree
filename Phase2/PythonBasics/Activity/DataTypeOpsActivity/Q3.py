print("Enter the total amount")
total = int(input())
print("Enter the number of days")
days = int(input())
print("Enter the cost of 1 litre of milk")
price = int(input())
print("Amount of milk Shruthi will buy for", days, "days is:")
sum_milk = 0
for i in range (days):
    sum_milk+= int(input())
total_price = sum_milk*price
remaining = total - total_price
print("Remaining amount with Shruthi is:", remaining)