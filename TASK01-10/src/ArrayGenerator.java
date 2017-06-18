
import java.util.Arrays;

public class ArrayGenerator {
    int size;
    int[][] arr;

    public ArrayGenerator(int size){
        if (size < 0){
            throw new IllegalArgumentException("Size can not be a negative number");
        }
        this.size = size;
        arr = new int[size][size];
        generate();
    }

    private void generate(){
        for (int i = 0; i < arr.length; i++){
            if (i%2 == 0){
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = j + 1;
                }
            }else{
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = arr[i].length - j;
                }
            }
        }
    }

    public void print(){
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }

    public static void main(String[] args) {
        ArrayGenerator array = new ArrayGenerator(20);
        array.print();
    }
}
