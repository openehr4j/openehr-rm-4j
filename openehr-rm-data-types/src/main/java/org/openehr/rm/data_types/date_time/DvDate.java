package org.openehr.rm.data_types.date_time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base.foundation_types.time_types.Iso8601Date;




public interface DvDate extends DvTemporal, Iso8601Date {



  String getValue();




  Integer magnitude();




  Boolean isEqual(Object other);




  DvDate add(DvDate aDiff);




  DvDate subtract(DvDate aDiff);




  DvDuration diff(Object other);




  Boolean lessThan(Object other);




  Boolean isStrictlyComparableTo(Object other);
}
