public class rat {

    public static void solveMaze(int maze[][],
                                 int row,
                                 int col,
                                 boolean visited[][],
                                 String path) {

        int n = maze.length;

        // 1. BASE CASE
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        // 2. SAFETY CHECK
        if (row < 0 || col < 0 ||
            row >= n || col >= n ||
            maze[row][col] == 0 ||
            visited[row][col] == true) {

            return;
        }

        // 3. DO
        visited[row][col] = true;

        // 4. RECURSE

        // Down
        solveMaze(maze, row + 1, col,
                  visited, path + "D");

        // Left
        solveMaze(maze, row, col - 1,
                  visited, path + "L");

        // Right
        solveMaze(maze, row, col + 1,
                  visited, path + "R");

        // Up
        solveMaze(maze, row - 1, col,
                  visited, path + "U");

        // 5. UNDO (BACKTRACK)
        visited[row][col] = false;
    }

    public static void main(String[] args) {

        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int n = maze.length;

        boolean visited[][] = new boolean[n][n];

        solveMaze(maze, 0, 0, visited, "");
    }
}