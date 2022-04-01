package calculadora;
public class InterfaceCalculadora extends javax.swing.JFrame {
    
    public InterfaceCalculadora() {
        initComponents();
        Limpa = false;
    }

    Double Valor1, Valor2;
    String Operador, Valor2s;
    Boolean Limpa;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button0 = new javax.swing.JButton();
        ButtonPonto = new javax.swing.JButton();
        ButtonResultado = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonDivisao = new javax.swing.JButton();
        ButtonMultiplicacao = new javax.swing.JButton();
        ButtonSubtracao = new javax.swing.JButton();
        ButtonSoma = new javax.swing.JButton();
        Visor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(371, 694));
        setResizable(false);
        getContentPane().setLayout(null);

        Button0.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button0.setForeground(new java.awt.Color(255, 255, 255));
        Button0.setText("0");
        Button0.setBorderPainted(false);
        Button0.setContentAreaFilled(false);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        Button0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button0KeyPressed(evt);
            }
        });
        getContentPane().add(Button0);
        Button0.setBounds(50, 560, 60, 72);

        ButtonPonto.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        ButtonPonto.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPonto.setText(",");
        ButtonPonto.setBorderPainted(false);
        ButtonPonto.setContentAreaFilled(false);
        ButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPontoActionPerformed(evt);
            }
        });
        ButtonPonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonPontoKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonPonto);
        ButtonPonto.setBounds(120, 560, 62, 72);

        ButtonResultado.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        ButtonResultado.setForeground(new java.awt.Color(255, 255, 255));
        ButtonResultado.setText("=");
        ButtonResultado.setBorderPainted(false);
        ButtonResultado.setContentAreaFilled(false);
        ButtonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResultadoActionPerformed(evt);
            }
        });
        ButtonResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonResultadoKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonResultado);
        ButtonResultado.setBounds(190, 560, 62, 70);

        Button3.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("3");
        Button3.setBorderPainted(false);
        Button3.setContentAreaFilled(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        Button3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button3KeyPressed(evt);
            }
        });
        getContentPane().add(Button3);
        Button3.setBounds(190, 480, 62, 72);

        Button2.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("2");
        Button2.setBorderPainted(false);
        Button2.setContentAreaFilled(false);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        Button2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button2KeyPressed(evt);
            }
        });
        getContentPane().add(Button2);
        Button2.setBounds(120, 480, 62, 72);

        Button1.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("1");
        Button1.setBorderPainted(false);
        Button1.setContentAreaFilled(false);
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button1MouseReleased(evt);
            }
        });
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        Button1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button1KeyPressed(evt);
            }
        });
        getContentPane().add(Button1);
        Button1.setBounds(50, 480, 62, 72);

        Button4.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("4");
        Button4.setBorderPainted(false);
        Button4.setContentAreaFilled(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        Button4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button4KeyPressed(evt);
            }
        });
        getContentPane().add(Button4);
        Button4.setBounds(50, 400, 62, 72);

        Button7.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("7");
        Button7.setBorderPainted(false);
        Button7.setContentAreaFilled(false);
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        Button7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button7KeyPressed(evt);
            }
        });
        getContentPane().add(Button7);
        Button7.setBounds(50, 320, 62, 72);

        ButtonLimpar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLimpar.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        ButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLimpar.setText("AC");
        ButtonLimpar.setBorder(null);
        ButtonLimpar.setBorderPainted(false);
        ButtonLimpar.setContentAreaFilled(false);
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        ButtonLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonLimparKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonLimpar);
        ButtonLimpar.setBounds(150, 250, 80, 72);

        Button8.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("8");
        Button8.setBorderPainted(false);
        Button8.setContentAreaFilled(false);
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        Button8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button8KeyPressed(evt);
            }
        });
        getContentPane().add(Button8);
        Button8.setBounds(120, 320, 62, 72);

        Button5.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("5");
        Button5.setBorderPainted(false);
        Button5.setContentAreaFilled(false);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        Button5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button5KeyPressed(evt);
            }
        });
        getContentPane().add(Button5);
        Button5.setBounds(120, 400, 62, 72);

        Button6.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("6");
        Button6.setBorderPainted(false);
        Button6.setContentAreaFilled(false);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        Button6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button6KeyPressed(evt);
            }
        });
        getContentPane().add(Button6);
        Button6.setBounds(190, 400, 62, 72);

        Button9.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("9");
        Button9.setBorderPainted(false);
        Button9.setContentAreaFilled(false);
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        Button9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Button9KeyPressed(evt);
            }
        });
        getContentPane().add(Button9);
        Button9.setBounds(190, 320, 62, 72);

        ButtonDivisao.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        ButtonDivisao.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDivisao.setText("/");
        ButtonDivisao.setBorderPainted(false);
        ButtonDivisao.setContentAreaFilled(false);
        ButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivisaoActionPerformed(evt);
            }
        });
        ButtonDivisao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonDivisaoKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonDivisao);
        ButtonDivisao.setBounds(250, 320, 62, 72);

        ButtonMultiplicacao.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        ButtonMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMultiplicacao.setText("X");
        ButtonMultiplicacao.setToolTipText("");
        ButtonMultiplicacao.setBorderPainted(false);
        ButtonMultiplicacao.setContentAreaFilled(false);
        ButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplicacaoActionPerformed(evt);
            }
        });
        ButtonMultiplicacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonMultiplicacaoKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonMultiplicacao);
        ButtonMultiplicacao.setBounds(250, 400, 62, 72);

        ButtonSubtracao.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        ButtonSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSubtracao.setText("-");
        ButtonSubtracao.setBorderPainted(false);
        ButtonSubtracao.setContentAreaFilled(false);
        ButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubtracaoActionPerformed(evt);
            }
        });
        ButtonSubtracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonSubtracaoKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonSubtracao);
        ButtonSubtracao.setBounds(250, 480, 62, 72);

        ButtonSoma.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        ButtonSoma.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSoma.setText("+");
        ButtonSoma.setBorderPainted(false);
        ButtonSoma.setContentAreaFilled(false);
        ButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSomaActionPerformed(evt);
            }
        });
        ButtonSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonSomaKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonSoma);
        ButtonSoma.setBounds(250, 560, 62, 72);

        Visor.setEditable(false);
        Visor.setBackground(new java.awt.Color(255, 255, 255));
        Visor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisorActionPerformed(evt);
            }
        });
        getContentPane().add(Visor);
        Visor.setBounds(50, 170, 278, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pami\\Desktop\\Programação\\Pacetech\\logo (5).png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 310, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pami\\Desktop\\Programação\\Pacetech\\fundo pacetech5.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 370, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonPontoKeyPressed

    }//GEN-LAST:event_ButtonPontoKeyPressed

    private void ButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPontoActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        String Ponto;
        Ponto=Visor.getText();

        if(Ponto.length()<=0){
            Visor.setText("0.");
            Valor2s = "0.";
        }
        else{
            if(!existeponto(Visor.getText())){
                Visor.setText(Visor.getText()+".");
                Valor2s = Valor2s + ".";
            }
        }
        
    }//GEN-LAST:event_ButtonPontoActionPerformed

    private void Button3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button3KeyPressed

    }//GEN-LAST:event_Button3KeyPressed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"3");
        Valor2s = Valor2s + "3";
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button1KeyPressed

    }//GEN-LAST:event_Button1KeyPressed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"1");
        Valor2s = Valor2s + "1";
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseReleased

    }//GEN-LAST:event_Button1MouseReleased

    private void Button2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button2KeyPressed

    }//GEN-LAST:event_Button2KeyPressed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        
        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"2");
        Valor2s = Valor2s + "2";
    }//GEN-LAST:event_Button2ActionPerformed

    private void ButtonResultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonResultadoKeyPressed

    }//GEN-LAST:event_ButtonResultadoKeyPressed

    private void ButtonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResultadoActionPerformed
        Valor2 = Double.parseDouble(Valor2s);
        Double Resultado = 0.0;
        
        if (Operador == "+"){
            Resultado = Valor1 + Valor2;
        }
        if (Operador == "-"){
            Resultado = Valor1 - Valor2;
        }
        if (Operador == "*"){
            Resultado = Valor1 * Valor2;
        }
        if (Operador == "/"){
            Resultado = Valor1 / Valor2;
        }
        Visor.setText(Visor.getText() + " = " + Resultado.toString());
        Limpa = true;
    }//GEN-LAST:event_ButtonResultadoActionPerformed

    private void Button5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button5KeyPressed

    }//GEN-LAST:event_Button5KeyPressed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"5");
        Valor2s = Valor2s + "5";
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button4KeyPressed

    }//GEN-LAST:event_Button4KeyPressed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"4");
        Valor2s = Valor2s + "4";
    }//GEN-LAST:event_Button4ActionPerformed

    private void ButtonLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonLimparKeyPressed

    }//GEN-LAST:event_ButtonLimparKeyPressed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed

        Visor.setText("");
        Valor2s = "";
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void Button6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button6KeyPressed

    }//GEN-LAST:event_Button6KeyPressed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"6");
        Valor2s = Valor2s + "6";
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button7KeyPressed

    }//GEN-LAST:event_Button7KeyPressed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"7");
        Valor2s = Valor2s + "7";
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button8KeyPressed

    }//GEN-LAST:event_Button8KeyPressed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"8");
        Valor2s = Valor2s + "8";
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button9KeyPressed

    }//GEN-LAST:event_Button9KeyPressed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }
        
        Visor.setText(Visor.getText()+"9");
        Valor2s = Valor2s + "9";
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Button0KeyPressed

    }//GEN-LAST:event_Button0KeyPressed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed

        if (Limpa) {
            Visor.setText("");
            Valor2s = "";
            Limpa = false;
        }

        Visor.setText(Visor.getText()+"0");
        Valor2s = Valor2s + "0";
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonDivisaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonDivisaoKeyPressed

    }//GEN-LAST:event_ButtonDivisaoKeyPressed

    private void ButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivisaoActionPerformed

        Valor2s = "";
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText(Visor.getText()+" / ");
        Operador = "/";

    }//GEN-LAST:event_ButtonDivisaoActionPerformed

    private void ButtonMultiplicacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonMultiplicacaoKeyPressed

    }//GEN-LAST:event_ButtonMultiplicacaoKeyPressed

    private void ButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplicacaoActionPerformed

        Valor2s = "";
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText(Visor.getText()+" * ");
        Operador = "*";
        
    }//GEN-LAST:event_ButtonMultiplicacaoActionPerformed

    private void ButtonSubtracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonSubtracaoKeyPressed

    }//GEN-LAST:event_ButtonSubtracaoKeyPressed

    private void ButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubtracaoActionPerformed

        Valor2s = "";
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText(Visor.getText()+" - ");
        Operador = "-";

    }//GEN-LAST:event_ButtonSubtracaoActionPerformed

    private void ButtonSomaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonSomaKeyPressed

    }//GEN-LAST:event_ButtonSomaKeyPressed

    private void ButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSomaActionPerformed

        Valor2s = "";
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText(Visor.getText()+" + ");
        Operador = "+";
        
    }//GEN-LAST:event_ButtonSomaActionPerformed

    private void VisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisorActionPerformed

    public static boolean existeponto(String Sinal){
        boolean resultado;
        resultado=false;
        
        for (int i = 0; i < Sinal.length(); i++){
            if(Sinal.substring(i, i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado; 
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonDivisao;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonMultiplicacao;
    private javax.swing.JButton ButtonPonto;
    private javax.swing.JButton ButtonResultado;
    private javax.swing.JButton ButtonSoma;
    private javax.swing.JButton ButtonSubtracao;
    private javax.swing.JTextField Visor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
