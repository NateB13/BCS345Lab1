//Nathan Burnham 9/12/21 Lab1 BCS345

package nathanburnhambcs345lab1;

public class NathanBurnhamBCS345Lab1
{

    //Main Declaration 
    public static void main(String[] args)
    {
        
        System.out.print("Even numbers from 1 to 100:\n");
        //For loop with int i as counter up to 100.
        for (int i=0; i<=100; i++)
            //If statement tells program to divide the value of i by 2 to check for a remainder.
            if(i%2==0)
                //If no remainder is found, print out that number, and then progress onto a new line.
                System.out.print(i + "\n");
    }    
}