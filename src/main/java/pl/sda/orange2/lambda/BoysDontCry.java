package pl.sda.orange2.lambda;

//it's functional interface because has one abstract method
//funstional interface, żeby zablokować dodanie drugiej metody, żeby działała lambda

@FunctionalInterface
public interface BoysDontCry {
    void silnoreki();

    //można dodać drugą metodę, ale musi być defaultowa- musi mieć ciało
    //anonimowa nie ma ciała!!

    default void cry() {};
}
