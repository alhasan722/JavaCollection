package javaFiles.textFiles;

import java.io.File;

public class folderActions {

    ////creating folder
    public static void createFolder(String folderPath)
    {
       File folder = new File(folderPath);
       if (!folder.exists())
       {
           folder.mkdir();////create a new folder methos
           System.out.println("Folder created:"+folderPath);
       }
    }
/// //check folder exist or not
public static boolean createFolderExist(String folderPath)
    {
        File folder = new File(folderPath);
        return folder.exists();///folder exsit or not
    }

    ////rename folder
    public static void renameFolder(String oldPath, String newPath)
    {
        File oldfolder = new File(oldPath);
        File newfolder = new File(newPath);
        if (oldfolder.exists())
        {
            oldfolder.renameTo(newfolder);///this will rename the folder name
            System.out.println("Folder renamed:"+newPath);
        }
    }
    ///folder delete
    public static void deleteFolder(String folderPath)
    {
        File folder = new File(folderPath);
        if (folder.exists())
        {
            for (File file:folder.listFiles())
            {
                file.delete();
            }

                folder.delete();///will delete the folder
                System.out.println("Folder deleted:"+folderPath);
        }

    }

//////Users/abdullahhasan/Desktop
    public static void main(String[] args)
    {
            String folderPath = "/Users/abdullahhasan/Desktop/myfiles";
            createFolder(folderPath);
            boolean folderexist=createFolderExist(folderPath);
            System.out.println("Folder exist:"+folderexist);
            String newFolderpath="/Users/abdullahhasan/Desktop/myfiles1";
           renameFolder(folderPath,newFolderpath);
           deleteFolder(newFolderpath);
    }
}
