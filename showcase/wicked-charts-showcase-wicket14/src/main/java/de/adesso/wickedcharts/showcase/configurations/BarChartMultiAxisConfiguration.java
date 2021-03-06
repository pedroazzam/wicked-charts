package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
/**
 * A sample that shows how a multi-axis bar chart configuration looks.
 */

/**
 *
 * A sample that shows how a multi-axis bar chart configuration looks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/charts/bar/multi-axis.html">http://www.chartjs.org/samples/latest/charts/bar/multi-axis.html</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
@SuppressWarnings("serial")
public class BarChartMultiAxisConfiguration extends ShowcaseConfiguration{
	public BarChartMultiAxisConfiguration() {
		setType(ChartType.BAR);
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("Dataset 1")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false)
				.setYAxisID("y-axis-1");
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("Dataset 2")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(randomIntegerList(7)))
				.setFill(false)
				.setYAxisID("y-axis-2");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bar Chart - Multi Axis"))
				.setTooltips(new Tooltips()
						.setMode(TooltipMode.INDEX)
						.setIntersect(false))
				.setLegend(new Legend()
						.setPosition(Position.TOP))
				.setScales(new Scales()
						.setYAxes(Arrays.asList(new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.LEFT)
								.setId("y-axis-1"),
								new AxesScale()
								.setType("linear")
								.setDisplay(true)
								.setPosition(Position.RIGHT)
								.setId("y-axis-2")
								.setGridLines(new GridLines()
										.setDrawOnChartArea(false)))))
								
				;
		setOptions(options);
		
	}

}
