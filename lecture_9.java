public class lecture_9 {
    public static void main(String[] args) {
        //Arrays
        int x=101;
        int[] rollNums = new int[3];
        for(int i=0;i<rollNums.length;i++){
            rollNums[i]=x+1;
            System.out.println(rollNums[i]);
        }

        //multidimentional array ⭐️
        int[][] marks = new int[3][3];
        marks[0][0]=20;
        marks[0][1]=30;
        marks[0][2]=40;
        marks[1][0]=50;
        marks[1][1]=60;
        marks[1][2]=70;
        marks[2][0]=80;
        marks[2][1]=90;
        marks[2][2]=100;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(marks[i][j]);
            }
        }


    }
}
