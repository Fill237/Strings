import java.util.Scanner;

public class str {

    public static final Scanner src = new Scanner(System.in);

    public static void main(String[] args){
        int n = 0;

        System.out.println("Введите кол-во строк");
            if (src.hasNextInt()){
                n =src.nextInt();
            } else {  //проверка
                System.out.println("Ничего не происходит...");
                return;
            }

        String[] str = new String[n];
            for (int i = 0; i < n; i++){
                System.out.println("Введите строку № " + (i+1));
                str[i] = src.next();
            }

//        for (int i = 0; i < str.length; i++) { //выводим все строки которые ввели
//            System.out.println(str[i]);
//        }

        int[] count = new int[n]; //массив для сохранения длинны строк
            for (int i = 0; i < str.length; i++){ //проходимся по всем элементам массива
                for (int j = 0; j < str[i].length(); j++) { //сохраняю текущий символ
                    char temp = ' ';
                    for (int k = 0; k < str[i].length(); k++) { //символ сравнивается с каждым символом в данной строке

                        if (str[i].charAt(j) != str[i].charAt(k) && temp != str[i].charAt(k)){ //если текущий символ не будет равен следующему символу то прибавляем длину
                            temp = str[i].charAt(k);
                            count[i]++;
                        }
                    }
                }
            }
        int max = 0;
        String answer = "";
            for (int i = 0; i < count.length; i++) {
                if (max <= count[i]){
                    max = count[i];
                    answer = str[i];
                }
            }
        System.out.println(answer);  //вывод наибольшей строки

            if (n != 1 || n != 2) {
                System.out.printf("%s\n", str[0]);
            }
            else{
                System.out.println("exit");
            }
    }
}
