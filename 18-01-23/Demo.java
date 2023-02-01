
class Demo {  
    public static void main(String... args){
        Dier dier = new Vogel();
        
        if(dier instanceof Vogel) {
            Vogel temp = (Vogel)dier;
            System.out.println(temp.snavel);
            System.out.println("ja een vogel");
        }else {
            System.out.println("nee geen vogel");
        }

    }
}
class Dier{
    
}
class Vogel extends Dier{
    int snavel;
}
class Krokodil extends Dier{
    
}
