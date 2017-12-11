/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author usfng
 */
public class Client {

    // The GUIs
    private static LoginGUI loginGUI;
    private static RegisterGUI registerGUI;
    private static DashboardGUI dashboardGUI;
    
    private static clientManagerInterface auth; // Our remote object

    public static void main(String args[]) {

        // Initializes the GUIs
        initLoginGUI();
        initRegisterGUI();
        initDashboardGUI();

        // Show the login GUI first
        loginGUI.setVisible(true);

        // Connect to the RMI Registry
        // and grab the remote auth object
        try {
            Registry r = LocateRegistry.getRegistry(1099);
            auth = (clientManagerInterface) r.lookup("auth");
        } catch (Exception e) {
            System.out.println("Exception " + e.toString());
        }

    }

    private static void initLoginGUI() {
        loginGUI = new LoginGUI();
        loginGUI.setLocationRelativeTo(null); // center the screen
        // Register the action listeners
        loginGUI.getLoginButton().addActionListener(new LoginButtonListener());
        loginGUI.getRegisterNavButton().addActionListener(new RegisterNavButtonListener());
    }

    private static void initRegisterGUI() {
        registerGUI = new RegisterGUI();
        registerGUI.setLocationRelativeTo(null); //center the screen
        // Register the action listeners
        registerGUI.getRegisterButton().addActionListener(new RegisterButtonListener());
        registerGUI.getLoginNavButton().addActionListener(new LoginNavButtonListener());
    }

    private static void initDashboardGUI() {
        dashboardGUI = new DashboardGUI();
        dashboardGUI.setLocationRelativeTo(null); // center the screen
    }

    // The action listener for the login button
    static class LoginButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String username = loginGUI.getUserName();
                String password = loginGUI.getPassword();
                User u = auth.login(username, password);
                if (u == null) {
                    JOptionPane.showMessageDialog(null, "Wrong username/password. Please try again");
                } else {
                    JOptionPane.showMessageDialog(null, "Logged in successfully!");
                    loginGUI.dispose();
                    initLoginGUI();
                    dashboardGUI.setUsername(u.getFullName());
                    dashboardGUI.setVisible(true);
                }
            } catch (Exception ex) {
                System.out.println("exception " + ex.toString());
            }
        }

    }

    // The action listener for the Register navigation button
    static class RegisterNavButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            loginGUI.dispose();
            initLoginGUI();
            registerGUI.setVisible(true);
        }

    }

    // The action listener for the register button
    static class RegisterButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String username = registerGUI.getUsername();
                String password = registerGUI.getPassword();
                String fullName = registerGUI.getFullName();

                int result = auth.register(username, password, fullName);

                if (result == 0) {
                    JOptionPane.showMessageDialog(null, "Username already exists, please try another one");
                } else {
                    JOptionPane.showMessageDialog(null, "Registed successfully! Please login");
                    registerGUI.dispose();
                    initRegisterGUI();
                    loginGUI.setVisible(true);
                }

            } catch (Exception ex) {

            }

        }

    }

    // The action listener for the Login navigation Button
    static class LoginNavButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            registerGUI.dispose();
            initRegisterGUI();
            loginGUI.setVisible(true);
        }

    }

}
