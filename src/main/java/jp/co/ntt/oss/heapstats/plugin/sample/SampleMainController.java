/*
 * Copyright (C) 2015 Nippon Telegraph and Telephone Corporation
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package jp.co.ntt.oss.heapstats.plugin.sample;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import jp.co.ntt.oss.heapstats.plugin.PluginController;
import jp.co.ntt.oss.heapstats.plugin.sample.tabs.SampleTab1Controller;
import jp.co.ntt.oss.heapstats.plugin.sample.tabs.SampleTab2Controller;

/**
 * FXML Controller for main window in Sample Plugin.
 *
 * @author KUBOTA Yuji
 */
public class SampleMainController extends PluginController implements Initializable {

    private ResourceBundle resource;

    @FXML
    private AnchorPane tab1;

    @FXML
    private SampleTab1Controller sampleTab1Controller;

    @FXML
    private AnchorPane tab2;

    @FXML
    private SampleTab2Controller sampleTab2Controller;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        super.initialize(url, rb);
        resource = rb;
    }

    @Override
    public String getPluginName() {
        return "Sample";
    }

    @Override
    public String getLicense() {
        return LICENSE_GPL_V2;
    }

    @Override
    public Map<String, String> getLibraryLicense() {
        // This sample plugin does not use any libraries.
        return null;
    }

    @Override
    public EventHandler<Event> getOnPluginTabSelected() {
        // This plugin does not return any actions when selected.
        return null;
    }

    @Override
    public Runnable getOnCloseRequest() {
        // This plugin does not request anything when closed.
        return null;
    }

}
