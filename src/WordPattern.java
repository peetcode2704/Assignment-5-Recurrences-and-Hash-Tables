import java.util.HashMap;
import java.util.regex.Pattern;

public class WordPattern {
    public boolean isFollowPattern(String p, char d, String s) {
        String delimiter = String.valueOf(d); //convert d into String
        //To avoid regex pattern error, it quotes the pattern and interprets it as string literals.
        String[] words = s.split(Pattern.quote(delimiter));

        //If the length of the pattern doesn't match the length of the String s "aaa" vs "dog cat" 2 != 3.
        if(words.length != p.length()){
            return false;
        }
        //Hashmap to pair a character to a word.
        HashMap <Character, String> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            //Access each character at a time
            char curr_char = p.charAt(i);
            if(map.containsKey(curr_char)){
                //If it does not match the word return false
                if(!map.get(curr_char).equals(words[i])){
                    return false;
                }
            }
            else {
                //Checks if the word is already a value in the map or is already mapped to another character
                if (map.containsValue(words[i])){
                    return false;
                }
                //Otherwise, put it in the map.
                map.put(curr_char, words[i]);
            }
        }
        return true;
    }
}