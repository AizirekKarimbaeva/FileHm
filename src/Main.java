import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("File.txt");
        writer.write(1+": Aa"+"\n"+
        2+": Bb"+"\n"+
        3+": Cc"+"\n"+
        4+": Dd"+"\n"+
        5+": Ee"+"\n"+
        6+": Ff"+"\n"+
        7+": Gg"+"\n"+
        8+": Hh"+"\n"+
        9+": Ii"+"\n"+
        10+": Jj"+"\n"+
        11+": Kk"+"\n"+
        12+": Ll"+"\n"+
        13+": Mm"+"\n"+
        14+": Nn"+"\n"+
        15+": Oo"+"\n"+
        16+": Pp"+"\n"+
        17+": Qq"+"\n"+
        18+": Rr"+"\n"+
        20+": Ss"+"\n"+
        21+": Tt"+"\n"+
        22+": Uu"+"\n"+
        23+": Vv"+"\n"+
        24+": Ww"+"\n"+
        25+": Xx"+"\n"+
        26+": Yy"+"\n"+
        27+": Zz"+"\n");
        writer.write(0+"\n"+
                1+":  "+1+"\n"+
                2+":  "+10+"\n"+
                3+":  "+20+"\n"+
                4+":  "+30+"\n"+
                5+":  "+40+"\n"+
                6+":  "+50+"\n"+
                7+":  "+60+"\n"+
                8+":  "+70+"\n"+
                9+":  "+80+"\n"+
                10+":  "+90+"\n"+
                11+":  "+100+"\n"+
                12+":  "+200+"\n"+
                13+":  "+300+"\n"+
                14+":  "+400+"\n"+
                15+":  "+500+"\n"+
                16+":  "+600+"\n"+
                17+":  "+700+"\n"+
                18+":  "+800+"\n"+
                19+":  "+900+"\n"+
                20+":  "+1000+"\n");
        writer.close();
        FileReader reader = new FileReader("File.txt");
        Scanner sc = new Scanner(reader);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        reader.close();
    }
}