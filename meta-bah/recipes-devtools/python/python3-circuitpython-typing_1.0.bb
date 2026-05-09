SUMMARY = "Adafruit CircuitPython Typing"
DESCRIPTION = "This recipe adds Adafruit CircuitPython Typing to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a089cc2176ad7f6066833cbef57695b0"
DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_Typing.git;protocol=https;branch=main"
SRCREV = "ebd10505dd733ed4df77391dcbf90d4bdaa7d45a"

inherit python_setuptools_build_meta python3native

S = "${WORKDIR}/git"
BBCLASSEXTEND = ""
