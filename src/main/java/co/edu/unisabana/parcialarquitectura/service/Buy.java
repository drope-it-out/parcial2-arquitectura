package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.Conexion;
import co.edu.unisabana.parcialarquitectura.repository.Database;

public class Buy implements Conexion {
  private Database database = new Database();
  public Buy(Database database){
    this.database = database;
  }
  public String makePurchase(int vendorCode, int buyerCode, String item) {
    if (buyerCode == vendorCode) {
      throw new IllegalSaleException(vendorCode, buyerCode);
    }
    int result = database.savePurchase(buyerCode, item);
    if (result == 1) {
      return "Product sold";
    } else {
      return "The sale was not possible";
    }
  }
  @Override
  public void getData() {

  }
  @Override
  public void setData() {

  }
}
