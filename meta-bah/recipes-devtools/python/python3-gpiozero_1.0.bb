SUMMARY = "gpiozero"
DESCRIPTION = "This recipe adds gpiozero python package to the layer"
SECTION = "libs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=f7edfe7aeac02cb6c394726db07eb41c"
DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/gpiozero/gpiozero.git;protocol=https;branch=master \
           "
SRCREV = "a13848bd9701844c139709750cfa038c59b2ab5f"

S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python3native

RDEPENDS:${PN} += "python3-colorzero"
BBCLASSEXTEND = ""
