package org.openehr.rm.demographic;

import org.openehr.rm_demographic.demographic.Party;

/**
 * An _intentional_ real-world agent, equivalent to a mind, either individual or aggregate. An Agent may have one or more Personae, each of which is characterised by one or more Capabilities.
 */
public interface Agent extends Party {
  /**
   * Languages which can be used to communicate with this actor, in preferred order of use (if known, else order irrelevant).
   */
  List<TerminologyTerm> getLanguages();

  /**
   * Personae of an Agent based on Capabilities. A Persona corresponds to the potential to act in a specific capability-based way, i.e. to have a competency or ability.
   */
  List<Persona> getPersonae();
}
