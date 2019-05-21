package Escola;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
   
    
    public Pessoa(String x, String y, String z){
    setNome(x);
    setEndereco(y);
    setTelefone(z);
        
    }
   
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
 
    public void setNome(String x){
        this.nome = x;
    }
    
    public void setEndereco(String y){
        this.endereco = y;
    }
    
    public void setTelefone(String z){
        this.telefone = z;
    }
   
    
}