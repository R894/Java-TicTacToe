package TicTacToe.TicTacToe;
import javafx.scene.control.Button;

public class TicTacToe {
    private boolean xTurn;
    private Button[][] buttons;
    private boolean won;
    
    public TicTacToe(Button[][] buttons){
        xTurn = true;
        won = false;
        this.buttons = buttons;
    }
    public void mark(Button btn){
        if(btn.getText() != "X" && btn.getText() != "O"){
            if(xTurn){
                btn.setText("X");
                xTurn = !xTurn;
                return;
            }
            btn.setText("O");
            xTurn = !xTurn;
        }
    }
    public String getPreviousTurn(){
        if(xTurn){
            return "O";
        }
        return "X";
    }
    public String getCurrentTurn(){
        if(xTurn){
            return "X";
        }
        return "O";
    }
    
    public String checkWin(Button[][] buttons){
        //check horizontals
        for(int i=0; i<buttons.length; i++){
            if(buttons[i][0].getText() != " " && buttons[i][1].getText() != " " && buttons[i][0].getText() == buttons[i][1].getText() && buttons[i][1].getText() == buttons[i][2].getText()){
                System.out.println("WEEN" + getPreviousTurn());
                return buttons[i][0].getText();
            }
        }
        //check verticals
        for(int i=0; i<buttons.length; i++){
            if(buttons[0][i].getText() != " " &&buttons[1][i].getText() != " "  && buttons[0][i].getText() == buttons[1][i].getText() && buttons[1][i].getText() == buttons[2][i].getText()){
                System.out.println("WEEN"+ getPreviousTurn());
                return buttons[0][i].getText();
            }
        }
        //check diagonals
        if(buttons[0][0].getText() != " " && buttons[1][1].getText() != " "  && buttons[0][0].getText() == buttons[1][1].getText() &&  buttons[1][1].getText() == buttons[2][2].getText()){
            System.out.println("WEEN"+ getPreviousTurn());
            return buttons[0][0].getText();
        }
        
        if(buttons[0][0].getText() != " " && buttons[1][1].getText() != " " && buttons[0][2].getText() == buttons[1][1].getText() &&  buttons[1][1].getText() == buttons[2][0].getText()){
            System.out.println("WEEN"+ getPreviousTurn());
            return buttons[0][0].getText();
            
        }
        return null;
    }
    
}
