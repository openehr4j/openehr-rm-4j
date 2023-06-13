package org.openehr.rm.ehr_extract.common;

import java.util.List;

import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.data_types.date_time.DvDateTime;

/**
 * Generic model of an Extract of some information from a repository.
 */
public interface Extract extends Locatable {
  /**
   * The content extracted and serialised from the source repository for this Extract.
   */
  List getChapters();

  /**
   * The specification that this Extract actually conforms to; might not be identical with the specification of the corresponding request.
   */
  ExtractSpec getSpecification();

  /**
   * Reference to causing Request, if any.
   */
  HierObjectId getRequestId();

  /**
   * Creation time of this Extract
   */
  DvDateTime getTimeCreated();

  /**
   * Identifier of creating system.
   */
  HierObjectId getSystemId();

  /**
   * Number of this Extract response in sequence of responses to Extract request identified by `_request_id_`. If this is the sole response, or there was no request, value is 1.
   */
  Integer getSequenceNr();

  /**
   * Participations relevant to the creation of this Extract.
   */
  List getParticipations();
}
