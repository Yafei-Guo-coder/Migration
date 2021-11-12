package Main;

import pgl.app.hapScanner.HapScanner;
import pgl.infra.utils.IOUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static Function.CreatePara.*;
import static Function.HaploType.getHaplo;

/**
 * @author Yafei Guo
 * @create 2020-12-24 9:05 PM
 */
public class Start {
    public static void main(String[] args) throws IOException {
        String[] str = new String[42];
        String temp = null;
        BufferedReader lib = IOUtils.getTextReader("/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/lib_3.1.txt");
        for (int i = 0; i < 42; i++) {
            str[i] = lib.readLine();
        }
        int chrABD[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42};
//        int chrAB[] = {1,2,3,4,7,8,9,10,13,14,15,16,19,20,21,22,25,26,27,28,31,32,33,34,37,38,39,40};
//        int chrD[] = {5,6,11,12,17,18,23,24,29,30,35,36,41,42};


//        Para1(chrAB,"/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/测试数据/fastCall/inputfile/Fastcall2_1_parameters.txt","/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/para1/","AB_taxaBamMap.txt");
//        Para2(chrAB,"/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/测试数据/fastCall/inputfile/Fastcall2_2_parameters.txt","/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/para2/");
//        Para3(chrAB,str,"/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/测试数据/fastCall/inputfile/Fastcall2_3_parameters.txt","/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/para3/","AB_taxaBamMap.txt");
//        Para1(chrD,"/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/para1/1_parameters.txt","/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/para1/","D_taxaBamMap.txt");
//        Para2(chrD,"/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/para2/1_parameters.txt","/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/para2/");
        Para3(chrABD,str,"/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/测试数据/fastCall/inputfile/Fastcall2_3_parameters.txt","/Users/guoyafei/Documents/02_VmapIII/03_Fastcall2/para3/","D_taxaBamMap.txt");

//
//            List<File> Dirlist = IOUtils.getFileListInDir("/Users/guoyafei/Documents/01_Migration/02_Environment/02_XP-CLR/Gene/V5/VCF");
//
//            for (int j = 0; j < Dirlist.size(); j++) {
//
//                getHaplo(Dirlist.get(j).getAbsolutePath(),Dirlist.get(j).getAbsolutePath().replace("vcf","txt"));
//            }

//        getHaplo("/Users/guoyafei/Documents/02_VmapIII/04_Statistics/Q.recode.vcf","/Users/guoyafei/Documents/02_VmapIII/04_Statistics/Q.recode.txt");
//        getHaplo("/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/01_VCF/geneA_mac.vcf","/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/02_haplo/geneA_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/01_VCF/geneB_mac.vcf","/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/02_haplo/geneB_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/01_VCF/geneD_mac.vcf","/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/02_haplo/geneD_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.vcf","/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.txt");
//        HapScanner hapScanner=new HapScanner("/Users/guoyafei/IdeaProjects/PlantGenetics/TIGER/src/pgl/app/hapScanner/parameters_hapScanner.txt");

    }
}