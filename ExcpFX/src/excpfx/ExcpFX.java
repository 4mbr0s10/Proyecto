
package excpfx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author dam1
 */
public class ExcpFX extends Application {
    int ballCenterX=10;
    @Override
    public void start(Stage primaryStage) {
          
        Pane root = new Pane();
        Scene scene=new Scene(root, 1280, 720);
        BackgroundImage myBI= new BackgroundImage(new Image("fondo.png",1280,720,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          BackgroundSize.DEFAULT);

    Background bg = new Background (myBI);
        
   root.setBackground(bg);
        
        primaryStage.setTitle("ExcepHunter");
        primaryStage.setScene(scene);
        primaryStage.show();
//        Circle sopapo = new Circle(10, 10, 10);
//        sopapo.setFill(Color.CHARTREUSE);
        Image imagenSopapo = new Image("sopapo.png");
        
        Polygon p = new Polygon();
        
        p.setLayoutX(10);
        p.setLayoutY(10);
        p.getPoints().add(50.0);
        p.getPoints().add(0.0);
        p.getPoints().add(100.0);
        p.getPoints().add(100.0);
        p.getPoints().add(0.0);
        p.getPoints().add(100.0);
        
        p.setFill(new ImagePattern(imagenSopapo, 0, 0, 1, 1, true));
        
        root.getChildren().add(p);
//        Image image = new Image("sopapo.png");
//        SopapoSprite sp = new SopapoSprite();
//        sp.setImage(image);
           Timeline animationBall = new Timeline(
           new KeyFrame(Duration.seconds(0.017), (ActionEvent ae) ->{
               p.setLayoutX(ballCenterX);
               ballCenterX+=6;
               System.out.println(ballCenterX);
           })
           ); 
                   animationBall.setCycleCount(Timeline.INDEFINITE);
                   animationBall.play();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
