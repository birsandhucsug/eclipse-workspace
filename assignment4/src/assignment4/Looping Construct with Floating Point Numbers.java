package assignment4;

/* while this is extremely clusmy code,
it fulfils the assignment parameters
the code you sent me has been quite extensively studied,
i drafted a version of this exercise using both arrays and arraylists
i did not fully grasp collections for arraylists
and only managed to use ints instead of floats for arrays
therefore this version, albeit not very neat, is the only one that meets all parameters
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float loop=0;
        float big=-2147483648;
        //smallest possible int
        float small=2147483647;
        //biggest possible int, because when i initialized it as 0 the output would always be 0 when testing used values of 1 and above
        float num0=0;
        float num1=0;
        float num2=0;
        float num3=0;
        float num4=0;
        float sum=0;
        float average=0;
        float interest=0;
        Scanner input = new Scanner(System.in);

        while (loop<=4) {

            System.out.println ("Type a number");
            float num = input.nextFloat(); 

            if (num>big) {big=num;}

            if (num<small) {small=num;}
            if (loop==0) {num0=num;}
            if (loop==1) {num1=num;}
            if (loop==2) {num2=num;}
            if (loop==3) {num3=num;}
            if (loop==4) {num4=num;}
            if (loop==5) {break};
            loop++;
        }
        sum=num0+num1+num2+num3+num4;
        average=sum/5;
        interest=sum/5;

        System.out.println ("The sum of all numbers is " + sum + ".");
        System.out.println ("The biggest number is " + big + ".");
        System.out.println ("The smallest number is " + small + ".");
        System.out.println ("The average of all numbers is " + average + ".");
        System.out.println ("20% interest of the total sum is " +interest + ".");

    }

}