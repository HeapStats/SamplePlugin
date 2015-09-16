# SamplePlugin
Sample plugin for HeapStatsFXAnalyzer to use as template project.

## How to create your plugin

HeapStatsFXAnalyzer provides a tab window per controllers (plugins) as below.

![Plugin_And_Window](https://raw.github.com/wiki/HeapStats/SamplePlugin/image/1_tab_is_1_plugin.png)

So you follow the below to create your plugin.

 1. You create a Controller class which extends jp.co.ntt.oss.heapstats.plugin.PluginController.
 2. You create 

## How to enable your plugin

You can enable your plugin by below.
 
 1. set your *.jar to lib directory of HeapStatsFXAnalyzer.
 2. edit `plugins` at heapstats.properties.
