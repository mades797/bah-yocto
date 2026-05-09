SUMMARY = "Adafruit CircuitPython Display Text"
DESCRIPTION = "Adds Adafruit CircuitPython Display Text to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LICENSE.txt;md5=c8a713a68fc526c28e9946d088f455ce"
DEPENDS += "python3-setuptools-scm-native"
SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_Display_Text.git;protocol=https;branch=main \
           file://0001-Corrected-license-field-in-pyproject.toml.patch;patchdir=.. \
           "
SRCREV = "6450c7a3dc4c16c4af4b75eda549537dffb5a73c"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native
BBCLASSEXTEND = ""
