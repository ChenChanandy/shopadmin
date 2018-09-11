package shopadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.CellphoneMapper;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Service
public class CellphoneServiceImpl implements CellphoneService {
    private CellphoneMapper cellphoneMapper;

    @Autowired
    public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
        this.cellphoneMapper = cellphoneMapper;
    }

    @Override
    public void create(Cellphone cellphone) {
        cellphoneMapper.create(cellphone);
    }

    @Override
    public List<Cellphone> findAll() {
        return cellphoneMapper.findAll();
    }
}
