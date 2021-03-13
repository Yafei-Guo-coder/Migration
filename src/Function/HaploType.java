package Function;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author Yafei Guo
 * @create 2020-09-26 10:52 AM
 */
public class HaploType {

    public static void getHaplo(String input, String output) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(new File(input)));
        BufferedWriter wt = new BufferedWriter(new FileWriter(new File(output)));
        String line;
        List<String> listTab;
        while ((line = rd.readLine()) != null ) {
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
}
