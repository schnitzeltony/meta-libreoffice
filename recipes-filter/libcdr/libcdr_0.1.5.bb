SUMMARY = "CorelDraw file format importer library for LibreOffice"
HOMEPAGE = "https://wiki.documentfoundation.org/DLP/Libraries/libcdr"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "https://dev-www.libreoffice.org/src/libcdr/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "3040295f7a027c5bcdffbdb5bbdfd00a"
SRC_URI[sha256sum] = "6ace5c499a8be34ad871e825442ce388614ae2d8675c4381756a7319429e3a48"

inherit autotools pkgconfig

DEPENDS = "icu lcms librevenge"

BBCLASSEXTEND = "native"
