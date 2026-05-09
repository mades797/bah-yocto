FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://wpa_supplicant.conf \
            file://wpa_supplicant.service"

# We must run 'export BB_ENV_PASSTHROUGH_ADDITIONS="${BB_ENV_PASSTHROUGH_ADDITIONS} WIFI_SSID WIFI_PASSWORD" beforehand'
do_install:append () {
    cat ${WORKDIR}/wpa_supplicant.conf | sed "s/@WIFI_SSID@/${WIFI_SSID}/" | sed "s/@WIFI_PASSWORD@/${WIFI_PASSWORD}/" > ${D}${sysconfdir}/wpa_supplicant.conf
    chmod 644 ${D}${sysconfdir}/wpa_supplicant.conf
    install -m 644 ${WORKDIR}/wpa_supplicant.service ${D}${systemd_system_unitdir}/wpa_supplicant.service
}

SYSTEMD_SERVICE:${PN} = "wpa_supplicant.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"
