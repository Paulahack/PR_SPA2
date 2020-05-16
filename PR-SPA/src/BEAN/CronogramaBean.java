
package BEAN;


    public class CronogramaBean {
    private String Cliente;
    private String Data;
    private String Horário;
    private String Serviços;
    private int Quantidade_de_Sessões;
    private float Pagamento_Total;
    private String Forma_de_Pagamento;
            
    public void setCliente(String cliente){
         this.Cliente= cliente;
     }            
     public String getCliente(){
         return this.Cliente;
     }
     public void setData(String data){
         this.Data = data;
     }            
     public String getData(){
         return this.Data;
     }
     public void setHorário(String horas){
         this.Horário = horas;
     }            
     public String getHorário(){
         return this.Horário;
         
     }
     public void setServiços(String serviços){
         this.Serviços= serviços;
     }            
     public String getServiços(){
         return this.Serviços;
     }
     public void setQuantidade_de_Sessões(int quant){
         this.Quantidade_de_Sessões= quant;
     }            
     public int getQuantidade_de_Sessões(){
         return this.Quantidade_de_Sessões;
         
     }
     public void setPagamento_Total(float total){
         this.Pagamento_Total= total;
     }            
     public float getPagamento_Total(){
         return this.Pagamento_Total;
         
     }
    public void setForma_de_Pagamento(String form){
         this.Forma_de_Pagamento= form;
     }            
     public String getForma_de_Pagamento(){
         return this.Forma_de_Pagamento;
     }
    }
