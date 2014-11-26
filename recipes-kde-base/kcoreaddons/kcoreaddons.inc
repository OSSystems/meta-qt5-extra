SUMMARY = "Addons to QtCore"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRCREV = "cdc7f71a4072ec540618116c02bab0cd4ea4061e"
PV = "5.5.0"

PACKAGES =+ "${PN}-bin"

FILES_${PN} += "${datadir}"
FILES_${PN}-bin = "${bindir}/desktoptojson"
