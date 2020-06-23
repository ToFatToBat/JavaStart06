package zajecia.liczby;

public class NumbersMethod {
    DataInput dataInput = new DataInput();
    int result;


    public int gretest() {
        if (dataInput.a > dataInput.b) {
            if (dataInput.a > dataInput.c) {
                result = dataInput.a;
            } else result = dataInput.c;

        }else if (dataInput.b > dataInput.c){
            result = dataInput.b;

        }else result = dataInput.c;

        return result;
    }
}
