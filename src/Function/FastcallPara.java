package Function;

import pgl.infra.utils.IOUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * @author Yafei Guo
 * @create 2020-09-29 10:24 AM
 */
public class FastcallPara {
    public static void main(String[] args) throws IOException {
        getNewTaxafile("/Users/guoyafei/Documents/Lulab/Project-4-VmapIII/para/fastcall.txt");
    }
    private static void getNewTaxafile(String paraPath) throws IOException {
        String paraFile = paraPath;
        for(int i = 1; i < 43;i++ ){
            BufferedReader br = IOUtils.getTextReader(paraFile);
            BufferedWriter bw = IOUtils.getTextWriter("/Users/guoyafei/Documents/Lulab/Project-4-VmapIII/para/chr"+i+"_para.txt");
            int line = 1;
            String temp;
            while((temp = br.readLine())!=null){
                if(line==20){
                    System.out.println(i);
                    bw.write(i+"\n");
                    //bw.newLine();
                }else{
                    System.out.println(temp);
                    bw.write(temp);
                    bw.newLine();
                }
                line++;
            }
            bw.flush();
            bw.close();
            br.close();
        }

    }
}
