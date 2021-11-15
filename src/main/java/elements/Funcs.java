/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Funcs {
    public static File[] loadPath(String path) {
        File file = new File(path);
        return file.listFiles();
    }
    
    public static String readFile(final String path) {
        try {
            StringBuilder data = new StringBuilder();
            File file = new File(path);
            
            if (file.exists()) {
                Scanner reader = new Scanner(file);
                
                if (reader.hasNext()) {
                    data.append(reader.nextLine());
                }
                
                reader.close();
            }
            
            return data.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
