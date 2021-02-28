import java.util.Scanner;

public class lesson5 {

    class Employee {

        String Name;
        String Profession;
        String email;
        long Telephone;
        long Salary;
        int Age;

        void GetData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();

            System.out.print("\n\tEnter Employee Profession : ");
            Profession = sc.nextLine();

            System.out.print("\n\tEnter Employee email : ");
            email = sc.nextLine();

            System.out.print("\n\tEnter Employee Telephone : ");
            Telephone = Long.parseLong(sc.nextLine());

            System.out.print("\n\tEnter Employee Salary : ");
            Salary = Long.parseLong(sc.nextLine());

            System.out.print("\n\tEnter Employee Age : ");
            Age = Integer.parseInt(sc.nextLine());
        }

        void PutData()
        {
            System.out.print("\n\tEmployee Name : " + Name);
            System.out.print("\n\tEmployee Profession : " + Profession);
            System.out.print("\n\tEmployee email : " + email);
            System.out.print("\n\tEmployee Telephone : " + Telephone);
            System.out.print("\n\tEmployee Salary : " + Salary);
            System.out.print("\n\tEmployee Age : " + Age);
        }
    }

    public Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age)
    {}
}

public class Employee {
    public static
    void main(String args[]) {


        Employee[] E = new Employee[5];

        E[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        E[1] = new Employee("Petrov Petr", "Engineer", "banderaspapandreas@mail.ru", "9107884715", 120000, 50);
        E[2] = new Employee("Fedorov Fedor", "Engineer", "ChuckFu@yandex.ru", "9048886661", 120000, 78);
        E[3] = new Employee("Vasin Vasya", "Singer", "vvasin@gmail.com", "9056667772", 1000000, 50);
        E[4] = new Employee("Sentyurin Kirill", "Trainee", "ksentyurin@vimpelcom.ru", "9107987777", 1000000, 30);

        for(Employee item : E) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}

