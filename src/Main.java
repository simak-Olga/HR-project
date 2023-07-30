import java.util.Scanner;
class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private boolean hire;

    public Employee(String surname, String name, String patronymic, String dateOfBirth, String address, boolean hire) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.hire = hire;
    }

    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public boolean isHire() {
        return hire;
    }
}

class Frame {
    private Employee employee;

    public Frame(Employee employee) {
        this.employee = employee;
    }

    public void fillCard() {
        System.out.println("Карточка - приём на работу:");
        System.out.println("Фамилия: " + employee.getFullName());
        System.out.println("Дата рождения: " + employee.getDateOfBirth());
        System.out.println("Адрес проживания: " + employee.getAddress());
    }

    public void saveCard() {
        System.out.println("Карточка сохранена.");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные о сотруднике (фамилия, имя, отчество, дата рождения, адрес проживания):");
        String surname = scanner.nextLine();
        String name = scanner.nextLine();
        String patronymic = scanner.nextLine();
        String dateOfBirth = scanner.nextLine();
        String address = scanner.nextLine();

        System.out.println("Предоставьте справку с предыдущего места работы (да/нет):");
        String hasCertificate = scanner.nextLine();

        boolean hire = false;

        if (hasCertificate.equals("да")) {
            System.out.println("Сотрудник принят на работу.");
            hire = true;
        } else if (hasCertificate.equals("нет")) {
            System.out.println("Сотрудник не принят на работу.");
        } else {
            System.out.println("Введен некорректный ответ.");
        }

        if (hire) {
            Employee employee = new Employee(surname, name, patronymic, dateOfBirth, address, hire);
            Frame frame = new Frame(employee);
            frame.fillCard();
            frame.saveCard();
        }

        scanner.close();
    }
}

