do_deploy:append() {
    echo "dtparam=audio=on" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtparam=audio_drive=1" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "dtoverlay=pwm-2chan,pin=18,func=2,pin2=13,func2=4" >> ${DEPLOYDIR}/bootfiles/config.txt
    echo "gpu_mem=16" >> ${DEPLOYDIR}/bootfiles/config.txt
}
