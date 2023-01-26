/**
 * @author Thi
 * @created 26/01/2023 - 07:57
 * @project ExercicioMod7
 */
public class FichaTecnica {

    public static void main(String args[]) {

    Carro carro = new Carro();
    carro.setModelo("Nissan March");
    carro.setDirecao("Elétrica");
    carro.setAirbags("Sim");
    carro.setAltura(1528);
    carro.setAno(2016);
    carro.setCambio("Manual");
    carro.setClassificacao("Hatch");
    carro.setCombustivel("Flex");
    carro.setComprimento(3827);
    carro.setConsumoCidade(8.5);
    carro.setConsumoEstrada(9.9);
    carro.setControleDeTracao("Não");
    carro.setEntreEixos(2450);
    carro.setFreiosAbs("Sim");
    carro.setLargura(1675);
    carro.setMotorizacao(1.6);
    carro.setMultimidia("Somente rádio");
    carro.setOcupantes(5);
    carro.setPeso(982);
    carro.setPneus("185/55 R16");
    carro.setPortaMalas(265);
    carro.setPorte("Compacto");
    carro.setPotencia(111);
    carro.setTorque(15.1);
    carro.setTracao("Dianteira");
    carro.setVelocidadeMaxima(182);
    carro.setVolumeTanque(41);
    carro.setZeroCem(9.5);

    System.out.println("\n***** PROGRAMA DE FICHA TÉCNICA *****\n");
    System.out.printf("%s%s%s%.1f\n", "Modelo: ", carro.getModelo()," ", carro.getMotorizacao());
    System.out.printf("%s%s\n", "Câmbio: ", carro.getCambio());
    System.out.printf("%s%s\n", "Classificação: ", carro.getClassificacao());
    System.out.printf("%s%s\n", "Porte: ", carro.getPorte());
    System.out.printf("%s%s\n", "Airbags: ", carro.getAirbags());
    System.out.printf("%s%s\n", "Ocupantes: ", carro.getOcupantes());
    System.out.printf("%s%s\n", "Tração: ", carro.getTracao());
    System.out.printf("%s%s\n", "Freios ABS: ", carro.getFreiosAbs());
    System.out.printf("%s%s\n", "Direção: ", carro.getDirecao());
    System.out.printf("%s%s\n", "Controle de tração: ", carro.getControleDeTracao());
    System.out.printf("%s%d%s\n", "Porta-malas: ", carro.getPortaMalas()," litros");
    System.out.printf("%s%s\n", "Multimídia: ", carro.getMultimidia());
    System.out.printf("%s%s\n", "Pneus: ", carro.getPneus());
    System.out.printf("%s%d%s\n", "Potencia: ", carro.getPotencia(), "cv");
    System.out.printf("%s%d%s\n", "Velocidade Máxima: ", carro.getVelocidadeMaxima(), " km/h");
    System.out.printf("%s%.1f%s\n", "Torque: ",carro.getTorque()," kgf");
    System.out.printf("%s%.1f%s\n", "Zero a cem: ",carro.getZeroCem(), " segundos");
    System.out.println("\n***** DIMENSÕES *****\n");
    System.out.printf("%s%.1f%s\n", "Peso: ",carro.getPeso(),"mm");
    System.out.printf("%s%.1f%s\n", "Altura: ",carro.getAltura(),"mm");
    System.out.printf("%s%.1f%s\n", "Comprimento: ",carro.getComprimento(),"mm");
    System.out.printf("%s%.1f%s\n", "Largura: ",carro.getLargura(),"mm");
    System.out.printf("%s%.1f%s\n", "Entre-eixos: ",carro.getEntreEixos(),"mm");
    System.out.println("\n***** ECONOMIA *****\n");
    System.out.printf("%s%.1f%s\n", "Urbano: ",carro.getConsumoCidade(), " Km/L");
    System.out.printf("%s%.1f%s\n", "Rodoviário: ",carro.getConsumoEstrada(), " Km/L");
    System.out.printf("%s%d%s\n", "Tanque de Combustível: ",carro.getVolumeTanque(), " Km/L");

    }
}
