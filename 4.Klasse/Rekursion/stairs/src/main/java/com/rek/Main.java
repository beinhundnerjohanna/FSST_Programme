package com.rek;

public class Main {
    public static void main(String[] args) {
        int n = 22;

        System.out.println(stairwayToHeaven(0,n));
    }

    static public int stairwayToHeaven(int pos, int steps){
        if(pos == steps-3){
            return 1;
        }else if(pos == steps-2 || pos == steps-4){
            return 1;
        }
        else{
            return stairwayToHeaven(pos + 2, steps) + stairwayToHeaven(pos+3, steps) ;
        }
    }

}