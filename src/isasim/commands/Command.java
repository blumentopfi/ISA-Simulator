package isasim.commands;

import isasim.main.Processor;

public abstract class Command {
    public abstract void execute(Processor main) ;
    public abstract String getName() ;
    public static int TestInt = 0 ;
    public boolean setFlags   ;
}
