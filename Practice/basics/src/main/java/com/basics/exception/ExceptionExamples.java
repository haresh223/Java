package com.basics.exception;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionExamples {

    // Runtime Exception
    // compile time exception

    // try
    // catch
    // finally  // this block of code is always executed
    //  throws
    // throw

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {
            j = i / 10;  // attempting to divide by zero
            System.out.println(j);
            new ExceptionExamples().readFile("test.txt");

        } catch(ArithmeticException e) {

            System.out.println("ERROR: Illegal operation being done.  " + e.getMessage());
//            e.printStackTrace();  // will print the entire message
        }catch(NullPointerException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        catch(Exception e ){
            e.getMessage();
        }
        finally {
            System.out.println("This will laways get executed");
        }

        System.out.println("Does this get printed ?");
    }

    public void readFile(String fileName) throws FileNotFoundException  {

        File f = new File(fileName);
        if(!f.exists()) {
            throw new FileNotFoundException("File doesn't exist") ; }

        System.out.println(f.getAbsoluteFile());
    }

}

// stack  -- LIFO last in first out --- the last element to be inserted will come out first



