package lab1_mrea;
public class ForCycle {
    public static void main(String[] args){
        for(int i = 0;  i< args.length;i++){
            System.out.println("Аргумент" + (i+1) + ": " + args[i]);
        }
    }
}
