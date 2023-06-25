package GUIProject.hust.soict.globalict.javafx;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(javafx.event.ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(javafx.scene.input.MouseEvent event){
        Circle newCircle = new Circle(event.getX(),
                event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
