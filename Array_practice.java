public class Array_practice {
    public static void main(String[] args) {
        int [] q = {0,1,2,3,4,5};
        
        //printing
        for (int i = 0; i < q.length; i++) {
            System.out.print(i+" ");
        }

        //reversing
        // System.out.println("\nwith decrementing i: ");
        // for (int i = q.length-1; i >= 0; i--) {
        //     System.out.print(i+" ");
        // }

        //reversing by swap
        System.out.println("\nwith swap: ");
        for (int i = 0; i < q.length/2; i++) {
            int w = q.length;
            int temp = q[i];
            q[i] = q[w-1-i];
            q[w-1-i] = temp;
        }
        for (int i = 0; i < q.length; i++) {
            System.out.print(i+" ");
        }
    }
}
