package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.paper.widget.PaperButton;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TodoList implements EntryPoint {

	public void onModuleLoad() {
		Polymer.importHref("iron-icons/iron-icons.html", new Function() {
			@Override
			public Object call(Object arg) {
				return null;
			}
		});
		startApplication();
	}

	private void startApplication() {
		RootPanel.get().add(new Main());
	}
}
