package p6;

public class Main {
    public static void main(String[] args) {
        try {
            System.err.println("level 0"); // вызвать специальный поток ошибок
           if (true) {
               throw new Error();
           }
           System.err.println("leval 1");
        }catch (Error exception){
            System.err.println("level 2");
        }
        System.out.println("level 3");
    }

}
