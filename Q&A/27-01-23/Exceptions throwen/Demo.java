
public class Demo {
    public static void main(String[] args){
        new Checkit().go();
    }    
}

class Checkit{
    void go() {
        int a = 15;
        try {
            a = 16;
            throw new Exception();
        }catch(Exception e) {
            a = 17;
            throw new RuntimeException();
        }finally {
            a = 18;
            throw new Error();
        }

    }
}
