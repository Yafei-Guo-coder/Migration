package Function;
//import utils.IOUtils;

import pgl.infra.utils.IOUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * @author Yafei Guo
 * @create 2020-07-06 2:27 PM
 */
public class Para {
    public static void getNewTaxafile(int chr[], String infileS, String outfileS, String outDir){
        try {
            BufferedWriter bw = null;
            String temp = "";
            int chrA[] = chr;

                for(int i = 0; i < chrA.length;i++ ){
                    BufferedReader br = IOUtils.getTextReader(infileS);
                    int line = 1;
                    bw = IOUtils.getTextWriter(outfileS + chrA[i]+"_parameters.txt");
                    while((temp = br.readLine())!=null){
                        if(line==12){
                            bw.write("/data1/home/yafei/test/test/ZNTaxaBam.txt");
                            bw.newLine();
                        }else if(line==17){
                            bw.write("/data1/home/yafei/test/test/Vmap1_posAllele/chr"+chrA[i]+"_posAllele.txt");
                            bw.newLine();
                        }
                        else if(line==20){
                            bw.write("/data1/home/yafei/test/test/Vmap1_pos/chr"+chrA[i]+"_pos.txt");
                            bw.newLine();
                        }
                        else if(line==23){
                            bw.write(Integer.toString(chrA[i]));
                            bw.newLine();
                        }else if(line==29){
                            bw.write("/data1/home/yafei/Software/anaconda3/bin/samtools");
                            bw.newLine();
                        }else if(line==32){
                            bw.write("16");
                            bw.newLine();
                        }else if(line==35){
                            bw.write(outDir);
                            bw.newLine();
                        }else{
                            bw.write(temp);
                            bw.newLine();
                        }
                        line++;
                    }
                    bw.flush();
                    bw.close();
                    br.close();
                }
//            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
