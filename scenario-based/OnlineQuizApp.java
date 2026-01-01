import java.util.Scanner;

public class OnlineQuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which data type is used to store true/false values?",
            "2. Which of these is NOT a Java loop?",
            "3. What is the size of int in Java?",
            "4. Which keyword is used to create an object?",
            "5. Which OOP concept involves reusing existing code?"
        };

      
        String[][] options = {
            {"a) int", "b) boolean", "c) double", "d) char"},
            {"a) for", "b) repeat", "c) while", "d) do-while"},
            {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) 1 byte"},
            {"a) create", "b) new", "c) make", "d) build"},
            {"a) Polymorphism", "b) Inheritance", "c) Abstraction", "d) Encapsulation"}
        };

        
        char[] answers = {'b', 'b', 'b', 'b', 'b'};

        int score = 0;

        System.out.println("=== ONLINE QUIZ APPLICATION ===\n");

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            // Print options
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (a/b/c/d): ");
            char userAnswer = Character.toLowerCase(sc.next().charAt(0));

            // Switch to check answer
            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("✔ Correct!\n");
                        score++;
                    } else {
                        System.out.println("✘ Wrong! Correct answer: " + answers[i] + "\n");
                    }
                    break;

                default:
                    System.out.println("Invalid option! No marks awarded.\n");
            }
        }

        System.out.println("=== QUIZ FINISHED ===");
        System.out.println("Your Score: " + score + " / 5");

        sc.close();
    }
}
