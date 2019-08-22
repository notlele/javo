package ExemploInterface;

public class ExemploInterface {
    public static void main(String[] args) {
        Alimento arroz = new Alimento(10,"Camil 5kg", 13,5);
        Perfume chanel = new Perfume(20,"Chanel nr.5",300,"floral");
        Servico manutencao = new Servico("Manutenção de notebook",150);
        Tributo trib = new Tributo();

        trib.adicionaTributavel(arroz);
        trib.adicionaTributavel(chanel);
        trib.adicionaTributavel(manutencao);
        System.out.println("Total tributo = " + trib.calculaTotalTributo());

        trib.exibeTodos();
        
    }

}
