package com.georgidinov.chucknorrisjokeapp.controllers;

import com.georgidinov.chucknorrisjokeapp.services.QuoteService;
import com.georgidinov.chucknorrisjokeapp.util.AttributeNames;
import com.georgidinov.chucknorrisjokeapp.util.Mappings;
import com.georgidinov.chucknorrisjokeapp.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

    //== fields ==
    private final QuoteService quoteService;


    //== constructors ==
    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }//end of constructor


    //== public methods ==
    @GetMapping(Mappings.HOME)
    public String home(Model model) {
        model.addAttribute(AttributeNames.QUOTE, this.quoteService.getRandomQuote());
        return ViewNames.CHUCK_NORRIS_INDEX_PAGE;
    }//end of method home

}//end of class QuoteController
