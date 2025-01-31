import javax.swing.*;
import java.awt.*;
public class MDIFromGUI extends JFrame{
    public JFrame frame;
    public JMenuBar menubar;
    public JMenu file,edit,view,news;
    public JMenuItem open,save,edits;
    public JMenuItem window,message;
    public JDesktopPane desktopPane;
    public JInternalFrame app,app2,app3;
    public Color black;
    public MDIFromGUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        black = new Color(0, 0, 0);
        frame = new JFrame("SubMenuItem Demo");
        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        news = new JMenu("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        edits = new JMenuItem("Edit");
        window = new JMenuItem("Window");
        message = new JMenuItem("Message");
        app = new JInternalFrame("Application 01",true,true,true,true);
        app2 = new JInternalFrame("Application 02",true,true,true,true);
        app3 = new JInternalFrame("Application 03",true,true,true,true);
        desktopPane = new JDesktopPane();
        file.add(news);
        file.addSeparator();
        news.add(window);
        news.addSeparator();
        news.add(message);
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(edits);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);
        app.getContentPane().add(new JLabel());
        app.setSize(200,200);
        app.setVisible(true);
        app2.getContentPane().add(new JLabel());
        app2.setSize(200,200);
        app2.setLocation(app.getX()+app.getWidth()+10, app.getY());
        app2.setVisible(true);
        app3.getContentPane().add(new JLabel());
        app3.setSize(200,200);
        app3.setLocation(app2.getX()+app2.getWidth()+20, app2.getY());
        app3.setVisible(true);
        desktopPane.add(app);
        desktopPane.add(app2);
        desktopPane.add(app3);
        desktopPane.setBackground(black);
        frame.setJMenuBar(menubar);
        frame.add(desktopPane);
        frame.setBackground(black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setVisible(true);
    }
}