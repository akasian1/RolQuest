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

    Personaje p = new Personaje();
    p.setNombre("Ayla la Hechicera");
    p.setClase(ClasePersonaje.MAGO);
    p.setNivel(5);
    p.setPuntosVida(80);
    p.setArmaPrincipal("Bastón del Alba");


   FichaDetalle fD = new FichaDetalle();
   fD.setRaza("Elfa");
   fD.setDescripcion("Elfa Maga");
   fD.setDeidad("D");
   fD.setAlineamiento("A");
   fD.setPersonaje(p);

   p.setFichaDetalle(fD);


    Partida partida = new Partida();
    partida.setNombre("La leyenda de Ayla");
    partida.setNumeroJugadores(4);
    partida.setEstado(Estado.EN_CURSO);

    Mision m = new Mision();
    m.setTitulo("El Bosque de las Sombras");
    m.setDescripcion("Explora las ruinas antiguas y vence a la Sombra del Olvido.");
    m.setDificultad(Dificultad.ALTA);
    m.setRecompensa(500);
    m.setActiva(true);
    m.setPartida(partida);
//    misionService.create(m);

    Mision m2 = new Mision();
    m2.setTitulo("La cueva");
    m2.setDescripcion("Explora.");
    m2.setDificultad(Dificultad.BAJA);
    m2.setRecompensa(100);
    m2.setActiva(false);
    m2.setPartida(partida);
//    misionService.create(m2);

    partida.getMisiones().add(m);
    partida.getMisiones().add(m2);
    partidaService.create(partida);

    p.getMisiones().add(m);
    p.getMisiones().add(m2);

    personajeService.create(p);
    fichaDetalleService.create(fD);




    System.out.println("Datos iniciales añadidos correctamente.");
}
