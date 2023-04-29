package com.example.demo.repositories;

import com.example.demo.models.Stock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IStockRepository extends CrudRepository<Stock,Integer> {


     List<Stock> findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(Double price, LocalDateTime date);

     List<Stock> findBy();

    //custom queries : native

    //basic select :

    @Query(value = "select * from STOCK where STOCK_MARKET_CAP > :capPercentage" , nativeQuery = true)
     List<Stock> getAllStocksAboveMarketCap(Double capPercentage);

    //update using custom query

    @Modifying
    @Query(value = "update STOCK set STOCK_MARKET_CAP = :capPercentage where Stock_id = :id" , nativeQuery = true)
     void updateMarketCapById(Double capPercentage, Integer id);

    @Modifying
    @Query(value = "Delete from Stock where Stock_owner_count <= :clientCount" , nativeQuery = true)
     void deleteStocksBasedOnCount(Integer clientCount);


    @Modifying
    @Query(value = "update stock set STOCK_TYPE = :myType where Stock_id = :id", nativeQuery = true)
     void modifyStockTypeById( String myType,Integer id);


    @Modifying
    @Query(value = "update stock set stock_id = :stockId, stock_name = :stockName, stock_price= :stockPrice, stock_Birth_Time_Stamp =:stockBirthTimeStamp where stock_id = :id",nativeQuery = true)
    void updateStockById(Integer id, Integer stockId, String stockName, Double stockPrice, LocalDateTime stockBirthTimeStamp);
}
