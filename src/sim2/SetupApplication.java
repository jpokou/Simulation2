/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sim2;

public class SetupApplication {

    
        ControleurTournoi controleur = new ControleurTournoi();
        UIConsole ui;
    
	public SetupApplication() {
		
            
            this.controleur = new ControleurTournoi();
            ui = new UIConsole(controleur);
            
            lancerApplication();
            
	}

	public void lancerApplication() {
            ui.menuPrincipal();
	}

}