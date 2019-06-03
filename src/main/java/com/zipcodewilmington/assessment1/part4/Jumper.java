package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        //How many jumps it will take Tariq to scale the wall:
        int jumps = (k / j);
        //How many units remain from Tariq's last jump to the flag:
        int steps = (k % j);
        //Return the amount of jumps in addition to smaller units of progression to flag.
        return jumps + steps;
    }
}
