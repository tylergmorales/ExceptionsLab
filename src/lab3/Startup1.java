/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author tmorales3
 */
public class Startup1 {
    public static void main(String[] args) {
        
        
        String s = "hello";
        StringService service = new StringService();
        
        try {
        service.saveText(s, -1);
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
