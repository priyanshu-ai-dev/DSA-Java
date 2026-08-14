import java.util.Scanner;
class QuadrantChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X coordinate:");
        int x = sc.nextInt();
        System.out.println("Enter y coordinate:");
        int y = sc.nextInt();
        // if(x==0 && y==0){
        //  System.out.println("At origin");
        // }
        // else if(x==0 && y!=0){
        //     System.out.println("At Y axis");
        // }
        // else if(y==0 && x!=0){
        //     System.out.println("At X axis");
        // }
        // else if(x<0 && y<0){
        //     System.out.println("In 3rd Quadrant");
        // }
        // else if(x<0 && y>0){
        //     System.out.println("In 2nd Quadrant");
        // }
        // else if(x>0 && y<0){
        //     System.out.println("In 4th Quadrant");
        // }
        // else {
        //     System.out.println("In 1st Quadrant");
        // }
        if (x==0){
            if(y==0){
                System.out.println("At origin");
            }
            else {
                System.out.println("At Y Axis");
            }
        }
        else if(y==0){
            if(x==0){
                System.out.println("At origin");
            }
            else{
                System.out.println("At X Axis");
            }
        }
        else {
         if(x<0 && y<0){
            System.out.println("In 3rd Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("In 2nd Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("In 4th Quadrant");
        }
        else {
            System.out.println("In 1st Quadrant");
        }
        }
    }
}