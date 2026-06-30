do_deploy:append() {
    # echo "dtparam=audio=off" >> ${DEPLOYDIR}/bootfiles/config.txt
    # echo "dtoverlay=vc4-kms-v3d,noaudio" >> ${DEPLOYDIR}/bootfiles/config.txt
    # echo "dtparam=i2s=on" >> ${DEPLOYDIR}/bootfiles/config.txt
    # echo "dtoverlay=rpi-codeczero" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtparam=i2c1=on" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtparam=i2c_arm=on" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtoverlay=vc4-fkms-v3d" >> ${DEPLOYDIR}/bootfiles/config.txt

    echo "dtparam=audio=off" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtoverlay=vc4-kms-v3d,noaudio" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtparam=i2s=on" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtoverlay=rpi-codeczero" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "force_turbo=1" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "avoid_pwm_pll=1" >> ${DEPLOYDIR}/bootfiles/config.txt

}
