DESCRIPTION = "Libre office base"
LICENSE = "GPLv3 & LGPLv3 & MPLv1.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING.LGPL;md5=6a6a8e020838b23406c81b19c1d46df6 \
    file://COPYING.MPL;md5=9741c346eef56131163e13b9db1241b3 \
"

require libreoffice-version.inc

SRC_URI += " \
    git://github.com/dagwieers/unoconv.git;destsuffix=git/unoconv;name=unoconv \
    file://0001-update-ax_boost-scripts-to-fix-configure-with-system.patch \
    file://0002-fix-gcc-build-error.patch \
    file://0003-upgrade-to-ICU-58.patch \
    file://0004-remove-dictmgr.hxx-to-be-compatible-with-later-hunsp.patch \
    file://0005-packedpixeliterator.hxx-fix-typo-detected-by-gcc7.patch \
    file://0006-Fix-build-with-recent-icu.patch \
    file://0007-fix-build-with-poppler-0.64.patch \
    file://0008-Make-virtual-ScValidationDlg-non-inline.patch \
"
SRCREV_unoconv = "260b815bf2c57118df439f381974f3f0987222a1"

inherit autotools-brokensep pkgconfig distutils-base perlnative

DEPENDS += " \
    python3-lxml-native \
    ccache-native \
    archive-zip-native \
    gperf-native \
    bison-native \
    zip-native \
"

EXTRA_OECONF = " \
    --without-doxygen \
    --enable-release-build \
    --disable-verbose \
    ${@oe.utils.parallel_make_argument(d, '--with-parallelism=%d')} \
    \
    --with-system-librevenge \
    --with-system-libabw \
    --with-system-libcdr \
    --with-system-libebook \
    --with-system-libfreehand \
"
