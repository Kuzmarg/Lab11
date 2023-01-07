package task2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private static int cur_id = 0;
    private int id;
    private String name;
    private int age;
    private Sex sex;
    public Client(String name, int age, Sex sex) {
        id = cur_id++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
