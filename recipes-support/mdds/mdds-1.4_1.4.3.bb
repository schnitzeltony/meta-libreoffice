SUMMARY = "A collection of multi-dimensional data structures and indexing algorithms"
HOMEPAGE = "https://gitlab.com/mdds/mdds"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=60a6093677ded88b5e28677e52a0c011"

inherit autotools-brokensep pkgconfig

SRC_URI = " \
    http://kohei.us/files/mdds/src/mdds-${PV}.tar.bz2 \
    file://0001-configure.ac-remove-fixed-paths-causing-trouble-when.patch \
"
SRC_URI[md5sum] = "0a30078082ea1cd50f32ec69499182db"
SRC_URI[sha256sum] = "25ce3d5af9f6609e1de05bb22b2316e57b74a72a5b686fbb2da199da72349c81"

S = "${WORKDIR}/mdds-${PV}"

DEPENDS = "boost"

BBCLASSEXTEND = "native"
