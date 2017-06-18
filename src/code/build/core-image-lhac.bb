DESCRIPTION = "A core-image-minimal image with some extras"
IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_LINGUAS = " "
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "python-modules python-pybluez python-pygatt python-flask python-scapy lighttpd hostapd dhcp-server linux-firmware-ralink"
