package leetcode;

public class MakeTheStringGreat1544 {

    public void MakeTheStringGreat1544() {
        String s = "leEeetcodEe";
        StringBuffer sReturnText = new StringBuffer(s);
        for (int i = 0; i < sReturnText.length() - 1; i++) {
            if (sReturnText.charAt(i) >= 'a' && sReturnText.charAt(i) <= 'z') {
                if (Character.toUpperCase(sReturnText.charAt(i)) == sReturnText.charAt(i + 1)) {
                    sReturnText.delete(i, i + 2);
                    i = - 1;
                }
            } else if (sReturnText.charAt(i) >= 'A' && sReturnText.charAt(i) <= 'Z') {
                if (Character.toLowerCase(sReturnText.charAt(i)) == sReturnText.charAt(i + 1)) {
                    sReturnText.delete(i, i + 2);
                    i = -1;
                }
            }
        }
    }
}
