SUMMARY = "boot image for Ez-Medical devices"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL += "usbutils"

#dropbear ssh server
IMAGE_FEATURES = "ssh-server-dropbear"

