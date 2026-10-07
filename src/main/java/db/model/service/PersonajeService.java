package db.model.service;

import db.model.dao.PersonajeDAO;
import db.model.entity.Personaje;

public class PersonajeService extends GenericServiceImpl<Personaje,Integer> {
    public PersonajeService() {
        super(new PersonajeDAO());
    }
}
