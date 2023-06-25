package aims.Screen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import aims.Store;
import aims.Cart;
import media.Playable;
import media.Media;

public class StoreScreen extends JFrame{
    private Store store;
    private Cart cart;
    public StoreScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp. setLayout(new BorderLayout ());
        cp.add(createNorth(), BorderLayout .NORTH) ;
        cp.add(createCenter(), BorderLayout.CENTER) ;
        setVisible(true);
        setTitle("Store" );
        setSize(1024, 768);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout (new BoxLayout (north, BoxLayout.Y_AXIS) ) ;
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar( ) {
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu ("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));
        JMenuBar menuBar = new JMenuBar();
        menuBar. setLayout (new FlowLayout(FlowLayout.LEFT) );
        menuBar. add(menu);
        return menuBar;
    }

    JPanel createHeader( ) {
        JPanel header = new JPanel();
        header. setLayout(new BoxLayout(header, BoxLayout.X_AXIS) ) ;
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont( ) .getName( ), Font .PLAIN, 50));
        title.setForeground(Color.CYAN) ;
        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50) );
        header.add (Box.createRigidArea( new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add (Box.createRigidArea( new Dimension(10, 10)));
        return header;
    }

    JPanel createCenter( ) {
        JPanel center = new JPanel ();
        center.setLayout (new GridLayout (3, 3, 2, 2));
        ArrayList<Media> mediaInStore = store.getItemInStore();
        for (int i = 0; i < 2; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }
        return center;
    }

    public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media){
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS) ) ;
        JLabel title = new JLabel(media.getTitle( ) );
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);
        JLabel cost = new JLabel(""+media.getCost( )+" $");
        cost.setAlignmentX(CENTER_ALIGNMENT) ;
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        container.add(new JButton("Add to cart"));
        if (media instanceof Playable) {
        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JDialog infoDialog = new JDialog();
            infoDialog.setTitle("Media Information");
            infoDialog.setSize(300, 200);
            infoDialog.setResizable(false);
            infoDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            JLabel titleLabel = new JLabel("Title: " + media.getTitle(), JLabel.CENTER);
            titleLabel.setAlignmentX(CENTER_ALIGNMENT);
            JLabel costLabel = new JLabel("Cost: " + media.getCost(), JLabel.CENTER);
            costLabel.setAlignmentX(CENTER_ALIGNMENT);
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(titleLabel);
            panel.add(costLabel);
            infoDialog.add(panel);
            infoDialog.setVisible(true);
        }
    });
    container.add(playButton);
}   
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color .BLACK));
        }
    }
}