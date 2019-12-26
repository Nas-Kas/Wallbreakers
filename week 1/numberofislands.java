class Solution {
    int count = 0;
    public int numIslands(char[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        printMatrix(grid);
        return count;
    }
    
    public void dfs(char [] [] grid, int i, int j){
        if(i< 0 || i >= grid.length) return;
        if(j< 0 || j >= grid[0].length) return;
        if(grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        
    }
    public void printMatrix(char grid [] []){
        for(int i = 0; i < grid.length; i++){
            System.out.println();
            for(int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j] + ":");
            }
        }
    }
}