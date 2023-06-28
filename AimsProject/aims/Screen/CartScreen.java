package aims.Screen;

import aims.Cart;
import media.Book;
import media.CompactDisc;
import media.DigitalVideoDisc;
import aims.Screen.controller.CartScreenController;
import aims.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

import static aims.Screen.StoreScreen.cart;
import static aims.Screen.StoreScreen.store;

public class CartScreen extends JFrame {
    public static void main(String[] args) {
        new CartScreen();
    }
    public CartScreen() {
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart,store);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}