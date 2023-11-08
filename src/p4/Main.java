package p4;

public class Main {
    public static void main(String[] args) {
       // Throwable главный

        //Error      описывает внутренние ошибки в среде Java / релиз - новое приложение
        //Exception  описывает другие классы ошибок, исключения. От него наследуются другие классы ошибок

        // RuntimeException  наседник  - базовый класс для непроверяемых исключений, н-р неверное преобразование типов и выход за пределы массива
        // Не проверяемые исключения:
        // ArithmeticException - арифметические, например, деление на 0
        // IndexOutOfBoundsException  - выход за пределы массива
        //  IllegalArgumentException //неверный аргумент при вызове метода
        // NullPointerException  -  использование пустой ссылки
        // NumberFormatException - ошибка преобразования строки в число

        // есть и прверяемые исключения :
        // ClassNotFoundException  - невозможно найти класс
        // CloneNotSupportedException - не поддерживает клонирование

    }
    public Client clone() throws CloneNotSupportedException{
        Client client = (Client) super.clone();
        return client;
    }



}
