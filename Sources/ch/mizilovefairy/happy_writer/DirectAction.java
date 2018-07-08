package ch.mizilovefairy.happy_writer;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WORequest;

import ch.mizilovefairy.happy_writer.components.Main;
import er.extensions.appserver.ERXDirectAction;

/**
 * Hier werden alle Aktionen gespeichert welche keine Session brauchen.
 * 
 * @author Marco Selenati
 *
 */
public class DirectAction extends ERXDirectAction {
	public DirectAction(WORequest request) {
		super(request);
	}

	@Override
	/**
	 * Gibt die Hauptseite zurück.
	 */
	public WOActionResults defaultAction() {
		return pageWithName(Main.class.getName());
	}

	public Application application() {
		return (Application) WOApplication.application();
	}

	@Override
	public Session session() {
		return (Session) super.session();
	}
}
