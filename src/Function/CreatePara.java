package Function;
//import utils.IOUtils;

import pgl.infra.utils.IOUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * @author Yafei Guo
 * @create 2020-07-06 2:27 PM
 */
public class CreatePara {
    public static void Para1(int chr[], String infileS, String outfileS, String outDir){
        try {
            BufferedWriter bw = null;
            String temp = "";
            int chrA[] = chr;

                for(int i = 0; i < chrA.length;i++ ){
                    BufferedReader br = IOUtils.getTextReader(infileS);
                    int line = 1;
                    bw = IOUtils.getTextWriter(outDir+"/"+outfileS + chrA[i]+"_parameters.txt");
                    while((temp = br.readLine())!=null){
                        if(line==14){
                            bw.write("/data1/home/xinyue/ref/byChr/chr0"+chrA[i]+".fa.gz");
//                            bw.write("/data1/home/yafei/test/test/ZNTaxaBam.txt");
                            bw.newLine();
                        }else if(line==44){
                            bw.write(Integer.toString(chrA[i]));
//                            bw.write("/data1/home/yafei/test/test/Vmap1_posAllele/chr"+chrA[i]+"_posAllele.txt");
                            bw.newLine();
                        }
                        else if(line==50){
                            bw.write("/data2/xinyue/vmap3/ing/chr0"+chrA[i]);
                            bw.newLine();
                        }
                        else{
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
    public static void Para2(int chr[], String infileS, String outfileS, String outDir){
        try {
            BufferedWriter bw = null;
            String temp = "";
            int chrA[] = chr;

            for(int i = 0; i < chrA.length;i++ ){
                BufferedReader br = IOUtils.getTextReader(infileS);
                int line = 1;
                bw = IOUtils.getTextWriter(outDir+"/"+outfileS + chrA[i]+"_parameters.txt");
                while((temp = br.readLine())!=null){
                    if(line==14){
                        bw.write("/data1/home/xinyue/ref/byChr/chr0"+chrA[i]+".fa.gz");
//                            bw.write("/data1/home/yafei/test/test/ZNTaxaBam.txt");
                        bw.newLine();
                    }else if(line==17){
                        bw.write(Integer.toString(chrA[i]));
//                            bw.write("/data1/home/yafei/test/test/Vmap1_posAllele/chr"+chrA[i]+"_posAllele.txt");
                        bw.newLine();
                    }
                    else if(line==26){
                        bw.write("/data2/xinyue/vmap3/ing/chr0"+chrA[i]);
                        bw.newLine();
                    }
                    else{
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
