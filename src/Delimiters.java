import java.util.ArrayList;
public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    // Part (a)
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> sss = new ArrayList<>();

        for (String too : tokens) {
            if (too.equals(openDel) || too.equals(closeDel))
                sss.add(too);
        }
        return sss;
    }

    // Part (b)
    public boolean isBalanced(ArrayList<String> delimiters) {

        int od = 0;
        int cd = 0;

        for (String ddd : delimiters) {
            if (openDel.equals(ddd)) od++;
            else cd++;
        }
        if (od == cd && od >= cd) return true;
        else return false;
    }

    public static void main(String[] args) {

        Delimiters d = new Delimiters("(", ")");
        String[] tokens = { "(", "x", "+", "y", ")", ")", "(", "z", ")" };
        ArrayList<String> list = d.getDelimitersList(tokens);
        System.out.println("Delimiters list: " + list);
        System.out.println("Is balanced: " + d.isBalanced(list));
    }
}
