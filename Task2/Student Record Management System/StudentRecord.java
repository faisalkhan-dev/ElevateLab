import java.util.*;

class Student
{
    int ID;
    String name;
    double marks;

    Student(int ID , String name, double marks)
    {
        this.ID = ID;
        this.name = name;
        this.marks= marks;
    }
    public int getId()
    {
        return ID;
    }
    public String getName()
    {
    return name;
    }
    public double getMarks()
    {
        return marks;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setMarks(double marks)
    {
        this.marks = marks;
    }
    void display()
    {
        System.out.println("Student ID : "+ ID);
        System.out.println("Student name: " + name);
        System.out.println("Student marks:" + marks);
    }
}

public class StudentRecord
{
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Student> list = new ArrayList<>();
    
    private static void addStudent()
    {
       System.out.println("Enter the ID of the student:");
       int id = sc.nextInt();
       sc.nextLine();
       for (Student s : list) 
       {
        if (s.getId() == id)
        {
           System.out.println("Student with this ID already exists.");
           return;
        }
       }

       System.out.println("Enter the name of the student:");
       String name = sc.nextLine();

       System.out.println("Enter marks of the student:");
       double marks = sc.nextDouble();

       list.add(new Student(id, name, marks));
       System.out.println("Student added");
    }

    private static void viewStudent()
    {
        if(list.isEmpty())
        {
            System.out.println("No student data.");
            return;
        }
        for(Student s:list)
        {
            s.display();
            System.out.println();
        }
    }

    private static void updateStudent()
    {
        System.out.println("Enter the student ID:");
        int id = sc.nextInt();

        for(Student s : list)
        {
            if(s.getId() == id)
            {
                sc.nextLine();
                System.out.println("Enter the name of the student:");
                s.setName(sc.nextLine());

                System.out.println("Enter the marks of the student:");
                s.setMarks(sc.nextDouble());

                System.out.println("Student data is updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent()
    {
        System.out.println("Enter the ID of the student:");
        int id = sc.nextInt();

         Iterator<Student> iterator = list.iterator();
         while (iterator.hasNext()) 
         {
            Student s = iterator.next();
            if (s.getId() == id) 
            {
            iterator.remove();
            System.out.println("Student deleted.");
            return;
           }
         }
       System.out.println("Student not found.");
    }
    public static void main(String args[])
    {
      while(true)
      {
        System.out.println("Student_record_management_system");
        System.out.println("**************************");
        System.out.println("1.Add Student");
        System.out.println("2.View Student");
        System.out.println("3.Update Student");
        System.out.println("4.Delete Student");
        System.out.println("5. Exit");

        System.out.println("Choose your option:");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                addStudent();
                break;
            case 2:
                viewStudent();
                break;
            case 3:
                updateStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                System.out.println("Exiting..");
                return;
            default:
                System.out.println("Invalid choice");
        }
      }
    }
}