package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] mt = rotate_matrix(m);
		
		for(int i = 0;i < m.length;i++) {
			for(int j = 0;j < m.length;j++) {
				System.out.print(mt[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private static void swap_mirror(int[][]m,int i,int j) {
		if(i != j){
			int d = m[i][j];
			m[i][j] = m[j][i];
			m[j][i] = d;
		}
	}
	
	private static void swap(int[] v,int i,int j){
		int d = v[i];
		v[i] = v[j];
		v[j] = d;
	}
	
	private static void invert(int[]v) {
		
		int[] swaped = new int[v.length];
		for(int i = 0;i < v.length;i++) {
			if((v.length-1) % 2 == 0 && i == (v.length-1)/2) {
				continue;
			}
			if(swaped[i] == 0) {
				swap(v,i,v.length-1-i);
				swaped[v.length-1-i] = 1;
				swaped[i] = 1;
			}
		}
		
	}
	
	private static int[][] rotate_matrix(int[][]m){
		//
		
		//I will create a matrix that will keep track of what element was swaped or not
		
		int[][] swaped = new int[m.length][m.length];
		
		for(int i = 0;i < m.length;i++){
			for(int j = 0;j < m[i].length;j++){
				if(swaped[i][j] == 0) {
					swap_mirror(m,i,j);
					swaped[i][j] = 1;
					swaped[j][i] = 1;
				}
				
			}
		}
		
		for(int i = 0;i < m.length;i++) {
			invert(m[i]);
		}
		
		
		
		
		return m;
		
	}
    
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

