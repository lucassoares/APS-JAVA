package aps.pkg1;

public class APS1 {

    public static void main(String[] args) {

        Carros carro = new Carros();

        carro.setAno(2019);
        carro.setModelo("prisma");
        carro.setCor("cinza");

        String meuCarro = "Carro: " + carro.getModelo() + " " + carro.getCor() + ", ano " + carro.getAno();
        
        System.out.println(meuCarro);

    }
}
