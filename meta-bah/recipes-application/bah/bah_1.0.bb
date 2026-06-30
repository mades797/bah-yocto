SUMMARY = "BAH"
DESCRIPTION = "TODO"
SECTION = "app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0c5aeb84cc8f2d4863f96e4424bed86"

SRC_URI = "git:///home/maxime/bah/;protocol=file;branch=main \
           file://bah.service \
"
SRCREV = "1c5a2508702938e5f1f1e82653c834335cb14f05"

S = "${WORKDIR}/git"

inherit systemd
inherit python_setuptools_build_meta
DEPENDS += "python3-setuptools-native python3-wheel-native"
SYSTEMD_SERVICE:${PN} = "bah.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/bah.service ${D}${systemd_system_unitdir}/bah.service
}

FILES:${PN} += "\
    ${systemd_system_unitdir}/bah.service \
    ${bindir}/main.py \
"
BBCLASSEXTEND = ""
