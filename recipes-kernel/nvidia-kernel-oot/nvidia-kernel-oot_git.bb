LIC_FILES_CHKSUM:remove = "file://nvdisplay/COPYING"

BASE_REPO = "github.com/OE4T/nvidia-kernel-oot;protocol=https"
BASE_BRANCH = "wip-r38.2.x"
SRCREV_base = "85fe6a011e79695270cef9e3a1a4d10abb6d28f3"

HWPM_REPO = "nv-tegra.nvidia.com/r/linux-hwpm;protocol=https"
HWPM_PATH = "hwpm"
HWPM_BRANCH = "rel-38"
SRCREV_hwpm = "927a33af1caac3deb42b7406dcd31eee5296b761"

TEGRA_DTS_REPO = "nv-tegra.nvidia.com/r/device/hardware/nvidia/tegra-public-dts;protocol=https"
TEGRA_DTS_PATH = "hardware/nvidia/tegra/nv-public"
TEGRA_DTS_BRANCH = "rel-38"
SRCREV_tegra-dts = "2101ccc1b1ef8267e63286332aed34891943c7c7"

T23X_DTS_REPO = "nv-tegra.nvidia.com/r/device/hardware/nvidia/t23x-public-dts;protocol=https"
T23X_DTS_PATH = "hardware/nvidia/t23x/nv-public"
T23X_DTS_BRANCH = "rel-38"
SRCREV_t23x-dts = "eddfded360c80bf6b0f54f1852b2645e3b192b05"

T264_DTS_REPO = "nv-tegra.nvidia.com/r/device/hardware/nvidia/t264-public-dts;protocol=https"
T264_DTS_PATH = "hardware/nvidia/t264/nv-public"
T264_DTS_BRANCH = "rel-38"
SRCREV_t264-dts = "46fba1fed6485235a74f8bdffe52051a27c3899c"

NVIDIA_OOT_REPO = "nv-tegra.nvidia.com/r/linux-nv-oot;protocol=https"
NVIDIA_OOT_PATH = "nvidia-oot"
NVIDIA_OOT_BRANCH = "rel-38"
SRCREV_nvidia-oot = "9ee2b0168619b3e18ce76c1f47300685c876d0fd"

NVETHERNETRM_REPO = "nv-tegra.nvidia.com/r/kernel/nvethernetrm;protocol=https"
NVETHERNETRM_PATH = "nvethernetrm"
NVETHERNETRM_BRANCH = "rel-38"
SRCREV_nvethernetrm = "b704cd863afe8c0aa9c53f1d60c9be1931ca3672"

KERNEL_DEVICETREE_REPO = "nv-tegra.nvidia.com/r/linux/kernel-devicetree.git;protocol=https"
KERNEL_DEVICETREE_PATH = "kernel-devicetree"
KERNEL_DEVICETREE_BRANCH = "rel-38"
SRCREV_kernel-devicetree = "d488feae6501566a90743e45729608bc5f2586f9"

UNIFIEDGPUDISP_REPO = "nv-tegra.nvidia.com/r/tegra/kernel-src/nv-unified-gpu-display-driver.git;protocol=https"
UNIFIEDGPUDISP_PATH = "unifiedgpudisp"
UNIFIEDGPUDISP_BRANCH = "rel-38"
SRCREV_unifiedgpudisp = "e3b791eb48d1c18ab0136c5af2c5aaf550bf9a22"

SRC_URI = " \
    git://${BASE_REPO};branch=${BASE_BRANCH};name=base \
    git://${HWPM_REPO};branch=${HWPM_BRANCH};subdir=${BP}/${HWPM_PATH};name=hwpm \
    git://${TEGRA_DTS_REPO};branch=${TEGRA_DTS_BRANCH};subdir=${BP}/${TEGRA_DTS_PATH};name=tegra-dts \
    git://${T23X_DTS_REPO};branch=${T23X_DTS_BRANCH};subdir=${BP}/${T23X_DTS_PATH};name=t23x-dts \
    git://${T264_DTS_REPO};branch=${T264_DTS_BRANCH};subdir=${BP}/${T264_DTS_PATH};name=t264-dts \
    git://${NVIDIA_OOT_REPO};branch=${NVIDIA_OOT_BRANCH};subdir=${BP}/${NVIDIA_OOT_PATH};name=nvidia-oot \
    git://${NVETHERNETRM_REPO};branch=${NVETHERNETRM_BRANCH};subdir=${BP}/${NVETHERNETRM_PATH};name=nvethernetrm \
    git://${KERNEL_DEVICETREE_REPO};branch=${KERNEL_DEVICETREE_BRANCH};subdir=${BP}/${KERNEL_DEVICETREE_PATH};name=kernel-devicetree \
    git://${UNIFIEDGPUDISP_REPO};branch=${UNIFIEDGPUDISP_BRANCH};subdir=${BP}/${UNIFIEDGPUDISP_PATH};name=unifiedgpudisp \
    "

SRC_URI:append = " \
    file://0001-nvethernet-add-symlink-to-nvethernetrm.patch;patchdir=nvidia-oot \
    file://0001-tegra264-ufs-provision.dts-make-build-reproducible.patch;patchdir=hardware/nvidia/t264/nv-public \
    "

SRCREV_FORMAT = "base"

PV = "rel-38+git"
DEFAULT_PREFERENCE = "-1"

require nvidia-kernel-oot.inc
