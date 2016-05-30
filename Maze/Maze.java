package Maze;

import java.util.Scanner;
import java.util.Stack;

public class Maze {
	private int row;
	private int col;
	private int [][] grid = new int [row][col];
	public int [][] trace;
	
	public void position(int row, int col){
		for(int i =0;i<row;i++){
			for(int j =0;j<col;j++){
				System.out.println(grid[i][j]+"");
				if(grid[i][j]==1){
					//obstacle
				}
				else if(grid[i][j]==0){
					Cell();
				}
				
			}
		}
	}

	public void Cell(){
		
		if(grid[row-1][col-1]==0){
			row--; col--;
			
		}
		if(grid[row-1][col]==0){
			row--;
			
		}
		
		if(grid[row-1][col+1]==0){
			row--;col++;
			
		}
		
		if(grid[row][col-1]==0){
			col--;
			
		}
		
		if(grid[row][col+1]==0){
			col++;
			
		}
		if(grid[row+1][col-1]==0){
			row++;col--;
		}
		if(grid[row+1][col]==0){
			row++;
		}
		if(grid[row+1][col+1]==0){
			row++;col++;
		}

		
	}
	public void entrance(int row, int col){
		row=0;col=0;
		int ent = grid[row][col];
		
	}
	public void exit(int n, int m){
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Stack ki = new Stack();
		
		
		System.out.print("Maze Problem : ");
		in.hasNext();
		System.out.println(" ");
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		ki.pop();
		
		System.out.println("Entrance = ");
		System.out.println("Exit = ");
		
	}

}
