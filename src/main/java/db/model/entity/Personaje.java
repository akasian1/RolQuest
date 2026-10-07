package db.model.entity;

import db.model.enums.ClasePersonaje;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Personaje")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personajeID;

    @Column(name = "Nombre", nullable = false, length = 100, unique = true)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "Clase")
    private ClasePersonaje clase;

    @Column(name = "Nivel", nullable = false)
    private int nivel;

    @Column(name = "PuntosVida", nullable = false)
    private int puntosVida;

    @Column(name = "ArmaPrincipal")
    private String armaPrincipal;

    @OneToOne(mappedBy = "personaje")
    private FichaDetalle fichaDetalle;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "Personaje_Mision",
            joinColumns = @JoinColumn(name = "personajeID"),
            inverseJoinColumns = @JoinColumn(name = "misionID")
    )
    private List<Mision> misiones = new ArrayList<>();

    public List<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<Mision> misiones) {
        this.misiones = misiones;
    }

    public FichaDetalle getFichaDetalle() {
        return fichaDetalle;
    }

    public void setFichaDetalle(FichaDetalle fichaDetalle) {
        this.fichaDetalle = fichaDetalle;
    }

    public int getPersonajeID() {
        return personajeID;
    }

    public void setPersonajeID(int personajeID) {
        this.personajeID = personajeID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClasePersonaje getClase() {
        return clase;
    }

    public void setClase(ClasePersonaje clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }
}
