SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma cmake-lib

DEPENDS += " \
    baloo \
    kdeclarative \
    plasma-framework \
    kconfig \
    kactivities \
    krunner \
    kjsembed \
    knotifyconfig \
    kdesu \
    knewstuff \
    kwallet \
    kcmutils \
    kidletime \
    kdeclarative \
    kdewebkit \
    ktextwidgets \
    kdelibs4support \
    kxmlrpcclient \
    kcrash \
    networkmanager-qt \
    libksysguard \
    libkscreen \
    kwayland \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver libsm libxcb kwin", "", d)} \
    zlib \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4085a9bdd87706beeccfcc7dd09d5b85"
SRC_URI[sha256sum] = "95f5b2319ca0c63f883e5350760d234eb2ee1a57f21e612f9ac35b0ded467316"

SRC_URI += " \
    file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    \
    file://0002-align-phonon-path.patch \
    file://0003-fix-paths-in-startkde.patch \
    file://0004-startkde-add-meta-qt5-standard-binary-path-to-PATH.patch \
    file://0005-startkde-fix-path-for-start_kdeinit_wrapper.patch \
    file://0006-startkde-create-kde-s-home.patch \
    file://0007-startkde-enable-starting-X.patch \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "LibKWorkspace, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "LibKWorkspace, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "LibTaskManager, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[4] = "LibTaskManager, -S${includedir}, -S${STAGING_INCDIR}"

# REVISIT
FILES_${PN} += " \
    ${datadir} \
    ${libdir}/libkdeinit5*.so \
    ${libdir}/plugins \
    ${libdir}/qml \
"
FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/plugins/*/.debug \
    ${libdir}/plugins/*/*/.debug \
    ${libdir}/qml/org/kde/*/*/.debug \
    ${libdir}/qml/org/kde/*/*/*/.debug \
"

FILES_${PN}-dev = " \
    ${includedir} \
    ${libdir}/cmake \
    ${libdir}/libkworkspace5.so \
    ${libdir}/libweather_ion.so \
    ${libdir}/libplasma-geolocation-interface.so \
    ${libdir}/libtaskmanager.so \
"

# startkde requires:
RDEPENDS_${PN} += " \
    qttools-tools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "xsetroot xmessage", "", d)} \
"
