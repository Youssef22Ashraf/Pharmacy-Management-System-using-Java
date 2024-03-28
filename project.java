import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;


public class project extends drugs  {

private Stage stage;
private Scene scene;


/////////////////////////////////////////////////////////// add_attributes /////////////////////////////////////////////////////////////////

@FXML
public  TextField pharmacy_counter;
@FXML
public static int capa;
@FXML
public TextField name;
@FXML
public TextField idd;
@FXML
public TextField priced;
@FXML
public TextField quantitud;
@FXML
public TextField cat;
@FXML
public TextField drug_type;
@FXML
public AnchorPane scenePane;

///////////////////////////////////////////////////////////// remove_attributes //////////////////////////////////////////////////////////////////////////

@FXML
public TextField remove_id;
@FXML
public TextField remove_cat;

//////////////////////////////////////////////////////////// place_attributes ///////////////////////////////////////////////////////////////////////////

@FXML
public TextField place_id;

//////////////////////////////////////////////////////////// sales_attributes ///////////////////////////////////////////////////////////////////////////

@FXML
public TextField sales_id;
@FXML
public static double total_sales=0;
@FXML
public static int  quantity =0;
@FXML
public static int ccc;


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////// memory ////////////////////////////////////////////////////////////////////////////////////////

public void set_cap(){
    capa=Integer.parseInt(pharmacy_counter.getText());
    System.out.println(capa);
}


public static ArrayList < ArrayList<drugs> > pham_list = new ArrayList<ArrayList<drugs>>();
public static ArrayList<drugs> cosme_list = new ArrayList<drugs>();
public static ArrayList<drugs> pres_list = new ArrayList<drugs>();
public static ArrayList<drugs> other_list = new ArrayList<drugs>();


public project(){
    pham_list.add(cosme_list);
    pham_list.add(pres_list);
    pham_list.add(other_list); 
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////      windows       ////////////////////////////////////////////////////////////

public void home_window(ActionEvent event) throws IOException{
    Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void cap_window(ActionEvent event) throws IOException{
    Parent root= FXMLLoader.load(getClass().getResource("capacity.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}



public void add_window(ActionEvent event) throws IOException{ 
    Parent root= FXMLLoader.load(getClass().getResource("add.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show(); 
}

public void remove_window(ActionEvent event) throws IOException{
    Parent root= FXMLLoader.load(getClass().getResource("remove.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show(); 
}

public void place_window(ActionEvent event) throws IOException{  
    Parent root= FXMLLoader.load(getClass().getResource("place.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void sales_window(ActionEvent event) throws IOException{
    Parent root= FXMLLoader.load(getClass().getResource("sales.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////// add_functions //////////////////////////////////////////////////////////////////////////

public void add_drug(ActionEvent event){  
    if (capa != 0) {
    if ((cat.getText()).equals("cosmetics")) {                 
        drugs dd = new drugs();
        dd.setName(name.getText());
        dd.setId(Integer.parseInt(idd.getText()));
        dd.setPrice(Integer.parseInt(priced.getText()));
        dd.setAvailable_quantity(Integer.parseInt(quantitud.getText()));
        dd.setCatogery(cat.getText());
        cosme_list.add(dd);
        capa-= dd.getAvailable_quantity();

        System.out.println("alooooooooo cos "+capa);
    }
    else if ((cat.getText()).equals("prescription")) {
        drugs dd = new drugs();
        dd.setName(name.getText());
        dd.setId(Integer.parseInt(idd.getText()));
        dd.setPrice(Integer.parseInt(priced.getText()));
        dd.setAvailable_quantity(Integer.parseInt(quantitud.getText()));
        dd.setCatogery(cat.getText());
        pres_list.add(dd);  
        capa-= dd.getAvailable_quantity();
        System.out.println("alooooooooo pre"); 
    }
    else{  
        drugs dd = new drugs();
        dd.setName(name.getText());
        dd.setId(Integer.parseInt(idd.getText()));
        dd.setPrice(Integer.parseInt(priced.getText()));
        dd.setAvailable_quantity(Integer.parseInt(quantitud.getText()));
        dd.setCatogery(cat.getText());
        other_list.add(dd);
        capa-= dd.getAvailable_quantity();
        System.out.println("alooooooooo others");
    }
}else{
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("THE CAPACITY IS FULL");
        alert.showAndWait();
} 
    
    
   
}
    

    


public void show(ActionEvent event){   
    
        StringBuilder output = new StringBuilder(); 
        for (int i = 0; i < 3; i++) {
            if (i==0) {
                output.append("Cosmetics List:\n");
            }
            else if (i==1) {
                output.append("pres list:\n");
            }
            else{
                output.append("other list:\n");
            }
            for (int j = 0; j < (pham_list.get(i)).size(); j++){
                output.append(pham_list.get(i).get(j).getName()+"       \n");
                output.append(pham_list.get(i).get(j).getId()+"       \n");
                output.append(pham_list.get(i).get(j).getPrice()+"       \n");
                output.append(pham_list.get(i).get(j).getCatogery()+"       \n");
                output.append(pham_list.get(i).get(j).getAvailable_quantity()+"       \n");
            }    
        }
        
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("List Contents");
        alert.setHeaderText(null);
        alert.setContentText(output.toString());
        alert.showAndWait();

} 

public void exit(ActionEvent event) {
    Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
    confirmationAlert.setTitle("Exit Confirmation");
    confirmationAlert.setHeaderText(null);
    confirmationAlert.setContentText("Are you sure you want to exit?");
    confirmationAlert.showAndWait().filter(response -> response == ButtonType.OK).ifPresent(response -> Platform.exit());
}
  

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////// remove_functions ///////////////////////////////////////////////////////////////////////////




public void remove(ActionEvent e) {
    int i_D = Integer.parseInt(remove_id.getText());
    if (capa !=0) {
        
    
    if((remove_cat.getText()).equals("cosmetics")){  
        System.out.println("rrere");  
        for (int j = 0; j < (pham_list.get(0)).size(); j++){
            if ((i_D) == pham_list.get(0).get(j).getId() ){
                capa+= pham_list.get(0).get(j).getAvailable_quantity();
                cosme_list.remove(pham_list.get(0).get(j));
                
                System.out.println("donee");
            }
        }  
    }
    else if((remove_cat.getText()).equals("prescription")){
        for (int j = 0; j < (pham_list.get(1)).size(); j++){
            if (i_D== pham_list.get(1).get(j).getId() ){
                capa+= pham_list.get(1).get(j).getAvailable_quantity();
                pres_list.remove(pham_list.get(1).get(j));
            }
        } 
    }
    else{
        for (int j = 0; j < (pham_list.get(2)).size(); j++){
            if (i_D == pham_list.get(2).get(j).getId() ){
                capa+= pham_list.get(2).get(j).getAvailable_quantity();
                other_list.remove(pham_list.get(2).get(j));
            }
        } 
    }
}else{
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("THE CAPACITY IS EMPTY");
        alert.showAndWait();

}
   

}

/////////////////////////////////////////////////       place an order       //////////////////////////////////////////////////////////////////////

public void place_an_order(ActionEvent event){
    int place_idd = Integer.parseInt(place_id.getText());
    for (int i = 0; i < pham_list.size(); i++) {
        for (int j = 0; j < (pham_list.get(i)).size(); j++){
            if (place_idd == pham_list.get(i).get(j).getId() ){
                if (i == 0) {
                    System.out.println(pham_list.get(i).get(j).getPrice()*(1.2));
                    total_sales += pham_list.get(i).get(j).getPrice()*1.2;
                    quantity++;
                }
                else if (i == 1){
                    System.out.println(pham_list.get(i).get(j).getPrice());
                    total_sales += pham_list.get(i).get(j).getPrice();
                    quantity++;
                }
                else if (i == 2){
                    System.out.println(pham_list.get(i).get(j).getPrice());
                    total_sales += pham_list.get(i).get(j).getPrice();
                    quantity++;
                }
            }
            else{
                System.out.println("no drug");
            }
        }    
    }
    
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(" place order ");
    alert.setContentText(" Order is placed ");
    alert.showAndWait();   

}

//////////////////////////////////////////////////////      gett salees          ///////////////////////////////////////////////////////////////////////////

public void get_total_sales(ActionEvent event){
    System.out.println("total sales:"+total_sales);
    System.out.println("total sales:"+quantity); 
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("place order");
    alert.setContentText("total sales = "+ total_sales+" \n" + "quantity = "+ quantity);
    alert.showAndWait();
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}


