package collectionsImplPropria.pilha;

public class PilhaTeste {
	public static void main(String[] args) {
		Pilha<String> pilhaStrings = new Pilha<String>();
		
		// Inserção
        pilhaStrings.empilhar(1, "Primeiro");
        pilhaStrings.empilhar(2, "Segundo");
        pilhaStrings.empilhar(3, "Terceiro");
        pilhaStrings.empilhar(4, "Quarto");
        pilhaStrings.empilhar(5, "Quinto");
        
        System.out.println(pilhaStrings.toString());
        
        
        // Busca
        System.out.println(pilhaStrings.contem("Segundo"));
        System.out.println(pilhaStrings.getTotalElementos());
        System.out.println(pilhaStrings.buscaNode("Quarto"));
        
     
        // Remoção
        pilhaStrings.desempilhar();
        System.out.println(pilhaStrings.toString());
        
        pilhaStrings.desempilhar();
        System.out.println(pilhaStrings.toString());
        
        pilhaStrings.desempilhar();
        System.out.println(pilhaStrings.toString());
	}
}