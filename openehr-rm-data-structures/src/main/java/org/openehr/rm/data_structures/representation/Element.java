package org.openehr.rm.data_structures.representation;

/**
 * The leaf variant of `ITEM`, to which a `DATA_VALUE` instance is attached.
 */
public interface Element extends Item {
  /**
   * Flavour of null value, e.g. `253&#124;unknown&#124;`, `271&#124;no information&#124;`, `272&#124;masked&#124;`, and `273&#124;not applicable&#124;`.
   */
  DvCodedText getNullFlavour();

  /**
   * Property representing leaf value object of `ELEMENT`. In real data, any concrete subtype of `DATA_VALUE` can be used.
   */
  DataValue getValue();

  /**
   * Optional specific reason for null value; if set, `_null_flavour_` must be set. Null reason may apply only to a minority of clinical data, commonly needed in reporting contexts.
   */
  DvText getNullReason();

  /**
   * True if value logically not known, e.g. if indeterminate, not asked etc.
   */
  void is_null();
}
