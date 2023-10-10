import java.util.*;

public class EjemploColecciones {

    public static void main(String[] args) {

        Collection<String> col1 = new HashSet<String>();
        Collection<String> col2 = Arrays.asList("valor1", "valor2");
        Collection<String> col3 = Collections.singleton("valor3");

        // add() y addAll() devuelven true si cambia la colección.
        // Importa en conjuntos
        if (col1.add("cero"))
            System.out.println ("col1 modificada");
        if (col1.addAll(col2))
            System.out.println ("col1 modificada");

        // Copiamos usando un copy constructor
        Collection<String> copia = new ArrayList<String>(col1);
        col1.remove("cero"); 		// eliminar un elemento
        col1.removeAll(col3); 		// eliminar los elementos en e de c
        col1.retainAll(col2); 		// elimina de c los que no están en d
        col1.clear(); 				// eliminar todos
        boolean b = col1.isEmpty();	// b == true
        int s = col1.size(); 		// s == 0

        // Recuperamos en c la copia
        b = col1.addAll(copia); 	// b == true
        b = col1.contains("cero"); 	// b == true
        b = col1.containsAll(col2);	// b == true;

        // Recorremos col1
        Iterator<String> iterador = col1.iterator();
        while(iterador.hasNext())
            System.out.println(iterador.next());

        for(Iterator<String> i = col1.iterator(); i.hasNext();)
            System.out.println(i.next());

        // Recorremos de col1
        for(String word : col1) System.out.println(word);

        // Las colecciones tienen toString()
        System.out.println(col1);

        // Copia en un Array
        Object[] elementos = col1.toArray();

        // Obtenemos una copia
        String[] cadenas = col1.toArray(new String[col1.size()]);

        //Sin necesidad de saber el tamñao
        cadenas = col1.toArray(new String[0]);
    }
}