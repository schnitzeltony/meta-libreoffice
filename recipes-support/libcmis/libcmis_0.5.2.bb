SUMMARY = "C++ client library for the CMIS interface"
HOMEPAGE = "https://github.com/tdf/libcmis"
LICENSE = "MPL-1.1 & GPL-2.0-only & LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=0117647fecb9a932c25a7bbfc0333c37 \
    file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
    file://COPYING.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

SRC_URI = " \
    https://github.com/tdf/libcmis/releases/download/v${PV}/${BPN}-${PV}.tar.gz \
    file://0001-Avoid-cross-compile-unsafe-paths.patch \
"

SRC_URI[md5sum] = "e3ebb4f603e62e748685b6376d5719d9"
SRC_URI[sha256sum] = "ed6f681a48abbf3c2324564b17a180d21fa9503230e8708825e1ad80daee4f81"

inherit autotools pkgconfig

DEPENDS = "curl libxml2 cppunit boost"

EXTRA_OECONF = " \
    --without-man \
"

do_configure:prepend() {
    touch ${S}/README
}
