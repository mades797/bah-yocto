#!/bin/sh
set -e
FILE="$(find /data/update -type f -name "*.swu" | head -n 1)"
if [ -n "${FILE}" ]; then
    echo "Found update file: ${FILE}"
    CURRENT_PART="$(swupdate -g)"
    if [ "${CURRENT_PART}" = "/dev/mmcblk0p2" ]; then
        COPY="copy2"
    else
        COPY="copy1"
    fi
    echo "Using copy: ${COPY}"
    if ! mountpoint -q /boot; then
        mount /dev/mmcblk0p1 /boot/
    fi
    swupdate -e "stable,${COPY}" -H raspberrypi0-2w:1.0 -i "${FILE}" -v
    rm "${FILE}"
    reboot
else
    rm -rf /data/tmp/update
    echo "No update file found. Exiting."
fi
