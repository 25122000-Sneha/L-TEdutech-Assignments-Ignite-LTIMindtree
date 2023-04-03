package Phase2.Week_6.Exceptions.Explore.Q6;
public class Main {
    public static void main(String[] args) {
        try{
            System.out.print("Try" + "" + 1/0);
            }
        catch(Exception e){
            System.out.print("Catch");
            }
    }
}
