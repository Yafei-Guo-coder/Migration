/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;
import java.io.*;
import java.util.*;

/**
 *
 * @author guoyafei
 */
public class CreateVCF {
    public static void Tab2vcf(String inputTab,String inputSite, String inputConvers, String outputVcf) throws IOException {
        BufferedReader readerTab = new BufferedReader(new FileReader(new File(inputTab)));
        BufferedReader readerSite = new BufferedReader(new FileReader(new File(inputSite)));
        BufferedReader readerConvers = new BufferedReader(new FileReader(new File(inputConvers)));
	    BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputVcf)));
	    writer.write("##fileformat=VCFv4.1\n" +
                "##FORMAT=<ID=GT,Number=1,Type=String,Description=\"Genotype\">\n" +
                "##FORMAT=<ID=AD,Number=.,Type=Integer,Description=\"Allelic depths for the reference and alternate alleles in the order listed\">\n" +
                "##FORMAT=<ID=GL,Number=.,Type=Integer,Description=\"Genotype likelihoods for 0/0, 0/1, 1/1, or  0/0, 0/1, 0/2, 1/1, 1/2, 2/2 if 2 alt alleles\">\n" +
                "##INFO=<ID=DP,Number=1,Type=Integer,Description=\"Total Depth\">\n" +
                "##INFO=<ID=NZ,Number=1,Type=Integer,Description=\"Number of taxa with called genotypes\">\n" +
                "##INFO=<ID=AD,Number=.,Type=Integer,Description=\"Total allelelic depths in order listed starting with REF\">\n" +
                "##INFO=<ID=AC,Number=.,Type=Integer,Description=\"Numbers of ALT alleles in order listed\">\n" +
                "##INFO=<ID=GN,Number=.,Type=Integer,Description=\"Number of taxa with genotypes AA,AB,BB or AA,AB,AC,BB,BC,CC if 2 alt alleles\">\n" +
                "##INFO=<ID=HT,Number=1,Type=Integer,Description=\"Number of heterozygotes\">\n" +
                "##INFO=<ID=MAF,Number=1,Type=Float,Description=\"Minor allele frequency\">\n" +
                "##ALT=<ID=DEL,Description=\"Deletion\">\n" +
                "##ALT=<ID=INS,Description=\"Insertion\">\n" +
                "##HapMapVersion=\"3.2.1\"\n");
        String header = readerTab.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append("#CHROM\tPOS\tID\tREF\tALT\tQUAL\tFILTER\tINFO\tFORMAT\t");
        List line = Arrays.asList(header.split("\t",6));
        sb.append(line.get(5));
//        String string = sb.toString();
        writer.write(sb+"\n");

        readerConvers.readLine();

        String lineTab;
        String lineSite;
        String lineConvers;
        while ((lineTab = readerTab.readLine()) != null & (lineSite = readerSite.readLine()) != null & (lineConvers = readerConvers.readLine()) != null) {
            List<String> listTab = Arrays.asList(lineTab.split("\t",6));
            List<String> listSite = Arrays.asList(lineSite.split(" "));
            List<String> listConvers = Arrays.asList(lineConvers.split("\t"));
//            if (listSite.get(1).equals(listConvers.get(4))) {
                List num = Arrays.asList((listTab.get(5)).split("\t"));
                Collections.replaceAll(num, "2", "0/0");
                Collections.replaceAll(num, "1", "0/1");
                Collections.replaceAll(num, "0", "1/1");
                Collections.replaceAll(num, "-1", "./.");
                Collections.replaceAll(num, "-2", "./.");
                List<String> firstLine = Arrays.asList(listConvers.get(2), listConvers.get(3), listConvers.get(2)+"-"+listConvers.get(3),listSite.get(1),listConvers.get(5),".",".",".","GT");
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < firstLine.size(); i++) {
                    sb2.append(firstLine.get(i)+"\t");
                }
                for (int i = 0; i < num.size()-1; i++) {
                    sb2.append(num.get(i)+"\t");
                }
                sb2.append(num.get(num.size()-1));
                writer.write(sb2.toString()+"\n");
//            }

//            if (listSite.get(1).equals( listConvers.get(5))) {
//                List num = Arrays.asList((listTab.get(5)).split("\t"));
//                Collections.replaceAll(num, "2", "1/1");
//                Collections.replaceAll(num, "1", "0/1");
//                Collections.replaceAll(num, "0", "0/0");
//                Collections.replaceAll(num, "-1", "./.");
//                Collections.replaceAll(num, "-2", "./.");
//                List<String> firstLine = Arrays.asList(listConvers.get(2), listConvers.get(3), listConvers.get(2)+"-"+listConvers.get(3),listSite.get(1),listConvers.get(4),".",".",".","GT");
//                StringBuilder sb2 = new StringBuilder();
//                for (int i = 0; i < firstLine.size(); i++) {
//                    sb2.append(firstLine.get(i)+"\t");
//                }
//                for (int i = 0; i < num.size()-1; i++) {
//                    sb2.append(num.get(i)+"\t");
//                }
//                sb2.append(num.get(num.size()-1));
//                writer.write(sb2.toString()+"\n");
//            }

        }
        readerTab.close();
        readerSite.close();
        readerConvers.close();
        writer.close();
	}
}
