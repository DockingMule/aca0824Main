package alloway.austin.main;

/**
 * Created by Austin on 1/4/2017.
 */
        import java.util.Scanner;


        import java.util.Arrays;
        import java.util.Scanner;
        import java.util.List;

public class onHold {

    public static String replace(String a, String b ){
        String error = "Error: Incorrect characters";
        String [] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","\n"," ","%","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String replaced = "";
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < characters.length; i++){
            if(a.contains(characters[i])){
                countA++;}
        }
        if (countA != a.length())
            return error;
        else if (!(a.contains("%")))
            return "Error: no %";
        else{
            if(a.contains("%"))
                replaced = a.substring(0, a.indexOf("%")) + b + a.substring(a.indexOf("%")+1);
            return replaced;}
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String initial = scan.nextLine();
        System.out.println("Enter the replacement string: ");
        String replacement = scan.nextLine();
        System.out.println(replace(initial, replacement));


    }
}