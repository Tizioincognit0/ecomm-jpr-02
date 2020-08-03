package com.ai.ecom02.controller;

import com.ai.ecom02.model.Colore;
import com.ai.ecom02.service.impl.ServiceColore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ControllerAnagrafiche {

    @Autowired
    ServiceColore srvColore;

    @RequestMapping(value = ("/Colori"))
    @ResponseBody
    public List<Colore> colori() {
        return srvColore.getAll();
    }

}