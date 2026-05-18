import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Rectangle
{
    private int width;
    private int length;

    public Rectangle(int w, int l){
        width = w;
        length = l;
    }

    public int perimeter(){
        return 2*(width+length);
    }

    public int area(){
        return width*length;
    }
    // TO DO: Create attributes for your Rectangle class

    
    // TO DO: Create constructor(s) for your Rectangle class


    // TO DO: Create methods that compute the perimeter and area of your Rectangle


    public static void main(String[] args) throws IOException
    {
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);

        String name = scan.nextLine();
        int grade = Integer.parseInt(scan.nextLine());

        System.out.printf("Hello %s! You are in %dth grade!%n", name, grade);
        double gpa = Double.parseDouble(scan.nextLine());
        String hs = scan.nextLine();

        System.out.println("your GPA is "+  gpa +" and You are in " + hs);

        // TO DO: Add code that reads in a third and fourth line, which are the GPA and school name.
        // Add these fields to your input.txt
        // Print a message that displays these values


        // TO DO: Create Rectangle objects and compute their perimeter and areas
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Perimeter "+  rect.perimeter() +" Area " + rect.area());




        scan.close();
    }
}