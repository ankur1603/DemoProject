package abc.morgan.training.livingbeing;

public class HumanBeing implements LivingBeing{
    @Override
    public String breath() {
        return "I breath with my nose";
    }

    @Override
    public String walk() {
        return "I walk on 2 legs";
    }

    @Override
    public String eat() {
        return "I eat junk food";
    }
}
