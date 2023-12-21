/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import Service.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.*;


/**
 *
 * @author pc
 */
public class MenuUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminUI
     */
    public MenuUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        addDataToCategoryTable();
        setupCategoryTableListener();
        populateComboBox();
        addDataToDishTable();
        setupDishTableListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dishCategoryTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        categoryIdInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        categoryNameInput = new javax.swing.JTextField();
        updateCategoryButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dishCategoryList = new javax.swing.JComboBox<>();
        dishPriceInput = new javax.swing.JTextField();
        dishNameInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        dishTable = new javax.swing.JTable();
        dishIdInput = new javax.swing.JTextField();
        deleteCategoryButton = new javax.swing.JButton();
        insertCategoryButton = new javax.swing.JButton();
        insertDishButton = new javax.swing.JButton();
        updateDishButton = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dishCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(dishCategoryTable);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("DISH INFORMATION");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Category ID");

        categoryIdInput.setEditable(false);
        categoryIdInput.setText("Select a category to get an ID");
        categoryIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIdInputActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Category Name");

        updateCategoryButton.setBackground(new java.awt.Color(245, 71, 72));
        updateCategoryButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updateCategoryButton.setForeground(new java.awt.Color(255, 255, 255));
        updateCategoryButton.setText("Update");
        updateCategoryButton.setBorder(null);
        updateCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCategoryButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("CATEGORY INFORMATION");

        dishCategoryList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dishCategoryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishCategoryListActionPerformed(evt);
            }
        });

        dishPriceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishPriceInputActionPerformed(evt);
            }
        });

        dishNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishNameInputActionPerformed(evt);
            }
        });

        dishTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Category"
            }
        ));
        jScrollPane2.setViewportView(dishTable);

        dishIdInput.setEditable(false);
        dishIdInput.setText("Select a dish to get an ID");
        dishIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishIdInputActionPerformed(evt);
            }
        });

        deleteCategoryButton.setBackground(new java.awt.Color(245, 71, 72));
        deleteCategoryButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteCategoryButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteCategoryButton.setText("Delete");
        deleteCategoryButton.setBorder(null);
        deleteCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCategoryButtonActionPerformed(evt);
            }
        });

        insertCategoryButton.setBackground(new java.awt.Color(245, 71, 72));
        insertCategoryButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        insertCategoryButton.setForeground(new java.awt.Color(255, 255, 255));
        insertCategoryButton.setText("Insert");
        insertCategoryButton.setBorder(null);
        insertCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCategoryButtonActionPerformed(evt);
            }
        });

        insertDishButton.setBackground(new java.awt.Color(245, 71, 72));
        insertDishButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        insertDishButton.setForeground(new java.awt.Color(255, 255, 255));
        insertDishButton.setText("Insert");
        insertDishButton.setBorder(null);
        insertDishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDishButtonActionPerformed(evt);
            }
        });

        updateDishButton.setBackground(new java.awt.Color(245, 71, 72));
        updateDishButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updateDishButton.setForeground(new java.awt.Color(255, 255, 255));
        updateDishButton.setText("Update");
        updateDishButton.setBorder(null);
        updateDishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDishButtonActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(245, 71, 72));
        Delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.setBorder(null);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Dish Category");
        jLabel7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel7ComponentHidden(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Dish Name");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Dish ID");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Dish Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(categoryNameInput)
                        .addComponent(categoryIdInput, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(insertCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(updateCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(deleteCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10)
                        .addComponent(jScrollPane1))
                    .addComponent(jLabel12)
                    .addComponent(jLabel9))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dishNameInput)
                                            .addComponent(dishCategoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(113, 113, 113))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(insertDishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(updateDishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(311, 311, 311)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(331, 331, 331)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dishPriceInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dishIdInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dishCategoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dishIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(categoryIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dishNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dishPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertDishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateDishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     int CategorySelectedRowIndex;
   private void setupCategoryTableListener(){
      dishCategoryTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    JTable source = dishCategoryTable;
                   CategorySelectedRowIndex = source.getSelectedRow();

                    if (CategorySelectedRowIndex >= 0) {
                        categoryIdInput.setText(source.getValueAt(CategorySelectedRowIndex, 0).toString());
                        categoryNameInput.setText(source.getValueAt(CategorySelectedRowIndex, 1).toString());
                    } 
                }
            }
        });
    }  
   
   int DishSelectedRowIndex;
     private void setupDishTableListener(){
      dishTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    JTable source = dishTable;
                   DishSelectedRowIndex = source.getSelectedRow();

                    if ( DishSelectedRowIndex >= 0) {
                    
                        dishIdInput.setText(source.getValueAt(DishSelectedRowIndex, 0).toString());
                        dishNameInput.setText(source.getValueAt(DishSelectedRowIndex, 1).toString());
                        dishPriceInput.setText(source.getValueAt(DishSelectedRowIndex, 2).toString());
                    } 
                }
            }
        });
    }  
    
 
  private void addDataToCategoryTable(){
           try{
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishCategoryService dishCategoryService = (DishCategoryService) theRegistry.lookup("category");
        List<DishCategory> dishCategoryList =  dishCategoryService.allDishCategories();
        DefaultTableModel dishCategoryTableModel = (DefaultTableModel) dishCategoryTable.getModel();
        dishCategoryTableModel.setRowCount(0);
        
        if (dishCategoryList != null) {
            for (DishCategory item : dishCategoryList) {
                   
                     
                    int selectedRow = dishCategoryTable.getSelectedRow();
                    if (selectedRow >= 0) {
                   
                         String dishId =  dishCategoryTableModel.getValueAt(selectedRow, 1).toString();
                         String dishName =  dishCategoryTableModel.getValueAt(selectedRow, 2).toString();
                         categoryIdInput.setText(dishId);
                         categoryNameInput.setText(dishName);
                         
                    }
               
     
                    dishCategoryTableModel.addRow(new Object[]{
                    item.getCategoryId(),
                    item.getCategoryName(),
                });
                  
                
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "No record in the database");
        }
        
           } catch(Exception ex){
               ex.printStackTrace();
           }
    }
  
  private void addDataToDishTable(){
           try{
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishService dishService = (DishService) theRegistry.lookup("dish");
        List<Dish> dishList =  dishService.allDishes();
        DefaultTableModel dishTableModel = (DefaultTableModel) dishTable.getModel();
        dishTableModel.setRowCount(0);
        
        if (dishList != null) {
            for (Dish item : dishList) {
                   
                     
                    int selectedRow = dishTable.getSelectedRow();
                    if (selectedRow >= 0) {
                   
                         String dishId =  dishTableModel.getValueAt(selectedRow, 1).toString();
                         String dishName =  dishTableModel.getValueAt(selectedRow, 2).toString();
                         categoryIdInput.setText(dishId);
                         categoryNameInput.setText(dishName);
                         
                    }
 
                    dishTableModel.addRow(new Object[]{
                    item.getDishId(),
                    item.getName(),
                    item.getPrice(),
                    (item.getCategory() != null) ? item.getCategory().getCategoryName() : "",
                    
                });
      
            }
        } else {
            JOptionPane.showMessageDialog(this, "No record in the database");
        }
        
           } catch(Exception ex){
               ex.printStackTrace();
           }
    }
  

   
    private void categoryIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIdInputActionPerformed

    private void updateCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCategoryButtonActionPerformed
          if (CategorySelectedRowIndex  < 0) {
              JOptionPane.showMessageDialog(this, "Please select a row first!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
          }
        try {
        int categoryId = Integer.parseInt(categoryIdInput.getText().trim()); 
        String categoryName = categoryNameInput.getText().trim();
       

        if (categoryName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the category name!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }else {  
            
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishCategoryService dishCategoryService = (DishCategoryService) theRegistry.lookup("category");
        DishCategory theDishCategory = new DishCategory();
        theDishCategory.setCategoryId(categoryId);
        theDishCategory.setCategoryName(categoryName);
       
        DishCategory dishCategoryObj = dishCategoryService.updateDishCategory(theDishCategory);

        if (dishCategoryObj != null) {
            addDataToCategoryTable();
            populateComboBox();
            JOptionPane.showMessageDialog(this, "Data Saved");
            categoryIdInput.setText("");
             categoryNameInput.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Data Not Saved");
        }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_updateCategoryButtonActionPerformed

    private void dishCategoryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishCategoryListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishCategoryListActionPerformed

    private void dishPriceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishPriceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishPriceInputActionPerformed

    private void dishNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishNameInputActionPerformed

    private void dishIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishIdInputActionPerformed

    private void deleteCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCategoryButtonActionPerformed
        if (CategorySelectedRowIndex  < 0) {
              JOptionPane.showMessageDialog(this, "Please select a row first!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
          }
        try {
        int categoryId = Integer.parseInt(categoryIdInput.getText().trim()); 
        String categoryName = categoryNameInput.getText().trim();
             
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishCategoryService dishCategoryService = (DishCategoryService) theRegistry.lookup("category");
        DishCategory theDishCategory = new DishCategory();
        theDishCategory.setCategoryId(categoryId);
        theDishCategory.setCategoryName(categoryName);
       
        DishCategory dishCategoryObj = dishCategoryService.deleteDishCategory(theDishCategory);

        if (dishCategoryObj != null) {
            addDataToCategoryTable();
            populateComboBox();
            JOptionPane.showMessageDialog(this, "Data Deleted");
            categoryIdInput.setText("");
             categoryNameInput.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Data Not Deleted!");
        }
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_deleteCategoryButtonActionPerformed

    private void insertCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCategoryButtonActionPerformed
         try {
        String categoryName = categoryNameInput.getText().trim();
       

        if (categoryName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the category name!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }else {  
            
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishCategoryService dishCategoryService = (DishCategoryService) theRegistry.lookup("category");
        DishCategory theDishCategory = new DishCategory();
        theDishCategory.setCategoryName(categoryName);
       
        DishCategory dishCategoryObj = dishCategoryService.recordDishCategory(theDishCategory);

        if (dishCategoryObj != null) {
            addDataToCategoryTable();
            populateComboBox();
            categoryIdInput.setText("");
             categoryNameInput.setText("");
            JOptionPane.showMessageDialog(this, "Data Saved");
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Data Not Saved");
        }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_insertCategoryButtonActionPerformed
     private  void populateComboBox(){
          try {
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishCategoryService service = (DishCategoryService) theRegistry.lookup("category");
        List<String> categoryNames = service.allCategoryNames();
        categoryNames.add(0, "Select a category");
        dishCategoryList.setModel(new DefaultComboBoxModel<>(categoryNames.toArray(new String[0])));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }
    private void insertDishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDishButtonActionPerformed
         try {
        String dishName = dishNameInput.getText().trim();
        String dishPrice = dishPriceInput.getText();
        String dishCategory = dishCategoryList.getSelectedItem().toString();
        
       

        if (dishName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the dish name!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        } else if(dishCategory == null || dishCategory.isEmpty() || dishCategory.equals("Select a category")){
            JOptionPane.showMessageDialog(this, "Please select a category.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        else if(dishPrice.isEmpty()){
             JOptionPane.showMessageDialog(this, "Please fill in the dish price!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        } else if(dishCategory.isEmpty()){
             JOptionPane.showMessageDialog(this, "Please select the dish category!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        else {  
            
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishService dishService = (DishService) theRegistry.lookup("dish");
        Dish theDish = new Dish();
        theDish.setName(dishName);
        theDish.setPrice(Double.parseDouble(dishPrice));
       
        DishCategoryService dishCategoryService = (DishCategoryService) theRegistry.lookup("category");
        DishCategory dishCategoryObj = dishCategoryService.getCategoryByName(dishCategory);
        theDish.setCategory(dishCategoryObj);
        
        Dish dishObj = dishService.recordDish(theDish);
        
          if (dishObj != null) {
            addDataToDishTable();
            JOptionPane.showMessageDialog(this, "Data Saved!");
            dishIdInput.setText("");
            dishNameInput.setText("");
            dishPriceInput.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Data Not saved!");
        }
       
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_insertDishButtonActionPerformed

    private void updateDishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDishButtonActionPerformed
         if (DishSelectedRowIndex  < 0) {
              JOptionPane.showMessageDialog(this, "Please select a row first!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
          }
        try {
            int dishId = Integer.parseInt(dishIdInput.getText().trim()); 
            String dishName = dishNameInput.getText().trim();
            String dishPrice = dishPriceInput.getText().trim();
            String dishCategory = dishCategoryList.getSelectedItem().toString();


            if (dishName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in the dish name!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            } else if(dishCategory == null || dishCategory.isEmpty() || dishCategory.equals("Select a category")){
                JOptionPane.showMessageDialog(this, "Please select a category.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            else if(dishPrice.isEmpty()){
                 JOptionPane.showMessageDialog(this, "Please fill in the dish price", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            else {  

            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            DishService dishService = (DishService) theRegistry.lookup("dish");
            Dish theDish = new Dish();
            theDish.setDishId(dishId);
            theDish.setName(dishName);
            theDish.setPrice(Double.parseDouble(dishPrice));

            DishCategoryService dishCategoryService = (DishCategoryService) theRegistry.lookup("category");
            DishCategory dishCategoryObj = dishCategoryService.getCategoryByName(dishCategory);
            theDish.setCategory(dishCategoryObj);

            Dish dishObj = dishService.updateDish(theDish);

              if (dishObj != null) {
                addDataToDishTable();
                JOptionPane.showMessageDialog(this, "Data Saved!");
                dishIdInput.setText("");
                dishNameInput.setText("");
                dishPriceInput.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Data Not saved!");
            }
            }
       
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_updateDishButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         if (DishSelectedRowIndex  < 0) {
              JOptionPane.showMessageDialog(this, "Please select a row first!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
          }
        try {
        int dishId = Integer.parseInt(dishIdInput.getText().trim()); 
        
             
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        DishService dishService = (DishService) theRegistry.lookup("dish");
        Dish theDish = new Dish();
        theDish.setDishId(dishId);
       
        Dish dishObj = dishService.deleteDish(theDish);

        if (dishObj != null) {
            addDataToDishTable();
            JOptionPane.showMessageDialog(this, "Data Deleted");
            dishIdInput.setText("");
            dishNameInput.setText("");
             dishPriceInput.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Data Not Deleted!");
        }
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jLabel7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel7ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7ComponentHidden

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
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField categoryIdInput;
    private javax.swing.JTextField categoryNameInput;
    private javax.swing.JButton deleteCategoryButton;
    private javax.swing.JComboBox<String> dishCategoryList;
    private javax.swing.JTable dishCategoryTable;
    private javax.swing.JTextField dishIdInput;
    private javax.swing.JTextField dishNameInput;
    private javax.swing.JTextField dishPriceInput;
    private javax.swing.JTable dishTable;
    private javax.swing.JButton insertCategoryButton;
    private javax.swing.JButton insertDishButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updateCategoryButton;
    private javax.swing.JButton updateDishButton;
    // End of variables declaration//GEN-END:variables
}
