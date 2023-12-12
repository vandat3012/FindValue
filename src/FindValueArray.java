import java.util.Scanner;

public class FindValueArray {
    public static void main(String[] args) {
        String[] nameStudent = {"dat","huy","nhat"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i<nameStudent.length ; i++) {
            if (nameStudent[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(inputName + " is not exist");
        }
    }
}
