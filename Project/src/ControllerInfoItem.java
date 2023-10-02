import javax.security.auth.callback.LanguageCallback;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ControllerInfoItem {

  @FXML
  private ImageView img;

  @FXML
  private Label title = new Label();

  @FXML
  private Label color = new Label();

  @FXML
  private Label nomDelVideojoc = new Label();

  @FXML
  private Label data = new Label();

  @FXML
  private Label procesador = new Label();

  @FXML
  private Label venudes = new Label();

  @FXML
  private Label any = new Label();
  
  @FXML
  private Label tipus = new Label();
  
  @FXML
  private Label descripcio = new Label();


  public void setImage(String resourceName) {

    // Obté una referència al recurs dins del .jar
    ClassLoader classLoader = getClass().getClassLoader();
    Image image = new Image(classLoader.getResourceAsStream(resourceName));

    // Estableix la imatge a l'ImageView
    img.setImage(image);
  }
  public void setTitle(String text) {
    // Estableix el contingut del Label
    this.title.setText(text);
  }

  // personatges
  public void setColor(String text) {
    // Estableix el color
    this.color.setText(text);
  }

  public void setNomDelVideojoc(String text) {

    // Estableix el contingut del Label
    this.nomDelVideojoc.setText(text);
  }

  // consoles
  public void setData(String text) {
    this.data.setText(text);
  }
  
  public void setProcesador(String text) {
    this.procesador.setText(text);
  }

  public void setVenudes(int num) {
    this.venudes.setText(Integer.toString(num));
  }

  // jocs
  public void setAny(int num) {
    this.any.setText(Integer.toString(num));
  }

  public void setTipus(String text) {
    this.tipus.setText(text);
  }

  public void setDescripcio(String text) {
    this.descripcio.setText(text);
  }


}
