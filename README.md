# SamplePlugin

Sample plugin for HeapStats Analyzer to use as template project.

## Requirements

* JDK 13 or later
* Maven

## Build

```
$ mvn package
```

## How to use

1. Move sample plugin jar to `plugins` in HeapStats Analyzer

```
$ mv target/heapstats-analyzer-plugin-sample.jar /path/to/HeapStatsAnalyzer/plugins/
$ vim /path/to/HeapStatsAnalyzer/heapstats.properties
```
 
2. Set plugin FQCN to `plugins` entry as below:

```
plugins=jp.co.ntt.oss.heapstats.plugin.sample
```

3. run HeapStats Analyzer
 
 ![Screenshot](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/screenshot.png)

# How to create your plugin

HeapStats Analyzer provides a tab window per controllers (plugins) as below.

![Plugin_And_Window](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/1_tab_is_1_plugin.png)

You can create your plugin by the below steps.

1. Create a Controller class which is extended `jp.co.ntt.oss.heapstats.api.plugin.PluginController` like [SampleMainController.java](https://github.com/HeapStats/SamplePlugin/blob/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample/SampleMainController.java).
2. Create FXML and CSS file to design your view.
    * Example: [src/main/resources/../sample](https://github.com/HeapStats/SamplePlugin/tree/master/src/main/resources/jp/co/ntt/oss/heapstats/plugin/sample)
3. Create `module-info.java` and opens the package which contains Controller.

## Tips: Separate Controller 

If you want to separate your big controller and FXML file, you can separate the nested FXML file like sample plugin.

![Controller_And_View](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/controllers.png)

 * [MainController](https://github.com/HeapStats/SamplePlugin/tree/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample)
 * [TabController](https://github.com/HeapStats/SamplePlugin/tree/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample/tabs)

See also [Oracle's documentation](https://docs.oracle.com/javase/8/javafx/api/javafx/fxml/doc-files/introduction_to_fxml.html#nested_controllers).

# How to enable your plugin

You can enable your plugin by below steps. 
 
1. Set your plugin ( `*.jar` ) to `plugins` directory in HeapStats Analyzer.
2. Edit `plugins` properties in `heapstats.properties` to add a package of your Controller.
