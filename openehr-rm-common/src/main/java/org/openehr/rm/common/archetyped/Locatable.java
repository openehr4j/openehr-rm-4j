package org.openehr.rm.common.archetyped;

import org.openehr.base_base_types.identification.UidBasedId;
import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.rm_common.archetyped.Archetyped;
import org.openehr.rm_common.archetyped.FeederAudit;
import org.openehr.rm_common.archetyped.Pathable;
import org.openehr.rm_data_types.text.DvText;

/**
 * Root class of all information model classes that can be archetyped. Most classes in the openEHR reference model inherit from the `LOCATABLE` class, which defines the idea of  locatability in an archetyped structure. `LOCATABLE` defines a runtime name and an `_archetype_node_id_`.
 */
public interface Locatable extends Pathable {
  /**
   * Runtime name of this fragment, used to build runtime paths. This is the term provided via a clinical application or batch process to name this EHR construct: its retention in the EHR faithfully preserves the original label by which this entry was known to end users.
   */
  DvText getName();

  /**
   * Design-time archetype identifier of this node taken from its generating archetype; used to build archetype paths. Always in the form of an at-code, e.g.  `at0005`. This value enables a 'standardised' name for this node to be generated, by referring to the generating archetype local terminology.
   */
  String getArchetypeNodeId();

  /**
   * Optional globally unique object identifier for root points of archetyped structures.
   */
  UidBasedId getUid();

  /**
   * Links to other archetyped structures (data whose root object inherits from `ARCHETYPED`, such as `ENTRY`, `SECTION` and so on). Links may be to structures in other compositions.
   */
  List<Link> getLinks();

  /**
   * Details of archetyping used on this node.
   */
  Archetyped getArchetypeDetails();

  /**
   * Audit trail from non-openEHR system of original commit of information forming the content of this node, or from a conversion gateway which has synthesised this node.
   */
  FeederAudit getFeederAudit();

  /**
   * Clinical concept of the archetype as a whole (= derived from the archetype_node_id' of the root node)
   */
  DvText concept();

  /**
   * True if this node is the root of an archetyped structure.
   */
  Boolean isArchetypeRoot();
}
