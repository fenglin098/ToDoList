import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String category;
        String priorityLevel;
        String isDone;
        String answer;
        Scanner sc = new Scanner (System.in);

        do{
            ArrayList<String> task = new ArrayList<>();
            System.out.println("Enter the item you have to do: ");
            name = sc.next().toLowerCase();
            task.add(name);
            System.out.println("Enter the category of this item: ");
            category = sc.next();
            task.add(category);
            System.out.println("Your assigned priority is: ");
            priorityLevel = sc.next();
            task.add(priorityLevel);
            System.out.println("Is this item completed? (true or false)");
            isDone = sc.next().toLowerCase();
            task.add(isDone);
            System.out.println("Do you have another item? Enter q or quit or exit.");
            answer = sc.next().toLowerCase();
        }while (answer.equals("yes"));
        System.out.println("Item Name\tCategory\tPriority\tDone?");

    }
    public static void print(String name, String category, String priorityLevel, String isDone){
        System.out.println(name+"\t"+category+"\t"+priorityLevel+"\t"+isDone);
        }
    }


