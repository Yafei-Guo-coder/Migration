package Function;
import pgl.infra.utils.IOUtils;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
/**
 * @author Yafei Guo
 * @create 2020-09-26 10:52 AM
 */
public class HaploType {
    public static void getHaplo(String input, String output) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(input));
        BufferedWriter wt = new BufferedWriter(new FileWriter(output));
        String line;
        List<String> listTab;
        while ((line = rd.readLine()) != null ) {
            if (line.startsWith("#")) continue;
            listTab = Arrays.asList(line.split("\t"));
            StringBuilder bf = new StringBuilder();
            for (int i = 9; i < listTab.size(); i++) {
                if(listTab.get(i).startsWith("1/1")){
                    bf.append("2\t");
                }else if(listTab.get(i).startsWith("0/0")){
                    bf.append("0\t");
                }else if(listTab.get(i).startsWith("0/1") | listTab.get(i).startsWith("1/0") ){
                    bf.append("1\t");
                }else if(listTab.get(i).startsWith("./.")){
                    bf.append("-1\t");
                }else{
                    bf.append(listTab.get(i)+"\t");
                }
            }
            wt.write(bf.toString()+"\n");
        }
        rd.close();
        wt.close();
    }
    public static void changeVCF(String input, String output) throws IOException {
        BufferedReader rd = IOUtils.getTextGzipReader(input);
        BufferedWriter wt = new BufferedWriter(new FileWriter(output));
        String line;
        List<String> listTab;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while ((line = rd.readLine()) != null ) {
//            StringBuilder bf = new StringBuilder();
            int count1 = 0;
            int count2 = 0;
            map.put("A", 0);
            map.put("C", 0);
            map.put("G", 0);
            map.put("T", 0);
            if (line.startsWith("#")) continue;
            listTab = Arrays.asList(line.split("\t"));
            String chr = listTab.get(0);
            int pos = Integer.parseInt(listTab.get(1));
            String Ref = listTab.get(3);
            String Alt = listTab.get(4);

            if(Alt =="D" || Alt=="I"){
                continue;
            }
            for (int i = 9; i < listTab.size(); i++) {
                if(listTab.get(i).startsWith("1/1")){
//                    bf.append("2\t");
                    count1 = count1 +2;
                }else if(listTab.get(i).startsWith("0/0")){
//                    bf.append("4\t");
                    count2 = count2 +2;
                }else if(listTab.get(i).startsWith("0/1") | listTab.get(i).startsWith("1/0") ){
//                    bf.append("1\t");
                    count1 = count1 +1;
                    count2 = count2 +1;
                }
            }
            //int sum = count1 + count2;
            map.replace(Ref, count2);
            map.replace(Alt, count1);
            float ratio;
            if(count1>count2){
                ratio = (float) count2 / (count2+count1);
            }else{
                ratio = (float) count1 / (count1+count2);
            }
            if(ratio > 0.01){
                wt.write(chr+"\t"+pos+"\t"+Ref+"\t"+Alt+"\t"+ratio+"\t");
                for (String key: map.keySet()){
                    wt.write(map.get(key)+",");
                }
                wt.newLine();
            }
        }
        rd.close();
        wt.close();
    }
}
