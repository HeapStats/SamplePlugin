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
package jp.co.ntt.oss.heapstats.plugin.sample.tabs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller for "Tab2" tab in Sample Plugin.
 *
 * @author KUBOTA Yuji
 */
public class SampleTab2Controller implements Initializable {
    
    @FXML
    private Label tab2label;
    
    private ResourceBundle rb;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        tab2label.setText(rb.getString("tab2.message"));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.rb = rb;
    }
    
}
