print("Enter the word :")
word = input().lower()
vowels = 0
for x in word:
    if x=='a' or x=='e' or x=='i' or x=='o' or x=='u':
        vowels += 1
print("Count of vowels in",word," is",vowels)
