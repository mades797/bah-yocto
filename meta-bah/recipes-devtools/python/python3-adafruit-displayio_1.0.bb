SUMMARY = "Adafruit CircuitPython DisplayIO"
DESCRIPTION = "This recipe adds Adafruit CircuitPython DisplayIO to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LICENSE.txt;md5=c8a713a68fc526c28e9946d088f455ce"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/adafruit/Adafruit_Blinka_Displayio.git;protocol=https;branch=main"
SRCREV = "cd4c7e1e743255bcec0dbdcfff42da7d8206d080"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native

RDEPENDS:${PN} += "python3-circuitpython-typing python3-typing-extensions"
BBCLASSEXTEND = ""
