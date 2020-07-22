package com.georgidinov.chucknorrisjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    //== fields ==
    private final ChuckNorrisQuotes chuckNorrisQuotes;


    //== constructors ==
    @Autowired
    public QuoteServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }//end of constructor


    //== public methods ==
    @Override
    public String getRandomQuote() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }//end of method getRandomQuote

}//end of class QuoteService
