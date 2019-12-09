/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
/**
 *
 * @author guoyafei
 */
public class CreateVCF {
    public static void main(String[] args) throws IOException
	{
		
            BufferedReader bufferedReader;
        try ( //BufferedReader是可以按行读取文件
            FileInputStream inputStream = new FileInputStream("/Users/guoyafei/Downloads/Results/ChangeFormat/vcf_input.txt")) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            
            File writename = new File("/Users/guoyafei/Downloads/Results/ChangeFormat/vcf_output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
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
                String AA = (String) list.get(3);
                String AB = (String) list.get(4);
                String BB = (String) list.get(5);
                
                Collections.replaceAll(list, AA, "0/0");
                Collections.replaceAll(list, AB, "0/1");
                Collections.replaceAll(list, BB, "1/1");
                Collections.replaceAll(list, "NN", "./.");
                
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
