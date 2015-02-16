SUMMARY = "All KF5 packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup distro_features_check

TIER_1 = " \
    attica \
    karchive \
    kcodecs \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    kdnssd \
    kguiaddons \
    ki18n \
    kidletime \
    kimageformats \
    kitemmodels \
    kitemviews \
    kplotting \
    kwidgetsaddons \
    kwindowsystem \
    networkmanager-qt \
    solid \
    sonnet \
    threadweaver \
"

TIER_2 = " \
    kauth \
    kcompletion \
    kcrash \
    kdoctools \
    kjobwidgets \
    kpackage \
    kpty \
    kunitconversion \
"

TIER_3 = " \
    kactivities \
    kbookmarks \
    kcmutils \
    kconfigwidgets \
    kdeclarative \
    kded \
    kdesignerplugin \
    kdesu \
    kdewebkit \
    kemoticons \
    kglobalaccel \
    kiconthemes \
    kinit \
    kio \
    knewstuff \
    knotifications \
    knotifyconfig \
    kparts \
    kservice \
    ktexteditor \
    ktextwidgets \
    kwallet \
    kxmlgui \
    plasma-framework \
"

TIER_4 = " \
    frameworkintegration \
"

PORTING_AIDS_TIER_1 = " \
    kjs \
"

PORTING_AIDS_TIER_3 = " \
    kdelibs4support \
    khtml \
    kjsembed \
    krunner \
"

RDEPENDS_${PN} = " \
    ${TIER_1} \
    ${TIER_2} \
    ${TIER_3} \
    ${TIER_4} \
    ${PORTING_AIDS_TIER_1} \
    ${PORTING_AIDS_TIER_3} \
"