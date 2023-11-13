public class Arithmetic {
    private int first;
    private int second;

    public Arithmetic(){
        first = 0;
        second = 0;
    }

    public Arithmetic(int first, int second){
        this.first = first;
        this.second = second;
    }

    public int sum(){
        return first + second;
    }

    public int comp(){
        return first * second;
    }

    public int min(){
        if(first <= second) return first;
        return second;
    }

    public int max(){
        if(first >= second) return first;
        return second;
    }
}
