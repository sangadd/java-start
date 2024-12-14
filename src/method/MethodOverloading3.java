package method;

public class MethodOverloading3 {
    public static void main(String[] args) {
        System.out.println("1 :" + add(1, 2));
        System.out.println("2 :" + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
    
    // 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고 그래도 없으면 형변환이 가능한 타입의 메서드를 찾아서 실행함
}