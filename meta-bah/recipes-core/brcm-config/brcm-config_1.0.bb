SUMMARY = "Add custom brcmfmac configuration file"
DESCRIPTION = "This is a workaround for failed WIFI connections. See https://archlinuxarm.org/forum/viewtopic.php?f=9&t=17095#p73046"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LICENSE.txt;md5=c8a713a68fc526c28e9946d088f455ce"
SRC_URI = "file://brcmfmac.conf"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/modprobe.d
    install -m 0644 ${WORKDIR}/brcmfmac.conf ${D}${sysconfdir}/modprobe.d/brcmfmac.conf
}
BBCLASSEXTEND = ""
