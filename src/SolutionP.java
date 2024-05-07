import java.util.HashMap;
import java.util.Map;

class SolutionP {

    public static void main(String[] args) {
        SolutionP.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
    }
    public static int longestPalindrome(String s) {
        int length = 0;
        if(s.length() == 1) {
            return 1;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c : map.keySet()) {
            if(map.get(c) > 1) {
                if(map.get(c) % 2 == 0)
                    length += map.get(c);
                else
                    length += map.get(c) - 1;
            }
        }

        if(length != s.length() && length % 2 == 0) {
            length = length + 1;
        }

        return length;

    }
}