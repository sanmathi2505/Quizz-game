import java.util.Scanner;
public class quizapp {
    public static void main(String args[]) {
        question_answers questions = new question_answers();
        Scanner input = new Scanner(System.in);
        char ans;
        int correct = 0, wrong = 0;

        questions.question1();
        ans =Character.toUpperCase( input.next().charAt(0));
        if (ans == questions.answer1) {
            correct++;
        } else
            wrong++;

        questions.question2();
        ans =Character.toUpperCase( input.next().charAt(0));
        if (ans == questions.answer2) {
            correct++;
        } else
            wrong++;

        questions.question3();
        ans =Character.toUpperCase( input.next().charAt(0));
        if (ans == questions.answer3) {
            correct++;
        } else
            wrong++;

        questions.question4();
        ans =Character.toUpperCase( input.next().charAt(0));
        if (ans == questions.answer4) {
            correct++;
        } else
            wrong++;

        questions.question5();
        ans =Character.toUpperCase( input.next().charAt(0));
        if (ans == questions.answer5) {
            correct++;
        } else
            wrong++;

        // Double correct_double = (double) correct;
        // Double percentage = (correct_double / 5) * 100;

        System.out.println("total marks:50");
        System.out.println("your marks:" + correct * 10);
        System.out.println("total questions:5");
        System.out.println("your correct answer:" + correct + "\nyour wrong answer:" + wrong);
    }
}

class question_answers {
    void question1() {
        System.out.println("1. What is the default value of a boolean in Java?");
        System.out.println("A. true");
        System.out.println("B. false");
        System.out.println("C. Null");
        System.out.println("D. 0");
    }

    void question2() {
        System.out.println("2. Which of the following is NOT a valid Java keyword?");
        System.out.println("A. Class");
        System.out.println("B. Interface");
        System.out.println("C. Main");
        System.out.println("D. Static");
    }

    void question3() {
        System.out.println("3. Which method is used to compare two strings in Java for equality?");
        System.out.println("A. ==");
        System.out.println("B. .equals()");
        System.out.println("C. .compare()");
        System.out.println("D. .compareTo()");
    }

    void question4() {
        System.out.println("4. Which of the following is NOT a feature of Java?");
        System.out.println("A. Object-Oriented");
        System.out.println("B. Platform independent");
        System.out.println("C. Pointers");
        System.out.println("D. Robust");
    }

    void question5() {
        System.out.println("5. Which symbol is used to end a statement in Java?");
        System.out.println("A. .");
        System.out.println("B. ,");
        System.out.println("C. :");
        System.out.println("D. ;");
    }

    char answer1 = 'B';
    char answer2 = 'C';
    char answer3 = 'B';
    char answer4 = 'C';
    char answer5 = 'D';
}