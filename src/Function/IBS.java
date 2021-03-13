package Function;

import pgl.infra.dna.genot.GenoIOFormat;
import pgl.infra.dna.genot.GenotypeGrid;
import pgl.infra.dna.genot.GenotypeOperation;
import pgl.infra.dna.genot.summa.SumTaxaDivergence;
import pgl.infra.utils.IOFileFormat;
import pgl.infra.utils.IOUtils;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yafei Guo
 * @create 2020-07-29 7:50 PM
 */
public class IBS {
    public static void getNum(String infile, String Outfile) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(Outfile)));
        GenotypeGrid g1 = new GenotypeGrid(infile, GenoIOFormat.VCF);
        List<String> taxa = Arrays.asList(g1.getTaxaNames());
        for (int i = 0; i < taxa.size() ; i++) {
            bw.write(taxa.get(i) +"\t"+ g1.getMissingNumberByTaxon(i) +"\t"+ g1.getHeterozygoteNumberByTaxon(i) +"\t"+ g1.getHomozygoteNumberByTaxon(i) +"\n");
        }
        bw.close();
    }
    public static void get_Homozygous_alternative_Num(String infile, String Outfile, int num) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(Outfile)));
        BufferedReader br = IOUtils.getTextGzipReader(infile);
        GenotypeGrid g1 = new GenotypeGrid(infile, GenoIOFormat.VCF);
        List<String> taxa = Arrays.asList(g1.getTaxaNames());
        int[] myArray = new int[num];
        String line;
        for (int i = 0; i < 22; i++) {
            br.readLine();
        }
        while ((line = br.readLine()) != null) {
            List<String> list = Arrays.asList(line.split("\t"));
            for (int i = 9; i < list.size(); i++) {
                if(list.get(i).startsWith("1/1")){
                    myArray[i-9] = myArray[i-9]+1;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            bw.write(taxa.get(i) + "\t" + myArray[i] + "\n");
        }
        br.close();
        bw.close();
    }

}
