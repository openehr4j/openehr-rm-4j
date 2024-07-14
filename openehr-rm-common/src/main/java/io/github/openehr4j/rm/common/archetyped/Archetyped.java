package io.github.openehr4j.rm.common.archetyped;

import java.lang.String;
import org.openehr.base.base_types.identification.ArchetypeId;
import org.openehr.base.base_types.identification.TemplateId;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_archetyped_class">specifications.openehr.org</a>
 */
public interface Archetyped {

  ArchetypeId getArchetypeId();

  TemplateId getTemplateId();

  String getRmVersion();
}
