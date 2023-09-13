public class Array {
    public static void main(String[] args) {
        //array
        int nums[] = {2,4,2,2,2};

        int[] arr = new int[10];
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(nums[1]);

        //multidimensional array
        int [][] mat = new int[5][3];
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                mat[i][j] = (int)( Math.random()*100);
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }

        //jaggered and 3d array
        int jag_arr[][] = new int[3][];
        jag_arr[0] = new int[2];
        jag_arr[1] = new int[5];
        jag_arr[2] = new int[7];
        
        for(int i=0; i<jag_arr.length; i++){
            for(int j=0; j<jag_arr[i].length; j++){
                jag_arr[i][j] = (int)(Math.random() * 100);
                System.out.print(jag_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
