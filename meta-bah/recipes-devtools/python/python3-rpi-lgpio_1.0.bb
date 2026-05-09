SUMMARY = "RPI lgpio"
DESCRIPTION = "This recipe adds RPI lgpio to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=10a1f024ab54c55df5c7d1977af69e90"

DEPENDS += "python3-setuptools-scm-native"
SRC_URI = "git://github.com/waveform80/rpi-lgpio.git;protocol=https;branch=main"
SRCREV = "2debec30e78fca89abc83186b4d841f04c38930f"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native

BBCLASSEXTEND = ""
