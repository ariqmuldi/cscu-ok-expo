public class medium2 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (count_words(sentence) == 9) {  // Mistake kept
            System.out.println("Number of words: " + count_words(sentence));
            System.out.println("You are correct!");
        } else {
            System.out.println("Number of words: " + count_words(sentence));
            System.out.println("You are wrong!");
        }
    }

    public static int count_words(String sentence) {
        int count = 0;
        for (char charVar : sentence.toCharArray()) {
            if (charVar == " ") {
                count += 1
            }
        }
        return count;
    }

    
}
