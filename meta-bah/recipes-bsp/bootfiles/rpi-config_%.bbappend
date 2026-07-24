do_deploy:append() {
    echo "dtparam=audio=off" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtparam=i2s=on" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtoverlay=rpi-codeczero" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtoverlay=i2c-gpio,bus=3,i2c_gpio_sda=16,i2c_gpio_scl=12" >> ${DEPLOYDIR}/bootfiles/config.txt
}
