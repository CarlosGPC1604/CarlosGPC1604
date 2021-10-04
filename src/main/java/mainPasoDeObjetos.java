import static javax.swing.JOptionPane.*;
public class mainPasoDeObjetos {
    public static void main(String[] args) {
        Alumno AlCarlos;

        AlCarlos = new DatosAlumnos().getObjAlumno();
        AlCarlos.ImprimirAlumno(AlCarlos);
    }
}
