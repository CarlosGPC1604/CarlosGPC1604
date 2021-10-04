import static javax.swing.JOptionPane.showMessageDialog;

public class Alumno {
    private String Nombre;
    private String Apellidos;
    private String NoControl;
    
    private final String MsgNombre = "=== Paso de objetos ===\nIntroduce el nombre(s) del alumno;";
    private final String MsgApellidos = "=== Paso de objetos ===\nIntroduce los apellidos del alumno;";
    private final String MsgNoControl = "=== Paso de objetos ===\nIntroduce el número de control del alumno;";
    
    public Alumno(){
        this.Nombre = "Desconocido";
        this.Apellidos = "Desconocido";
        this.NoControl = "Por definir";
    }
    
    public Alumno(String Nombre, String Apellidos, String NoControl) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.NoControl = NoControl;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    public String getMsgNombre() {
        return MsgNombre;
    }

    public String getMsgApellidos() {
        return MsgApellidos;
    }

    public String getMsgNoControl() {
        return MsgNoControl;
    }
    
    public void ImprimirAlumno(Alumno Alumno){
        showMessageDialog(null, Alumno.toString());
    }
    
    @Override
    public String toString() {
        return "=== Alumno ===\n" + "Nombre(s) = " + Nombre + ".\nApellidos = " + Apellidos + ".\nNo. control = " + NoControl + ".";
    }
}
