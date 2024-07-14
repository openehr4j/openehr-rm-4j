package io.github.openehr4j.rm.demographic;

import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_actor_class">specifications.openehr.org</a>
 */
public interface Actor extends Party {

  List getLanguages();

  List getRoles();
}
