import org.gjt.sp.jedit.*;
import java.util.Vector;

public class HelloWorldPlugin extends EditPlugin {
    public void createMenuItems(Vector menuItems) {
        menuItems.addElement(GUIUtilities.loadMenuItem("HelloWorld"));
    }
}
