package db.model.service;

import db.model.dao.PartidaDAO;
import db.model.entity.Partida;

public class PartidaService extends GenericServiceImpl<Partida,Integer> {
    public PartidaService() {
        super(new PartidaDAO());
    }
}
