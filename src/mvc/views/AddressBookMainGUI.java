/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;

//vo object
//import mvc.models.Person;

//import mvc.controller.AddressBookController;

import java.awt.BorderLayout;
//import java.awt.Component;
import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;



//import javax.swing.JLabel;
//import javax.swing.JList;
import javax.swing.JPanel;
//import javax.swing.ListSelectionModel;

/**
 *
 * @author Admin
 */
public class AddressBookMainGUI {
    
    private final JFrame frame;
    private final NameListPanel contactListPanel;
    private final DetailViewPanel detailsPanel;
    private final JButton btn_add;
    private final JButton btn_edit;
    private final JButton btn_delete;
    private final JButton btn_search;
    private final JButton btn_home;
    private final JPanel panel_btn;
    
    
    
     //private ContactDialog add;
     
     
  
        
    public AddressBookMainGUI(String text){
        frame = new JFrame("Address Book");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        //frame.setSize(500, 500);
      //  frame.pack();
        frame.setVisible(true);
     //   frame.pack();
        //frame.setVisible(true);
       // frame.setLocationRelativeTo(null);
         //frame.setVisible(true);
        
        
        contactListPanel=new NameListPanel();
        frame.getContentPane().add(contactListPanel,BorderLayout.WEST);
       /* JList names; 
                names= new JList<String>(nameList);
        Component add1 = contactListPanel.add(names);*/
        //contentPane.add(namesJList);
        // contactListPanel.add(J)
        /*
        nameList = person.getNameList();
        // namesJList = new JList<String>(items);
        //  contentPane.add(namesJList);
        contactList = new JList<String>(nameList);
        this.add(contactList);
         */
        // to be removed from commen=t frim line 66 to  line 67//
        detailsPanel=new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 4));
        
        btn_home = new JButton("");
        ImageIcon img5 = new ImageIcon("C:\\Users\\VIjay\\Downloads\\Addressbookjava-master\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\images.png");
        btn_home.setIcon(img5);
        panel_btn.add(btn_home);
        
        btn_add = new JButton("");
        ImageIcon img = new ImageIcon("C:\\Users\\VIjay\\Downloads\\Addressbookjava-master\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\add-icon.png");
        btn_add.setIcon(img);
        panel_btn.add(btn_add);
        
        
        btn_edit = new JButton("");
        ImageIcon img1 = new ImageIcon("C:\\Users\\VIjay\\Downloads\\Addressbookjava-master\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\imgonline-com-ua-resize-9OOV6bkq1cBbVud.png");
        btn_edit.setIcon(img1);
        panel_btn.add(btn_edit);
        
        btn_delete = new JButton("");
        ImageIcon img2 = new ImageIcon("C:\\Users\\VIjay\\Downloads\\Addressbookjava-master\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\del-icon.png");
        btn_delete.setIcon(img2);
        panel_btn.add(btn_delete);
        
        btn_search = new JButton("");
        ImageIcon img3 = new ImageIcon("C:\\Users\\VIjay\\Downloads\\Addressbookjava-master\\Addressbookjava-master\\AddressBook-MVC-java-master\\src\\mvc\\views\\mcg-icon.png");
        btn_search.setIcon(img3);
        panel_btn.add(btn_search);
        
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
    }
    
    public NameListPanel getNameListPanel()
    {
        return contactListPanel;
    }
    
    public DetailViewPanel getDetailViewPanel()
    {
        return detailsPanel;
    }
    
  /*  public  Person addPerson(Person person)
    {
        return person;
    }
    */        
    /*
    
    public LayoutManager getPanelLayout() {
  return panel.getLayout();
}
    
    */
    //btn_add.add
    public JFrame getMainGUIFrame()
    {
        return frame;
    }
    public JButton getAdd(){ 
        return btn_add;
    }
    
    public JButton getEdit(){
        return btn_edit;
    }
    
    public JButton getDelete(){
        return btn_delete;
    }
    public JButton getSearch(){
        return btn_search;
        
    }
    
    public JButton getHome(){
        return btn_home;
        
    }
    public void setText(String text){
       // label.setText(text);
    }
    
    /*
  public void  populateList(String[] namesList){
      JList namesJList;
            namesJList = new JList<String>(namesList);
            contactListPanel.add(namesJList);
            namesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
    */
    
}
