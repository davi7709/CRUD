package view;

import model.Person;
import controller.PersonController;



public class PersonView extends javax.swing.JFrame {

    PersonController tableModel = new PersonController();

    public PersonView() {
        initComponents();

        jTPersons.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTPersons = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTPersons.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTPersons);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("CADASTRO");

        jLabel2.setText("CPF");

        jLabel3.setText("Celular");

        jLabel5.setText("Email");

        jLabel4.setText("Nome ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(222, 222, 222)
                                                                .addComponent(jLabel1)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(txtCPF)
                                                                                .addComponent(txtCel)
                                                                                .addComponent(txtEmail))
                                                                        .addComponent(jLabel5))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(86, 86, 86)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSalvar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(btnEditar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExcluir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {

        Person p = new Person();
        p.setName(txtNome.getText());
        p.setCpf(txtCPF.getText());
        p.setCel(Integer.parseInt(txtCel.getText()));
        p.setEmail(txtEmail.getText());


        tableModel.addRow(p);


    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {

        if (jTPersons.getSelectedRow() != -1) {

            tableModel.removeRow(jTPersons.getSelectedRow());
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {

        if (jTPersons.getSelectedRow() != -1) {
            tableModel.setValueAt(txtNome.getText(), jTPersons.getSelectedRow(), 0);
            tableModel.setValueAt(txtCPF.getText(), jTPersons.getSelectedRow(), 1);
            tableModel.setValueAt(txtCel.getText(), jTPersons.getSelectedRow(), 2);
            tableModel.setValueAt(txtEmail.getText(), jTPersons.getSelectedRow(), 3);


        }
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonView().setVisible(true);
            }
        });
    }


        private javax.swing.JButton btnEditar;
        private javax.swing.JButton btnExcluir;
        private javax.swing.JButton btnSalvar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTPersons;
        private javax.swing.JTextField txtCPF;
        private javax.swing.JTextField txtCel;
        private javax.swing.JTextField txtEmail;
        private javax.swing.JTextField txtNome;

    }

