public class teste {
    public static void main(String[] args) {
        //CLIENTE
        Cliente cliente1 = new Cliente();
        cliente1.setCPF("00000000000");
        cliente1.setNome("Gabriel");
        cliente1.setEmail("gabriel@vanz.com");
        cliente1.setEndereco("Paim Filho");
        
        System.out.println("\nClientes");
        System.out.printf("O cliente %s, cujo seu CPF é %s, seu Email é %s, seu endereço %s.\n", 
        cliente1.getNome(),
        cliente1.getCPF(),
        cliente1.getEmail(),
        cliente1.getEndereco());
        

        //PRODUTO
        Produto produto1 = new Produto();
        produto1.setProduto("Chocolate");
        produto1.setCodigo(12345);
        produto1.setPreco(5.99);
        
        System.out.println("\nProdutos");
        System.out.printf("O produto %s, cujo seu codigo %d, com o preco de %s.\n",
        produto1.getProduto(),
        produto1.getCodigo(),
        produto1.getPreco());
    }
}
