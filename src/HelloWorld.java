import javax.swing. *;
import org.gjt.sp.jedit. *;

public class HelloWorld extends JDialog
{
    // private members
    private View view;

    public HelloWorld (View view)
    {
        super (view, jEdit.getProperty ("HelloWorld.title"), false);

        this.view = view;

        JPanel content = new JPanel ();
        setContentPane (content);

        JLabel caption = new JLabel (jEdit.getProperty ("HelloWorld.caption"));
        content.add (caption);

        pack ();
        GUIUtilities.loadGeometry (this, "HelloWorld");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setVisible(true);
    }


    public void dispose ()
    {
        view = null;
        GUIUtilities.saveGeometry (this, "HelloWorld");
        super.dispose ();
    }
}
