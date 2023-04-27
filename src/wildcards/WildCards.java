package wildcards;

import java.util.ArrayList;
import java.util.List;

class SuperClass
{
    public static void tester(List<? extends SuperClass> lista)// ? - znak wieloznaczności
    {
        // ? - znak wieloznaczności
        // ? extends JakaśKlasa - znak wielosnaczności ograniczony klasą
        // tzw bounded wildcard
    }
}

class SubClass extends SuperClass
{
    
}

public class WildCards 
{
    public static void main(String[] args) 
    {
        /**
         * Mówię,że pdkładam za "E" : "String" we wszystkich deklaracjach/
         * definicjach metod
         * Lista Stringów
         */
        List<String> listaStringow = new ArrayList<String>();
        
        List<SuperClass> listaClass = new ArrayList<SuperClass>();
        List<SubClass> listaSubClass = new ArrayList<SubClass>();
        listaClass.add(new SuperClass());
        listaClass.add(new SubClass());
        
        SuperClass.tester(listaClass);
        
        /*
        Przykład złego wykorzystania typu generycznego
        ArrayList<String> listaS = new ArrayList<String>();
        ArrayList<Object> listaO = listaS;
        
        listaO.add(new Integer(4));
        String a = (String) listaO.get(0);
        */
    }
    
}
