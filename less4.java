import javax.swing.plaf.basic.BasicTreeUI;

class less4 {

    public static void main(String args[]) {

        int[] x = {31, 30, 31, 31, 30, 31, 30, 31, 31};
        printSumArray(x);

    }
    public static void printSumArray(int[] data){
        int sum = 0;
         for (int i = 0; i < data.length; i++){
             sum=sum+data[i];
             System.out.println(sum);

         }
    }
}
