package Main;

import pgl.app.hapScanner.HapScanner;

import java.io.IOException;

import static Function.CreatePara.*;
import static Function.HaploType.getHaplo;

/**
 * @author Yafei Guo
 * @create 2020-12-24 9:05 PM
 */
public class Start {
    public static void main(String[] args) throws IOException {
        int chrABD[] = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42};
//        int chrAB[] = {1,2,3,4,7,8,9,10,13,14,15,16,19,20,21,22,25,26,27,28,31,32,33,34,37,38,39,40};
//        int chrD[] = {5,6,11,12,17,18,23,24,29,30,35,36,41,42};
        Para1(chrABD,"/Users/guoyafei/Desktop/para.txt","/Users/guoyafei/Desktop/para");
//        Para2(chrD,"/Users/guoyafei/IdeaProjects/PlantGenetics/Fastcall2_parameters_step2.txt","/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/para2/Fastcall2_");
//        Para3(chrD,"/Users/guoyafei/IdeaProjects/PlantGenetics/Fastcall2_parameters_step3.txt","/Users/guoyafei/Documents/01_个人项目/04_VmapIII/09_Fastcall2/para3/Fastcall2_");


//        getHaplo("/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/01_VCF/geneA_mac.vcf","/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/02_haplo/geneA_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/01_VCF/geneB_mac.vcf","/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/02_haplo/geneB_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/01_VCF/geneD_mac.vcf","/Users/guoyafei/Documents/01_个人项目/05_FuGWAS/06_单倍型分析0419/02_haplo/geneD_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.vcf","/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.txt");
//        HapScanner hapScanner=new HapScanner("/Users/guoyafei/IdeaProjects/PlantGenetics/TIGER/src/pgl/app/hapScanner/parameters_hapScanner.txt");

    }
}