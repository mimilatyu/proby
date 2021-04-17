import java.util.Arrays;

public class Module3 {
    public static void main(String[] args) {
        String[] str1 = new String[]{"bezumno", "mozno", "byt", "pervym"}; //создаем строчный массив
        System.out.println(Arrays.toString(str1));
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int j = 0; j<str1.length-1; j++) {
                if(str1[j].length()<str1[j+1].length()) {
                    String tmp = str1[j];
                    str1[j]=str1[j+1];
                    str1[j+1]=tmp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(str1)); //отсортировали массив по длине элемента
        String[] str2 =  new String[4]; // создали новый массив
        Arrays.fill(str2, str1[2]); // заполнили весь новый массив третьим элементом первого массива
        System.out.println(Arrays.toString(str2)); // выводим на экран


        char i = str2[0].charAt(3); // находим четвертый символ первого элемента второго массива
        System.out.println(i); // выводим элемент на экран
    }
}
