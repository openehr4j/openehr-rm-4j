package org.openehr.rm.ehr_extract.common;

import java.lang.String;
import java.util.List;

/**
 * The manifest for one entity (e.g. EHR subject), identifying the entity and optionally specifying top-level items to be included in the Extract. The list actually included may be modified by the `_version_spec_` part of the specification, and also by the link_depth attribute. In repeat (standing order) requests, the final inclusion may be modified by the send_changes_only value for `EXTRACT_UPDATE_SPEC._update_method_`.
 */
public interface ExtractEntityManifest {
  /**
   * Identifier by which this entity is known in the Extract. May be one of the other identifiers, e.g. ehr_id or subject_id, or it may be something else, including a simple integer.
   */
  String getExtractIdKey();

  /**
   * EHR / EMR identifier for the entity at the target system.
   */
  String getEhrId();

  /**
   * Subject (i.e. patient or similar) identifier for the entity at the target system.
   */
  String getSubjectId();

  /**
   * Other identifiers that may be used to find the entity at the target system, keyed by type. May include medicare numbers, drivers license number, tax number etc.
   */
  List getOtherIds();

  /**
   * List of Uids of items to be included in the Extract, in cases where individual items are being requested by id. More typically, this attribute is not used, and the `EXTRACT_SPEC._criteria query_` defines the Extract contents. If set, for openEHR data, these are Uids identifying the version containers.
   */
  List getItemList();
}
