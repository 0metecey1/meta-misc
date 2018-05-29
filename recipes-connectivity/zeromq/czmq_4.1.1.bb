DESCRIPTION = "High-level C Binding for ZeroMQ"
HOMEPAGE = "http://czmq.zeromq.org/"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

DEPENDS = "zeromq util-linux systemd"

SRC_URI = "http://github.com/zeromq/czmq/releases/download/v${PV}/czmq-${PV}.tar.gz" 

SRC_URI[md5sum] = "6d3a6fdd25c2bb29897c53670dce97bf"
SRC_URI[sha256sum] = "f00ff419881dc2a05d0686c8467cd89b4882677fc56f31c0e2cc81c134cbb0c0"

#S = "${WORKDIR}/czmq-${PV}"

EXTRA_OECONF += "--disable-drafts"

inherit autotools pkgconfig 

FILES_${PN}-dev += "${datadir}/zproject"

RDEPENDS_${PN}-dev = "zeromq-dev"
