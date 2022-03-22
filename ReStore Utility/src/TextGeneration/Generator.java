package TextGeneration;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Generator {
	
	
	public static String getText(String invNum, String itmName, String salePrice, String WW, String HH, String DD){
        String result;
		String inventoryNumber = invNum;
        String itemName = itmName;
        String price = salePrice;
        String width = WW;
        String height = HH;
        String depth = DD;
        String filePrefix = "Habitat ReStore - " + inventoryNumber +
                            " - " + itemName + " " + price + " " + "()";
        String itemDescription = itemName + " " + inventoryNumber + " " + 
                                 "for sale at the Habitat for Humanity ReStore" +
                                 "\nPrice: " + price + "\n" + "Dimensions: " + width
                                 + "\"W x " + height + "\"H x " + depth + "\"D\n" +
                                 "All measurements approximate\n" +
                                 "Unfortunately, we do not ship. Local pickup only.\n" +
                                 "The Habitat for Humanity of Southern Santa Barbara County ReStore (Habitat ReStore) is a nonprofit home\n" + 
                                 "improvement store and donation center open to the public 5 days a week. The ReStore sells new and\n" + 
                                 "gently used furniture, appliance, home décor and building materials to the public at a fraction of the retail \n" + 
                                 "price. New inventory arrives every day. The ReStore is owned and operated by Habitat for Humanity of\n" + 
                                 "Southern Santa Barbara County, and proceeds are used to build more affordable Habitat for Humanity\n" + "homes for purchase by qualified low-income families in our community.\n" +
                                 "The Habitat ReStore accepts cash, credit and debit cards. Please bring your own truck and loading crew.\n" +
                                 "Unfortunately we do not accept returns.\n" +
                                 "For inquiries regarding this item or donations please call during ReStore's hours of operations:\n" + 
                                 "Sunday & Monday CLOSED\n" +
                                 "Tuesday 11:00 a.m. to 5:00 p.m\n" +
                                 "Wednesday 11:00 a.m. to 5:00 p.m\n" +
                                 "Thursday 11:00 a.m. to 5:00 p.m\n" +
                                 "Friday 11:00 a.m. to 5:00 p.m\n" +
                                 "Saturday 11:00 a.m. to 5:00 p.m\n" + "\n" +
                                 "Habitat ReStore\n" +
                                 "The Home Improvement Store That Builds Homes\n" +
                                 "6860 Cortona Drive, Suite A\n" +
                                 "Goleta, CA 93117\n" +
                                 "Phone 805-692-2226\n" + 
                                 "Have an item to donate? Call 805-692-2226.\n" +
                                 "www.sbhabitat.org\n";
        
        return result = "Made by Kristian Abad\n\n" + "File name prefix :\n\n" + filePrefix + "\n\n" 
                           +"Listing Name:\n\n" + itemName + " "+ inventoryNumber + "\n\n" 
        		           +"Item Description:\n\n" + itemDescription;
    }
}
