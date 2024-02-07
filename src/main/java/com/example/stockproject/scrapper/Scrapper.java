package com.example.stockproject.scrapper;

import com.example.stockproject.model.Company;
import com.example.stockproject.model.ScrapedResult;

public interface Scrapper {

    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrape(Company company);
}
