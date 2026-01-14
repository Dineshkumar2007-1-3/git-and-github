import java.util.*;
import java.util.Arrays;

public class prj1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int avgg=0;
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        for(int i=0 ;i<n;i++){
             System.out.println("enter the marks of students:");
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        for(int arr1:arr){
            
            avgg+=arr1;
        }
        double average = (double)avgg/n;
        System.out.println("\n----- Student Grade Summary -----");
        System.out.println("Total Students : " + n);
        System.out.println("Average Score  : " + average);
        System.out.println("Highest Score  : " + arr.get(n-1));
        System.out.println("Lowest Score   : " + arr.get(0));
        System.out.println("---------------------------------");
        sc.close();

    }
}