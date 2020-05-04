import java.util.Scanner;
public class Homwork0427 {

	public static void main(String[] args) {
		
		int grades[] = new int[4];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        for(i=0; i<6; i++) { 
            System.out.print("Enter Grades of Subject"+(i+1)+":");
            grades[i] = scanner.nextInt();
            total = total + grades[i];
         }
         scanner.close();
         
         avg = total/4;
         System.out.print("The student Grade is: ");
        
        
        
	System.out.print("The student Grade is: ");{
    if(avg>=90)
    {
        System.out.print("A");
    }
    else if(avg>=80 && avg<90)
    {
       System.out.print("B");
    } 
    else if(avg>=70 && avg<80)
    {
        System.out.print("C");
    }
    else
    {
        System.out.print("D");
    }
}
}

}
