package com.juankevintrujillo;

/**
 *
 * @author juankevintr
 */
public class Main {

    public static void main(String[] args) {
	Histogram histogram = new Histogram(2,5,1,9,0,1,-3,3,7,4,6,8,2,9,-5,7,0);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
