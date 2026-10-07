package db.model.dao;

import db.model.entity.Partida;

public class PartidaDAO extends GenericDAOImpl<Partida,Integer> {
    public PartidaDAO() {
        super(Partida.class);
    }
}
