package com.company;

public class CodeWordChecker implements StringChecker {
    private String pass;
    private String $;
    private int max, min;
    private String str;
    public CodeWordChecker(String str, int max, int min){
        this.max = max;
        this.min = min;
        this.str = str;
    }



    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
    @Override
    public boolean isValid(String illegalStr) {
        if(this.str.indexOf(illegalStr) == 1) {
        return true;
        }
        return false;
    }
}
