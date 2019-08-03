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
    file://0001-Workaround-boost-library-detection-failures.patch \
"
SRCREV_unoconv = "260b815bf2c57118df439f381974f3f0987222a1"

inherit autotools pkgconfig python3native distutils3-base perlnative

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
    --enable-python=system \
    ${@oe.utils.parallel_make_argument(d, '--with-parallelism=%d')} \
    \
    --with-system-boost \
    --with-boost-date-time=boost_date_time \
    --with-boost-filesystem=boost_filesystem \
    --with-boost-locale=boost_locale\
    --with-boost-iostreams=boost_iostreams\
    --with-boost-system=boost_system\
    \
    --with-system-cairo \
    --with-system-epoxy \
    --with-system-curl \
    --with-system-libpng \
    --with-system-jpeg \
    --with-system-libxml \
    --with-system-graphite \
    --with-system-harfbuzz \
    --with-system-icu \
    --with-system-expat \
    --with-system-lcms2 \
    --with-system-nss \
    --with-system-cppunit \
    --with-system-libabw \
    --with-system-libcdr \
    --with-system-libebook \
    --with-system-libfreehand \
    --with-system-hunspell \
    --with-system-mythes \
    --with-system-clucene \
    --with-system-libcmis \
    --with-system-libpagemaker \
    --with-system-glm \
    --with-system-libetonyek \
    --with-system-libvisio \
    --with-system-libexttextcat \
    --with-system-altlinuxhyph \
    --with-system-neon \
    --with-system-librevenge \
    --with-system-libabw \
    --with-system-libcdr \
    --with-system-libebook \
    --with-system-libfreehand \
    --with-system-zlib \
"

