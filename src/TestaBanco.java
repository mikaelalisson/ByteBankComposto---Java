
public class TestaBanco {
	public static void main(String[] args) {
		Cliente mikael = new Cliente();
		mikael.nome = "Mikael Alisson";
		mikael.cpf = "443.712.938-59";
		mikael.profissao = "developer";
		
		Conta contaDoMikael = new Conta();
		contaDoMikael.deposita(100);
		
		// associa o cliente mikael para a conta ContaDoMikael
		contaDoMikael.titular = mikael;
		System.out.println(contaDoMikael.titular.nome);
				
	}

}
