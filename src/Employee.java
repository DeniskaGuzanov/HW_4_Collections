import java.time.LocalDateTime;

public class Employee {

    private int id;
    private String phone;
    private String name;
    private  LocalDateTime localDateTime;
    private static int idEmployee = 0;

    public Employee(String phone, String name, LocalDateTime localDateTime) {
        this.id = ++ idEmployee;
        this.phone = phone;
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public int getWorking() {
        int start = localDateTime.getYear();
        int now = localDateTime.now().getYear();
     return now - start;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
