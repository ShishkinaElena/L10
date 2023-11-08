package p3;

public class Main {
    public static void main(String[] args) {
    try {
        int res = getSum( 0, 5);
    }catch (Exception exception){
        System.out.println(exception.getMessage()); //  обработка ошибки
    }

    int res2 = getSum2(1, 5);
        System.out.println(res2);
    }


    public static int getSum(int a, int b) throws  Exception{  // throws - это оператор. По его условию выбрасывается исключение
        if (a<1 ||  b<1) throw  new Exception("The number < 1");
        return a+b;
    }


    public static int getSum2(int a, int b) {
        int res = 0;
        try {
            if (a < 1 || b < 1) throw new Exception("The number < 1");  // обработка исключения в методе
            res = a+b;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            res = a;
        }
        return res;
    }
}
