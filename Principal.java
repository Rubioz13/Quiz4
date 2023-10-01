package estudiante;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date fechaNacFabian = new Date(2000, 8, 4);

        Date fechaNacNicolas = new Date(2003, 10, 13);

        estudiante.Estudiante fabian = new estudiante.Estudiante("Fabian", fechaNacFabian);

        estudiante.Estudiante nicolas = new estudiante.Estudiante("Nicolas", fechaNacNicolas);

        System.out.println("Nombre del estudiante: " + fabian.getNombre());

        fabian.setNotadeMateria1(4.0);
        fabian.setNotadeMateria2(4.0);
        fabian.setNotadeMateria3(4.5);

        System.out.println("Nota numero 1 es: " + fabian.getNotadeMateria1());

        System.out.println("Nota numero 2 es: " + fabian.getNotadeMateria2());

        System.out.println("Nota numero 3 es: " + fabian.getNotadeMateria3());

        double promedio = (fabian.getNotadeMateria1() + fabian.getNotadeMateria2() + fabian.getNotadeMateria3()) / 3.0;

        System.out.println("Promedio en esta clase es: " + promedio);



        System.out.println("Nombre del estudiante: " + nicolas.getNombre());

        nicolas.setNotadeMateria1(4.7);
        nicolas.setNotadeMateria2(4.0);
        nicolas.setNotadeMateria3(4.3);

        System.out.println("Nota numero 1 es: " + nicolas.getNotadeMateria1());

        System.out.println("Nota numero 2 es: " + nicolas.getNotadeMateria2());

        System.out.println("Nota numero 3 es: " + nicolas.getNotadeMateria3());

        double promedio2 = (nicolas.getNotadeMateria1() + nicolas.getNotadeMateria2() + nicolas.getNotadeMateria3()) / 3.0;

        System.out.println("Promedio en esta clase es: " + promedio2);
/**
 * estudiante se usa para sacar el contenido de la calse estudiante y asi complementarl con el objeto y el get que se requiere y el double se usa para los promedio ya
 * dan un numero  decimal y si lo tomamos como int pues dara error. fin <3.
 */
    }
}