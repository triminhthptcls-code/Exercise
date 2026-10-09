package capital;

public class capitalizena {
    public String formatName(String rawName) {
        rawName = rawName.trim().toLowerCase();
        String[] words = rawName.split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String first = word.substring(0, 1).toUpperCase();
            String end = word.substring(1).toLowerCase();
            result = result + first + end;
            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }
}
