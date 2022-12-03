package task2;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    private int id;
    private static int count = 0;
    @Getter @Setter
    private Gender gender;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;

    public Client(String name, int age, Gender gender) {
        id = ++count;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
