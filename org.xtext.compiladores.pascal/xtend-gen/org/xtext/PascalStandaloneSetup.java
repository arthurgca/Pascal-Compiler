/**
 * generated by Xtext 2.11.0
 */
package org.xtext;

import org.xtext.PascalStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PascalStandaloneSetup extends PascalStandaloneSetupGenerated {
  public static void doSetup() {
    new PascalStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
