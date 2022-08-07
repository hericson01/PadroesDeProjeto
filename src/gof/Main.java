package gof;


import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazyHolder;
import gof.singleton.SingletonPreguiçoso;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        // Singleton
        SingletonPreguiçoso lazy = SingletonPreguiçoso.getInstancia();
        System.out.println(lazy);
        lazy = SingletonPreguiçoso.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        
        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Hericson", "7285931");
        
    }
}
