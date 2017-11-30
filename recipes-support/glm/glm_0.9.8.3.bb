SUMMARY = "C++ mathematics library for graphics programming"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://copying.txt;md5=4431606d144252143c9c3df384a74cad"

inherit cmake

SRC_URI = "git://github.com/g-truc/glm.git"
# 0.9.8.3 tag
SRCREV = "6a1e2ec5d5e79e6d869c947cbdbcbb297bdf9d32"
S = "${WORKDIR}/git"

do_configure() {
    # for some reason simple tailored configure runs best
    mkdir -p ${B}
    cd ${B}
    # -DCMAKE_INSTALL_LIBDIR:PATH=${libdir} causes configur break with
    # | CMake Error: Could not open file for write in copy operation /usr/lib/cmake/glm/glmConfig.cmake.tmp
    # | CMake Error: : System Error: No such file or directory
    cmake \
        -DCMAKE_INSTALL_PREFIX:PATH=${prefix} \
        -DCMAKE_INSTALL_INCLUDEDIR:PATH=${includedir} \
        ${OECMAKE_SOURCEPATH}
}

FILES_${PN}-dev += "${libdir}/cmake"

BBCLASSEXTEND = "native"
