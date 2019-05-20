package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ItemService;

@Controller
public class ItemsController  {

    @Autowired
    private ItemService itemsServiceImpl;
    @RequestMapping(value = "items/findAll.do")
    @ResponseBody
    public Object findAll(){

        return  itemsServiceImpl.findAll();
    }
}
