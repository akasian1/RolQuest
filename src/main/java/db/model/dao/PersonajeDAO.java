package db.model.dao;

import db.model.entity.Personaje;

public class PersonajeDAO extends GenericDAOImpl<Personaje,Integer> {
    public PersonajeDAO() {
        super(Personaje.class);
    }
}
