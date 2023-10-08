import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    ClassLoader classLoader = getClass().getClassLoader();
    Image image = new Image(classLoader.getResourceAsStream(resourceName));

    img.setImage(image);
  }
  public void setTitle(String text) {
    this.title.setText(text);
  }

  // Personatges
  public void setColor(String text) {
    this.color.setText(text);
  }

  public void setNomDelVideojoc(String text) {

    this.nomDelVideojoc.setText(text);
  }

  // Consoles
  public void setData(String text) {
    this.data.setText(text);
  }
  
  public void setProcesador(String text) {
    this.procesador.setText(text);
  }

  public void setVenudes(int num) {
    this.venudes.setText(Integer.toString(num));
  }

  // Videojocs
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
