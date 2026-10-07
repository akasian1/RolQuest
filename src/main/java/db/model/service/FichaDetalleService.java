package db.model.service;

import db.model.dao.FichaDetalleDAO;
import db.model.entity.FichaDetalle;

public class FichaDetalleService extends GenericServiceImpl<FichaDetalle,Integer> {
    public FichaDetalleService() {
        super(new FichaDetalleDAO());
    }


}
