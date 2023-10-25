import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("First Name: ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Middle Name: ");
        student.setMiddleName(scanner.nextLine());

        System.out.print("Last Name: ");
        student.setLastName(scanner.nextLine());

        System.out.print("Suffix: ");
        student.setSuffix(scanner.nextLine());

        System.out.println("\nPerson Details:");
         System.out.println("First Name: " + student.getFirstName());
          System.out.println("Middle Name: " + student.getMiddleName());
           System.out.println("Last Name: " + student.getLastName());
             System.out.println("Suffix: " + student.getSuffix());
                 System.out.println("Full Name: " + student.getFullName());
}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
     public String getFullName() {
    if (suffix != null && !suffix.isEmpty()) {
        return firstName + " " + middleName + " " + lastName + " " + suffix;
    } else {
        return firstName + " " + middleName + " " + lastName;
     }
    
   }
    
}