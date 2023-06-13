package org.openehr.rm.ehr_extract.message;

import java.lang.Object;
import java.lang.String;
import org.openehr.rm.common.generic.AuditDetails;

/**
 * A “message” is an authored, possibly signed, piece of content intended for one or more recipients. Since the recipient may or may not be known directly, recipients are specified in the `ADDRESSED_MESSAGE` class.
 */
public interface Message {
  /**
   * Details of who actually created the message and when. This is the person who entered the data or otherwise caused the message to be created, or might be a piece of software.
   */
  AuditDetails getAudit();

  /**
   * Content of the message.
   */
  Object getContent();

  /**
   * Optional signature by the author of message content in openPGP format. The signature is created as a Hash and optional signing of the serialisation of this message object with this signature field Void.
   */
  String getSignature();
}
