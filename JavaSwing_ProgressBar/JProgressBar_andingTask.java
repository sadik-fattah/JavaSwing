import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
//JProgressBar_andingTask
public class JProgressBar_andingTask extends JPanel implements ActionListener,
        PropertyChangeListener {

    private JProgressBar progressBar;
    private JButton startButton;
    private JTextArea taskOutput;
    private Task task;

    class Task extends SwingWorker<Void, Void> {
        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;

            setProgress(0);

            try {
                Thread.sleep(1000 + random.nextInt(2000));
            } catch (InterruptedException ignore) {
            }
            while (progress < 100) {

                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignore) {
                }

                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
            return null;
        }
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            startButton.setEnabled(true);
            taskOutput.append("Done!\n");
        }
    }
    public JProgressBar_andingTask() {
        super(new BorderLayout());
        startButton = new JButton("Start");
        startButton.setActionCommand("start");
        startButton.addActionListener(this);
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        taskOutput = new JTextArea(5, 20);
        taskOutput.setMargin(new Insets(5, 5, 5, 5));
        taskOutput.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(progressBar);
        add(panel, BorderLayout.PAGE_START);
        add(new JScrollPane(taskOutput), BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    public void actionPerformed(ActionEvent evt) {
        progressBar.setIndeterminate(true);
        startButton.setEnabled(false);
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setIndeterminate(false);
            progressBar.setValue(progress);
            taskOutput.append(String.format("Completed %d%% of task.\n", progress));
        }
    }
    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("ProgressBarDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new JProgressBar_andingTask();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
