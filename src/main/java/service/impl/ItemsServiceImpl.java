package service.impl;

import mapper.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Items;
import service.ItemService;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemService {
    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> findAll() {
        return itemsMapper.selectByExampleWithBLOBs(null);
    }
}
