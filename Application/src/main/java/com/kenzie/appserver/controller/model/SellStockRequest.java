package com.kenzie.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.UUID;

public class SellStockRequest {

    @NotEmpty
    @JsonProperty("userId")
    private String userId;

    @NotEmpty
    @JsonProperty("recordId")
    private UUID recordId;

    @JsonProperty("stockSymbol")
    private String stockSymbol;

    @JsonProperty("name")
    private String stockName;

    @JsonProperty("salePrice")
    private double salePrice;

    @JsonProperty("shares")
    private int shares;

    @JsonProperty("sellStockDate")
    private String sellStockDate;


    public SellStockRequest(String userId, UUID recordId, String stockSymbol, String stockName,
                            double salePrice, int shares) {
        this.userId = userId;

        this.recordId = recordId;
        this.stockSymbol = stockSymbol;
        this.stockName = stockName;
        this.salePrice = salePrice;
        this.shares = shares;
        this.sellStockDate = LocalDate.now().toString();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UUID getRecordId() {
        return recordId;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getsalePrice() {
        return salePrice;
    }

    public void setsalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public String getSellStockDate() {
        return sellStockDate;
    }

    public void setSellStockDate(String sellStockDate) {
        this.sellStockDate = sellStockDate;
    }
}
