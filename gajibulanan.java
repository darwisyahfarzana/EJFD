
 import java.util.Scanner;
 public class gajibulanan 
 {
   public static void main (String args[])
   {        
Scanner input=new Scanner(System.in);


System.out.println ("Masukkan nama anda:" );
String nama=input.next();

System.out.println ("Masukkan bilangan jam sehari:" );
int jam=input.nextInt();


if (jam>9){
{System .out.println( " bilangan jam sehari tidak boleh melebihi 9 jam ,sila masukkan bilangan jam yang betul ");}



}
else
  
{
        System.out.println ("Masukkan bilangan hari :" );
        int hari=input.nextInt();

      if (hari>30)
      {System.out.println ("Bilanan hari bekerja tidak boleh melebihi 30 hari sila masukkan bilangan hari yang betul :" );
      }
      else
      {
      System.out.println ("Masukkan bilangan jam ot :" );
     int jamot=input.nextInt();
      
      if(jamot>50)
     {System.out.println ("Bilanan jam kerja lebih masa tidak boleh melebihi 50 jam,sila masukkan bilangan jam yang betul " );
      }
      else{
          int gaji=(jam*hari*20)+(jamot*15);
          System.out.println ("Rumusan gaji bulanan  :"+nama );
       System.out.println ("jumlah jam bekerja  :" +jam);
      System.out.println ("jumlah hari bekerja:"+hari );
      System.out.println ("Jumlah jam ot :"+jamot );
      System.out.println ("JUMLAH GAJI :RM"+gaji );}


           
   
      
  
  

