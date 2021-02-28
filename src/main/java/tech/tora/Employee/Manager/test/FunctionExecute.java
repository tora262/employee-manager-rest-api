package tech.tora.Employee.Manager.test;

@FunctionalInterface
public interface FunctionExecute {
    public int execute(int a, int b);
}

class MathUtil {
    public static int sum(int i, int j){
        return i+j;
    }

    public static int minus(int i, int j) {
        return i - j;
    }
}

class MainClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        int sum = doAction(a, b, MathUtil::sum);

        int minus = doAction(a, b, MathUtil::minus);

        System.out.println(sum);

    }

    public static int doAction(int a, int b, FunctionExecute func) {
        return func.execute(a, b);
    }
}
