/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata2v2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aleja
 */
public class Kata2V2 {

    public static void main(String[] args) {
        int [] data = {1,6,2,8,3,8,2,7,3,4,2,9,0,6};
    
    Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
    
    for (int i=0; i<data.length; i++){
        histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
    }
    
    for (Map.Entry<Integer, Integer> entry: histogram.entrySet()){
        System.out.println(entry.getKey() + "==>" + entry.getValue());
    }
}
}    
