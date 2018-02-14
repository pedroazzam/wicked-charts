package de.adesso.wickedcharts.chartjs.chartoptions;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Tooltips {
	private TooltipMode mode;
	private Boolean intersect;
	private TooltipCallbacks callbacks;
	private FontStyle footerFontStyle;
}
