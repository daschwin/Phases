/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.de.htwg.phases.ui.internal.PhasesActivator;

public class PhasesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PhasesActivator.getInstance().getInjector("org.xtext.de.htwg.Phases");
	}

}
