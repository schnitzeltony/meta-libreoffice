SUMMARY = "A library for import of many old Mac document formats"
HOMEPAGE = "http://sourceforge.net/projects/libmwaw"
LICENSE = " LGPLv2.1 & MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL;md5=a049c5e22d3bd7bc3c9a2e9135a6d104 \
    file://COPYING.MPL;md5=cce0d89a18de69e7f51f693182ac4a3e \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "271c52cad27c92a02b0088c7d2d980db"
SRC_URI[sha256sum] = "9cf4b16ef1abf56ba5b9e2c7180c4901c34604c0160a36b6969a578ded8cbfa7"

inherit autotools-brokensep pkgconfig

DEPENDS = "librevenge"
