package Exercicios6_7;
public class UsaEstoque {

	public static void main(String[] args) {
		

        Estoque estoque1 = new Estoque("impressora jato de tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);


        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        estoque1.precisaRepor();
        estoque2.precisaRepor();
        estoque3.precisaRepor();

        estoque1.mudarNome("Impressora com cartucho");
        estoque1.mudarQtdMinima(10);


        estoque1.mostrar();
        estoque2.mostrar();
        estoque3.mostrar();

    }
		
}

