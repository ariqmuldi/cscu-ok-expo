// Change from == " " to ' ' and return count + 1 and add semi colon after count += 1
public class medium2_solution {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (count_words(sentence) == 9) {
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
            if (charVar == ' ') {
                count += 1;
            }
        }
        return count + 1;
    }

    
}
