package org.openehr.rm.common.archetyped;

import java.lang.String;
import org.openehr.base.base_types.identification.ArchetypeId;
import org.openehr.base.base_types.identification.TemplateId;




public interface Archetyped {



  ArchetypeId getArchetypeId();




  TemplateId getTemplateId();




  String getRmVersion();
}
