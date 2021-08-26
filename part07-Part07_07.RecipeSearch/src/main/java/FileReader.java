/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class FileReader {
    
    public ArrayList<String> createFileAsArray(String fileName){
        ArrayList<String> fileAsArray = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                fileAsArray.add(fileScanner.nextLine());
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        return fileAsArray;
    }
    
    
}
