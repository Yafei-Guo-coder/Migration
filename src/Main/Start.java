package Main;

import java.io.IOException;

import static Function.CreatePara.Para1;
import static Function.HaploType.getHaplo;
import static Function.CreatePara.Para2;

/**
 * @author Yafei Guo
 * @create 2020-12-24 9:05 PM
 */
public class Start {
    public static void main(String[] args) throws IOException {

        int chrABD[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42};
//        Para2(chrABD,"/Users/guoyafei/Documents/个人项目/Project-4-VmapIII/para2/parameters_fastcall2_2.txt","Fastcall2_","/Users/guoyafei/Documents/个人项目/Project-4-VmapIII/para2");

//        Para1(chrABD,"/Users/guoyafei/Documents/个人项目/Project-4-VmapIII/para1/parameters_fastcall2_1.txt","Fastcall2_","/Users/guoyafei/Documents/个人项目/Project-4-VmapIII/para1");

        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_17_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/17_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_19_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/19_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_47_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/47_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_48_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/48_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_49_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/49_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_50_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/50_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_51_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/51_haplo.txt");
        getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_52_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/52_haplo.txt");

//        getHaplo("/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.vcf","/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.txt");
    }
}
