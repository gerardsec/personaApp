package sample;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "persona", schema = "ggs", catalog = "")
public class PersonaEntity {
    private Integer personaCl;
    private String nombre;
    private Date nacimiento;
    private String telefono;
    private String domicilio;
    private String correo;
    private Integer altura;
    private Double peso;
    private String notas;

    @Id
    @Column(name = "persona_cl", nullable = false)
    public Integer getPersonaCl() {
        return personaCl;
    }

    public void setPersonaCl(Integer personaCl) {
        this.personaCl = personaCl;
    }

    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "nacimiento", nullable = true)
    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Basic
    @Column(name = "telefono", nullable = true, length = 45)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "domicilio", nullable = true, length = 45)
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Basic
    @Column(name = "correo", nullable = true, length = 45)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "altura", nullable = true)
    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Basic
    @Column(name = "peso", nullable = true, precision = 0)
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Basic
    @Column(name = "notas", nullable = true, length = 45)
    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonaEntity that = (PersonaEntity) o;

        if (personaCl != null ? !personaCl.equals(that.personaCl) : that.personaCl != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (nacimiento != null ? !nacimiento.equals(that.nacimiento) : that.nacimiento != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (domicilio != null ? !domicilio.equals(that.domicilio) : that.domicilio != null) return false;
        if (correo != null ? !correo.equals(that.correo) : that.correo != null) return false;
        if (altura != null ? !altura.equals(that.altura) : that.altura != null) return false;
        if (peso != null ? !peso.equals(that.peso) : that.peso != null) return false;
        if (notas != null ? !notas.equals(that.notas) : that.notas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personaCl != null ? personaCl.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (domicilio != null ? domicilio.hashCode() : 0);
        result = 31 * result + (correo != null ? correo.hashCode() : 0);
        result = 31 * result + (altura != null ? altura.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        result = 31 * result + (notas != null ? notas.hashCode() : 0);
        return result;
    }
}
