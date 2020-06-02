package aam.gui;

import java.awt.event.ActionEvent;

/**
 *
 * @author Augusto Marrengula
 */
public class Main extends javax.swing.JFrame
{
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField userField;
    private javax.swing.JTextField passwordField;
    
    public Main()
    {
        criaComponents();
    }

    private void criaComponents()
    {
        loginButton = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela Principal");
        setMaximumSize(new java.awt.Dimension(650, 350));
        setMinimumSize(new java.awt.Dimension(650, 350));
        getContentPane().setLayout(null);
        
        // configurações dos componentes
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Oi");
            }
        });
        
        getContentPane().add(loginButton);
        loginButton.setBounds(256, 230, 125, 36);
        
        // configurações do campo usuário
        userField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userField.setText("Usuario");
        
        getContentPane().add(userField);
        userField.setBounds(223, 113, 207, 33);
        
        // configurações do campo password
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("******");
        
        getContentPane().add(passwordField);
        passwordField.setBounds(223, 160, 207, 33);
        
        pack();
        setLocationRelativeTo(null);
    }
}
