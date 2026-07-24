do_install:append() {
    echo "UUID=${DATA_PART_UUID}    /data    ext4    defaults    0    0" >> ${D}${sysconfdir}/fstab
    echo "//${BAH_SERVER_ADDRESS}${BAH_SERVER_PATH} ${BAH_MOUNT_PATH} cifs username=${BAH_SERVER_USERNAME},password=${BAH_SERVER_PASSWORD},ro,noauto,x-systemd.automount,x-systemd.mount-timeout=10,soft,vers=3.0,echo_interval=5,actimeo=1 0 0" >> ${D}${sysconfdir}/fstab
}
