/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.io.File;

/**
 *
 * @author thiago
 */
public class Funcs {
    public static File[] loadPath(String path) {
        File file = new File(path);
        return file.listFiles();
    }
}
