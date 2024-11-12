package W6.Array_practice_snippets;
public class Array_practice {
    public static void main(String[] args) {
        int [] q = {0,1,2,3,4,5};

        //printing
        System.out.println("printing: ");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i]+" ");
        }
        
        //search in array
        System.out.println("\n\nsearch in array: ");
        int temp = 10;
        boolean isPresent = false;
        for (int i = 0; i < q.length; i++) {
            if (temp == q[i]) {
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println("yes number is present");
        } else {
            System.out.println("no element is not present");
        }

        //reversing
        System.out.println("\nby decrementing i: ");
        for (int i = q.length-1; i >= 0 ; i--) {
            System.out.print(q[i]+" ");
        }
        
        //by swapping
        System.out.println("\n\nby swapping and for-each loop: ");
        for (int i = 0; i < q.length/2; i++) {
            int l = q.length;
            int w = q[i];
            q[i] = q[l-i-1];
            q[l-i-1] = w;
        }
        for(int e : q){
            System.out.print(e+" ");
        }

        //maximum in array
        System.out.println("\n\nmaximum in elements: ");
        int e = Integer.MIN_VALUE;
        for (int i = 0; i < q.length; i++) {
            if (e<q[i]) {
                e = q[i];
            }
        }
        System.out.print(e);

        //minimum in array
        System.out.println("\n\nMinimum in elements: ");
        int r = Integer.MAX_VALUE;
        for (int i = 0; i < q.length; i++) {
            if (r>q[i]) {
                r = q[i];
            }
        }
        System.out.print(r);

        //adding two arrays
        System.out.println("\n\nadding two arrays");
        int [] add  = {0,1,2,3,4,5};
        int [] pika = {0,0,0,0,0,0};
        for (int i = 0; i < q.length; i++) {
            pika[i] = q[i]+add[i];
            System.out.print(pika[i]+" ");
        }
        

        // soting by bubble sort
        System.out.println("\n\nbubble sort");
        for (int j = 0; j < q.length; j++) {
            for (int i = 0; i < q.length-1; i++) {
                if (q[i]>q[i+1]) {
                    int t = q[i];
                    q[i] = q[i+1];
                    q[i+1] = t;
                }
            }
        }
        for (int i : q) {
            System.out.print(i+" ");
        }

        //selection sort
        System.out.println("\n\nselectionn sort: ");
        for (int i = 0; i < q.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < q.length; j++) {
                if (q[smallest]>q[j]) {
                    smallest = j;
                }
            }
            int u = q[smallest];
            q[smallest] = q[i] ;
            q[i] = u;
        }
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i]+" ");
        }

        /* for(int i = 0;i<q.length;i++ ){
         * int smallest = i;
         * for(int j = i+1; j > q.length; j++){
         * if(q[smallest]>q[j]){
         *   smallest = j;
         *   }
         *  }
         *  int temp = q[smallest];
         *  q[smallest] = q[i];
         *  q[i] = temp;
         * }
         */
        
        //insertion sort
        // for (int i = 1; i < q.length; i++) {
        //     int current = q[i];
        //     int j = i-1;
        //     while (j>=0 && q[j]>current) {
        //         q[j+1] = q[j];
        //         j--;
        //         q[j+1] = current;
        //     }
        // }
    }
}    