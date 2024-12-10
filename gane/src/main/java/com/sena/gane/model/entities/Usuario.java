package com.sena.gane.model.entities;

import com.sena.gane.enums.Roles;
import com.sena.gane.enums.TipoDocumento;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellidos;

    @Column(name = "tipo_documento", nullable = false)
    private TipoDocumento tipoDocumento;

    @Column(name = "numero_documento", nullable = false, unique = true)
    private String nDocumento;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(nullable = false)
    private String contrasenia;

    @Column(nullable = false)
    private Roles role;

    public Usuario() {};

    public Usuario(String nombre, String apellidos, TipoDocumento tipoDocumento, String nDocumento, Date fechaNacimiento, int edad, String correo, String contrasenia, Roles role) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.nDocumento = nDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.role = role;
    }

    //crear getter y setter

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(String nDocumento) {
        this.nDocumento = nDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
