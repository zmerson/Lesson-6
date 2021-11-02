package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import model.GameElement;

public class Text extends GameElement{
    
    private String message;

    public Text(String message, int x, int y){
        super(x, y);
        this.message = message;
        super.color = Color.yellow;
    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(super.color);
        g2.setFont(new Font("Courier", Font.BOLD, 30));
        g2.drawString(message, super.x, super.y);
    }

    @Override
    public void move() {
        
    }
}
