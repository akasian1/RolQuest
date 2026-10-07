package db.model.service;

import db.model.dao.PersonajeDAO;
import db.model.entity.Personaje;

import static db.model.service.GenericConstants.ERROR_PARAM_NULL;

public class PersonajeService extends GenericServiceImpl<Personaje,Integer> {
    public PersonajeService() {
        super(new PersonajeDAO());
    }

    @Override
    public int create(Personaje p) {
        if (p.getFichaDetalle() == null) {
            logger.error("No se puede crear Personaje sin Ficha Detalle");
            return ERROR_PARAM_NULL;
        }
        return super.create(p);
    }

}
