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
public abstract class ShareAsset implements Asset {
    protected String symbol;
    protected double total_cost;
    protected double current_price;
    
    public double getprofit(){
    return 0;
    }
}
