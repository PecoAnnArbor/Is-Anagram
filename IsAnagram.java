package isanagram;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        isAnagram("Hello", "ellHo");
    }
    static void isAnagram(String s1, String s2) {
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");
        
        boolean status = true;
        
        if(copyOfs1.length() != copyOfs2.length()) {
            status = false;
        }
        else {
            char[] s1Arr = copyOfs1.toLowerCase().toCharArray();
            char[] s2Arr = copyOfs2.toLowerCase().toCharArray();
            
            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);
            
            status = Arrays.equals(s1Arr, s2Arr);
        }
        if(status) {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
    
}
