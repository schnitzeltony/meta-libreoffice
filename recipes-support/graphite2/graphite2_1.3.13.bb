SUMMARY = "Font rendering capabilities for complex non-Roman writing systems"
HOMEPAGE = "http://sourceforge.net/projects/silgraphite"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=acba2ba259d936c324b90ab679e6b901"

inherit cmake

DEPENDS += "freetype"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/silgraphite/${BPN}/${BPN}-${PV}.tgz"
SRC_URI[md5sum] = "29616d4f9651706036ca25c111508272"
SRC_URI[sha256sum] = "dd63e169b0d3cf954b397c122551ab9343e0696fb2045e1b326db0202d875f06"

EXTRA_OECMAKE += " \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

BBCLASSEXTEND = "native"
