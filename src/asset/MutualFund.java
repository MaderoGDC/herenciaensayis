/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

/**
 *
 * @author dmadero
 */
public class MutualFund extends ShareAsset {
    
    protected double totalShares;
    
    

    @Override
    public double getMarketValue() {
        return this.totalShares*this.current_price;
    }

    @Override
    public double getProfit() {
        return this.totalShares*this.current_price-this.total_cost;
    }
    
}
