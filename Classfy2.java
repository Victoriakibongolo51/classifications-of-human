/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classfy2;

/**
 *
 * @author HP
 */
import java.util.*;
public class Classfy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        Male1 Mo= new Male1();
        Female2 Fo =new Female2();
        System.out.print("Choose between Female and Male\n"
        +"1:Male\n"
        +"2:Female");
        int num;
        num=sc.nextInt();
        switch(num)
        {
            case 1:
                Mo.display();
                break;
            case 2:
            Fo.display();
            break;
        }
    }
    
}
