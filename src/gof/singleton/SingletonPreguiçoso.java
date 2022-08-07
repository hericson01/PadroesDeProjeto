package gof.singleton;

public class SingletonPreguiçoso {
    private static SingletonPreguiçoso instancia;

    private SingletonPreguiçoso() {
        super();
    }

    public static SingletonPreguiçoso getInstancia() {
        if (instancia == null) {
            instancia = new SingletonPreguiçoso();
        }
        return instancia;
    }
}
