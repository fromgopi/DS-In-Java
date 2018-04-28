package com.example.strings;

public class LongestPalidromSubString {

    String find(String s){

        if(s.isEmpty()){
            return "";
        }
        if (s.length() == 1){
            return s;
        }

        String longest = s.substring(0,1);

        for(int i=0;i<s.length();i++){
            String temp = helper(s, i, i);
            if(temp.length() >= longest.length()){
                longest = temp;
            }
            temp = helper(s, i, i+1);
            if(temp.length() >= longest.length()){
                longest = temp;
            }
        }

        return longest;
    }

    private String helper(String s, int start, int end) {
        while (start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1, end);
    }
}
