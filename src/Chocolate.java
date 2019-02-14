public class Chocolate extends Food {

    public String eaten(Animal animal) {
        return "animal eats chocolate";
    }

    public String eaten(Dog dog){
        throw new CruelException("Dogs cannot eat chocolate.");
    }

    public String eaten(Cat cat){
        return "cat eats chocolate";
    }
  
}

public static class CruelException extends Exception {
    public CruelException(){}
    
    public CruelException(String str){
        super(str);
    }
}
