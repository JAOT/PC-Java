package exemploLE;

import javax.swing.JOptionPane;

public class exemploLE
{
    public static void main(String[] args)
    {
        String  nome    = JOptionPane.showInputDialog(null, "Como te chamas?", "Nome");
        
        int     ano   = Integer.parseInt( JOptionPane.showInputDialog(null, "Insere o ano de nascimento.", "Idade"));
        
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Já viveste "+ (2020 - ano) + " anos...");
    } 
}