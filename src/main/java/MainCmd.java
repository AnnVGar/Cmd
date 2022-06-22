import impl.CommandFactory;
import core.Core;

public class    MainCmd {
    public static void main(String[] args){
        new Core(new CommandFactory()).StartCmd(args);

    }
}
