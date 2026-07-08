FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "\
    file://asound.state \
"

do_install:append() {
    install -d ${D}${localstatedir}/lib/alsa
    install -m 0644 ${WORKDIR}/asound.state ${D}${localstatedir}/lib/alsa/asound.state
}
