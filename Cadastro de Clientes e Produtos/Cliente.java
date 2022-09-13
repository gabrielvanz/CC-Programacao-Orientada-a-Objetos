public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private String endereco;

    //GETTERS//
    //Get CPF do Cliente
    public String getCPF() {
        return this.cpf;
    }

    //Get Nome do Cliente
    public String getNome() {
        return this.nome;
    }

    //Get E-mail do Cliente
    public String getEmail() {
        return this.email;
    }

    //Get Endereço do Cliente
    public String getEndereco() {
        return this.endereco;
    }
    
    //SETTERS//
    //Set CPF do Cliente
    public void setCPF(String cpfVar) {
        this.cpf = cpfVar;
    }
    
    //Set Nome do Cliente
    public void setNome(String nomeVar) {
        this.nome = nomeVar;
    }

    //Set E-mail do Cliente
    public void setEmail(String emailVar) {
        this.email = emailVar;
    }
    
    //Set Endereço do Cliente
    public void setEndereco(String enderecoVar) {
        this.endereco = enderecoVar;
    }


    //Método Construtor
    public Cliente(){
        this("Nome não informado");
    }

    public Cliente(String nome){
        this(nome, "00000000000");
    }

    public Cliente(String nome, String cpf){
        this(nome, cpf, "");
    }

    public Cliente(String nome, String cpf, String email){
        this(nome, cpf, email, "");
    }

    public Cliente(String nome, String cpf, String email, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

}