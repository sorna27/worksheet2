/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class customer {
    public static void main(String[] args){
        cust c1=new cust(101,"aaa",20);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(30);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        invoice in=new invoice(100,c1,2000);
        cust c2=new cust(102,"bbb",10);
        System.out.println(in.getdata());
        System.out.println(in.getcustomer());
        System.out.println(in.getamount());
        in.setamount(30);
        in.setcustomer(c2);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdiscount());
    }
}
    class cust
    {
        int id;
        String name;
        int discount;
        cust(int i,String n,int d)
        {
            id=i;
            name=n;
            discount=d;
        }
        int getid()
        {
            return id;
        }
        String getname()
        {
            return name;
        }
        int getdiscount()
        {
            return discount;
        }
        void setdiscount(int d1)
        {
           discount=d1;
        }
        public String toString()
        {
            return "ID"+id+"\nName"+name+"\ndiscount"+discount;
       
        }
    }
        class invoice
        {
            int id;
            cust o;
            double amount;
            invoice(int i,cust o1,double a)
            {
                id=i;
                amount=a;
                o=o1;
            }
            cust getcustomer()
            {
                return o;
               
            }
            void setcustomer(cust o2)
            {
                o=o2;
               
            }
            int getdata()
            {
                return id;
       
            }
            double getamount()
            {
                return amount;
            }
            void setamount(double d)
            {
                amount=d;
            }
            String getcustomername()
            {
                return o.name;
               
            }
            double getamountafterdiscount()
            {
                return amount-(amount)*o.discount/100;
               
            }
        }

