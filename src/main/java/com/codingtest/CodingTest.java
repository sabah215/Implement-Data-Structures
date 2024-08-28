package com.codingtest;

import java.util.Stack;

/*
* Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring*/
public class CodingTest {
    public static void main(String[] args) {
            int len = getSubstring("abcabcbb");
            System.out.println(len);
        }
    public static int getSubstring(String s){
        int count = 0;
        Stack<Character> st = new Stack<>();

        char [] ch = s.toCharArray();
        for(char c : ch){
            while(!st.isEmpty()){
                if(st.contains(c)){
                    st.pop();
                    count++;
                }
                else st.push(c);
            }
            st.push(c);
        }
        return count;
    }
}

