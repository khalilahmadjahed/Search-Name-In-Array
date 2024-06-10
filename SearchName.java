import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many names do you want to enter: ");
        int noName = input.nextInt();

        String[] names =new String[noName];
        System.out.println("Enter the names: ");
        for(int i = 0; i < noName; i++){
            System.out.print((i + 1) + " - ");
            names[i] = input.next();
            System.out.println("");
        }

        //foreach loop for printing the elements
        // int counter = 1;
        // for(String name : names){
        //     System.out.println(counter + " - " + name);
        //     counter++;
        // }

        System.out.print("Enter a name for search it: ");
        String searchedName = input.next();

        search(names, searchedName);
    }

    public static void search(String[]names, String key){
        boolean flag = false;

        for(String name : names){
            if (name.equalsIgnoreCase(key)) {
                System.out.println("FOUNDED!");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("NOT FOUNDED!");
        }
    }
}
