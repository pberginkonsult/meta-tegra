# APE audio support for devkit carrier boards with RT5640 codec (P3737, P4071)
#
# The AHUB subsystem requires the tegra-aconnect bus driver to enumerate
# child platform devices, since aconnect has no simple-bus fallback.
# Most modules use tegra210-compatible driver names that are shared
# across Tegra186/194/234/264 SoCs. The OOT replacements for these do not
# exist for current SoC targets, so the in-tree modules are used.
# snd-soc-tegra-controls is OOT-only (provides mixer-control compatible).

MACHINE_EXTRA_RDEPENDS += " \
    kernel-module-tegra-aconnect \
    kernel-module-snd-soc-tegra-audio-graph-card \
    kernel-module-snd-soc-tegra-pcm \
    kernel-module-snd-soc-tegra-controls \
    kernel-module-snd-soc-tegra186-asrc \
    kernel-module-snd-soc-tegra210-admaif \
    kernel-module-snd-soc-tegra210-adx \
    kernel-module-snd-soc-tegra210-ahub \
    kernel-module-snd-soc-tegra210-amx \
    kernel-module-snd-soc-tegra210-i2s \
    kernel-module-snd-soc-tegra210-mixer \
    kernel-module-snd-soc-tegra210-mvc \
    kernel-module-snd-soc-tegra210-ope \
    kernel-module-snd-soc-tegra210-sfc \
    kernel-module-snd-soc-rt5640 \
"
