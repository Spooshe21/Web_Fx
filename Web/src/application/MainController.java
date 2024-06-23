/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController.java
 *   Project:  JavaFX WebEngine Example
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *             Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * Controller class for handling interactions with a WebView and WebEngine in
 * JavaFX.
 */
public class MainController implements Initializable {

	@FXML
	private WebView webView;
	private WebEngine engine;

	/**
	 * Initializes the controller class.
	 * 
	 * @param location  The location used to resolve relative paths for the root
	 *                  object, or null if the location is not known.
	 * @param resources The resources used to localize the root object, or null if
	 *                  the root object was not localized.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		engine = webView.getEngine();
	}

	/**
	 * Loads "https://www.google.com" into the WebView when btn1 is clicked.
	 * [[1](https://stackoverflow.com/questions/24847951/how-to-click-a-button-on-website-loaded-into-javafx-webengine)]
	 * 
	 * @param event The ActionEvent triggered by clicking btn1.
	 */
	public void btn1(ActionEvent event) {
		engine.load("https://www.google.com");
	}

	/**
	 * Executes a JavaScript command to change the window location to
	 * "https://www.online-convert.com/" when btn2 is clicked.
	 * [[4](https://www.tabnine.com/code/java/methods/javafx.scene.web.WebEngine/getDocument)]
	 * 
	 * @param event The ActionEvent triggered by clicking btn2.
	 */
	public void btn2(ActionEvent event) {
		engine.executeScript("window.location=\"https://www.online-convert.com/\";");
	}

	/**
	 * Loads a custom HTML content "<html><body>
	 * <h1>Hello World</h1></body></html>" into the WebView when btn3 is clicked.
	 * 
	 * @param event The ActionEvent triggered by clicking btn3.
	 */
	public void btn3(ActionEvent event) {
		engine.loadContent("<html><body><h1>Hello World</h1></body></html>");
	}

	/**
	 * Reloads the current page in the WebView when btn4 is clicked.
	 * 
	 * @param event The ActionEvent triggered by clicking btn4.
	 */
	public void btn4(ActionEvent event) {
		engine.reload();
	}
}
