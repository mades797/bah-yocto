SUMMARY = "Adafruit CircuitPython Display Shapes"
DESCRIPTION = "This recipe adds Adafruit CircuitPython Display Shapes to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc0ed144111aed525810fe35c34499ca"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_Display_Shapes.git;protocol=https;branch=main \
           file://0001-Corrected-license-field-in-pyproject.toml.patch \
           "
SRCREV = "7f0466c1d3ac344bb8ef282d09c5eb8c1a521d72"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native

# RDEPENDS:${PN} += "\
#     python3-adafruit-circuitpython-busdevice \
#     python3-circuitpython-typing \
#     python3-core \
#     python3-shell \
# "
BBCLASSEXTEND = ""
