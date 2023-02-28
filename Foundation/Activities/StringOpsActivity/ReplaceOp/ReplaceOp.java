package Foundation.Activities.StringOpsActivity.ReplaceOp;

import java.util.Scanner;

public class ReplaceOp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the content of the document");
		String str = reader.nextLine();
		System.out.println("Enter the old name of the company");
		String str1 = reader.nextLine();
		System.out.println("Enter the new name of the company");
		String str2 = reader.nextLine();
		String modifiedStr = str.replace(str1, str2);
		System.out.println("The content of the modified document is");
		System.out.println(modifiedStr);
    }
}
