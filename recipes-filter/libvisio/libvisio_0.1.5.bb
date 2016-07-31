SUMMARY = "A library for import of Microsoft Visio diagrams"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libvisio"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "691522167fe3b0c94becfe5d957883be"
SRC_URI[sha256sum] = "430a067903660bb1b97daf4b045e408a1bb75ca45e615cf05fb1a4da65fc5a8c"

inherit autotools pkgconfig

DEPENDS = "icu libxml2 librevenge"

BBCLASSEXTEND = "native"
