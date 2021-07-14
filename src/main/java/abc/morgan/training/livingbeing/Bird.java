package abc.morgan.training.livingbeing;

public class Bird implements LivingBeing{
    @Override
    public String breath() {
        return "I breath from my beak";
    }

    @Override
    public String walk() {
        return "I dont walk , I fly";
    }

    @Override
    public String eat() {
        return "I eat insects";
    }
}
