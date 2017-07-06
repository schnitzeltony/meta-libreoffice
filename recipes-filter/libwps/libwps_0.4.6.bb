SUMMARY = "Import filter library for MS Works"
HOMEPAGE = "https://sourceforge.net/projects/libwps/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = " \
    http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.xz \
    file://0001-g-7-try-to-remove-some-warnings.patch \
"
SRC_URI[md5sum] = "b04428f208e2eb31adcba5a53dec62c2"
SRC_URI[sha256sum] = "e48a7c2fd20048a0a8eaf69bad972575f8b9f06e7497c787463f127d332fccd0"

inherit autotools pkgconfig

DEPENDS = "librevenge"
