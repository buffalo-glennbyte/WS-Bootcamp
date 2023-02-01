class Demo{
    public static void main(String[] args){
        int a = 25;
        Fiets f = new Fiets();
        String woord = "maandag";
        String woord2 = "maandag";
        String woord3 = new String("maandag");
        System.out.println(woord == woord3);
        int mmm = f.fietsen(24);
        Hulp h = new Hulp();
        h.test(a);
        h.test(f);
        System.out.println(a);
        System.out.println(f.prijs);
    }
}

class Hulp{
    void test(int ddd) {
        ddd = 44;
        System.out.println(ddd);
    }
    void test(Fiets fff) {
        fff.prijs = 55;
        System.out.println(fff.prijs);
    }
}

class Fiets{
    int prijs;
    int fietsen(int rrr) {
        int uuu = 15;
        return uuu;
    }
    
}
