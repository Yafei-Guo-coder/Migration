package Main;

import java.io.IOException;

import static Function.CreateVCF.Tab2vcf;

/**
 * @author Yafei Guo
 * @create 2020-07-11 2:04 PM
 */
public class Start {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i < 43; i++) {
            Tab2vcf("/data1/home/yafei/SNP/WW/chr"+i+".tab","/data1/home/yafei/SNP/WW/WW_site/chr"+i+"_WW.site","/data1/home/yafei/SNP/WW/chr"+i+".convers","/data1/home/yafei/SNP/WW/allWWvcf/chr"+i+".vcf");
        }

//        Tab2vcf("/Users/guoyafei/Desktop/test1/chr40.tab","/Users/guoyafei/Desktop/test1/chr40_WW.site","/Users/guoyafei/Desktop/test1/chr40.convers","/Users/guoyafei/Desktop/test1/output40.txt");

    }
}
