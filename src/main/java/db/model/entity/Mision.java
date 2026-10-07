package db.model.entity;

import db.model.enums.Dificultad;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Mision")
public class Mision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int misionID;

    @Column(name = "Titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "Descripcion")
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "Dificultad", nullable = false)
    private Dificultad dificultad;

    @Column(name = "Recompensa")
    private int recompensa;

    @Column(name = "Activa", nullable = false)
    private Boolean activa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Partida", nullable = false)
    private Partida partida;

    @ManyToMany(mappedBy = "misiones")
    private List<Personaje> personajes = new ArrayList<>();

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public int getMisionID() {
        return misionID;
    }

    public void setMisionID(int misionID) {
        this.misionID = misionID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}
