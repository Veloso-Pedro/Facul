import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.text.DecimalFormat;

public class CalculadoraDeMediaGUI {
    private static JTextArea resultado;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Média");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        frame.add(painel);
        placeComponents(painel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel painel) {
        painel.setLayout(null);

        JLabel pesoAc1Label = new JLabel("Peso AC1:");
        pesoAc1Label.setBounds(10, 10, 120, 25);
        painel.add(pesoAc1Label);

        JTextField pesoAc1Text = new JTextField(20);
        pesoAc1Text.setBounds(140, 10, 165, 25);
        painel.add(pesoAc1Text);

        JLabel pesoAc2Label = new JLabel("Peso AC2:");
        pesoAc2Label.setBounds(10, 40, 120, 25);
        painel.add(pesoAc2Label);

        JTextField pesoAc2Text = new JTextField(20);
        pesoAc2Text.setBounds(140, 40, 165, 25);
        painel.add(pesoAc2Text);

        JLabel pesoAgLabel = new JLabel("Peso AG:");
        pesoAgLabel.setBounds(10, 70, 120, 25);
        painel.add(pesoAgLabel);

        JTextField pesoAgText = new JTextField(20);
        pesoAgText.setBounds(140, 70, 165, 25);
        painel.add(pesoAgText);

        JLabel pesoAfLabel = new JLabel("Peso AF:");
        pesoAfLabel.setBounds(10, 100, 120, 25);
        painel.add(pesoAfLabel);

        JTextField pesoAfText = new JTextField(20);
        pesoAfText.setBounds(140, 100, 165, 25);
        painel.add(pesoAfText);

        JLabel notaAc1Label = new JLabel("Nota AC1:");
        notaAc1Label.setBounds(10, 140, 120, 25);
        painel.add(notaAc1Label);

        JTextField notaAc1Text = new JTextField(20);
        notaAc1Text.setBounds(140, 140, 165, 25);
        painel.add(notaAc1Text);

        JLabel notaAc2Label = new JLabel("Nota AC2:");
        notaAc2Label.setBounds(10, 170, 120, 25);
        painel.add(notaAc2Label);

        JTextField notaAc2Text = new JTextField(20);
        notaAc2Text.setBounds(140, 170, 165, 25);
        painel.add(notaAc2Text);

        JLabel notaAgLabel = new JLabel("Nota AG:");
        notaAgLabel.setBounds(10, 200, 120, 25);
        painel.add(notaAgLabel);

        JTextField notaAgText = new JTextField(20);
        notaAgText.setBounds(140, 200, 165, 25);
        painel.add(notaAgText);

        JLabel notaAfLabel = new JLabel("Nota AF:");
        notaAfLabel.setBounds(10, 230, 120, 25);
        painel.add(notaAfLabel);

        JTextField notaAfText = new JTextField(20);
        notaAfText.setBounds(140, 230, 165, 25);
        painel.add(notaAfText);

        JLabel notaNmLabel = new JLabel("Nota mínima:");
        notaNmLabel.setBounds(10, 270, 120, 25);
        painel.add(notaNmLabel);

        JTextField notaNmText = new JTextField(20);
        notaNmText.setBounds(140, 270, 165, 25);
        painel.add(notaNmText);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 310, 150, 25);
        painel.add(calcularButton);

        JButton verHistoricoButton = new JButton("Ver Histórico");
        verHistoricoButton.setBounds(170, 310, 150, 25);
        painel.add(verHistoricoButton);

        resultado = new JTextArea();
        resultado.setBounds(10, 350, 460, 180);
        resultado.setLineWrap(true);
        resultado.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(resultado);
        scroll.setBounds(10, 350, 460, 180);
        painel.add(scroll);

        // Ação do botão Calcular
        calcularButton.addActionListener(e -> {
            try {
                double pesoAc1 = Double.parseDouble(pesoAc1Text.getText());
                double pesoAc2 = Double.parseDouble(pesoAc2Text.getText());
                double pesoAg = Double.parseDouble(pesoAgText.getText());
                double pesoAf = Double.parseDouble(pesoAfText.getText());

                double somaPesos = pesoAc1 + pesoAc2 + pesoAg + pesoAf;
                if (somaPesos != 100) {
                    resultado.setText("Erro: A soma dos pesos deve ser exatamente 100.");
                    return;
                }

                double notaAc1 = Double.parseDouble(notaAc1Text.getText());
                double notaAc2 = Double.parseDouble(notaAc2Text.getText());
                double notaAg = Double.parseDouble(notaAgText.getText());
                double notaAf = Double.parseDouble(notaAfText.getText());
                double notaNm = Double.parseDouble(notaNmText.getText());

                if (notaNm < 3) {
                    resultado.setText("Erro: Nota mínima deve ser maior que 3.");
                    return;
                }

                double media = (notaAc1 * (pesoAc1 / 100)) + (notaAc2 * (pesoAc2 / 100)) +
                               (notaAg * (pesoAg / 100)) + (notaAf * (pesoAf / 100));

                DecimalFormat df = new DecimalFormat("0.0");
                StringBuilder saida = new StringBuilder();
                saida.append("Média calculada: ").append(df.format(media)).append("\n");

                if (media < notaNm - 1) {
                    saida.append("Situação: Reprovado\n");
                } else if (media < notaNm) {
                    saida.append("Situação: Recuperação\n");
                } else if (media == 10.0) {
                    saida.append("Situação: Aprovado com Excelência\n");
                } else {
                    saida.append("Situação: Aprovado\n");
                }

                resultado.setText(saida.toString());

                // Gravar no histórico
                gravarHistorico(saida.toString());

            } catch (NumberFormatException ex) {
                resultado.setText("Erro: Verifique se todos os campos estão preenchidos corretamente.");
            }
        });

        // Ação do botão Ver Histórico
        verHistoricoButton.addActionListener(e -> mostrarHistorico());
    }

    private static void gravarHistorico(String texto) {
        try (FileWriter writer = new FileWriter("historico.txt", true)) {
            writer.write(texto + "--------------------------\n");
        } catch (IOException e) {
            resultado.setText("Erro ao salvar o histórico.");
        }
    }

    private static void mostrarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("historico.txt"))) {
            StringBuilder conteudo = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            resultado.setText(conteudo.toString());
        } catch (IOException e) {
            resultado.setText("Não foi possível ler o histórico.");
        }
    }
}

