/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisions;

import java.util.Scanner;

/**
 *
 * @author DouglasD
 */
public class Decisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        
        if(age < 3){
            System.out.println("You are an infant. Go drink some more milk.");            
        }else if(age > 3 && age <=12){
            System.out.println("You are a child, keep studying and grow big and strong.");
        }else if(age > 12 && age <20){
            System.out.println("You are a teenager. Be careful in these years.");
        }else{
            System.out.println("You are an adult.");
        }
        
        /*
        You cannot use these decision making operators when working with strings because
        strings are not a datatype but a combination of chars. You must use the .methods.
        
        Relational Operations:
        <,<=,>,>=,++,!=
        
        Logical Operations:
        &&,|| "and" and "or"
        
        Boolean results of true or false.
        */
    }
    
}
