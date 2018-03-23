/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Amila Jayasinghe
 */
public class Controls {

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static Integer userID;
    public static String username;
    public static String DATE_STANDARD = "yyyy-MM-dd";
    public static String TIME_STANDARD = "HH:mm:ss";

    public static void centerWindow(Window centerThis, Window onThis) {
        try {
            Dimension ctd = centerThis.getSize();
            int wid_ct = ctd.width;
            int hei_ct = ctd.height;

            Dimension otd = onThis.getSize();
            int wid_ot = otd.width;
            int hei_ot = otd.height;

            Point ot_p = onThis.getLocation();
            int x_ot = ot_p.x;
            int y_ot = ot_p.y;

            int x = (wid_ot - wid_ct) / 2;
            int y = (hei_ot - hei_ct) / 2;
            centerThis.setLocation(x_ot + x, y_ot + y);
        } catch (Exception e) {
        }
    }

    public static String formatAmount(Double d) {
        return new DecimalFormat("#0.00").format(d);
    }

    public static boolean isAuthorized(String userName, String pass) {
        boolean found = false;
        String typedPass = DigestUtils.sha1Hex(("MDCC" + pass + "badboyes").getBytes());
        try {
            ResultSet check_user = Database.getData("SELECT in_usr.usrName, in_usr.usrID, in_usr.usrPwd,in_usr.usrLevel FROM in_usr WHERE in_usr.usrName = '" + userName + "'");
            String savedPass = null;
            if (check_user.next()) {
                savedPass = check_user.getString("usrPwd");
                if (typedPass.equals(savedPass)) {
                    found = true;
                    userID = check_user.getInt("usrID");
                    username = check_user.getString("usrName");
                    System.setProperty("userid", userID.toString());
                    System.setProperty("username", username);
                    System.setProperty("userLevel", check_user.getString("usrLevel"));
                }
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Connectivity Error. Check Configuration", "Error", JOptionPane.ERROR_MESSAGE);
            // sqlEx.getMessage();
        } catch (Exception ex) {
            Logger.getLogger(Controls.class.getName()).log(Level.SEVERE, null, ex);
        }
        return found;
    }

    public static boolean isAuthorized_for_return(String userName, String pass) {
        boolean found = false;
        String typedPass = DigestUtils.sha1Hex(("MDCC" + pass + "badboyes").getBytes());
        try {
            ResultSet check_user = Database.getData("SELECT in_usr.usrName, in_usr.usrID, in_usr.usrPwd, in_usrlevel.lvName FROM "
                    + "in_usr INNER JOIN in_usrlevel ON in_usr.usrLevel = in_usrlevel.lvID "
                    + "WHERE in_usr.usrName = '" + userName + "'");
            String savedPass = null;
            if (check_user.next()) {

                if (check_user.getString("lvName").equals("Admin")) {
                    savedPass = check_user.getString("usrPwd");
                    if (typedPass.equals(savedPass)) {
                        found = true;
                    }
                }

            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Connectivity Error. Check Configuration", "Error", JOptionPane.ERROR_MESSAGE);
            // sqlEx.getMessage();
        } catch (Exception ex) {
            Logger.getLogger(Controls.class.getName()).log(Level.SEVERE, null, ex);
        }
        return found;
    }

    public static void addKeyBindingAction(JFrame targetFrame, int keyCode, String inputName, String actionName, AbstractAction action) {
        InputMap inputMap = targetFrame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(keyCode, 0), inputName);
        ActionMap actionMap = targetFrame.getRootPane().getActionMap();
        actionMap.put(actionName, action);
    }

    public static void addKeyBindingAction(JDialog targetDialog, int keyCode, String inputName, String actionName, AbstractAction action) {
        InputMap inputMap = targetDialog.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(keyCode, 0), inputName);
        ActionMap actionMap = targetDialog.getRootPane().getActionMap();
        actionMap.put(actionName, action);
    }

    public static String formattedDateTime(java.util.Date dateIn, String format) {
        String retDate = null;
        if (dateIn != null) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                retDate = sdf.format(dateIn);
                return retDate;
            } catch (Exception ex) {
                ex.printStackTrace();
//                Logger.getLogger(Commons.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            retDate = "";
        }
        return retDate;
    }

}
