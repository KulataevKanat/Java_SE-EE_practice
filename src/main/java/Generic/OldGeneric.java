package Generic;

public class OldGeneric {
    private Object val;

    public OldGeneric(Object arg) {
        this.val = arg;
    }

    @Override
    public String toString() {
        return "(" + val + ")";
    }

    public Object getValue() {
        return val;
    }

    public static void main(String[] args) {
        OldGeneric oldGenericString = new OldGeneric("HelloWorld");
        OldGeneric oldGenericInt = new OldGeneric(10);
        Integer iN = (Integer) oldGenericInt.getValue();
        if (oldGenericString.getValue() instanceof Integer) ;
        System.out.println("Its Integer");
        Integer iS = (Integer) oldGenericString.getValue();

        System.out.println(iN);
        System.out.println(iS);
    }
}
