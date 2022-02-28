package sentences;

public class SentenceTransformer {


    public String shortenSentence(String sentence) {
        String result = "";
        if ((int) sentence.charAt(0) < 65 || (int) sentence.charAt(0) > 90) {
            throw new IllegalArgumentException("Must start with capital letter!");
        }
        if ((int) sentence.charAt(sentence.length() - 1) != 46 && (int) sentence.charAt(sentence.length() - 1) != 33 && (int) sentence.charAt(sentence.length() - 1) != 63) {
            throw new IllegalArgumentException("Must end with . ! or ?");
        }
        String[] words = sentence.split(" ");

        if (words.length > 4) {
            result = words[0] + " ... " + words[words.length - 1];
        } else {
            result = sentence;
        }
        return result;
    }
}
