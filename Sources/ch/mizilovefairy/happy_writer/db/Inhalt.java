package ch.mizilovefairy.happy_writer.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inhalt extends _Inhalt {
	private static final long serialVersionUID = 8853842655202391752L;

	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(Inhalt.class);

	/**
	 * Generiert die icon lokation aus dem namen.
	 * 
	 * @return Die icon lokation.
	 */
	public final String icon() {
		return "assets/inhalt/" + name() + ".jpg";
	}
}
