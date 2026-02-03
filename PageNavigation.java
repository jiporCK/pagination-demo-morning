package new_features.pagination;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PageNavigation {

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1L, "James Smith", "jsmith88",
                LocalDate.of(1988, 5, 12),
                LocalDateTime.of(2023, 1, 10, 9, 0),
                LocalDateTime.of(2023, 6, 5, 14, 30)));

        userList.add(new User(2L, "Maria Garcia", "mgarcia92",
                LocalDate.of(1992, 8, 24),
                LocalDateTime.of(2023, 1, 12, 10, 30),
                LocalDateTime.of(2023, 7, 1, 9, 15)));

        userList.add(new User(3L, "Robert Chen", "rchen_dev",
                LocalDate.of(1985, 1, 30),
                LocalDateTime.of(2023, 2, 1, 14, 15),
                LocalDateTime.of(2023, 8, 20, 18, 45)));

        userList.add(new User(4L, "Sarah Miller", "smiller_01",
                LocalDate.of(1995, 11, 15),
                LocalDateTime.of(2023, 2, 5, 11, 45),
                LocalDateTime.of(2023, 9, 2, 10, 10)));

        userList.add(new User(5L, "Ahmed Hassan", "ahassan_pro",
                LocalDate.of(1990, 3, 22),
                LocalDateTime.of(2023, 2, 10, 16, 20),
                LocalDateTime.of(2023, 10, 11, 16, 55)));

        userList.add(new User(6L, "Elena Petrov", "elena_p",
                LocalDate.of(1987, 7, 4),
                LocalDateTime.of(2023, 3, 1, 8, 10),
                LocalDateTime.of(2023, 11, 7, 9, 40)));

        userList.add(new User(7L, "Kevin Nguyen", "knguyen_99",
                LocalDate.of(1999, 12, 1),
                LocalDateTime.of(2023, 3, 15, 13, 0),
                LocalDateTime.of(2023, 12, 1, 12, 0)));

        userList.add(new User(8L, "Chloe Dubois", "cdubois_fr",
                LocalDate.of(1993, 2, 14),
                LocalDateTime.of(2023, 3, 20, 17, 40),
                LocalDateTime.of(2024, 1, 3, 8, 25)));

        userList.add(new User(9L, "Liam O'Connor", "loconnor_82",
                LocalDate.of(1982, 10, 10),
                LocalDateTime.of(2023, 4, 2, 9, 50),
                LocalDateTime.of(2024, 1, 18, 14, 10)));

        userList.add(new User(10L, "Yuki Tanaka", "ytanaka_jp",
                LocalDate.of(1991, 6, 18),
                LocalDateTime.of(2023, 4, 10, 11, 25),
                LocalDateTime.of(2024, 2, 1, 10, 0)));

        userList.add(new User(11L, "Sofia Rossi", "srossi_it",
                LocalDate.of(1989, 9, 5),
                LocalDateTime.of(2023, 4, 25, 15, 10),
                LocalDateTime.of(2024, 2, 10, 9, 30)));

        userList.add(new User(12L, "Marcus Brown", "mbrown_ctx",
                LocalDate.of(1984, 4, 20),
                LocalDateTime.of(2023, 5, 5, 12, 0),
                LocalDateTime.of(2024, 2, 18, 16, 45)));

        userList.add(new User(13L, "Isabella Silva", "isilva_br",
                LocalDate.of(1996, 5, 30),
                LocalDateTime.of(2023, 5, 18, 10, 0),
                LocalDateTime.of(2024, 3, 1, 11, 10)));

        userList.add(new User(14L, "David Kim", "dkim_94",
                LocalDate.of(1994, 8, 12),
                LocalDateTime.of(2023, 6, 1, 14, 30),
                LocalDateTime.of(2024, 3, 10, 9, 0)));

        userList.add(new User(15L, "Fatima Al-Sayed", "fatima_as",
                LocalDate.of(1988, 12, 25),
                LocalDateTime.of(2023, 6, 15, 16, 15),
                LocalDateTime.of(2024, 3, 20, 15, 40)));

        userList.add(new User(16L, "Oliver Schmidt", "oschmidt_de",
                LocalDate.of(1983, 3, 8),
                LocalDateTime.of(2023, 7, 2, 9, 20),
                LocalDateTime.of(2024, 4, 1, 10, 30)));

        userList.add(new User(17L, "Amara Okafor", "aokafor_ng",
                LocalDate.of(1997, 11, 2),
                LocalDateTime.of(2023, 7, 20, 11, 45),
                LocalDateTime.of(2024, 4, 10, 14, 20)));

        userList.add(new User(18L, "Hiroshi Sato", "hsato_90",
                LocalDate.of(1990, 1, 15),
                LocalDateTime.of(2023, 8, 5, 13, 10),
                LocalDateTime.of(2024, 4, 18, 9, 15)));

        userList.add(new User(19L, "Emily Watson", "ewatson_uk",
                LocalDate.of(1992, 6, 25),
                LocalDateTime.of(2023, 8, 22, 15, 50),
                LocalDateTime.of(2024, 4, 25, 16, 0)));

        userList.add(new User(20L, "Carlos Mendez", "cmendez_mx",
                LocalDate.of(1986, 9, 12),
                LocalDateTime.of(2023, 9, 10, 10, 0),
                LocalDateTime.of(2024, 5, 1, 11, 30)));

        userList.add(new User(21L, "Rachel Green", "rgreen_94",
                LocalDate.of(1994, 10, 10),
                LocalDateTime.of(2023, 9, 28, 14, 20),
                LocalDateTime.of(2024, 5, 10, 13, 45)));

        userList.add(new User(22L, "Monica Geller", "chef_monica",
                LocalDate.of(1989, 4, 15),
                LocalDateTime.of(2023, 10, 5, 11, 30),
                LocalDateTime.of(2024, 5, 20, 10, 0)));

        userList.add(new User(23L, "Chandler Bing", "chan_the_man",
                LocalDate.of(1987, 2, 28),
                LocalDateTime.of(2023, 10, 12, 16, 40),
                LocalDateTime.of(2024, 5, 28, 17, 10)));

        userList.add(new User(24L, "Joey Tribbiani", "joey_actor",
                LocalDate.of(1991, 1, 9),
                LocalDateTime.of(2023, 11, 1, 9, 15),
                LocalDateTime.of(2024, 6, 5, 12, 30)));

        userList.add(new User(25L, "Phoebe Buffay", "phoebe_songs",
                LocalDate.of(1988, 7, 16),
                LocalDateTime.of(2023, 11, 15, 13, 50),
                LocalDateTime.of(2024, 6, 12, 15, 0)));

        userList.add(new User(26L, "Ross Geller", "dino_ross",
                LocalDate.of(1985, 10, 18),
                LocalDateTime.of(2023, 12, 1, 15, 0),
                LocalDateTime.of(2024, 6, 20, 11, 45)));

        userList.add(new User(27L, "Peter Parker", "spidey_qns",
                LocalDate.of(2001, 8, 10),
                LocalDateTime.of(2023, 12, 10, 10, 20),
                LocalDateTime.of(2024, 7, 1, 9, 0)));

        userList.add(new User(28L, "Clark Kent", "super_man_met",
                LocalDate.of(1980, 6, 18),
                LocalDateTime.of(2024, 1, 5, 14, 0),
                LocalDateTime.of(2024, 7, 10, 16, 30)));

        userList.add(new User(29L, "Bruce Wayne", "bat_gotham",
                LocalDate.of(1982, 2, 19),
                LocalDateTime.of(2024, 1, 20, 17, 30),
                LocalDateTime.of(2024, 7, 18, 22, 0)));

        userList.add(new User(30L, "Diana Prince", "wonder_w",
                LocalDate.of(1988, 1, 1),
                LocalDateTime.of(2024, 1, 30, 11, 10),
                LocalDateTime.of(2024, 7, 25, 10, 15)));
    }

    static int pageNumber = 1;
    static int pageSize = 8;
    static int totalPages = (userList.size() + pageSize - 1) / pageSize;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1. Show data
                    2. Set up page size
                    3. Next page
                    4. Previous page
                    5. Go to page
                    0. Exit""");
            System.out.print("Enter an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 0) System.exit(0);

            switch (option) {
                case 1 -> {
                    List<User> pagedUser = userList.stream()
                            .skip((pageNumber - 1) * pageSize)
                            .limit(pageSize)
                            .toList();
                    showUserList(pagedUser);
                    System.out.println("Page " + pageNumber + " of " + totalPages);
                }
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
                default -> System.out.println("Invalid option!");
            }

        }

    }

    public static void showUserList(List<User> users) {
        Table table = new Table(
                6, BorderStyle.CLASSIC );

        table.addCell(" ID ");
        table.addCell(" Full Name ");
        table.addCell(" Username ");
        table.addCell(" Date of Birth ");
        table.addCell(" Created At ");
        table.addCell(" Updated At ");

        users.forEach(user -> {
            table.addCell(user.getId().toString());
            table.addCell(user.getFullName());
            table.addCell(user.getUsername());
            table.addCell(user.getDateOfBirth().toString());
            table.addCell(user.getCreatedAt().toString());
            table.addCell(user.getUpdatedAt().toString());
        });

        System.out.println(table.render());
    }

}
