package HashMap;

import java.util.HashMap;


public class ValidAnagrams {
    static HashMap<Character,Integer> makeFreq(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
    static boolean checkAnagram1(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreq(s1);
        HashMap<Character, Integer> mp2 = makeFreq(s2);
        return mp1.equals(mp2);
    }
    static boolean checkAnagram2(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> mp = makeFreq(s);
        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            else{
                int currFreq=mp.get(ch);
                mp.put(ch,currFreq-1);
            }
        }
        // After this all the values in the map should be 0 if anagram is present

        for(int i:mp.values()){
            if(i!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        checkAnagram1(s1,s2);
    }
}
