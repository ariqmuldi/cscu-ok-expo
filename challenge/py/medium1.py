def count_vowels(string):
    vowels = "aeiou"
    count = 0
    for char in string:
        if char in vowels:
            count =+ 1
    return count

sentence = "HELLO world!"

if(count_vowels(sentence) == 3):
    print("Number of vowels:", count_vowels(sentence))
    print("You are correct!")
else:
    print("Number of vowels:", count_vowels(sentence))
    print("You are wrong! It must be 3!")
