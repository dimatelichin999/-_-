import static java.util.Arrays.fill;

class less5 {

    public static void main(String args[]){

        int [][] x1 = {{1,2},{1,3,4},{1,2,3,4}};
        fill(x1,8);
    }
    public static void fill(int[][] data,int value){

        for (int i = 0 ; i < data.length; i++){
            for (int j= 0;j < i ; j++ ){
                data[i][j]= value;
System.out.println(value);
            }
        }
    }
}
