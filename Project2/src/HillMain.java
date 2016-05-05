import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.HTMLEditor;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class HillMain extends Application {
	
	  Stage window;
	  Button Lex;
	  HTMLEditor userInput;
	  String lexerOutput;
	  String codeColor = "Aqua";
	  String commentColor = "Green";
	  
	  @Override
	  public void start(Stage mainStage) throws Exception
	  {
	    BorderPane root = new BorderPane();
	    
	    //Set up window Stage
	    window = mainStage;
	    window.setTitle("HillMilestone2");
	    
	    //Set up the MenuBar
	    MenuBar menu = new MenuBar();
	    
	    //Set up the Menu 
	    Menu mColorScheme = new Menu("Color Schemes");
	    
	    //Adding Original Color option
	    MenuItem miOriginalColor = new MenuItem("Original Colors");
	    miOriginalColor.setOnAction(new EventHandler<ActionEvent>()
	    {
	      @Override
	      /**
	       * handle
	       * 
	       * This function sets the color scheme to the original colors, blue and green.
	       * 
	       * Parameters:
	       *   None
	       * 
	       * Return Values:
	       *   None
	       */
	      public void handle(ActionEvent arg0) 
	      {
	        codeColor = "Aqua";
	        commentColor = "Green";
	      }
	    }
	    );
	    
	    //Adding Light Color option
	    MenuItem miAlternateColors = new MenuItem("Alternate Colors");
	    miAlternateColors.setOnAction(new EventHandler<ActionEvent>()
	    {
	      @Override
	      /**
	       * handle
	       * 
	       * This function sets the color scheme to alternate colors, brown and purple
	       * 
	       * Parameters:
	       *   None
	       * 
	       * Return Values:
	       *   None
	       */
	      public void handle(ActionEvent arg0) 
	      {
	        codeColor = "Brown";
	        commentColor = "Purple";
	      }
	    }
	    );
	   
	    //Add the Colors to the color option bar
	    mColorScheme.getItems().addAll(miOriginalColor, miAlternateColors);
	    
	    //Add the Menu bar main item
	    menu.getMenus().addAll(mColorScheme);	
	    
	    //Set up new Button 
	    Lex = new Button();
	    Lex.setText("Run Lexer");
	    Lex.setOnAction(new EventHandler<ActionEvent>()
	    {
	      @Override
	      /**
	       * handle
	       * 
	       * This function ends the text to the lexer and then returns what lexer says
	       * 
	       * Parameters:
	       *   None
	       *   
	       * Return Values:
	       *   None
	       */
	      public void handle(ActionEvent arg0) 
	      {
	        String htmlText = filterHTML(userInput.getHtmlText());
	        lexerOutput = Lexer.lexString(htmlText,codeColor,commentColor);
	        userInput.setHtmlText(lexerOutput);
	      }
	    }
	    );
	    
	    //Set up new HTML editor
	    userInput = new HTMLEditor();
	    userInput.setMaxWidth(1000);
	    userInput.setMaxHeight(750);
	    
	    //Set up the layout
	    root.setTop(menu);
	    root.setCenter(userInput);
	    root.setBottom(Lex);
	    
	    Scene scene = new Scene(root, 1000, 800);
	    window.setScene(scene);
	    window.show();
	  }
	  
	  /**
	   * filterHTML
	   * 
	   * This function is removes the html tags from the string
	   * 
	   * Parameters:
	   *   htmlText: The text with the html in it
	   *   
	   * Return values:
	   *   filteredString: The plain text of the html given above
	   */
	  private String filterHTML(String htmlText) 
	  {
		//changes all the new lines to ~ so it can be read later
	    String newLine = htmlText.replaceAll("<p>", "~");	
	    String NBSP = newLine.replaceAll("&nbsp;", " ");
	    Pattern htmlPattern = Pattern.compile("<[^>]*>");
	    Matcher htmlMatcher = htmlPattern.matcher(NBSP);
	    final StringBuffer filteredString = new StringBuffer(NBSP.length());
	    while(htmlMatcher.find()) 
	    {
	      htmlMatcher.appendReplacement(filteredString, "");
	    }
	    htmlMatcher.appendTail(filteredString);
	    return filteredString.toString().trim();
	  }
	  
	  
	  /**
	   * main
	   * 
	   * This launches the gui when the program is run
	   * 
	   * Parameters:
	   *   args: arguments that the user may input and use
	   */
	  public static void main(String[] args)
	  {
	    launch(args);
	  }
}