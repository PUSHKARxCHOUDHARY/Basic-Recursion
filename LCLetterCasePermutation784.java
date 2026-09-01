import java.util.*;

public class LCLetterCasePermutation784 {

    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        if (Character.isDigit(chars[index])) {
            backtrack(chars, index + 1, result);
        } else {
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index + 1, result);

            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
        }
    }

    public static void main(String[] args) {
        LCLetterCasePermutation784 sol = new LCLetterCasePermutation784();

        System.out.println(sol.letterCasePermutation("a1b2"));
        System.out.println(sol.letterCasePermutation("3z4"));
    }
}