
import static java.time.Clock.system;
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
public class program1 {
    public static void main(String[]a)
    {
        student1 obj[]= new student1[10];
        for(int i=0;i<2;i++)
        {
            obj[i]=new student1();
            obj[i].getdata();
            obj[i].markcal();
            obj[i].display();
        }
    }
}
        class student1
        {
            String name, dept, status;
            double m1,m2,m3,avg;
            void getdata()
            {
                Scanner obj= new Scanner(System.in);
                name= obj.next();
                dept=obj.next();
                m1=obj.nextDouble();
                m2=obj.nextDouble();
                m3=obj.nextDouble();
            }
            void markcal()
            {
                avg=(m1+m2+m3)/3;
            if(m1<50||m2<50||m3<50)
                {
                    status="FAIL";
                }
            else
                {
                        if(avg>=80)
                        {
                                status="FIRST CLASS";
                        }
                        if (avg>=70&&avg<=79)
                            status="Second class";
                        if (avg>=50&&avg<=69)
                            status="third class";
                }
            }
            void display()
            {
                System.out.println("Name:"+name+"\nm1:"+m1+"\nm2:"+m2+"\nm3:"+m3+"\navg:"+avg+"\n status:"+status);
            }
        }

                
                    
           
