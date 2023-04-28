package com.example.demo.services;

import com.example.demo.models.Stock;
import com.example.demo.repositories.IStockRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockService {

    @Autowired
    IStockRepository stockRepo;

    //custom finder
    public List<Stock> getStocksByType(String stockType) {

        return stockRepo.findByStockType(stockType);
    }

    //implicit methods in crudRepo
    public String addStocks(List<Stock> stockList) {

         Iterable<Stock> list = stockRepo.saveAll(stockList);
         if(list!=null)
         {
             return "Added list of Stocks.....!!!";
         }
         else
         {
             return "Could not added..!!!";
         }
    }

    public List<Stock> getStocksAbovePriceAndLowerDate(Double price, String date) {

        LocalDateTime myDate = LocalDateTime.parse(date);
        return stockRepo.findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(price, myDate);
    }

    public List<Stock> getAllStocksAboveMarketCap(Double capPercentage) {
        return stockRepo.getAllStocksAboveMarketCap(capPercentage);
    }

    @Transactional
    public void updateMarketCap(Double marketCap, Integer id) {
        stockRepo.updateMarketCapById(marketCap,id);
    }

    @Transactional
    public void deleteStocksBasedOnCount(Integer count) {
        stockRepo.deleteStocksBasedOnCount(count);
    }
}
