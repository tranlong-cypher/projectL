public class human {
    
    static void inputvalues( int value ){
        if(value>100){
            throw new ArithmeticException("value>100");
        }
    }
    public static void main(String[] args){
        inputvalues(110);
    }
}
