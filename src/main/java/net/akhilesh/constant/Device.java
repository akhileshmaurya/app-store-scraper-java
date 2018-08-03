
package net.akhilesh.constant;

public enum Device {
    IPAD("iPadSoftware"), MAC("macSoftware"), ALL("software");
    String name;

    Device(String name) {
        this.name = name;
    }
}
