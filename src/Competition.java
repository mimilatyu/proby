public class Competition {
    public static void main(String[] args) {

        int[][] nums = {
                {4, 3, 2, 1,4},
                {11, 12, 12, 34, 14},
                {1, 2 ,3, 4, 5},
                {7,3,4,2,7},
                {56,33,21,34,1},
        };

        int[] points = new int[5];
        String[] names = {"pasha", "masha", "dasha", "glasha", "sasha"};
        String[] result = new String[5];
        for (int i = 0; i < names.length; i++) {
            for(int j = 0; j < names.length; j++) {
                points[i] += nums[i][j];
            }
            result[i] = names[i] + " " + points[i];
            System.out.println(result[i]);
        }


    }
}
