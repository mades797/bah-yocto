#!/bin/bash

/home/maxime/bah-yocto/build/tmp/work/x86_64-linux/qemu-helper-native/1.0/recipe-sysroot-native/usr/bin/qemu-system-aarch64 \
    -object rng-random,filename=/dev/urandom,id=rng0 \
    -device virtio-rng-pci,rng=rng0 \
    -drive id=disk0,file=/home/maxime/bah-yocto/build/tmp/deploy/images/qemuarm64/rpi-bah-image-qemuarm64.rootfs.ext4,if=none,format=raw \
    -device virtio-blk-pci,drive=disk0 \
    -device qemu-xhci \
    -device usb-tablet \
    -device usb-kbd  \
    -machine virt \
    -cpu cortex-a57 \
    -smp 4 \
    -m 256 \
    -serial stdio \
    -device virtio-gpu-pci \
    -kernel /home/maxime/bah-yocto/build/tmp/deploy/images/qemuarm64/Image \
    -append 'root=/dev/vda rw  mem=256M ip=192.168.7.2::192.168.7.1:255.255.255.0::eth0:off:8.8.8.8 net.ifnames=0 swiotlb=0 '
