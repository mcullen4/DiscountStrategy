/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasourcestrategy;

/**
 *
 * @author Michele
 */
public class DataSourceFactory {
    
    public static DataSource getFakeDatebaseDataSource(){
    DataSource data = new FakeDatabase();
    return data;
    
    }
    
}
