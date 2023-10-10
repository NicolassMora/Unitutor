import java.util.*;
public class  EjemploSet {
    public static void main(String[] args) {
        /** Conjunto de asignaturas de la carrera */
        Set<Asignatura> s1 = new HashSet<Asignatura>();
        s1.add(new Asignatura("programacion 2"));
        s1.add(new Asignatura("base de datos 2"));
        System.out.println(s1);

        /** Ejemplo map */
        Map<Integer, String> m1 = new HashMap<Integer, String>();
        Map<String, Integer>m2 = new HashMap<String, Integer>();
        /** Mapa que asocia alumnos con las asignaturas que tienen inscritas actualmente */
        Map<Persona, List<Asignatura>>m3 = new HashMap<Persona, List<Asignatura>>();
        Persona p1 = new Persona("Juanito");
        Asignatura a1 = new Asignatura("Progra2");
        m3.put(p1, new ArrayList<Asignatura>());
        m3.get(p1).add(a1);
        Asignatura a2 = new Asignatura("Calculo");
        m3.get(p1).add(a2);
        System.out.println(m3);

    }
}
