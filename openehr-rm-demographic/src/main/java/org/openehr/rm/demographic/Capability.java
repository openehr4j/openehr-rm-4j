package org.openehr.rm.demographic;

/**
 * Capability of a role, such as  ehr modifier,  health care provider. Capability should be backed up by credentials.
 */
public interface Capability extends Locatable {
  /**
   * The qualifications of the performer of the role for this capability. This might include professional qualifications and official identifications such as provider numbers etc.
   */
  ItemStructure getCredentials();

  /**
   * Valid time interval for the credentials of this capability.
   */
  DvINTERVAL<DVDATE> getTimeValidity();
}
