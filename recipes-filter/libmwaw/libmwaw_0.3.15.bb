SUMMARY = "A library for import of many old Mac document formats"
HOMEPAGE = "http://sourceforge.net/projects/libmwaw"
LICENSE = " LGPLv2.1 & MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL;md5=a049c5e22d3bd7bc3c9a2e9135a6d104 \
    file://COPYING.MPL;md5=cce0d89a18de69e7f51f693182ac4a3e \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "4cda01e4c03c5d2a0f9b678ec13e0549"
SRC_URI[sha256sum] = "5396f30a1d459208eef6fdd3d642444fedc3c5c13d2e06372c3d30ef00011805"

inherit autotools-brokensep pkgconfig

DEPENDS = "librevenge"

BBCLASSEXTEND = "native"
