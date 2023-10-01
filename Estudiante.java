package estudiante;


import java.util.Date;
import java.time.LocalDate;

public class Estudiante {
    private String nombre;
    private Date fechaNacimiento;
    private double notadeMateria1;
    private double notadeMateria2;
    private double notadeMateria3;

    /**
     *
     * @param nombre,fechaNacimiento en general utilizamos este private en estas dos variables para que asi cualquier otra parte del codigo no
     *                               pueda modificar los valores que le pusimos en un principio
     * @param notadeMateria1,2y3 utilizamos private para lo ya dicho y el double para que este abarque menos utilidad de espacio y reciba enteros y decimales
     *
     */
    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.notadeMateria1 = 0.0;
        this.notadeMateria2 = 0.0;
        this.notadeMateria3 = 0.0;
        /**
         *  definimos las varibales de las notas en 0.0 ya que no hay ninguna nota iniciada
         */
    }

    /**
     *se usa get para complemetar el mensaje que se desea realizar y set para modificar siempre que se pueda la nota y retornamos con el mismo nombre de la variable
     *  para que asi no tome una variable inexistente y vuelva por asi decirlo al inicio sin ningun movimiento.
     */
    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getNotadeMateria1() {
        return notadeMateria1;
    }

    public double getNotadeMateria2() {
        return notadeMateria2;
    }

    public double getNotadeMateria3() {
        return notadeMateria3;
    }

    public void setNotadeMateria1(double notadeMateria1) {
        this.notadeMateria1 = notadeMateria1;
    }

    public void setNotadeMateria2(double notadeMateria2) {
        this.notadeMateria2 = notadeMateria2;
    }

    public void setNotadeMateria3(double notadeMateria3) {
        this.notadeMateria3 = notadeMateria3;
    }
}
