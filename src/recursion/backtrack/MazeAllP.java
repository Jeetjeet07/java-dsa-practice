import java.util.*;

public class MazeAllP {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

//        pathO("",board,0,0);  //incrementing order start from

        boolean[][] cells = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        allPath("",cells,0,0);
        int [][] path = new int[cells.length][cells[0].length];
        MatrixPrint("",cells,0,0,path,1);
    }


    static void pathO(String p, boolean[][] maze,int r,int c){
        //base
        if(r==maze.length-1  && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        //obstacle
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathO(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathO(p+'R',maze,r,c+1);
        }
    }





    static void allPath(String p, boolean[][] maze,int r,int c){
        //base
        if(r==maze.length-1  && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        //obstacle
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r<maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPath(p+'L',maze,r,c-1);
        }

        maze[r][c] = true;
    }




    static void MatrixPrint(String p, boolean[][] maze,int r,int c,int[][] path,int step){
        //base
        if(r==maze.length-1  && c== maze[0].length-1){
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        //obstacle
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c]=step;

        if(r<maze.length-1){
            MatrixPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            MatrixPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            MatrixPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            MatrixPrint(p+'L',maze,r,c-1,path,step+1);
        }

        maze[r][c] = true;
        path[r][c]=0;
    }
}
