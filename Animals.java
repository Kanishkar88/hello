public class Animals {
    void eats(){
        System.out.println("EATS");
    }
    void walks(){
        System.out.println("WALKS");
    }
}
class Lion {
    void type(){
        System.out.println("CAT");
    }
}
class Tiger extends Animals{

}
class Rossie{
    public static void main(String[] args) {
        Tiger a=new Tiger();
        a.eats();
        a.walks();
    }
}
