package Function;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Yafei Guo
 * @create 2020-08-17 3:11 PM
 */
public class Daf {
    public static void getAnces(String inputAnces, String inputVcf, String output) throws IOException {
        BufferedReader readAnces = new BufferedReader(new FileReader(new File(inputAnces)));
        BufferedReader readVcf = new BufferedReader(new FileReader(new File(inputVcf)));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(output)));
        String vcfline;
        String ancesline;
        for (int i = 0; i < 22; i++) {
            readVcf.readLine();
        }
        while ((vcfline = readVcf.readLine()) != null & (ancesline = readAnces.readLine()) != null) {
            List<String> listAnces = Arrays.asList(ancesline.split("\t"));
            List<String> listVcf = Arrays.asList(vcfline.split("\t",10));
            if (listVcf.get(3).equals(listAnces.get(2))) {
                List num = Arrays.asList((listVcf.get(9)).split("\t"));
                StringBuilder Trans = new StringBuilder();
                for (int i = 0; i < num.size(); i++) {
                    List newnum = Arrays.asList((num.get(i).toString().split(":")));
                    Trans.append(newnum.get(0)+"\t");
                }
                writer.write(Trans.toString()+"\n");
            }else if(listVcf.get(4).equals(listAnces.get(2))){
                List num = Arrays.asList((listVcf.get(9)).split("\t"));
                StringBuilder Trans = new StringBuilder();

                for (int i = 0; i < num.size(); i++) {
                    if (num.get(i).toString().startsWith("0/0")) {
                        Trans.append("1/1"+"\t");
                    } else if (num.get(i).toString().startsWith("1/1")) {
                        Trans.append("0/0"+"\t");
                    } else if (num.get(i).toString().startsWith("0/1")){
                        Trans.append("0/1"+"\t");
                    } else{
                        Trans.append("./."+"\t");
                    }
                }
                writer.write(Trans.toString()+"\n");
            }
        }
        writer.flush();
        readAnces.close();
        readVcf.close();
        writer.close();
    }
}
