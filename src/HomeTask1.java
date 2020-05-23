import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        int min = array[0];
        int max = array[0];
        double waver = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            waver += array[i];
        }
        waver = waver / array.length;
        System.out.println("max =" + max + "  " + "min =" + min + "  " + "waver =" + waver);

        //Zadanie 2

        int j = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] >= 0) {
                j++;
            }
        int countsum = 0;
        int[] newarray = new int[j];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                newarray[k] = array[i];
                k++;
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
            if (newarray[i] % 2 == 0) {
                countsum += newarray[i];
            }
        }
        System.out.println(countsum);
    }
}







