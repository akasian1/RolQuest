package db.model.service;

import db.model.dao.MisionDAO;
import db.model.entity.Mision;

public class MisionService extends GenericServiceImpl<Mision,Integer> {
    public MisionService() {
        super(new MisionDAO());
    }
}
