package p1;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        try {
           // int[] nums = new int[5];  // дан массив
            nums[6] = 100;
            nums[6] = Integer.parseUnsignedInt("qwertuui");
           // System.out.println(nums[6]);
            /* } catch (Exception exception) {   // это вид ошибки (Exception exception) В блоке try происходит ошибка, в блоке catch объявляется переменная exception
            System.out.println(exception.getMessage()); // печать ошибки Index 6 out of bounds for length 5
            exception.printStackTrace();  // детально описание ошибки
        }*/
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Выход за пределы массива");

        }
        catch (NumberFormatException exception){
            System.out.println(" Ошибка преобразования типов");
        }
        finally {
            System.out.println("Блок finally"); // блок finally необязателен
        }
        System.out.println("End program");
    }
}