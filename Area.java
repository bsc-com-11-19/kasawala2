import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        System.out.println("The area will be displayed here");
        Scanner input=new Scanner(System.in);

        //accepting length and breadth from the user
        System.out.println("Enter the length of the rectangle");
        double length=input.nextDouble();
        System.out.println("Enter the length of the breadth");
        double breadth=input.nextDouble();

        //displaying the area
        System.out.println("The area is "+ReturnArea(length,breadth));
       
    }
    //method to calculate area
    public static double ReturnArea(double l,double b){
        double area=l*b;
        return area; 
     }
}