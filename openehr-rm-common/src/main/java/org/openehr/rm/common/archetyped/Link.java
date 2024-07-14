package org.openehr.rm.common.archetyped;

import org.openehr.rm.data_types.text.DvText;
import org.openehr.rm.data_types.uri.DvEhrUri;




public interface Link {



  DvText getMeaning();




  DvText getType();




  DvEhrUri getTarget();
}
