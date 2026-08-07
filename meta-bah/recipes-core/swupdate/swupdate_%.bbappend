# add current file path so that the interfaces file from here is used
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# append the configuration fragment to the source files
SRC_URI:append = " \
    file://fragment.cfg \
    file://update.sh \
"

do_install:append() {
    install -d /data/update
    install -m 0755 "${WORKDIR}/update.sh" "${D}${bindir}/update.sh"
}

inherit systemd
SYSTEMD_SERVICE:${PN} = "swupdate.service"
SYSTEMD_AUTO_ENABLE = "enable"
