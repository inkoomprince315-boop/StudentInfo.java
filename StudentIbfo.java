import java.util.Scanner;
public class StudentInfo{
    public static void main(String[] args) {
        Scanner input=new
        Scanner(System.in);

        //input
        System.out.print("Enter Full Name:");
        String FullName=input.nextLine();

        System.out.print("Enter Index Number:");
        String indexNumber=input.nextLine();

        System.out.print("Enter Age:");
        int age=input.nextLine();

        System.out.print("Enter Gender(M/F:)");
        char gender=input.next().charAt(0);
        input.nextLine();//clear buffer

        System.out.print("Enter department:");
        String Department=input.nextLine();

        System.out.print("Enter Level:");
        int level=input.nextLine();

        System.out.print("Enter GPA:");
        double gpa=input.nextDouble();

        //GPA Classification
        String AcademicClass;

        if(gpa>=3.5&&gpa<==4.0){
            AcademicClass="First Class";}else if(gpa>=3.0) {
                AcademicClass="Second Class Upper;"
            }else if(gpa>=2.5) {
                AcademicClass="Second Class Lower";
            }else{
                AcademicClass="Pass";
            }
            //Output
            System.out.println("\n====STUDENT PROFILE====");
            System.out.println("Name:"+ fullName);
            System.out.println("Index"+indexNumber);
            System.out.println("Age:"+age);
            System.out.println("Gender: + gender");
            System.out.println("Department:"+ department);
            System.out.println("Level:"+ leve;);
            System.out.println("GPA:"+gpa);
            System.out.println("Adult Status:"+ adultStatus);
            System.out.println("Academic Class"+ academicClass);
            System.out.println("=====================");
            }
            }
        }

    }
} 