public class CircularSentence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String sentence = "leetcode exercises sound delightful";
        boolean result = solution.isCircularSentence(sentence);
        System.out.println("Is the sentence circular? " + result);
    }

    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        
        // Check if it's a single word and if the first and last characters are the same
        if (words.length == 1) {
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }
        
        // Check if each word's last character matches the next word's first character
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        
        // Check if the last character of the last word matches the first character of the first word
        return words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0);
    }
}
