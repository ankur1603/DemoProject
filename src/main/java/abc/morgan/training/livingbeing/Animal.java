package abc.morgan.training.livingbeing;

public class Animal implements LivingBeing{
    @Override
    public String breath() {
        return "Yes I do";
    }

    @Override
    public String walk() {
        return "yes on 4 legs";
    }

    @Override
    public String eat() {
        return "Feed me something";
    }
}
