import db.model.entity.FichaDetalle;
import db.model.entity.Mision;
import db.model.entity.Partida;
import db.model.entity.Personaje;
import db.model.enums.ClasePersonaje;
import db.model.enums.Dificultad;
import db.model.enums.Estado;
import db.model.service.FichaDetalleService;
import db.model.service.MisionService;
import db.model.service.PartidaService;
import db.model.service.PersonajeService;

public static void main(String[] args) {
    PersonajeService personajeService = new PersonajeService();
    MisionService misionService = new MisionService();
    PartidaService partidaService = new PartidaService();
    FichaDetalleService fichaDetalleService = new FichaDetalleService();

    // 1. Crear un personaje
    Personaje p = new Personaje();
    p.setNombre("Ayla la Hechicera");
    p.setClase(ClasePersonaje.MAGO);
    p.setNivel(5);
    p.setPuntosVida(80);
    p.setArmaPrincipal("Bastón del Alba");
    int idPersonaje = personajeService.create(p);


    FichaDetalle fD = new FichaDetalle();
    fD.setRaza("Elfa");
    fD.setDescripcion("Elfa Maga");
    fD.setDeidad("D");
    fD.setAlineamiento("A");
    fD.setPersonaje(personajeService.findById(idPersonaje));
    fichaDetalleService.create(fD);


    // 2. Crear una misión
    Mision m = new Mision();
    m.setTitulo("El Bosque de las Sombras");
    m.setDescripcion("Explora las ruinas antiguas y vence a la Sombra del Olvido.");
    m.setDificultad(Dificultad.ALTA);
    m.setRecompensa(500);
    m.setActiva(true);
    misionService.create(m);

    // 3. Crear una partida
    Partida partida = new Partida();
    partida.setNombre("La leyenda de Ayla");
    partida.setNumeroJugadores(4);
    partida.setEstado(Estado.EN_CURSO);
    partidaService.create(partida);

    System.out.println("Datos iniciales añadidos correctamente.");
}
