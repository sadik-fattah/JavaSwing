import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.net.URL;

public class CJEditorPane extends JFrame {
    JEditorPane editorPane = new JEditorPane();

    public  CJEditorPane(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        Box editorPaneBox = this.getEditPaneBox();
        contentPane.add(editorPaneBox, BorderLayout.CENTER);
    }
    private Box getEditPaneBox() {
        editorPane.setEditable(false);
        Box editorBox = Box.createHorizontalBox();
        editorBox.add(new JScrollPane(editorPane));

        editorPane.addHyperlinkListener((HyperlinkEvent event) -> {
            if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                go(event.getURL());
            } else if (event.getEventType() == HyperlinkEvent.EventType.ENTERED) {
                System.out.println("click this link");
            } else if (event.getEventType() == HyperlinkEvent.EventType.EXITED) {
                System.out.println("Ready");
            }
        });

        editorPane.addPropertyChangeListener((PropertyChangeEvent e) -> {
            String propertyName = e.getPropertyName();
            if (propertyName.equalsIgnoreCase("page")) {
                URL url = editorPane.getPage();
                System.out.println(url.toExternalForm());
            }
        });

        return editorBox;
    }
    public void go(URL url) {
        try {
            editorPane.setPage(url);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void go(String urlString) {
        try {
            URL url = new URL(urlString);
            go(url);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        CJEditorPane browser = new CJEditorPane("");
        browser.setSize(700, 500);
        browser.setVisible(true);
        browser.go("https://guercifzone-ar.blogspot.com/");
    }
}
