package main;
	
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
        public static void main(String[] args) {
		
                launch(args);
	}
        public void print(Stage stage,AnchorPane pane){
            Scene scene = new Scene(pane);
            stage.setTitle("Método Bolha");
            stage.setScene(scene);
            stage.show();
        }
        public void limpatela(GraphicsContext gc){
            gc.clearRect(0, 0, 800, 600);
        }
        public void carregatela(GraphicsContext gc,Elemento e,Elemento[] vetor){
            gc.setStroke(Color.RED);
            gc.strokeLine(10, 400, 765, 400);
            for(int i = 1; i<vetor.length;i++){
                if(i == e.getPrimeiro()){
                    Elemento aux = vetor[e.getPrimeiro()];
                    vetor[e.getPrimeiro()] = vetor[e.getSegundo()];
                    vetor[e.getSegundo()] = aux;
                    
                    
                }
            }
            for(int i = 1; i<=50; i++){
                        if(i == e.getPrimeiro() || i == e.getSegundo())
                            gc.setFill(Color.GREEN);
                        else
                            gc.setFill(Color.BLACK);
                        
                       
                    gc.fillRect(i*15,400 - vetor[i].getNum()*8 , 10, vetor[i].getNum()*8);
                    
                }
        }
        public void carregatelaS(GraphicsContext gc,Elemento e,Elemento[] vetor){
            gc.setStroke(Color.RED);
            gc.strokeLine(10, 400, 765, 400);
            for(int i = 1; i<vetor.length;i++){
                if(i == e.getPrimeiro()){
                    Elemento aux = vetor[e.getPrimeiro()];
                    vetor[e.getPrimeiro()] = vetor[e.getSegundo()];
                    vetor[e.getSegundo()] = aux;
                    
                    
                }
            }
            for(int i = 1; i<=50; i++){
                       
                       if(i<=e.getSegundo())
                           gc.setFill(Color.YELLOW);
                       else
                           gc.setFill(Color.GREEN);
                    gc.fillRect(i*15,400 - vetor[i].getNum()*8 , 10, vetor[i].getNum()*8);
                    
                }
        }
        public void full(GraphicsContext gc,Elemento[] vetor){
            for(int i = 1; i<=50; i++){
                        
                    gc.setFill(Color.RED);
                    
                    gc.fillRect(i*15,400 - vetor[i].getNum()*8 , 10, vetor[i].getNum()*8);
                    
                }
        }

        @Override
	public void start(Stage stage) {
                Elemento vetor1[] = new Elemento[51]; 
                Random rg = new Random();
               
                for(int i = 0; i<=50;i++){
                    int x = rg.nextInt(50);
                    if(x == 0)
                        x++;
                    vetor1[i] = new Elemento(x);
                    
                }
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(900, 500);
		
		Canvas c = new Canvas(900, 500);
		GraphicsContext  gc = c.getGraphicsContext2D();
		pane.getChildren().add(c);
		
		
		//setando a cor da linha
		gc.setStroke(Color.RED);
		
		//linha (x1, y1, x2, y2)
		gc.strokeLine(10, 400, 765, 400);
                print(stage,pane);
                
                Insertion zx = new Insertion();
                Bolha b = new Bolha();
                Quick qk = new Quick();
                Merge mg = new Merge();
                Selection sl = new Selection();
                Elemento vet[] = new Elemento[51];
                
                for(int i = 0; i<=50;i++){
                    vet[i] = new Elemento(vetor1[i].getNum());
                }
                
               
                ArrayList<Elemento> list = sl.Selec(vetor1);
                
                
                Timer timer = new Timer();
                TimerTask tarefa;
                tarefa = new TimerTask(){
                
                @Override
                public void run(){
                    
                    if(!list.isEmpty()){
                        Elemento e = list.get(0);
                        list.remove(0);
                        limpatela(gc);
                        carregatela(gc,e,vet);
                        
                    }else{
                        cancel();
                        limpatela(gc);
                        full(gc,vet);
                        System.out.print(".");
                    }
                }
                
                
            }; 
            
            timer.scheduleAtFixedRate(tarefa, 0, 100); 
            for(int i = 1; i<vetor1.length;i++)
                System.out.println(vetor1[i].getNum());
                
	}
	
	
}
