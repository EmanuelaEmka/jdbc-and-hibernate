package pl.sda.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {

        BoysDontCry boy = new ChlopakiNiePlacza();
        ChlopakiNiePlacza boy2 = new ChlopakiNiePlacza();
        boy.silnoreki();
        boy2.sing();


        BoysDontCry anonymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoreki:)");
            }
        };

        anonymousClassReference.silnoreki();

        // () parenthesis - arguments list
        // -> arguments, body separator
        // {} parenthesis - method body
        //lambda jest metodą anoniową ale pociąga za sobą definicję klasy
        //jeśli w interfejsie mamy więcej niż jedną metodę - lambda nie działa

        BoysDontCry firstLambda = () -> {};
        BoysDontCry secondLambda = () -> System.out.println("Lambda:)");
        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {
            System.out.println("first");
            System.out.println("second");
        };
    }

}
