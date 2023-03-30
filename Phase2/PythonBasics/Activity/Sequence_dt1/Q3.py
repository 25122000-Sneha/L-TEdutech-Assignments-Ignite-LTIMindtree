print("Enter the word :")
word = input()
count = 0
for x in word.lower():
    if x=='a' or x=='e' or x=='i' or x=='o' or x=='u':
        count += 1
print("Count of vowels in", word, "is", count)