package com.heima.controller;

import com.heima.domian.Items;
import com.heima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findDetail")
    public String findDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        //返回到itemDetail.jsp
        return "itemDetail";


    }
}
