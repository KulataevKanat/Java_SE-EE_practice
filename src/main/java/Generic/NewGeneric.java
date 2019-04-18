package Generic;

public class NewGeneric<T> {
    private T val;

    public NewGeneric(T arg) {
        this.val = arg;
    }

    @Override
    public String toString() {
        return "(" + val + ")";
    }

    public T getValue() {
        return val;
    }

    public static void main(String[] args) {
        OldGeneric oldGenericString = new OldGeneric("HelloWorld");
        NewGeneric<Integer> newGenericInt = new NewGeneric<Integer>(10);
        NewGeneric<String> newGenericString = new NewGeneric<String>("HelloWorld");

//        Integer iN = (Integer) oldGenericInt.getValue();

        if (oldGenericString.getValue() instanceof Integer) ;
        System.out.println("Its Integer");
        Integer iS = (Integer) oldGenericString.getValue();

        System.out.println(newGenericInt);
        System.out.println(iS);
        System.out.println(newGenericString);
    }

}
