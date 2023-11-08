package p5;

public class Main {
    public static void main(String[] args) {
    try {
        int res = SumsNums.getSumsNums(0,1);

    }catch (SumsException exception){
        System.out.println(exception.getMessage()); // The number < 1
        System.out.println(exception.getA());       // 0
        System.out.println(exception.getB());       // 1
        exception.printStackTrace();                // ошибка
    }
    }
}
