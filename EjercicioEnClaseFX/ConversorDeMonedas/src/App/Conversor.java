package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Conversor extends Application {

    @Override

    public void start(Stage primaryStage) throws Exception{


        try{

          System.out.println(getClass().getResource("/View/vista.fxml"));

          FXMLLoader loader = new FXMLLoader(
              getClass().getResource("/View/vista.fxml")
          ); 

          Scene scene = new Scene(loader.load());
          scene.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
    
          primaryStage.setTitle("Conversor de Monedas");
          primaryStage.setScene(scene);
          primaryStage.show();

      }catch(Exception e){

        e.printStackTrace();
      }

    }

    public static void main(String[] args){

        launch(args);
    }
    
}