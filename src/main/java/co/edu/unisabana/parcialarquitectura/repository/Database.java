package co.edu.unisabana.parcialarquitectura.repository;

import co.edu.unisabana.parcialarquitectura.Conexion;

public class Database implements Conexion {
  public int savePurchase(int buyerCode, String item) {
    if (buyerCode == 0 || item == null || item.isEmpty()) {
      return 0;
    }
    return 1;
  }

  @Override
  public void getData() {
  }

  @Override
  public void setData() {
  }
}
