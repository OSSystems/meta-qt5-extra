SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde

SRCREV = "99314346bfba565a19c5f95579edc3b03593a975"

# required
DEPENDS += " \
	qttools \
	kcoreaddons \
	kconfig \
	kdoctools \
"
