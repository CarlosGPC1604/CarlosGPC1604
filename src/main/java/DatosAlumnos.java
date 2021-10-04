import static javax.swing.JOptionPane.showInputDialog;

public class DatosAlumnos {
    Alumno ObjAlumno;

    public DatosAlumnos(){
        this.ObjAlumno = new Alumno();
    }

    public Alumno getObjAlumno() {
        ObjAlumno.setNombre(showInputDialog(ObjAlumno.getMsgNombre()));
        ObjAlumno.setApellidos(showInputDialog(ObjAlumno.getMsgApellidos()));
        ObjAlumno.setNoControl(showInputDialog(ObjAlumno.getMsgNoControl()));
        return ObjAlumno;
    }
}
