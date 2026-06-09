version = "0.1.0"
description = "A scanner for detecting WebDAV misconfigurations and vulnerabilities."

dependencies {
    // Add any specific external libraries your WebDAV scanner needs here
}

zapAddOn {
    addOnName.set("WebDAV Scanner")
    addOnId.set("webdav")
    // Use "alpha" for new add-ons.
    // It will move to beta/release as it matures.
    addOnStatus.set(org.zaproxy.gradle.addon.AddOnStatus.ALPHA)
}
