package org.openehr.rm.demographic;

/**
 * A relationship between parties. In BFO terms, a Relational quality, i.e. a Quality that s-depends on the parties of the relation.
 */
public interface PartyRelationship extends EntityRelationship {
  /**
   * The Accountability type defining the scope of this relationship; typically a job post.
   */
  String getScoper();

  /**
   * Source of relationship, may be understood as 'owner' of relationship.
   */
  String getSource();

  /**
   * Target of relationship.
   */
  String getTarget();
}
