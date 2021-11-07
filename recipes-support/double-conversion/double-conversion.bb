SUMMARY = "Efficient binary-decimal and decimal-binary conversion routines"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ea35644f0ec0d9767897115667e901f"

SRC_URI = "git://github.com/google/double-conversion.git;branch=master;protocol=https"
SRCREV = "5fa81e88ef24e735b4283b8f7454dc59693ac1fc"
PV = "3.1.5"
S = "${WORKDIR}/git"

inherit cmake
