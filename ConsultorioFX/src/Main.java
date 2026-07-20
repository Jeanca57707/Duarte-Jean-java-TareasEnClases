import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application{


    @Override
    public void start(Stage primarStage)throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/registro_consulta.fxml"));

        Scene scene = new Scene(loader.load());

        primarStage.setTitle("Consultorio Médico");
        primarStage.setScene(scene);
        primarStage.show();

    }

    public static void main(String[] args) throws Exception{

        launch(args);
    }

}