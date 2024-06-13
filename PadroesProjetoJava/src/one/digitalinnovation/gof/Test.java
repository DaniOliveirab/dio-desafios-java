package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.*;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("SINGLETON");
        System.out.println("-------------------------------------");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("SINGLETON LAZY");
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("SINGLETON EAGER");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("SINGLETON LAZY HOLDER");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        System.out.println("-------------------------------------");
        System.out.println("STRATEGY");
        System.out.println("-------------------------------------");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
    
        System.out.println("-------------------------------------");
        System.out.println("FACADE");
        System.out.println("-------------------------------------");

        Facade facade = new Facade();
        facade.migrarCliente("Danielly", "4489000");
    }
}
