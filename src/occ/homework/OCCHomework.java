/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package occ.homework;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author moni_
 */
public class OCCHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // TODO code application logic here
        System.out.println("¡Welcome to the Movie Survey!");
        
        System.out.println("Please, tell me what kind of movies you like.");

        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Science Fiction");
        System.out.println("5. Horror");
        System.out.println(" Enter the number: ");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        
        
        BufferedReader br = new BufferedReader(new FileReader("Movies1.csv"));
        String line = br.readLine();
        System.out.println(" The first category has the following action movies: " + line);

        
    }
    
    public static void introMessages(){
        
                
        System.out.println(" The second category has the following action movies: " );
        System.out.println(" The Third category has the following action movies: " );
        System.out.println(" The Fourth category has the following action movies: " );
        System.out.println(" The five category has the following action movies: " );
        
        
    }
    
}
