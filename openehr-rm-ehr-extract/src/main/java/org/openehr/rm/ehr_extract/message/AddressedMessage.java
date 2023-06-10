package org.openehr.rm.ehr_extract.message;

import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.rm_ehr_extract.message.Message;

/**
 * The concept of a message addressed to nominated recipients.
 */
public interface AddressedMessage {
  /**
   * Party sending the message.
   */
  String getSender();

  /**
   * Identification of message used by sender. This will be the same no matter how many times this message is sent to these recipients.
   */
  String getSenderReference();

  /**
   * Intended recipients, in the form of internet addresses.
   */
  List<String> getAddressees();

  /**
   * Urgency with which destination should deal with message:
   */
  Integer getUrgency();

  /**
   * The content of the message.
   */
  Message getMessage();
}
