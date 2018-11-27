import java.util.*;
import java.text.*;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.animation.*;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.effect.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.image.*;
import java.lang.Math.*;
import java.io.*;
public class SimpleMathgame extends Application
{
    // We keep track of the count, and label displaying the count:
    public static void main(String args[]){
        launch(args);
    }
    Stage stage;
    Button penjumlahan,pengurangan,perkalian,pembagian,operan,cek;
    BorderPane bpane;
    GridPane gpane;
    VBox vbox,vbox2;
    HBox hbox,hbox2;
    Text text,caption,equals,jumlah,operan1s,operan2s,hasils;
    Line line,line2,line3,line4;
    int score = 50;
    int operan1,operan2 ;
    String hasil1,hasil3;
    TextField question;
    public void start(Stage stage) {
        
        penjumlahan = new Button("Penjumlahan");
        pengurangan = new Button("Pengurangan");
        perkalian = new Button("Perkalian");
        pembagian = new Button("Pembagian");
        
        penjumlahan.setMaxWidth(Double.MAX_VALUE);
        pengurangan.setMaxWidth(Double.MAX_VALUE);
        perkalian.setMaxWidth(Double.MAX_VALUE);
        pembagian.setMaxWidth(Double.MAX_VALUE);
        
        penjumlahan.setOnAction(e -> Penjumlahan());
        pengurangan.setOnAction(e -> Pengurangan());
        perkalian.setOnAction(e -> Perkalian());
        pembagian.setOnAction(e -> Pembagian());
        
        caption = new Text();
        caption.setText("Game Matematika Sederhana");
        caption.setX(10);
        caption.setY(10);
        
        text = new Text();
        text.setText("Pilih salah satu tombol disebelah kiri untuk memulai permainan");
        text.setX(10);
        text.setY(10);
        
        vbox = new VBox(10,caption,penjumlahan,pengurangan,perkalian,pembagian);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));
        
        vbox2 = new VBox(text);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        
        bpane = new BorderPane();
        bpane.setLeft(vbox);
        bpane.setCenter(vbox2);
        bpane.setStyle("-fx-padding : 10;"+ 
                       "-fx-border-style : solid inside;"+
                       "-fx-border-width : 2;"+
                       "-fx-border-insets : 5;"+
                       "-fx-border-radius : 5;"+
                       "-fx-border-color: black;"+
                       "-fx-background-color : #384a68;");
        Scene scene = new Scene(bpane, 430, 200);
        stage.setTitle("Project PBO");
        stage.setScene(scene);
        stage.show();
    }
    public void Penjumlahan(){
        int value = this.score;
        String x = String.valueOf(value);
        Text skor = new Text();
        skor.setText("Skor = "+x);
        equals = new Text();
        equals.setText("=");
        jumlah = new Text();
        jumlah.setText("+");
        operan1s = new Text();
        operan2s = new Text();
        hasils = new Text();
        int operan1 = (int) (Math.random() * 11);
        this.operan1 = operan1;
        String c = String.valueOf(operan1);
        operan1s.setText(c);
        int operan2 = (int) (Math.random() * 11);
        this.operan2 = operan2;
        String a=String.valueOf(operan2);
        operan2s.setText(a);
        
        question = new TextField();
        
        //untuk view of operation
        int temp = this.operan1 + this.operan2;
        String f = String.valueOf(temp);
        this.hasil1 = f;
        
        cek = new Button("Cek Jawaban");
        cek.setOnAction(e -> exe());
        
        
        hbox2 = new HBox(10,cek);
        hbox2.setAlignment(Pos.CENTER);
        hbox = new HBox(10,operan1s,jumlah,operan2s,equals,question);
        hbox.setAlignment(Pos.CENTER);
        vbox2 = new VBox(10,skor,hbox,hbox2);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        vbox2.setStyle("-fx-padding : 10;"+ 
                       "-fx-border-style : solid inside;"+
                       "-fx-border-width : 2;"+
                       "-fx-border-insets : 5;"+
                       "-fx-border-radius : 5;"+
                       "-fx-border-color: red;"+
                       "-fx-background-image : url(tambah.png);"+
                       "-fx-background-repeat : no-repeat;");
        bpane.setCenter(vbox2);
    }
    public void Pengurangan(){
    int value = this.score;
        String x = String.valueOf(value);
        Text skor = new Text();
        skor.setText("Skor = "+x);
        equals = new Text();
        equals.setText("=");
        jumlah = new Text();
        jumlah.setText("-");
        operan1s = new Text();
        operan2s = new Text();
        hasils = new Text();
        int operan1 = (int) (Math.random() * 11);
        this.operan1 = operan1;
        String c = String.valueOf(operan1);
        operan1s.setText(c);
        int operan2 = (int) (Math.random() * 11);
        this.operan2 = operan2;
        String a=String.valueOf(operan2);
        operan2s.setText(a);
        question = new TextField();
        //untuk view of operation
        
        int temp = this.operan1 - this.operan2;
        String f = String.valueOf(temp);
        this.hasil1 = f;
        
        cek = new Button("Cek Jawaban");
        cek.setOnAction(e -> exe());
        
        hbox2 = new HBox(10,cek);
        hbox2.setAlignment(Pos.CENTER);
        hbox = new HBox(10,operan1s,jumlah,operan2s,equals,question);
        hbox.setAlignment(Pos.CENTER);
        vbox2 = new VBox(10,skor,hbox,hbox2);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        vbox2.setStyle("-fx-padding : 10;"+ 
                       "-fx-border-style : solid inside;"+
                       "-fx-border-width : 2;"+
                       "-fx-border-insets : 5;"+
                       "-fx-border-radius : 5;"+
                       "-fx-border-color: green;"+
                       "-fx-background-image : url(kurang.jpg);"+
                       "-fx-background-repeat : no-repeat;");
        bpane.setCenter(vbox2);
    }
    public void Perkalian(){
    int value = this.score;
        String x = String.valueOf(value);
        Text skor = new Text();
        skor.setText("Skor = "+x);
        equals = new Text();
        equals.setText("=");
        jumlah = new Text();
        jumlah.setText("x");
        operan1s = new Text();
        operan2s = new Text();
        hasils = new Text();
        int operan1 = (int) (Math.random() * 11);
        this.operan1 = operan1;
        String c = String.valueOf(operan1);
        operan1s.setText(c);
        int operan2 = (int) (Math.random() * 11);
        this.operan2 = operan2;
        String a=String.valueOf(operan2);
        operan2s.setText(a);
        question = new TextField();
        //untuk view of operation
        
        int temp = this.operan1 * this.operan2;
        String f = String.valueOf(operan1);
        this.hasil1 = f;
        
        cek = new Button("Cek Jawaban");
        cek.setOnAction(e -> exe());
        
        
        hbox2 = new HBox(10,cek);
        hbox2.setAlignment(Pos.CENTER);
        hbox = new HBox(10,operan1s,jumlah,operan2s,equals,question);
        hbox.setAlignment(Pos.CENTER);
        vbox2 = new VBox(10,skor,hbox,hbox2);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        vbox2.setStyle("-fx-padding : 10;"+ 
                       "-fx-border-style : solid inside;"+
                       "-fx-border-width : 2;"+
                       "-fx-border-insets : 5;"+
                       "-fx-border-radius : 5;"+
                       "-fx-border-color: yellow;"+
                       "-fx-background-image : url(kali.png);"+
                       "-fx-background-repeat : no-repeat;");
        bpane.setCenter(vbox2);
    }
    public void Pembagian(){
    int value = this.score;
        String x = String.valueOf(value);
        Text skor = new Text();
        skor.setText("Skor = "+x);
        equals = new Text();
        equals.setText("=");
        jumlah = new Text();
        jumlah.setText("/");
        operan1s = new Text();
        operan2s = new Text();
        hasils = new Text();
        int operan1 = (int) (Math.random() * 11);
        this.operan1 = operan1;
        String c = String.valueOf(operan1);
        operan1s.setText(c);
        int operan2 = (int) (Math.random() * 11);
        this.operan2 = operan2;
        String a=String.valueOf(operan2);
        operan2s.setText(a);
        question = new TextField();
        //untuk view of operation
        
        int a1 = this.operan1;
        int a2 = this.operan2;
        int temp = a1 * a2;
        int r = temp/a1;
        String f = String.valueOf(r);
        this.hasil1 = f;
        
        cek = new Button("Cek Jawaban");
        cek.setOnAction(e -> exe());
        
        hbox2 = new HBox(10,cek);
        hbox2.setAlignment(Pos.CENTER);
        hbox = new HBox(10,operan1s,jumlah,operan2s,equals,question);
        hbox.setAlignment(Pos.CENTER);
        vbox2 = new VBox(10,skor,hbox,hbox2);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        vbox2.setStyle("-fx-padding : 10;"+ 
                       "-fx-border-style : solid inside;"+
                       "-fx-border-width : 2;"+
                       "-fx-border-insets : 5;"+
                       "-fx-border-radius : 5;"+
                       "-fx-border-color: blue;"+
                       "-fx-background-image : url(bagi.png);"+
                       "-fx-background-repeat : no-repeat;");
        bpane.setCenter(vbox2);
    }
    public void exe(){
        stage = new Stage();
        Text text = new Text();
        String c = hasil1;
        
        Button kembali = new Button("Kembali");
        kembali.setOnAction(e ->Penjumlahan());
        
        if(question.getText().equals(c)){
            this.score = this.score + 5;
        }else{
            this.score = this.score - 5;
        }
        
        String skor = String.valueOf(this.score);
        text.setText(skor);
        
        vbox2 = new VBox(text,kembali);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        bpane.setCenter(vbox2);
    }
}
