package com.robotpajamas.blueteeth.Callback;

import com.robotpajamas.blueteeth.BlueteethDevice;

import java.util.List;

public interface ScanCallback {
    public void call(List<BlueteethDevice> bleDevices);
}
