package javaFiles.textFiles;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

    /////creating a file
    public static void createFile(String filepath)
    {
        File myfile = new File(filepath);
        try
        {
            if (myfile.createNewFile())
                {
                System.out.println("File created:"+myfile.getName());
                }
            else
                {
                System.out.println("File already exists.");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
////writting data into file
 public static void writeFile(String filepath)
 {
     try
     {
         FileWriter mywrite = new FileWriter(filepath);
         mywrite.write("welcome to java file handling");
         mywrite.close();
         System.out.println("successfully wrote to the file");
     } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();

     }
 }

 ///reading data from file
 public static void readDataFromFile(String filepath)
 {
     try {
         File myfile = new File(filepath);
         Scanner myScan = new Scanner(myfile);
         while (myScan.hasNextLine()) {
             String line = myScan.nextLine();
             System.out.println(line);
         }
         myScan.close();
     }
     catch (FileNotFoundException e)
     {
         System.out.println("error occar while file reading");
         e.printStackTrace();
     }
 }

 ////rename file
 public static void renameFile(String oldfilepath,String newfilepath)
 {
  File oldfile = new File(oldfilepath);
  File newfile = new File(newfilepath);
  if (oldfile.renameTo(newfile))
  {
      System.out.println("File renamed successfully");
  }
  else
  {
      System.out.println("File could not be renamed");
  }
 }

 ///delete file
 public static void deleteFile(String filepath)
 {
     File myFile= new File (filepath);
     if (myFile.delete())
     {
        System.out.println("File deleted successfully"+myFile.getName());
     }
     else
     {
        System.out.println("File could not be deleted");
     }
 }



    public static void main(String[] args)
    {
        String filepath="/Users/abdullahhasan/Desktop/myfiles/newFile.txt";
        ///createFile(filepath);
        ///writeFile(filepath);
        ////readDataFromFile(filepath);
        String newfilePath="/Users/abdullahhasan/Desktop/myfiles/newFile1.txt";
        ///renameFile(filepath,newfilePath);
        deleteFile(newfilePath);


    }
}
