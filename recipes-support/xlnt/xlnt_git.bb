SUMMARY = "Font rendering capabilities for complex non-Roman writing systems"
HOMEPAGE = "https://github.com/tfussell/xlnt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=edf9330898c89b4ef169be15be60107e"

inherit cmake

#DEPENDS += "freetype"

SRC_URI = "git://github.com/tfussell/xlnt.git;branch=master;protocol=https"
SRCREV = "e2262a0c65384416c8fb9263a057e7d0d3e381f6"
S = "${WORKDIR}/git"
PV = "1.4.0+git${SRCPV}"
