
public class RemarkFields {
    @MarkToSave
    private String smallString;
    @MarkToSave
    private String ss;

    private int number;

    public RemarkFields(String smallString, String ss, int number) {
        this.smallString = smallString;
        this.ss = ss;
        this.number = number;
    }

    public String getSmallString() {
        return smallString;
    }

    public String getSs() {
        return ss;
    }

    public int getNumber() {
        return number;
    }

    public void setSmallString(String smallString) {
        this.smallString = smallString;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "RemarkFields{" +
                "smallString='" + smallString + '\'' +
                ", ss='" + ss + '\'' +
                ", number=" + number +
                '}';
    }
}
