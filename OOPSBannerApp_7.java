public class OOPSBannerApp_6 {

    // Method for O
    static String getO(int row) {
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
        return O[row];
    }

    // Method for P
    static String getP(int row) {
        String[] P = {
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };
        return P[row];
    }

    // Method for S
    static String getS(int row) {
        String[] S = {
                " *****",
                "*     ",
                " *****",
                "     *",
                "***** "
        };
        return S[row];
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            String line = getO(i) + "  " + getO(i) + "  " + getP(i) + "  " + getS(i);
            System.out.println(line);
        }
    }
}