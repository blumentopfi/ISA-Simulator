package isasim.commands;

import isasim.main.Processor;
import isasim.physical.Register;

public abstract class RCommand extends Command {
    public abstract String getName() ;


    public Register getQuelle1() {
        return Quelle1;
    }

    public Register getQuelle2() {
        return Quelle2;
    }

    Register Quelle1 ;
    Register Quelle2 ;
    Register Ziel ;

    public void setValue1(int value1) {
        Value1 = value1;
    }

    int Value1 ;
    public int getValue1(){return Value1;}
    public int getValue2(){return Value2;}
    public Register getZiel(){return Ziel;}
    public void setValue2(int value2) {
        Value2 = value2;
    }

    int Value2 ;
    public RCommand(Register q1 , Register q2, Register z){
        this.Quelle1 = q1 ;
        this.Quelle2 = q2 ;
        this.Ziel = z ;
    }
    public abstract void execute(Processor main) ;
}
