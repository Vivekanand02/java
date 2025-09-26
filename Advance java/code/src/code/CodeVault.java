package code;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Snippet {
    private String title;
    private String code;

    public Snippet(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class CodeVault {
    private static List<Snippet> snippets = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static User loggedInUser  = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register\n2. Login\n3. Add Snippet\n4. View Snippets\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    addSnippet(scanner);
                    break;
                case 4:
                    viewSnippets();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users.add(new User(username, password));
        System.out.println("User  registered successfully!");
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User  user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser  = user;
                System.out.println("Login successful!");
                return;
            }
        }
        System.out.println("Invalid credentials. Please try again.");
    }

    private static void addSnippet(Scanner scanner) {
        if (loggedInUser  == null) {
            System.out.println("You must be logged in to add a snippet.");
            return;
        }
        System.out.print("Enter snippet title: ");
        String title = scanner.nextLine();
        System.out.print("Enter snippet code: ");
        String code = scanner.nextLine();
        snippets.add(new Snippet(title, code));
        System.out.println("Snippet added successfully!");
    }

    private static void viewSnippets() {
        if (snippets.isEmpty()) {
            System.out.println("No snippets available.");
            return;
        }
        for (Snippet snippet : snippets) {
            System.out.println("Title: " + snippet.getTitle());
            System.out.println("Code: " + snippet.getCode());
            System.out.println("-------------------------");
        }
    }
}