package Java.javaquiz2;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class MarkTester {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 75);
        B studentB = new B(85, 88, 92, 78);

        System.out.println("Percentage for student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage for student B: " + studentB.getPercentage() + "%");
    }
}