package $12_JPAmethod_query;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

        System.out.println("Tìm user với Agi trong khoảng (9 - 14)");
        System.out.println("findAllByAgiBetween: ");
        userRepository.findAllByAgiBetween(9, 14)
                .forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Tìm user với Agi trong lớn hơn hoặc bằng 99");
        System.out.println("findAllByAgiGreaterThan: ");
        userRepository.findAllByDefGreaterThanEqual(99)
                .forEach(System.out::println);

        // Tìm kiếm tất cả theo Atk = 29
        System.out.println("===========================================");
        System.out.println("Tìm user với Atk = 29");
        System.out.println("findAllByAtk: ");
        userRepository.findAllByAtk(29)
                .forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Tìm User với hp = 10");
        System.out.println("SELECT u FROM User u WHERE u.hp = :hp");
        User user = userRepository.findUserByHpQuery(10);
        System.out.println("User: " + user);
    }

}