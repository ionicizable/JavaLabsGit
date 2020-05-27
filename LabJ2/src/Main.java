import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountNum rd = new CountNum();

        //-----------ВАРИАНТ А------------//

        /*System.out.print("Введите n: ");
        int n = rd.reader();
        Integer[][] input = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            input[i][0] = rd.reader();
            input[i][1] = String.valueOf(Math.abs(input[i][0])).length();
        }
        System.out.println("Введите 1 для сортировки по убыванию, 2 для сортировки по возрастанию: ");
        int check = rd.reader();
        if (check==1) {
            bubbleSort(input,1);
            System.out.println("Сортированный массив: ");
            for (int i = 0; i < n; i++) System.out.println(input[i][0]);
        }
        else {
            bubbleSort(input,0);
            System.out.println("Сортированный массив: ");
            for (int i = 0; i < n; i++) System.out.println(input[i][0]);
        }*/

        //----------ВАРИАНТ С-----------//

        System.out.println("Введите размерность матрицы: ");
        int n = rd.reader();
        int w = n;
        int[][] input = new int[n][w];
        int[] val = new int[n * n];

        for (int i = 0; i < n * n; i++) {
            val[i] = (int) (Math.random() * (2 * n + 1) - n);
        }

        int itr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                input[i][j] = val[itr++];
            }
        }
        //ВЫВОД МАТРИЦЫ
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.format("%4d", input[i][j]);

            }
        }

        itr = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < w; j++) {
                list.get(i).add(val[itr]);
                itr++;
            }
        }

        Arrays.sort(val);
        int exterminate = val[val.length-1];
        System.out.println(val[val.length-1]);
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            if (val[i]==exterminate){
                count+=1;
            }
        }
        for (int x = 0; x < count; x++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < w; j++) {
                    if (list.get(i).get(j) == exterminate) {
                        list.remove(i);
                        --n;
                        for (int k = 0; k < n; k++) {
                            list.get(k).remove(j);
                        }
                        w--;
                    }
                }
            }
        }

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                if ((input[i][j] == exterminate) && (j != w - 1)) {
                    for (int k = 0; k < n; k++) {
                        input[k][j] = input[k][j + 1];
                        w--;
                    }
                    for (int k = 0; k < w; k++) {
                        input[i][k] = input[i + 1][k];
                    }
                }
            }

        }*/


        System.out.println("\nИзмененная матрица: ");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.format("%4d", /*input[i][j]*/list.get(i).get(j));

            }
        }


    }

    static void bubbleSort(Integer arr[][], Integer check) {
        int n = arr.length;
        if (check == 1) {
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j][1] < arr[j + 1][1]) {
                        // swap arr[j+1] and arr[i]
                        int temp = arr[j][1];
                        arr[j][1] = arr[j + 1][1];
                        arr[j + 1][1] = temp;
                        int temp2 = arr[j][0];
                        arr[j][0] = arr[j + 1][0];
                        arr[j + 1][0] = temp2;
                    }
        } else {
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j][1] > arr[j + 1][1]) {
                        // swap arr[j+1] and arr[i]
                        int temp = arr[j][1];
                        arr[j][1] = arr[j + 1][1];
                        arr[j + 1][1] = temp;
                        int temp2 = arr[j][0];
                        arr[j][0] = arr[j + 1][0];
                        arr[j + 1][0] = temp2;
                    }
        }

    }

}
