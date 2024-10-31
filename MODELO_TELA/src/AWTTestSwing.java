import javax.swing.*; // Importa as Classes da Biblioteca javax.swing
import java.awt.BorderLayout; // Importa a Classe BorderLayout
import java.awt.FlowLayout; // Importa a Classe FlowLayout

public class AWTTestSwing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("AWT Test"); // Cria uma Janela com o Nome de AWT Test
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ação ao fechar a Janela (fechar a Aplicação)
		frame.setSize(400, 200); // Determina a Largura e Altura da Janela
		frame.setLayout(new BorderLayout()); // Define o Layout da Janela como BorderLayout
		
		JLabel label1 = new JLabel("Label1"); // Cria o Rótulo da Janela com o nome de "Label1"
		JTextField textField1 = new JTextField(15); // Cria um campo de texto com no máx. 15 caracteres
		
		JPanel topPanel = new JPanel(); // Cria um novo Painel para o rótulo e campo de texto
		topPanel.setLayout(new FlowLayout()); //Define  Layout do Paienl como FlowtLayout
		topPanel.add(label1); // Adiciona  o Rótulo "label1" ao Painel
		topPanel.add(textField1); // Adiciona o campo de texto ao Painel
		
		JButton button1 = new JButton("Button 1"); // Cria o Botão 1 "Button1"
		JButton button2 = new JButton("Button 2"); // Cria o Botão 2 "Button2"
		JButton button3 = new JButton("Button 3"); // Cria o Botão 3 "Button3"
		
		JPanel buttonPanel = new JPanel(); // Cria um novo Painel para os Botões 
		buttonPanel.setLayout(new FlowLayout()); // Define o Layout do Painel como FlowLayot
		buttonPanel.add(button1); // Adiciona o Botão 1 ao Painel
		buttonPanel.add(button2); // Adiciona o Botão 2 ao Painel
		buttonPanel.add(button3); // Adiciona o Botão 3 ao Painel
		
		frame.add(topPanel, BorderLayout.NORTH); // Coloca o Painel do rótulo e caixa de texto no Canto superior central da Janela (Norte)
		frame.add(buttonPanel, BorderLayout.CENTER); // Coloca o Painel dos botões no centro da página
		
		frame.setVisible(true);
	}

}
