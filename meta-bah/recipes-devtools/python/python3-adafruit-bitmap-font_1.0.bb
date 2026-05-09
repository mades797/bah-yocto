SUMMARY = "Adafruit CircuitPython Bitmap Font"
DESCRIPTION = "Adds Adafruit CircuitPython Bitmap Font to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eabab13a6595c6c2c76eccef773808a"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_Bitmap_Font.git;protocol=https;branch=main \
           file://0001-Corrected-license-field-in-pyproject.toml.patch;patchdir=.. \
           "
SRCREV = "2b320bb26492b84d3ddabb2cd712d8db41a8b983"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native
BBCLASSEXTEND = ""
