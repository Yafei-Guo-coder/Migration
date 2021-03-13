package Main;

import Function.HaploType;
import pgl.app.fastCall2.FastCall2;

import java.io.IOException;

import static Function.HaploType.getHaplo;
import static Function.Para.getNewTaxafile;

/**
 * @author Yafei Guo
 * @create 2020-12-24 9:05 PM
 */
public class Start {
    public static void main(String[] args) throws IOException {
       getHaplo("/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/VCF/noheader/maf_17_noheader.vcf","/Users/guoyafei/Documents/个人项目/傅老师/20210311/GWAS_sign_gene/HaploType/17_haplo.txt");
//        getHaplo("/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.vcf","/Users/guoyafei/Documents/个人项目/Project-2-Migration/migration/add_ZNdata/Environment/All_noMiss_0.05_2000.txt");
    }
}
