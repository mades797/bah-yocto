SUMMARY = "Adafruit CircuitPython DisplayIO SSD1306 driver"
DESCRIPTION = "This recipe adds Adafruit CircuitPython DisplayIO SSD1306 driver to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LICENSE.txt;md5=c8a713a68fc526c28e9946d088f455ce"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_DisplayIO_SSD1306.git;protocol=https;branch=main \
           file://0001-Corrected-license-fiels-in-pyproject.toml.patch;patchdir=.. \
           "
SRCREV = "8c7acd451ad53f7dc3b33a704c885032a03c1064"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native

RDEPENDS:${PN} += "\
    python3-adafruit-circuitpython-busdevice \
    python3-circuitpython-typing \
    python3-core \
    python3-shell \
"
BBCLASSEXTEND = ""
