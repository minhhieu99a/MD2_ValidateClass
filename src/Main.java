public class Main {
    private static Class aClass;
    public static final String[] validClass = new String[] { "C1221H" , "C1125I" , "C1554K" };
    public static final String[] invalidClass = new String[] { "D1221H" , "A1221A" , "A153AH" };
    public static void main(String args[]) {
        Class aClass = new Class();
        for (String Aclass : validClass) {
            boolean isvalid = aClass.validate(Aclass);
            System.out.println("Class is " + Aclass +" is valid: "+ isvalid);
        }
        for (String Aclass : invalidClass) {
            boolean isvalid = aClass.validate(Aclass);
            System.out.println("Class is " + Aclass +" is valid: "+ isvalid);
        }
    }
}
