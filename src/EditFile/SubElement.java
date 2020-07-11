package EditFile;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author guoyafei
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;


public class SubElement {
    
    public static void main(String[] args) throws IOException
	{
		
            BufferedReader bufferedReader;
        try ( //BufferedReader是可以按行读取文件
            FileInputStream inputStream = new FileInputStream("/Users/guoyafei/Downloads/Results/all.txt")) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            
            File writename = new File("/Users/guoyafei/Downloads/Results/output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
	    writename.createNewFile(); // 创建新文件
	    BufferedWriter out = new BufferedWriter(new FileWriter(writename));

            String str = null;
            str = bufferedReader.readLine();
            out.write(str+"\r\n"); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
            while ((str = bufferedReader.readLine()) != null) {
                List list = Arrays.asList(str.split(" "));
//              System.out.println("List :"+list);
//              System.out.println(list.get(0));
                Collections.replaceAll(list, "0", list.get(0));
                Collections.replaceAll(list, "1", list.get(1));
                Collections.replaceAll(list, "2", list.get(2));
                Collections.replaceAll(list, "-2", ".");
                Collections.replaceAll(list, "-1", ".");
                
                // create object of StringBuilder class 
                StringBuilder sb = new StringBuilder(); 
  
                // Appends characters one by one 
                for (Object ch : list) { 
                  sb.append(ch+" "); 
                } 
  
                // convert in string 
                String string = sb.toString(); 
                
                out.write(string+"\r\n"); // \r\n即为换行		
                out.flush(); // 把缓存区内容压入文件
            }
            //close
        }
		bufferedReader.close();
//                out.flush(); // 把缓存区内容压入文件
                out.close(); // 最后记得关闭文件
		
	}
}
