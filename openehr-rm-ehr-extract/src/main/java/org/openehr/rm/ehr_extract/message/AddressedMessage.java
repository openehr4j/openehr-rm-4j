package org.openehr.rm.ehr_extract.message;

import java.util.List;

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
  List getAddressees();

  /**
   * Urgency with which destination should deal with message:
   */
  Integer getUrgency();

  /**
   * The content of the message.
   */
  Message getMessage();
}
