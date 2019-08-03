SUMMARY = "An ODF generator library"
HOMEPAGE = "https://sourceforge.net/p/libwpd/wiki/libodfgen"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/libwpd/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "ec7ce6c69aac83f8a9e6280d919b3cad"
SRC_URI[sha256sum] = "323e491f956c8ca2abb12c998e350670930a32317bf9662b0615dd4b3922b831"

inherit autotools pkgconfig perlnative

DEPENDS = "librevenge"

BBCLASSEXTEND = "native"
