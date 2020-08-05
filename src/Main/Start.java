package Main;

import Function.Para;

import java.io.IOException;

import static Function.CreateVCF.Tab2vcf;
import static Function.IBS.getNum;
import static Function.IBS.get_Homozygous_alternative_Num;

/**
 * @author Yafei Guo
 * @create 2020-07-11 2:04 PM
 */
public class Start {
    public static void main(String[] args) throws IOException {
//
//        for (int i = 1; i < 43; i++) {
//            Tab2vcf("/data1/home/yafei/SNP/WW/chr"+i+".tab","/data1/home/yafei/SNP/WW/WW_site/chr"+i+"_WW.site","/data1/home/yafei/SNP/WW/chr"+i+".convers","/data1/home/yafei/SNP/WW/outWWvcf_E2/chr"+i+".vcf","/data1/home/yafei/SNP/WW/WWname.txt");

//        Tab2vcf("/Users/guoyafei/Desktop/test1/chr40.tab","/Users/guoyafei/Desktop/test1/chr40_WW.site","/Users/guoyafei/Desktop/test1/chr40.convers","/Users/guoyafei/Desktop/test1/output40.txt");
//    int chrA[] = {1,2,7,8,13,14,19,20,25,26,31,32,37,38};
//    getNewTaxafile("AA_bam.txt", chrA,"/data2/xuebo/Projects/Speciation/More_accessions/hapScan/parameters_hapScanner_001.txt","/data2/xuebo/Projects/Speciation/More_accessions/hapScan/para_file/parameters_hapScannerAA_","AA");
//    int chrB[] = {3,4,9,10,15,16,21,22,27,28,33,34,39,40};
//    getNewTaxafile("SS_bam.txt",chrB,"/data2/xuebo/Projects/Speciation/More_accessions/hapScan/parameters_hapScanner_001.txt","/data2/xuebo/Projects/Speciation/More_accessions/hapScan/para_file/parameters_hapScannerBB_","BB");
//    int chrD[] = {5,6,11,12,17,18,23,24,29,30,35,36,41,42};
//    getNewTaxafile("DD_bam.txt",chrD,"/data2/xuebo/Projects/Speciation/More_accessions/hapScan/parameters_hapScanner_001.txt","/data2/xuebo/Projects/Speciation/More_accessions/hapScan/para_file/parameters_hapScannerDD_","DD");
//    int chrAB[] = {1,2,7,8,13,14,19,20,25,26,31,32,37,38,3,4,9,10,15,16,21,22,27,28,33,34,39,40};
//    getNewTaxafile("AABB_bam.txt",chrAB,"/data2/xuebo/Projects/Speciation/More_accessions/hapScan/parameters_hapScanner_001.txt","/data2/xuebo/Projects/Speciation/More_accessions/hapScan/para_file/parameters_hapScannerAABB_","AABB");
//        int chrABD[] = {1, 2, 7, 8, 13, 14, 19, 20, 25, 26, 31, 32, 37, 38, 3, 4, 9, 10, 15, 16, 21, 22, 27, 28, 33, 34, 39, 40, 5, 6, 11, 12, 17, 18, 23, 24, 29, 30, 35, 36, 41, 42};
//        Para.getNewTaxafile("CS_bam.txt", chrABD, "/data2/xuebo/Projects/Speciation/More_accessions/hapScan/parameters_hapScanner_001.txt", "/data2/xuebo/Projects/Speciation/More_accessions/hapScan/para_file/parameters_hapScannerCS_", "CS");
//        getNum("/data2/yafei/Project3/CS_Vmap/Alineage_withCS.vcf.gz","/data2/yafei/Project3/CS_Vmap/outA.txt");
//        getNum("/data2/yafei/Project3/CS_Vmap/Blineage_withCS.vcf.gz","/data2/yafei/Project3/CS_Vmap/outB.txt");
//        getNum("/data2/yafei/Project3/CS_Vmap/Dlineage_withCS.vcf.gz","/data2/yafei/Project3/CS_Vmap/outD.txt");
        get_Homozygous_alternative_Num("/data1/home/yafei/Project3/Vmap1.1/Alineage.vcf.gz","/data1/home/yafei/Project3/Vmap1.1/Alineage.txt",483);
        get_Homozygous_alternative_Num("/data1/home/yafei/Project3/Vmap1.1/Blineage.vcf.gz","/data1/home/yafei/Project3/Vmap1.1/Blineage.txt",402);
        get_Homozygous_alternative_Num("/data1/home/yafei/Project3/Vmap1.1/Dlineage.vcf.gz","/data1/home/yafei/Project3/Vmap1.1/Dlineage.txt",302);
    }
}
