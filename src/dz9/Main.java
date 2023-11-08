package dz9;
/*Д/з добавить в проект Phone свой класс NameException, исправим метод receiveCall
 получаем имя от пользователя и получаем исключение, если длина имени меньше 4 символов.
 */

public class Main {
    public static void main(String[] args) {

        ApplePhone phone = new ApplePhone("999-999-999", "Samsung S55", 100.123);
        phone.receiveCall("Misha");
        phone.info();
        //phone.receiveCall();
        phone.infoD();
        phone.inform("test");
    }
}