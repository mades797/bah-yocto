SUMMARY = "Adafruit Extended Bus"
DESCRIPTION = "Helper Library for Blinka to allow creating I2C and SPI busio objects by passing in the Bus ID"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a21fcca821a506d4c36f7bbecc0d009"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/adafruit/Adafruit_Python_Extended_Bus.git;protocol=https;branch=main"
SRCREV = "5c21cb514a6b6f95b6ec67ef21e3d50ec5d8bcb1"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native
BBCLASSEXTEND = ""
