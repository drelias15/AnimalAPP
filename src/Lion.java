
public class Lion extends Animal {
    public Lion () {

        System.out.println("A lion is born...");
    }


    @Override
    public String sleep() {
        return "A lion sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A lion eats...";
    }


    public String roar() {

        return "A lion roars...";
    }
}