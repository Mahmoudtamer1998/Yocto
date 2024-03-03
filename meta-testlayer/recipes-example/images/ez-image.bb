SUMMARY = "boot image for Ez-Medical devices"
inherit core-image
LICENSE = "MIT"
IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "usbutils"

