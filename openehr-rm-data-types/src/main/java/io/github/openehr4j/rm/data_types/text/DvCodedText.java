package io.github.openehr4j.rm.data_types.text;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_coded_text_class">specifications.openehr.org</a>
 */
public interface DvCodedText extends DvText {

  CodePhrase getDefiningCode();
}
