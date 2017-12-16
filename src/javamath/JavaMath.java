// PAGINA PRINCIPAL
package javamath;

import javax.swing.JOptionPane;

public class JavaMath {

    public static void main(String[] args) {
        new Menu();
    } //main
} // javamath

class Menu {

    int escolha;
    int menu;

    public Menu() {
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao JavaMath.");

        menu = Integer.parseInt(JOptionPane.showInputDialog("\n"
                + "Digite 1 para Cadastrar e Calcular Figuras Geométricas\n"
                + "Digite 2 para Cadastrar e Calcular Equações do Segundo Grau\n"
                + "Digite 3 para Visualizar Objetos de Classes Especificas\n"
                + "Digite 4 para Visualizar todos os Objetos Polimorfos\n"
                + "Digite 5 para Carregar dados de um Arquivo\n"
                + "Digite 6 para Salvar os dados em um Arquivo\n"
                + "Digite 7 para SAIR"
                + "\nDigite a opção desejada: "));

        switch (menu) {
            case 1: { //Menu de Criação de Figuras Geométricas
                escolha = Integer.parseInt(JOptionPane.showInputDialog("\nDigite 1 para calcular área e perimetro de um CONE\n"
                        + "Digite 2 para calcular área e perimetro de um TRIANGULO\n"
                        + "Digite 3 para calcular área e perimetro de um PARALELEPIPEDO\n"
                        + "Digite 4 para calcular área e perimetro de um CILINDRO\n"
                        + "Digite 5 para SAIR\n"
                        + "\nDigite a opção desejada: "));

                switch (escolha) {
                    case 1: {//Calcula Área e Perimetro de um CONE
                        int raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio: "));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));

                        Cone Con = new Cone(raio, altura);
                        JOptionPane.showMessageDialog(null, Con.toString());
                        break;
                    }
                    case 2: {//Calcula Área e Perimetro de um TRIANGULO
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado a: "));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado b: "));
                        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado c: "));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
                        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));

                        Triangulo Tri = new Triangulo(a, b, c, altura, base);
                        JOptionPane.showMessageDialog(null, Tri.toString());
                        break;
                    }
                    case 3: {//Calcula Área e Perimetro de um PARALELEPIPEDO
                        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
                        int largura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura: "));

                        Paralelepipedo para = new Paralelepipedo(comprimento, altura, largura);
                        JOptionPane.showMessageDialog(null, para.toString());
                        break;
                    }
                    case 4: { //Calcula Área e Perimetro de um CILINDRO
                        int raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio: "));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));

                        Cilindro Cil = new Cilindro(raio, altura);
                        JOptionPane.showMessageDialog(null, Cil.toString());
                        break;
                    }
                    case 5: {
                        System.exit(0);
                        break;
                    }
                    default: //Indica que a opção inserida não é válida
                        JOptionPane.showMessageDialog(null, "A opção inserida não é válida. Tente novamente!\n");
                        break;
                }//fim do escolha
                break;
            }//case1
            case 2: {
                //Calcula as raizes de uma equação do 2º Grau
                int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
                int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));

                EquacaoDoSegundoGrau Eqc2Grau = new EquacaoDoSegundoGrau(a, b, c);
                JOptionPane.showMessageDialog(null, Eqc2Grau.toString());
                break;

            }//case2
            case 3: {
            }
            case 4: {
            }
            case 5: {
            }
            case 6: {
            }
            case 7: {
                System.exit(0);
                break;
            }
            default: //Indica que a opção inserida não é válida
                JOptionPane.showMessageDialog(null, "A opção inserida não é válida. Tente novamente!\n");
                break;
        }
    }//fim do menu
}
