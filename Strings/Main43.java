import java.util.*;

public class Main43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String str[] = s.split(" ");

        char word1[] = str[0].toCharArray();
        char word2[] = str[1].toCharArray();

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < word1.length; i++) {
            for(int j = 0; j < word2.length; j++) {
                if(word1[i] == word2[j]) {
                    set.add(word1[i]);
                }
            }
        }

        for(int j = 2; j < str.length; j++) {

            char word[] = str[j].toCharArray();

            HashSet<Character> newSet = new HashSet<>();

            for(char ch : set) {

                boolean found = false;

                for(int k = 0; k < word.length; k++) {

                    if(ch == word[k]) {
                        found = true;
                        break;
                    }
                }

                if(found) {
                    newSet.add(ch);
                }
            }

            set = newSet;
        }

        if(set.isEmpty()) {
            System.out.print("-1");
        }
        else {

            ArrayList<Character> result = new ArrayList<>(set);

            Collections.sort(result);

            for(int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
        }

        sc.close();
    }
}