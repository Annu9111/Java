public class lecture_9 {
    public static void main(String[] args) {
        //Arrays⭐️
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
                System.out.print(marks[i][j]+ " ");
            }
            System.err.println();
        }

        //⭐️ //multi-dimention array with different length
        int[][] two_dimention = new int[3][];
        two_dimention[0]=new int[2];
        two_dimention[1]=new int[3];
        two_dimention[2]=new int[4];

        two_dimention[0][0]=23;
        two_dimention[0][1]=13;
        two_dimention[1][0]=45;
        two_dimention[1][2]=56;
        two_dimention[2][0]=34;
        two_dimention[2][1]=23;
        two_dimention[2][2]=13;
        two_dimention[2][3]=67;

        for(int row=0;row<two_dimention.length;row++){
            for(int cols=0;cols<two_dimention[row].length;cols++){
                System.out.println(two_dimention[row][cols]);
            }
        }


    }
}
