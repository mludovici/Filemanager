package com.kandinsky.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * PUNKT 3 - ButtonBar.
 * Zeigt eine Liste mit Buttons. Hier ist zu überlegen, ob die Buttons für beide Seiten angezeigt werden sollen,
 * oder nur für eine Seite.
 * @author schmidtb
 */

public class ButtonBar extends JPanel implements ActionListener {		
	
	JPanel buttonBar;
	JButton neuesFenster;	
	JButton zurück;
	JButton weiter;
	JButton hoch;
	JButton home;
	JButton aktualisieren;
	JButton vertauschen;
	JButton favoritenHinzufügen;
	JButton favoritenAnzeigen;
	JButton gruppieren;
	JButton ftpAnlegen;
	JButton ftpAnzeigen;
	JButton shellÖffnen;
	JButton hilfe;
	JButton einstellungen;	
	
	
	
	
	public ButtonBar() {
		
		//buttonBar = new JToolBar("Werkzeugleiste",0);
		buttonBar = new JPanel();		
		this.add(buttonBar);	
		//buttonBar.setPreferredSize(new Dimension(400,300)); 
		
		
		//Icon Quellen für die Buttons, am besten png
		//In welchem Ordner ? Im selben src Ordner oder woanders?
		Icon a = new ImageIcon(getClass().getResource(""));
		Icon b = new ImageIcon(getClass().getResource(""));
		Icon c = new ImageIcon(getClass().getResource(""));
		Icon d = new ImageIcon(getClass().getResource(""));
		Icon e = new ImageIcon(getClass().getResource(""));
		Icon f = new ImageIcon(getClass().getResource(""));
		Icon g = new ImageIcon(getClass().getResource(""));
		Icon h = new ImageIcon(getClass().getResource(""));
		Icon i = new ImageIcon(getClass().getResource(""));
		Icon j = new ImageIcon(getClass().getResource(""));
		Icon k = new ImageIcon(getClass().getResource(""));
		Icon l = new ImageIcon(getClass().getResource(""));
		Icon m = new ImageIcon(getClass().getResource(""));
		Icon n = new ImageIcon(getClass().getResource(""));
		Icon o = new ImageIcon(getClass().getResource(""));	
		
		//Buttons erstellen mit Icons
		neuesFenster =			new JButton("Neues Fenster",a);
		zurück = 				new JButton("Zurück",b);
		weiter = 				new JButton("Weiter",c);
		hoch =					new JButton("Hoch",d);
		home =					new JButton("Home",e);
		aktualisieren = 		new JButton("Aktualisieren",f);
		vertauschen = 			new JButton("Vertauschen",g);
		favoritenHinzufügen = 	new JButton("Favoriten hinzufügen",h);
		favoritenAnzeigen = 	new JButton("Favoriten anzeigen",i);
		gruppieren = 			new JButton("Gruppieren",j);
		ftpAnlegen = 			new JButton("FTP anlegen",k);
		ftpAnzeigen =			new JButton("FTP anzeigen",l);
		shellÖffnen = 			new JButton("Shell öffnen",m);
		hilfe =  				new JButton("Hilfe",n);
		einstellungen = 		new JButton("Einstellungen",o);
		
		
		//Buttons der buttonBar hinzufügen	
		buttonBar.add(neuesFenster);
		buttonBar.add(zurück);
		buttonBar.add(weiter);
		buttonBar.add(hoch);		
		buttonBar.add(home);
		buttonBar.add(aktualisieren);
		buttonBar.add(vertauschen);
		buttonBar.add(favoritenHinzufügen);
		buttonBar.add(favoritenAnzeigen);
		buttonBar.add(gruppieren);
		buttonBar.add(ftpAnlegen);
		buttonBar.add(ftpAnzeigen);
		buttonBar.add(shellÖffnen);
		buttonBar.add(hilfe);
		buttonBar.add(einstellungen);
		
		
		//ActionListener für die einzelnen Buttons		
		neuesFenster.addActionListener(this);
		zurück.addActionListener(this);
		weiter.addActionListener(this);
		hoch.addActionListener(this);
		home.addActionListener(this);
		aktualisieren.addActionListener(this);
		vertauschen.addActionListener(this);
		favoritenHinzufügen.addActionListener(this);
		favoritenAnzeigen.addActionListener(this);
		gruppieren.addActionListener(this);
		ftpAnlegen.addActionListener(this);
		ftpAnzeigen.addActionListener(this);
		shellÖffnen.addActionListener(this);
		hilfe.addActionListener(this);
		einstellungen.addActionListener(this);
		
		
	}

	//public class ButtonListener implements ActionListener {		
	
		@Override		
		public void actionPerformed(ActionEvent ae) {
			
			Object quelle = ae.getSource();			
		
			if (quelle == neuesFenster) {
				buttonBar.add(new JButton("GEKLICKT!"));
			}
		
			if (quelle == neuesFenster) {
			}
			
			if (quelle == zurück) {
			}
			
			if (quelle == weiter) {
			}
			
			if (quelle == hoch) {
			}
			
			if (quelle == home) {
			}
			
			if (quelle == aktualisieren) {
			}
			
			if (quelle == favoritenHinzufügen) {
			}
			
			if (quelle == favoritenAnzeigen) {
			}
			
			if (quelle == gruppieren) {
			}
			
			if (quelle == ftpAnlegen) {
			}
			
			if (quelle == ftpAnzeigen) {
			}
			
			if (quelle == shellÖffnen) {
			}
			
			if (quelle == hilfe) {
			}
			
			if (quelle == einstellungen) {
			}
			
			
			
		}
}
	
	


