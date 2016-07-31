SUMMARY = "Library for importing WordPerfect (tm) documents"
HOMEPAGE = "http://libwpd.sourceforge.net/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "79b56bcc349264d686a67994506ad199"
SRC_URI[sha256sum] = "efc20361d6e43f9ff74de5f4d86c2ce9c677693f5da08b0a88d603b7475a508d"

inherit autotools pkgconfig perlnative

DEPENDS = "librevenge"
