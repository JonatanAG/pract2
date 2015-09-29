/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author usuario
 */
public class CalculaHisto {
    public static <T> Histogram <T> computeHistogram (T [] vector){
        
        Histogram <T> histo = new Histogram<>();
        
        for(T key : vector){
            histo.increment(key);
        }
        return histo;
    }
}
