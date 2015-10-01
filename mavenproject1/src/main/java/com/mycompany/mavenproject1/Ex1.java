/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author student BARTOSZ REICHEL REICHEL@mif.pg.gda.pl GB 409
 *
 * DBSERVER.mif.pg.gda.pl/st.aspx
 */
public class Ex1 {

//    private String DATA_SRC = "data.json";
    public static void main(String[] args) {
        Ex1 obj = new Ex1();
        String data = obj.getFileWithUtil("data.json");
        for (int i = 0; i < data.length(); i++) {
            System.out.println(Integer.toBinaryString(data.charAt(i)));
        }
    }

    private String getFileWithUtil(String fileName) {

        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    private int countOnes(Integer t) {
        int result = 0;
        for ( int interation = 0; t/Math.pow(interation, 10) > 0 ; interation++) {
            result = (int) (result + t%Math.pow(interation, 10));
        }
        return result;
    };
//        Ex1 ex = new Ex1();
//        InputStream io = null;
//        try {
//            String t = ex.getFileWithUtil(DATA_SRC);
//            io = new FileInputStream(DATA_SRC);
//            for (int i = 0; i < t.length(); i++) {
//                System.out.println(Integer.toBinaryString(t.charAt(i)));
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ex1.class.getName()).log(Level.INFO, null, ex);
//        } finally {
//            try {
//                io.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Ex1.class.getName()).log(Level.WARNING, null, ex);
//            }
//        }
//    }
//
//     private String getFileWithUtil(String fileName) {
//
//	String result = "";
//		
//	ClassLoader classLoader = getClass().getClassLoader();
//	try {
//	    result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
//	} catch (IOException e) {
//                Logger.getLogger(Ex1.class.getName()).log(Level.WARNING, null, e);
//	}
//		
//	return result;
//  }
//	
}
