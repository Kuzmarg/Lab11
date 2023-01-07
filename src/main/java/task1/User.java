package task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@Builder
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<String> interests;

    public static void main(String[] args) {
        User user = User.builder().
                name("Volodymyr").
                age(18).
                gender(Gender.MALE).
                height(193).
                weight(76).
                interest("Volleyball").build();
        System.out.println(user.toString());
    }
}