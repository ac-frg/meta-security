SUMMARY = "IBM's Software TPM 2.0 TSS"
DESCRIPTION = "This is a user space TSS for TPM 2.0. It implements the \
functionality equivalent to (but not API compatible with) the TCG TSS \
working group's ESAPI, SAPI, and TCTI API's (and perhaps more) but with a \
hopefully simpler interface. \
It comes with over 110 'TPM tools' samples that can be used for scripted \
apps, rapid prototyping, education, and debugging. \
It also comes with a web based TPM interface, suitable for a demo to an \
audience that is unfamiliar with TCG technology. It is also useful for \
basic TPM management."
HOMEPAGE = "http://ibmswtpm.sourceforge.net/ibmtss2.html"
LICENSE = "BSD-2-Clause"
SECTION = "securty/tpm"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e023f61454ac828b4aa1bc4293f7d5f"

DEPENDS = "openssl ibmswtpm2"

inherit autotools pkgconfig

SRC_URI = "git://git.code.sf.net/p/ibmtpm20tss/tss;protocol=https;branch=master \
           file://0001-utils-12-Makefile.am-expand-wildcards-in-prereqs.patch \
          "
SRCREV = "0b9d77e304f68228b13b20ff0d72b0c16ffd2651"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+(\.\d+)+)"

EXTRA_OECONF = "--disable-tpm-1.2"
