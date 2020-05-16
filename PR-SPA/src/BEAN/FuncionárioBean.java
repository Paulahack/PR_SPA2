
package BEAN;


public class FuncionárioBean {
   private String Nome;
   private int Numero_de_Identificação;
    private String Área;
   private String CNPJ;
    private float Salário;
    
    public void setNome(String nome){
         this.Nome = nome;
     }            
     public String getNome(){
         return this.Nome;
     }
     public void setNumero_de_Identificação(int num){
         this.Numero_de_Identificação = num;
     }            
     public int getNumero_de_Identificação(){
         return this.Numero_de_Identificação;
         
     }
     public void setÁrea(String área){
         this.Área = área;
     }            
     public String getÁrea(){
         return this.Área;
         
     }
     public void setCNPJ(String cnpj){
         this.CNPJ = cnpj;
     }            
     public String getCNPJ(){
         return this.CNPJ;
         
     }
     public void setSalário(float salário){
         this.Salário = salário;
     }            
     public float getSalário(){
         return this.Salário;
     }
}

