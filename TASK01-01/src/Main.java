public class Main {
    public static boolean isStatementCorrect(int i){
        if (i < 1000 || i >= 10000){
            throw new IllegalArgumentException("Argument should be 4-digit number");
        }

        char[] ch = String.valueOf(i).toCharArray();
        int[] intArr = new int[ch.length];
        for (int j = 0; j < ch.length; j++){
            intArr[j] = Character.getNumericValue(ch[j]);
        }

        for (int j : intArr){
            System.out.println(j);
        }

        return (intArr[0] + intArr[1]) == (intArr[2] + intArr[3]);
    }

    public static void main(String[] args) {
        int i = 1234;
        System.out.println(isStatementCorrect(i));;
    }
}
