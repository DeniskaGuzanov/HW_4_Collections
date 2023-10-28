
//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
//        каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник


import java.time.LocalDateTime;
import java.time.Month;

public class MainNote {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();
        Employee emp1 = new Employee("1111", "Petro", LocalDateTime.of(2015, Month.APRIL, 4, 8, 22));
        Employee emp2 = new Employee("2222", "Nina", LocalDateTime.of(2020, Month.MARCH, 3, 10, 30));
        Employee emp3 = new Employee("3333", "Masha", LocalDateTime.of(2021, Month.JULY, 7, 11, 28));
        Employee emp4 = new Employee("4444", "Denis", LocalDateTime.of(2022, Month.SEPTEMBER, 9, 13, 10));
        Employee emp5 = new Employee("5555", "Nana", LocalDateTime.of(2022, Month.JANUARY, 14, 14, 56));
        Employee emp6 = new Employee("6666", "Natasha", LocalDateTime.of(2019, Month.APRIL, 4, 2, 21));
        Employee emp7 = new Employee("7777", "AfroJack", LocalDateTime.of(2021, Month.JULY, 7, 4, 29));

        directory.add(emp1);
        directory.add(emp2);
        directory.add(emp3);
        directory.add(emp4);
        directory.add(emp5);
        directory.add(emp6);
        directory.add(emp7);

        System.out.println("Соотрудник имеющий стаж работы в компании 2 года : " + directory.getEmployees(1));
        System.out.println("Номер телефона соотрудника с именем : " + directory.getPhone("Nina"));
        System.out.println("Соотрудник имеющий табельный номер : " + directory.getEmployee(5));
        System.out.println("Количество соотрулников : " + directory.size());
        System.out.println(directory.isEmpty());

    }
}