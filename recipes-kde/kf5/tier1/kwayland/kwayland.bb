SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d70abca43cbf6e6a6eba9d79830bf1a1"
SRC_URI[sha256sum] = "756c711c2796629090169ae5b348bf3e1bdd03011f89f5b8bc71cbfd8d4f1d61"
