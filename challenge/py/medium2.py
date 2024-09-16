def count_words(sentence):
    count = 0
    for char in sentence:
        if char != " ":
            count += 1
    return count

sentence = "The quick brown fox jumps over the lazy dog"
if count_words(sentence) == 9:
    print("Number of words:", count_words(sentence))
    print("You are correct!")
else:
    print("Number of words:", count_words(sentence))
    print("You are wrong!")