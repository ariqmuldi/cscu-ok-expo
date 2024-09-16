// Do string.toLowerCase().toCharArray() and count =+ to count +=
public class medium1_solution {
    public static void main(String[] args) {
        String sentence = "HELLO world!";

        if(count_vowels(sentence) == 3) {
            System.out.println("Number of vowels: " + count_vowels(sentence));
            System.out.println("You are correct!");
        } else {
            System.out.println("Number of vowels: " + count_vowels(sentence));
            System.out.println("You are wrong! It must be 3!");
        }
    }

    public static int count_vowels(String string) {
        String vowels = "aeiou";
        int count = 0;
        for (char charVar : string.toLowerCase().toCharArray()) { 
            if (vowels.indexOf(charVar) >= 0) {
                count += 1; 
            }
        }
        return count;
    }
}
