
IMAGE_FEATURES += "ssh-server-openssh"

inherit core-image


IMAGE_FEATURES:append = " tools-debug allow-empty-password allow-root-login empty-root-password"
IMAGE_FEATURES:append = " ssh-server-openssh"

IMAGE_INSTALL:append = " xz 7z zram"
IMAGE_INSTALL:append = " networkmanager"
IMAGE_INSTALL:append = " i2c-tools"
IMAGE_INSTALL:append = " curl vim nano"
IMAGE_INSTALL:append = " zsh htop btop powertop iotop"
IMAGE_INSTALL:append = " stress-ng lmsensors iozone3 nvme-cli"
IMAGE_INSTALL:append = " iperf3 iftop ethtool"
IMAGE_INSTALL:append = " git"
IMAGE_INSTALL:append = " valgrind heaptrack"
IMAGE_INSTALL:append = " libgpiod-tools"
