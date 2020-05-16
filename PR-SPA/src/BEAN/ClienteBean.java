
package BEAN;


public class ClienteBean {
     private String Nome;
     private int Idade;
     private String Endereço;
     private String CPF;
     private String Data_de_Nascimento;
     
     public void setNome(String nome){
         this.Nome = nome;
     }            
     public String getNome(){
         return this.Nome;
     }
      public void setIdade(int idade){
         this.Idade = idade;
     }            
     public int getIdade(){
         return this.Idade;
     }
      public void setEndereço(String endereço){
         this.Endereço = endereço;
     }            
     public String getEndereço(){
         return this.Endereço;
     }
      public void setCPF(String cpf){
         this.CPF = cpf ;
     }            
     public String getCPF(){
         return this.CPF;
     }
      public void setData_de_Nascimento(String data){
         this.Data_de_Nascimento = data;
     }            
     public String getData_de_Nascimento(){
         return this.Data_de_Nascimento;
    
}
     }
