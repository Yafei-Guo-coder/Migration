/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditFile;

import static com.google.common.io.Files.map;
import static com.univocity.parsers.conversions.Conversions.string;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static tech.tablesaw.api.QuerySupport.str;

/**
 *
 * @author guoyafei
 */
public class MergeVCF {
    
    // 这个方法是产生指定个数的./.
    private static String getDot(Integer Alength){
        StringBuilder StringDot = new StringBuilder();
        for(int j = 0; j< Alength-1; j++){
            StringDot.append("./." + " ");
        }
        StringDot.append("./.");
        return StringDot.toString();
    }
   
    public static void main(String[] args) throws IOException
	{
//            //读取pos文件：char，pos。并存储为list：array。
//            BufferedReader bufferedReader;
//            try ( 
//            FileInputStream inputPos = new FileInputStream("/Users/guoyafei/Downloads/Results/MergeVCF/all_pos.txt")) {
//            bufferedReader = new BufferedReader(new InputStreamReader(inputPos));
//            
//            ArrayList<String> array = new ArrayList<String>();
//            String str =  null;
//            while ((str = bufferedReader.readLine()) != null) {
//                array.add(str);
//            } 
//            }
            
            //构建输出文件：vcf_merge.vcf
            File writename = new File("/data1/home/yafei/SNP/Origin_File/Merge.vcf"); // 相对路径，如果没有则要建立一个新的output.txt文件
	    writename.createNewFile(); // 创建新文件
	    BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            
            //构建hashmap，用于存储分文件的行。
            Map<String,String> map = new HashMap<>();
            
            //读取分文件1：并且将内容存储为hashmap，键：char+pos。值：基因分型。
            BufferedReader bufferedReader2;
            try (
            FileInputStream inputStream = new FileInputStream("/data1/home/yafei/SNP/Origin_File/mergeE.vcf")) {
            bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
             
            String str2 = null;
            while ((str2 = bufferedReader2.readLine()) != null) {
                
                List list = Arrays.asList(str2.split("_"));

                map.put((String)list.get(0), (String)list.get(1));  
            }	
            
            }
            
            //读取分文件2：并且判断char+pos是否存在于map的键中，在的话添加新的值，不在的话补./.
            BufferedReader bufferedReader3;
            
            try (
            FileInputStream inputStream = new FileInputStream("/data1/home/yafei/SNP/Origin_File/mergeT.vcf")) {
            bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream));
         
            String str = null;
            while ((str = bufferedReader3.readLine()) != null) {
            
                List list = Arrays.asList(str.split("_"));
                
                boolean flag = map.containsKey((String)list.get(0));
                
                if(flag){
                    String oldV = map.get((String)list.get(0));
                    String newV = (String)list.get(1);
                    newV = oldV + " " + newV;
                
                    map.put((String)list.get(0), newV);
                }else{
                    String oldV = (String)list.get(1);
                    String newV = getDot(101);
                    newV = newV + " " + oldV;
                    map.put((String)list.get(0), newV);
                }
       
            }
            }
            
            //读取分文件3：并且判断char+pos是否存在于map的键中，在的话添加新的值，不在的话补./.
            BufferedReader bufferedReader4;
            
            try (
            FileInputStream inputStream = new FileInputStream("/data1/home/yafei/SNP/Origin_File/mergeW.vcf")) {
            bufferedReader4 = new BufferedReader(new InputStreamReader(inputStream));
         
            String str = null; 
            
            while ((str = bufferedReader4.readLine()) != null) {
            
                List list = Arrays.asList(str.split("_"));
                
                boolean flag = map.containsKey((String)list.get(0));
                
                if(flag){
                    List list2 = Arrays.asList(map.get((String)list.get(0)).split(" "));
                    if(list2.size()==143){
                        String oldV = map.get((String)list.get(0));
                        String newV = (String)list.get(1);
                        newV = oldV + " " + newV;
                        map.put((String)list.get(0), newV);
                    }else{
                        String oldV = map.get((String)list.get(0));
                        String newV = getDot(42) + " " + (String)list.get(1);
                        newV = oldV + " " + newV;
                        map.put((String)list.get(0), newV);
                    }
                    
                }else{
                    String oldV = (String)list.get(1);
                    String newV = getDot(143);
                    newV = newV + " " + oldV;
                    map.put((String)list.get(0), newV);
                }
       
            }
            }
            //迭代输出hashmap
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()){
            String key = (String)iterator.next();
            
            List list = Arrays.asList(map.get(key).split(" "));
            
            if(list.size()==101){
                
                out.write(key+" "+map.get(key)+" "+getDot(788)+"\r\n"); // \r\n即为换行
                
                out.flush(); // 把缓存区内容压入文件
            }
            if(list.size()==143){
                
                out.write(key+" "+map.get(key)+" "+getDot(746)+"\r\n"); // \r\n即为换行
                
                out.flush(); // 把缓存区内容压入文件
            }
            if(list.size()!=143 && list.size()!=101){
                
                out.write(key+" "+map.get(key)+"\r\n"); // \r\n即为换行
                
                out.flush(); // 把缓存区内容压入文件
            }
            
        }

           
        }
}