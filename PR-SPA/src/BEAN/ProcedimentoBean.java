
package BEAN;


public class ProcedimentoBean {
   private String Qual;
   private float Valor;
   private String Funcionário_Responsável;
   private String Produtos_Ultilizados;
   private String Tempo_de_Procedimento;
   
   public void setQual(String qual){
         this.Qual = qual;
     }            
     public String getQual(){
         return this.Qual;
     }
     public void setValor(float valor){
         this.Valor = valor;
     }            
     public float getValor(){
         return this.Valor;
     }
     public void setFuncionário_Responsável(String func){
         this.Funcionário_Responsável = func;
     }            
     public String getFuncionário_Responsável(){
         return this.Funcionário_Responsável;
         
     }
     public void setProdutos_Ultilizados(String prod){
         this.Produtos_Ultilizados = prod;
     }            
     public String getProdutos_Ultilizados(){
         return this.Produtos_Ultilizados;
         
     }
      public void setTempo_de_Procedimento(String tempo){
         this.Tempo_de_Procedimento = tempo;
     }            
     public String getTempo_de_Procedimento(){
         return this.Tempo_de_Procedimento;
     }
    
    
}
