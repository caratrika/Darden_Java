package lambda;
import java.util.ArrayList;
import java.util.List;
public class Lambda_q4 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("kiwi");
        words.add("orange");
 
       
        words.removeIf(word -> word.length() % 2 != 0);
 
        
        System.out.println("List after removing words with odd lengths: " + words);
    }
}