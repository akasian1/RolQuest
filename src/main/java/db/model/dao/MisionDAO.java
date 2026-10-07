package db.model.dao;

import db.model.entity.Mision;

public class MisionDAO extends GenericDAOImpl<Mision,Integer> {
    public MisionDAO() {
        super(Mision.class);
    }
}
