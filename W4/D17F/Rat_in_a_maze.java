package W4.D17F;
//add whatsapp code in this

public class Rat_in_a_maze {
    static int[][] sol= new int[100][100];
    static void display(int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(sol[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    static boolean RIAM(char[][] maze,int i,int j, int n, int m){
        //base case
        if(i==n-1 && j== m-1){
            sol[i][j]=1;
            display(n, m);
            return true;
        }

        if( i>=0 && i<n && j>=0 && j<m && maze[i][j]!='X' && sol[i][j]==0){
            sol[i][j]=1;
            //Right
            RIAM(maze, i, j+1, n, m);
            //Down
            RIAM(maze, i+1, j, n, m);
            //Left
            RIAM(maze, i, j-1, n, m);
            //Up
            RIAM(maze, i-1, j, n, m);

            //Backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze = {
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };

        RIAM(maze, 0, 0, 5, 5);
        // display(5, 5);
    }
}

/* YM
    //rat maze
    //dp dynammic programming meomorisation
    static int[][] sol=new int[100][100];
    static void displayArray(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean RIAM(char [][] maze,int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            sol[i][j]=1;
            displayArray(n, m);
            return true;
        }
        if(i>=0 &&  i<n && j>=0 && j<m && maze[i][j]!='X' && sol[i][j]==0 ){
            sol[i][j]=1;
            //right
            RIAM(maze, i, j+1, n, m);
            //down
            RIAM(maze, i+1, j, n, m);
            //left
            RIAM(maze, i, j-1, n, m);
            //up
            RIAM(maze, i-1, j, n, m);
            //backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze={
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };
        RIAM(maze, 0, 0, 5, 5);
    }
 */

 /*
    one more 
 
    //rat maze
    //dp dynammic programming meomorisation1
    int[][] sol=new int[100][100];
    static void displayArray(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean RIAM(char [][] maze,int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            displayArray(n, m);
            return true;
        }
        if(maze[i][j]!='X' && i>=0 && i<n && j<m && sol[i][j]==0){
            sol[i][j]=1;
            //right
            RIAM(maze, i, j+1, n, m);
            //down
            RIAM(maze, i+1, j, n, m);
            //left
            RIAM(maze, i, j-1, n, m);
            //up
            RIAM(maze, i-1, j, n, m);
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze={};
    } 
*/

/*  


    //rat maze
    //dp dynammic programming meomorisation
    static int[][] sol=new int[100][100];
    static void displayArray(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean RIAM(char [][] maze,int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            sol[i][j]=1;
            displayArray(n, m);
            return true;
        }
        if(i>=0 &&  i<n && j>=0 && j<m && maze[i][j]!='X' && sol[i][j]==0 ){
            sol[i][j]=1;
            //right
            RIAM(maze, i, j+1, n, m);
            //down
            RIAM(maze, i+1, j, n, m);
            //left
            RIAM(maze, i, j-1, n, m);
            //up
            RIAM(maze, i-1, j, n, m);
            //backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze={
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };
        RIAM(maze, 0, 0, 5, 5);
    } 
        
*/

/* static int sol[][] = new int[100][100];
    static int shortestPath[][] = new int[100][100];
    static int minPathLength = Integer.MAX_VALUE;
    static int currentPathLength = 0;

    static void display(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void copySolutionToShortestPath(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                shortestPath[i][j] = sol[i][j];
            }
        }
    }

    static boolean RIAM(char[][] maze, int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) { // reached
            sol[i][j] = 1;
            currentPathLength++;
            
            if (currentPathLength < minPathLength) {
                minPathLength = currentPathLength;
                copySolutionToShortestPath(n, m);
            }
            
            currentPathLength--;
            sol[i][j] = 0; // backtracking
            return false;
        }

        // Check if the current cell is valid
        if (i >= 0 && i < n && j >= 0 && j < m && maze[i][j] != 'X' && sol[i][j] == 0) {
            sol[i][j] = 1; // assumption
            currentPathLength++;

            // move right
            RIAM(maze, i, j + 1, n, m);
            
            // move down
            RIAM(maze, i + 1, j, n, m);
            
            // move left
            RIAM(maze, i, j - 1, n, m);
            
            // move up
            RIAM(maze, i - 1, j, n, m);

            // backtracking
            sol[i][j] = 0;
            currentPathLength--;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] maze = {
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };

        RIAM(maze, 0, 0, 5, 5);
        display(shortestPath, 5, 5);
    } 
*/

/* //rat maze
    //dp dynammic programming meomorisation
    static int[][] sol=new int[100][100];
    static void displayArray(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean RIAM(char [][] maze,int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            sol[i][j]=1;
            displayArray(n, m);
            return true;
        }
        if(i>=0 &&  i<n && j>=0 && j<m && maze[i][j]!='X' && sol[i][j]==0 ){
            sol[i][j]=1;
            //right
            RIAM(maze, i, j+1, n, m);
            //down
            RIAM(maze, i+1, j, n, m);
            //left
            RIAM(maze, i, j-1, n, m);
            //up
            RIAM(maze, i-1, j, n, m);
            //backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze={
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };
        RIAM(maze, 0, 0, 5, 5);
    } 
        
*/

/* static int sol[][] = new int[100][100];
    static int shortestPath[][] = new int[100][100];
    static int minPathLength = Integer.MAX_VALUE;
    static int currentPathLength = 0;

    static void display(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void copySolutionToShortestPath(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                shortestPath[i][j] = sol[i][j];
            }
        }
    }

    static boolean RIAM(char[][] maze, int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) { // reached
            sol[i][j] = 1;
            currentPathLength++;
            
            if (currentPathLength < minPathLength) {
                minPathLength = currentPathLength;
                copySolutionToShortestPath(n, m);
            }
            
            currentPathLength--;
            sol[i][j] = 0; // backtracking
            return false;
        }

        // Check if the current cell is valid
        if (i >= 0 && i < n && j >= 0 && j < m && maze[i][j] != 'X' && sol[i][j] == 0) {
            sol[i][j] = 1; // assumption
            currentPathLength++;

            // move right
            RIAM(maze, i, j + 1, n, m);
            
            // move down
            RIAM(maze, i + 1, j, n, m);
            
            // move left
            RIAM(maze, i, j - 1, n, m);
            
            // move up
            RIAM(maze, i - 1, j, n, m);

            // backtracking
            sol[i][j] = 0;
            currentPathLength--;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] maze = {
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };

        RIAM(maze, 0, 0, 5, 5);
        display(shortestPath, 5, 5);
    } */