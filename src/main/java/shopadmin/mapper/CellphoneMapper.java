package shopadmin.mapper;

import java.util.List;

import shopadmin.model.Cellphone;

public interface CellphoneMapper {

    void create(Cellphone cellphone);

    List<Cellphone> findAll();

}
