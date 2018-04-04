/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid.builder;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author DmShu
 */
public class PyramidBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(2); a.add(4); a.add(3); a.add(5); a.add(6); a.add(1);
    //a.add(7); a.add(8);
    //a.add(9); a.add(10);
       /* Sort statement*/
	   Collections.sort(a);
    Piramid p=new Piramid(a);
    /*
        for (Integer number : a) {
        System.out.println(number);
        }
         System.out.println(a);
*/
    }
    
}
