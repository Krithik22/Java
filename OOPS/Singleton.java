public class Singleton {
    private static Singleton instance;
    public int a = 0;
    private Singleton(int a){
        this.a = a;
    }
    public static Singleton getInstance(int a){
        if(instance == null){
            instance = new Singleton(a);
        }
        return instance;
    }
}
