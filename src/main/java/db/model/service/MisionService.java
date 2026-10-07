package db.model.service;

import db.model.dao.MisionDAO;
import db.model.entity.Mision;
import db.model.entity.Partida;

public class MisionService extends GenericServiceImpl<Mision,Integer> {
    public MisionService() {
        super(new MisionDAO());
    }

    @Override
    public int create(Mision m) {

        Partida p = m.getPartida();
        if (!p.getMisiones().contains(m)) p.getMisiones().add(m);


        return super.create(m);

    }

}
