import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws IOException{
        try{
            Parent root= FXMLLoader.load(getClass().getResource("capacity.fxml"));

            Image img = new Image("img.png");
            stage.getIcons().add(img);
            
            Scene scene=new Scene(root,Color.GREEN);
            stage.setTitle("PHarmacy zeftt");                                                                                           
            stage.setScene(scene);
            stage.show();
            
        }
        catch(Exception e)
        {
            System.out.println("ffffffffffffffffffffffffffffffffffffff");
        }
     
    }
}
