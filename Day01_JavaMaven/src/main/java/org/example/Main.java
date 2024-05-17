package org.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个要删除文件的绝对路径：");
        String path = scanner.next();
        while (!Objects.equals(path,"exit"))
        {
            File file = new File(path);
            if(file.isFile())
            {
                file.delete();
                System.out.println("删除成功！！");
            }
            else {
                deleteFile(file);
                file.delete();
                System.out.println("删除成功！");
            }
            System.out.println("请输入一个要删除文件的绝对路径(如果想退出请输入：exit)：");
            path = scanner.next();
        }
        }

        public static void deleteFile(File file)
        {
            File[] files = file.listFiles();
            {
                for (File file1 : files) {
                    if(file1.isFile()) {
                        file1.delete();
                    }
                    else if(file1.isDirectory())
                        deleteFile(file1);
                }
                for (File file1 : files)
                    file1.delete();
            }
        }
    }
