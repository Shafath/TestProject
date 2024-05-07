/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Question1 {

     * Complete the 'getMinSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY security_values
     *  2. STRING msg



    public static int getMinSum(List<Integer> security_values, String msg) {
        // Write your code here
        char[] msgArray = msg.toCharArray();
        Map<Character, Integer> charValues = new HashMap<Character, Integer>();

        for(int i = 0; i < 26; i++) {
            charValues.put((char)('a'+i), security_values.get(i));
        }

        // Convert the char array to Character array
        Character[] characterArray = new Character[msgArray.length];
        for (int i = 0; i < msgArray.length; i++) {
            characterArray[i] = msgArray[i];
        }

        Comparator<Character> customComparator = (a, b) -> Integer.compare(charValues.get(a), charValues.get(b));
        Arrays.sort(characterArray, customComparator);

        int minimumSum = 0;
        for(int i = 1; i < msg.length(); i++) {
            int diff = Math.abs(charValues.get(characterArray[i]) - charValues.get(characterArray[i-1]));              minimumSum += diff;
        }

        return minimumSum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int security_valuesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> security_values = IntStream.range(0, security_valuesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        String msg = bufferedReader.readLine();

        int result = Question1.getMinSum(security_values, msg);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
