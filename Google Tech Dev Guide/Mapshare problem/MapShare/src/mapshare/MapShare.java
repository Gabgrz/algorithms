/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapshare;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gab12
 */
public class MapShare {

    /**
     * @param args the command line arguments
     */
    
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "aaa");
        hm.put("b", "bbb");
        hm.put("c", "ccc");
        
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("a", "aaa");
        hm2.put("c", "meh");
        hm2.put("d", "hi");
        
        System.out.println(new MapShare().mapShare(hm2));
    }
}
