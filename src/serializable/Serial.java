package serializable;

import java.io.*;

public class Serial {
    public static void main(String[] args) {
        Student student = new Student("John", 25);

        String filename = "E:\\Programming\\Eclectics\\serial.txt";
        FileOutputStream fileout = null;
        ObjectOutputStream objout = null;
        // searialization

        try{

            // writing the student object to the file via serializing it
            fileout = new FileOutputStream(filename);
            objout = new ObjectOutputStream(fileout);
            objout.writeObject(student);
            objout.close();
            fileout.close();

            System.out.println("Object has been serialized: \n " +student);

        }
        catch(IOException ex){
            System.out.println("IOException is caught" );
        }

        // deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try{
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized: \n " +object);
            objIn.close();
            fileIn.close();
        }
        catch(IOException ex){
            System.out.println("IOException is caught" );

        }
        catch(ClassNotFoundException ex){
            System.out.println("ClassNotFoundException is caught" );
        }
    }
}
