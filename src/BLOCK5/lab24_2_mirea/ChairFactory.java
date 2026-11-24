package BLOCK5.lab24_2_mirea;
public class ChairFactory implements AbstractChairFactory {
    public VictorianChair createVictorianChair() { return new VictorianChair(120); }
    public FunctionalChair createFunctionalChair() { return new FunctionalChair(); }
    public MagicChair createMagicChair() { return new MagicChair(); }
}