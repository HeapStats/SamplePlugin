# SamplePlugin
Sample plugin for HeapStatsFXAnalyzer to use as template project.

## Build

 1. mvn package

## How to use

 1. mv target/heapstats-analyzer-plugin-sample.jar /path/to/HeapStatsFXAnalyzer/lib/
 2. vi /path/to/HeapStatsFXAnalyzer/heapstats.properties
 
 ```
 plugins=jp.co.ntt.oss.heapstats.plugin.sample
 ```
 3. run HeapStatsFXAnalyzer
 
 ![Screenshot](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/screenshot.png)


# How to create your plugin

HeapStatsFXAnalyzer provides a tab window per controllers (plugins) as below.

![Plugin_And_Window](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/1_tab_is_1_plugin.png)

You can create your plugin by the below steps.

 1. Create a Controller class which extend jp.co.ntt.oss.heapstats.plugin.PluginController like [SampleMainController.java](https://github.com/HeapStats/SamplePlugin/blob/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample/SampleMainController.java).
 2. Create fxml and CSS file to design your view.
  * Example: [src/main/resources/../sample](https://github.com/HeapStats/SamplePlugin/tree/master/src/main/resources/jp/co/ntt/oss/heapstats/plugin/sample)

## Tips: Run your plugin as standalone

If you want to run your plugin as standalone, you need 

 * a main class to launch your plugin. 
  * For example, sample plugin includes main class ([SamplePlugin.java](https://github.com/HeapStats/SamplePlugin/blob/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample/SamplePlugin.java))
 * to set `heapstats-analyzer.jar` in the classpath
  * `java -cp .:/path/to/HeapStatsFXAnalyzer/heapstats-analyzer.jar:/path/to/yourplugin.jar <MainClass>`

## Tips: Separate Controller 

If you want to separate your big controller and fxml file, you can separate the nested fxml file like sample plugin.

![Controller_And_View](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/controllers.png)

 * [MainController](https://github.com/HeapStats/SamplePlugin/tree/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample)
 * [TabController](https://github.com/HeapStats/SamplePlugin/tree/master/src/main/java/jp/co/ntt/oss/heapstats/plugin/sample/tabs)

See also [Oracle's documentation](https://docs.oracle.com/javase/8/javafx/api/javafx/fxml/doc-files/introduction_to_fxml.html#nested_controllers).

# How to enable your plugin

You can enable your plugin by below steps. 
 
 1. Set your plugin (*.jar) to lib directory of HeapStatsFXAnalyzer.
 2. Edit `plugins` properties in heapstats.properties to add a package of your Controller.
