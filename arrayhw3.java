package myselfcode;
import java.util.Scanner;
public class arrayhw3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int age[]=new int[10];
        //input in array
        for(int i=0;i<age.length;i++)
        {
            System.out.println("Enter "+(i+1)+"  Element:");
            age[i]=sc.nextInt();
        }

        System.out.println("Here your input values: ");
        for(int i=0;i<age.length;i++)

        {
            System.out.println(age[i]);
        }

    }

}