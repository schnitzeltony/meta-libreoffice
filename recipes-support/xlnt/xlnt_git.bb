SUMMARY = "Font rendering capabilities for complex non-Roman writing systems"
HOMEPAGE = "https://github.com/tfussell/xlnt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=edf9330898c89b4ef169be15be60107e"

inherit cmake

#DEPENDS += "freetype"

SRC_URI = "git://github.com/tfussell/xlnt.git"
SRCREV = "f30260153fcee7e1f775f25ff0cb2750e7826296"
S = "${WORKDIR}/git"
PV = "1.3.0+git${SRCPV}"
