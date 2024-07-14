package org.openehr.rm.demographic;

import java.util.List;

import org.openehr.base.base_types.identification.PartyRef;




public interface Role extends Party {



  Object getTimeValidity();




  PartyRef getPerformer();




  List getCapabilities();
}
