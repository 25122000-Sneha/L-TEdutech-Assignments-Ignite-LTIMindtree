package Foundation.Activities.StringOpsActivity.LastIndex;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the string");
        String  str = reader.nextLine();
        System.out.println("Enter the string to be searched");
        String  searchStr = reader.nextLine();
        System.out.println("The index of last occurence of " + "\"" +searchStr + "\""  +" is "+str.lastIndexOf(searchStr));
        System.out.println("Enter the index limit");
        int indexLimit = reader.nextInt();
        System.out.println("First occurence of " + "\"" +searchStr + "\""  +" from "+indexLimit+"th index backwards is "+str.lastIndexOf(searchStr, indexLimit));
    }
}
