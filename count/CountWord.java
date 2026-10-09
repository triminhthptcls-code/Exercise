package count;

public class CountWord {
    public int countWord0ccurrences(String text, String targetWord) {
        text = text.toLowerCase();
        targetWord = targetWord.toLowerCase();
        String[] words = text.split("[\\s.,!?]+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(targetWord)) {
                count++;
            }

        }
        return count;
    }
}
