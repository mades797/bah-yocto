SUMMARY = "PiSugar"
DESCRIPTION = "This recipe adds PiSugar to the layer"
SECTION = "libs"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/PiSugar/pisugar-power-manager-rs.git;protocol=https;branch=master \
           file://0002-Added-result_flattening-feature.patch \
           file://0001-Fixed-compilation-warnings.patch \
           "
SRC_URI:append = " file://pisugar-server.service file://config.json"
SRCREV = "1327567b8baebb46e75fe2896e28282a4f1d538e"

FETCHCMD_wget = "${bindir}/env wget -t 2 -T 30 --user-agent='bitbake/2.0 (https://yoctoproject.org)'"

S = "${WORKDIR}/git"

require pisugar-crates.inc

RUSTFLAGS:append = " -A warnings"

inherit cargo cargo-update-recipe-crates

B = "${WORKDIR}/build"

inherit systemd
SYSTEMD_SERVICE:${PN} = "pisugar-server.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/pisugar-server.service ${D}${systemd_system_unitdir}/pisugar-server.service
    install -d ${D}${sysconfdir}/pisugar-server
    install -m 0644 ${WORKDIR}/config.json ${D}${sysconfdir}/pisugar-server/config.json
}

FILES:${PN} += "\
    ${sysconfdir}/pisugar-server/config.json \
    ${systemd_system_unitdir}/pisugar-server.service \
    ${bindir}/pisugar-programmer \
    ${bindir}/pisugar-server \
    ${bindir}/pisugar-poweroff \
"
BBCLASSEXTEND = ""
