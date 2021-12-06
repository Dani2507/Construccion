package modelo;

public class ComandoPalabras {
    private static final String[] COMANDOS_VALIDOS = {
        "go", "quit", "help"
    };
    
    public ComandoPalabras() {
        
    }
    
    public boolean esComando(String comando)
    {
        for(int i = 0; i < COMANDOS_VALIDOS.length; i++) {
            if(COMANDOS_VALIDOS[i].equals(comando))
                return true;
        }
        return false;
    }
}
