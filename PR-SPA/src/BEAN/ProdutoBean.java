
package BEAN;


public class ProdutoBean {
   private String Produto;
   private int Quantidade;
   private float Valor_Unitário;
   private String Marca;
   private String Vendedor;
   
   public void setProduto(String prodt){
         this.Produto = prodt;
     }            
     public String getProduto(){
         return this.Produto;
         
     }
     public void setQuantidade(int quant){
         this.Quantidade = quant;
     }            
     public int getQuantidade(){
         return this.Quantidade;
         
     }
     public void setValor_Unitário(float valor){
         this.Valor_Unitário = valor;
     }            
     public float getValor_Unitário(){
         return this.Valor_Unitário;
         
     }
     public void setMarca(String marca){
         this.Marca = marca;
     }            
     public String getMarca(){
         return this.Marca;
         
     }
     public void setVendedor(String vendedor){
         this.Vendedor = vendedor;
     }            
     public String getVendedor(){
         return this.Vendedor;
         
     }
     
}
