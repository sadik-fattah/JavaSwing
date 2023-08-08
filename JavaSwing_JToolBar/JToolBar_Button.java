import java.awt.Insets;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
public class JToolBar_Button {


    @SuppressWarnings("serial")
    public class ToolBarButton extends JButton {

        public ToolBarButton(String text, Icon icon) {
            super(text, icon);

            initButton();
        }

        public ToolBarButton() {
            super();
            initButton();
        }


        public ToolBarButton(Action action) {
            super(action);

            initButton();
        }

        private void initButton() {
            setRolloverEnabled(true);
            setRequestFocusEnabled(false);
            setMargin(new Insets(1, 1, 1, 1));
            putClientProperty("JToolBar.isRollover", Boolean.TRUE);
        }

        public boolean isFocusTraversable() {
            return isRequestFocusEnabled();
        }


        public void updateUI() {
            super.updateUI();

            setRolloverEnabled(true);
            putClientProperty("JToolBar.isRollover", Boolean.TRUE);
        }
    }
}
