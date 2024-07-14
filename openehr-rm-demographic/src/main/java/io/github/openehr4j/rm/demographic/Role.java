package io.github.openehr4j.rm.demographic;

import java.util.List;

import org.openehr.base.base_types.identification.PartyRef;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_role_class">specifications.openehr.org</a>
 */
public interface Role extends Party {

  Object getTimeValidity();

  PartyRef getPerformer();

  List getCapabilities();
}
