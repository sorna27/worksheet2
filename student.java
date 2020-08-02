
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class student {
    public static void main(String[] arg){
        int a,b;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        art o1=new art();
        o1.add(a,b);
        o1.sub(a,b);
        o1.mul(a,b);
        o1.div(a,b);
    }
}
class art
{
    
    void add(int a,int b)
    {
        System.out.println((a+b));
    }
    void sub(int a,int b)
    {
        System.out.println((a-b));
    }
    void mul(int a,int b)
    {
        System.out.println((a*b));
    }
    void div(int a,int b)
    {
        System.out.println((a/b));
    }
}