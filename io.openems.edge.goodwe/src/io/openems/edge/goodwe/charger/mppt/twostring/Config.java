package io.openems.edge.goodwe.charger.mppt.twostring;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(//
		name = "GoodWe Charger MPPT Two-String", //
		description = "Implements the GoodWe-ET MPPT with two strings as one Charger.")

@interface Config {
	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "charger0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;

	@AttributeDefinition(name = "Used MPPT", description = "MPPT port that is used with one or two strings")
	MpptPort mpptPort() default MpptPort.MPPT_1;

	@AttributeDefinition(name = "GoodWe ESS or Battery-Inverter", description = "ID of GoodWe Energy Storage System or Battery-Inverter.")
	String essOrBatteryInverter_id() default "batteryInverter0";

	@AttributeDefinition(name = "GoodWe ESS or Battery-Inverter target filter", description = "This is auto-generated by 'GoodWe ESS or Battery-Inverter'.")
	String essOrBatteryInverter_target() default "(enabled=true)";

	String webconsole_configurationFactory_nameHint() default "GoodWe Charger MPPT Two-String [{id}]";
}