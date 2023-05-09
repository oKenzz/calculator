import javax.swing.JButton;

public class Controller {
    
    private JButton additionButton = new JButton("+");
    private JButton subtractionButton = new JButton("-");
    private JButton multiplicationButton = new JButton("*");
    private JButton divisionButton = new JButton("/");
    private JButton rootButton = new JButton("√");
    private JButton powerButton = new JButton("x^y");
    private JButton moduloButton = new JButton("mod");
    private JButton naturallogButton = new JButton("ln");
    private JButton log10Button = new JButton("log");
    private JButton sinButton = new JButton("sin");
    private JButton cosButton = new JButton("cos");
    private JButton tanButton = new JButton("tan");
    private JButton asinButton = new JButton("asin");
    private JButton acosButton = new JButton("acos");
    private JButton atanButton = new JButton("atan");

    private JButton[] buttonList = {
        additionButton,
        subtractionButton,
        multiplicationButton,
        divisionButton,
        rootButton,
        powerButton,
        moduloButton,
        naturallogButton,
        log10Button,
        sinButton,
        cosButton,
        tanButton,
        asinButton,
        acosButton,
        atanButton
    };

    private View view;

    public Controller(View view){
        this.view = view;
        for(JButton button : buttonList){
            view.panel.add(button);
        }
        view.revalidate();
    }


}
