import java.net.PortUnreachableException;
import java.util.Scanner;
public class scannerHomework {
    public static void main(String[] args){
        int laptopPrice=100 , phonePrice=80,computerPrice=120 ;
        System.out.println("Welcome.This site is for the manager of the shop.");
        int managerPassword=13851385;
        Scanner managerPasswordInput = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        if (managerPasswordInput.nextDouble() == managerPassword){
            System.out.println("Welcome boss.");}

        else {System.out.println("Your password is not correct :(");}

        
        
        
        System.out.print("What do you want to do ?(please enter the number), 1)see prices 2)see your password : ");
        if(managerPasswordInput.nextInt()==1){System.out.println("Laptop: "+laptopPrice);
        System.out.println("Phone: "+phonePrice);
        System.out.println("Computer: "+computerPrice);}
        if(managerPasswordInput.nextInt()==2){System.out.println(managerPassword);}
        else{System.out.println("Number is not true :(");}
        managerPasswordInput.close();

        
    }
    
}
