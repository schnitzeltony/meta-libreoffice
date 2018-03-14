SUMMARY = "Library for importing WordPerfect (tm) documents"
HOMEPAGE = "http://libwpd.sourceforge.net/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "50d575509d68c940e566c4a0581cd61a"
SRC_URI[sha256sum] = "323f68beaf4f35e5a4d7daffb4703d0566698280109210fa4eaa90dea27d6610"

inherit autotools pkgconfig perlnative

DEPENDS = "librevenge"
