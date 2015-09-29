/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author usuario
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] vector = {7,2,3,4,5,6};
       //String [] vector = {"Ana","Paco","Maria"};
       
       Histogram <Integer> histogram = CalculaHisto.computeHistogram(vector);
       for (Object key : histogram.keyset()){
        System.out.println(key + "-->" + histogram.get(key));
    }
    }
    
    
}
