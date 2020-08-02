/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class access {
   public static void main(String[] arg){
       volume1 obj=new volume1();
       obj.depth=10;
       obj.height=20;
       obj.width=30;
       double vol=obj.depth*obj.height*obj.width;
       System.out.println("volume:"+vol);
       
       
   }
    }
    
class volume1
{
    double height,width,depth;
}