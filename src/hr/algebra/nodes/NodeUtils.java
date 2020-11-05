/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.nodes;

import java.io.File;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author IgorKvakan
 */
public class NodeUtils  {

    public static VBox createVBox() {
        VBox vBox = new VBox();
        vBox.setPrefWidth(100);
        vBox.setPrefHeight(150);
        vBox.setMaxWidth(vBox.USE_PREF_SIZE);
        vBox.setMaxHeight(vBox.USE_PREF_SIZE);
        vBox.setStyle("-fx-background-color:#DFFF; -fx-border-color: #0284d0; -fx-border-width: 2;");
        vBox.setAlignment(Pos.CENTER);

        ///mouse drag event!!!
        return vBox;

    }

    public static ImageView createImageView(Image image) {
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitWidth(95);
        imageView.setFitHeight(90);
        return imageView;
    }

    public static Label createAttDef(int attack, int defense) {

        Label lbl = new Label(String.valueOf(attack) + File.separator + String.valueOf(defense));
        return lbl;
    }

    public static Label createTitle(String title) {
        Label lbl = new Label(title);
        lbl.setTooltip(new Tooltip(title));
        return lbl;
    }
    
}
