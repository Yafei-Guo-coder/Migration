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
    //产生step1的参数文件
    public static void Para1(int chr[], String infileS, String outfileS, String taxaBam){
        try {
            BufferedWriter bw = null;
            String temp = "";
            String taxa = taxaBam;
            int chrA[] = chr;
                for(int i = 0; i < chrA.length;i++ ){
                    BufferedReader br = IOUtils.getTextReader(infileS);
                    int line = 1;
                    bw = IOUtils.getTextWriter(outfileS + chrA[i]+"_parameters.txt");
                    while((temp = br.readLine())!=null){
                        if(line==14){
//                            bw.write(Integer.toString(chrA[i]));
                            bw.write("/data2/yafei/004_Vmap3/Fastcall2/01_Input/01_RefbyChr/chr0"+chrA[i]+".fa.gz");
//                            bw.write("/data1/home/yafei/test/test/ZNTaxaBam.txt");
                            bw.newLine();
                        }else if(line==17){
//                            bw.write(Integer.toString(chrA[i]));
                            bw.write("/data2/yafei/004_Vmap3/Fastcall2/01_Input/03_taxaBamMap/"+taxa);
                            bw.newLine();
                        }else if(line==44){
                           bw.write(Integer.toString(chrA[i]));
//                            bw.write("/data2/yafei/Hapscanner/chr0"+chrA[i]+"_posAllele.txt");
                            bw.newLine();
                        }else if(line==50){
                            bw.write("/data2/yafei/004_Vmap3/Fastcall2/02_Output/ing/chr"+chrA[i]);
                            bw.newLine();
                        }else if(line==53){
                            bw.write("/data1/home/yafei/008_Software/anaconda3/bin/samtools");
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
    //产生step3的参数文件
    public static void Para3(int chr[], String str[], String infileS, String outfileS, String taxaBam){
        try {
            BufferedWriter bw = null;
            String temp = "";
            String taxa = taxaBam;
            int chrA[] = chr;
            String s[] = str;
            for(int i = 0; i < chrA.length;i++ ){
                BufferedReader br = IOUtils.getTextReader(infileS);
                int line = 1;
                bw = IOUtils.getTextWriter(outfileS + chrA[i]+"_parameters.txt");
                while((temp = br.readLine())!=null){
                    if(line==14){
                        bw.write("/data2/yafei/004_Vmap3/Fastcall2/01_Input/01_RefbyChr/chr0"+chrA[i]+".fa.gz");
//                            bw.write("/data1/home/yafei/test/test/ZNTaxaBam.txt");
                        bw.newLine();
                    }else if(line==17){
//                            bw.write(Integer.toString(chrA[i]));
                        bw.write("/data2/yafei/004_Vmap3/Fastcall2/01_Input/03_taxaBamMap/"+taxa);
                        bw.newLine();
                    }else if(line==20){
//                        bw.write(Integer.toString(chrA[i]));
                            bw.write("/data2/yafei/004_Vmap3/Fastcall2/02_Output/Lib2/"+s[i]);
                        bw.newLine();
                    }else if(line==23){
                        bw.write(Integer.toString(chrA[i]));
//                            bw.write("/data1/home/yafei/test/test/Vmap1_posAllele/chr"+chrA[i]+"_posAllele.txt");
                        bw.newLine();
                    }
                    else if(line==29){
                        bw.write("/data1/home/yafei/008_Software/anaconda3/bin/samtools");
                        bw.newLine();
                    }else if(line==35){
                        bw.write("/data2/yafei/004_Vmap3/Fastcall2/02_Output/vcf");
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
    //产生step2的参数文件
    public static void Para2(int chr[], String infileS, String outfileS){
        try {
            BufferedWriter bw = null;
            String temp = "";
            int chrA[] = chr;

            for(int i = 0; i < chrA.length;i++ ){
                BufferedReader br = IOUtils.getTextReader(infileS);
                int line = 1;
                bw = IOUtils.getTextWriter(outfileS + chrA[i]+"_parameters.txt");
                while((temp = br.readLine())!=null){
                    if(line==14){
                        bw.write("/data2/yafei/004_Vmap3/Fastcall2/01_Input/01_RefbyChr/chr0"+chrA[i]+".fa.gz");
//                            bw.write("/data1/home/yafei/test/test/ZNTaxaBam.txt");
                        bw.newLine();
                    }else if(line==17){
                        bw.write(Integer.toString(chrA[i]));
//                            bw.write("/data1/home/yafei/test/test/Vmap1_posAllele/chr"+chrA[i]+"_posAllele.txt");
                        bw.newLine();
                    }
                    else if(line==26){
                        bw.write("/data2/yafei/004_Vmap3/Fastcall2/02_Output/ing/chr"+chrA[i]);
                        bw.newLine();
                    }else if(line==29){
                        bw.write("/data2/yafei/004_Vmap3/Fastcall2/02_Output/Lib");
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
