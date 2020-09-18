import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        String[] Student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < Student.length; i++) {
            if (Student[i].equals(name)) {
                isExist = true;
                System.out.println("Index of " + name + " is " + (i + 1));
                break;
            }
        }
        if (!isExist) {
            System.out.println("no match");
        }
    }
}
