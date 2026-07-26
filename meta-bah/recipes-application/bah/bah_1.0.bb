SUMMARY = "BAH"
DESCRIPTION = "TODO"
SECTION = "app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0c5aeb84cc8f2d4863f96e4424bed86"
DEPENDS += "python3-setuptools-native python3-wheel-native"
SRC_URI = "git:///home/maxime/bah/;protocol=file;branch=feature/vlc \
           file://bah.service \
"
SRCREV = "48acec9b36ffcbf2f4b3fffe19892de791651982"
S = "${WORKDIR}/git"

inherit systemd
inherit python_setuptools_build_meta
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
