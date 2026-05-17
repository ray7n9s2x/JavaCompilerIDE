# org.gradle
## 构建命令
````bash
gradlew.bat clean build copyJdk createExe dist -debug
````

## 输出:
````log
2025-11-22T18:14:39.760+0800 [INFO] [org.gradle.internal.nativeintegration.services.NativeServices] Initialized native services in: C:\Users\Administrator\.gradle\native
2025-11-22T18:14:39.867+0800 [INFO] [org.gradle.internal.nativeintegration.services.NativeServices] Initialized jansi services in: C:\Users\Administrator\.gradle\native
2025-11-22T18:14:39.935+0800 [LIFECYCLE] [org.gradle.launcher.cli.DebugLoggerWarningAction] 
#############################################################################
   WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING

   Debug level logging will leak security sensitive information!

   For more details, please refer to https://docs.gradle.org/8.14/userguide/logging.html#sec:debug_security in the Gradle documentation.
#############################################################################

2025-11-22T18:14:40.011+0800 [DEBUG] [org.gradle.internal.nativeintegration.services.NativeServices] Native-platform posix files integration is not available. Continuing with fallback.
2025-11-22T18:14:40.123+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Intel(R) 82579V Gigabit Network Connection-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.123+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Intel(R) 82579V Gigabit Network Connection-QoS Packet Scheduler-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Intel(R) 82579V Gigabit Network Connection-WFP 802.3 MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IP)-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IP)-QoS Packet Scheduler-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IPv6)-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IPv6)-QoS Packet Scheduler-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (Network Monitor)-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.124+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (Network Monitor)-QoS Packet Scheduler-0000
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Kernel Debug Network Adapter
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Intel(R) 82579V Gigabit Network Connection
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:6160:e886:ab49:21a5%ethernet_32769
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IP)
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IPv6)
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (Network Monitor)
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (PPPOE)
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Software Loopback Interface 1
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? true
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding loopback address /0:0:0:0:0:0:0:1
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding loopback address /127.0.0.1
2025-11-22T18:14:40.125+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Broadcom BCM943228HM4L 802.11a/b/g/n 2x2 WiFi Adapter-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Broadcom BCM943228HM4L 802.11a/b/g/n 2x2 WiFi Adapter-Virtual WiFi Filter Driver-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Broadcom BCM943228HM4L 802.11a/b/g/n 2x2 WiFi Adapter-Native WiFi Filter Driver-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Broadcom BCM943228HM4L 802.11a/b/g/n 2x2 WiFi Adapter-QoS Packet Scheduler-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Broadcom BCM943228HM4L 802.11a/b/g/n 2x2 WiFi Adapter-WFP 802.3 MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter-Native WiFi Filter Driver-0000
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.126+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface 802.11n USB Wireless LAN Card-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface 802.11n USB Wireless LAN Card-Virtual WiFi Filter Driver-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface 802.11n USB Wireless LAN Card-Native WiFi Filter Driver-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface 802.11n USB Wireless LAN Card-QoS Packet Scheduler-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface 802.11n USB Wireless LAN Card-WFP 802.3 MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter-QoS Packet Scheduler-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter-WFP 802.3 MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #2-WFP Native MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.127+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #2-Native WiFi Filter Driver-0000
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #2-QoS Packet Scheduler-0000
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #2-WFP 802.3 MAC Layer LightWeight Filter-0000
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Broadcom BCM943228HM4L 802.11a/b/g/n 2x2 WiFi Adapter
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:f351:3d05:2790:fd10%wireless_32768
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:7873:85f8:8be4:3e1c%wireless_32769
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #2
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:1983:1ef0:1c6c:efa2%wireless_32770
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface 802.11n USB Wireless LAN Card
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.128+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /fe80:0:0:0:a872:eb65:7659:36b%wireless_32771
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding remote address /192.168.1.35
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #3
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Wi-Fi Direct Virtual Adapter #4
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft Teredo Tunneling Adapter
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft IP-HTTPS Platform Adapter
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface Microsoft 6to4 Adapter
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (SSTP)
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (IKEv2)
2025-11-22T18:14:40.129+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.130+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (L2TP)
2025-11-22T18:14:40.130+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.130+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Adding IP addresses for network interface WAN Miniport (PPTP)
2025-11-22T18:14:40.130+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.InetAddresses] Is this a loopback interface? false
2025-11-22T18:14:40.293+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for metadata, path C:\Users\Administrator\.gradle\caches\8.14\jvms\metadata.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@14bee915
2025-11-22T18:14:40.563+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Executing build c9e1bad7-8422-495b-8be5-18d32b03c351 in daemon client {pid=7096}
2025-11-22T18:14:40.569+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:14:40.573+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:14:40.579+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:14:40.584+0800 [INFO] [org.gradle.launcher.daemon.client.DefaultDaemonConnector] Found daemon DaemonInfo{pid=6008, address=[2eb1a187-9226-4850-b285-b604a24caf4e port:56960, addresses:[/127.0.0.1]], state=Idle, lastBusy=1763292999667, context=DefaultDaemonContext[uid=ed34197c-15f6-42f9-a906-f5bed498fbe2,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=6008,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]} however its context does not match the desired criteria.
At least one daemon option is different.
Wanted: DaemonRequestContext{jvmCriteria=C:\Program Files\Java\jdk-21 (no JDK specified, using current Java home), daemonOpts=[-XX:MaxMetaspaceSize=384m, -XX:+HeapDumpOnOutOfMemoryError, -Xms256m, -Xmx512m, -Dfile.encoding=UTF-8, -Duser.country=CN, -Duser.language=zh, -Duser.variant], applyInstrumentationAgent=true, nativeServicesMode=ENABLED, priority=NORMAL}
Actual: DefaultDaemonContext[uid=ed34197c-15f6-42f9-a906-f5bed498fbe2,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=6008,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]

  Looking for a different daemon...
2025-11-22T18:14:40.585+0800 [INFO] [org.gradle.launcher.daemon.client.DefaultDaemonConnector] Found daemon DaemonInfo{pid=11876, address=[47f2a4c6-7f96-449b-886e-3476c6d54c5b port:63443, addresses:[/127.0.0.1]], state=Idle, lastBusy=1763719603378, context=DefaultDaemonContext[uid=4925bb41-fcf3-4455-953e-3d71e167db37,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=11876,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-Xmx2867m,-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]} however its context does not match the desired criteria.
At least one daemon option is different.
Wanted: DaemonRequestContext{jvmCriteria=C:\Program Files\Java\jdk-21 (no JDK specified, using current Java home), daemonOpts=[-XX:MaxMetaspaceSize=384m, -XX:+HeapDumpOnOutOfMemoryError, -Xms256m, -Xmx512m, -Dfile.encoding=UTF-8, -Duser.country=CN, -Duser.language=zh, -Duser.variant], applyInstrumentationAgent=true, nativeServicesMode=ENABLED, priority=NORMAL}
Actual: DefaultDaemonContext[uid=4925bb41-fcf3-4455-953e-3d71e167db37,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=11876,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-Xmx2867m,-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]

  Looking for a different daemon...
2025-11-22T18:14:40.588+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpOutgoingConnector] Attempting to connect to [2df97824-2d25-4015-94dd-69deb14bf649 port:55248, addresses:[/127.0.0.1]].
2025-11-22T18:14:40.588+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpOutgoingConnector] Trying to connect to address /127.0.0.1.
2025-11-22T18:14:40.593+0800 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpOutgoingConnector] Connected to address /127.0.0.1:55248.
2025-11-22T18:14:40.689+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Connected to daemon DaemonInfo{pid=15596, address=[2df97824-2d25-4015-94dd-69deb14bf649 port:55248, addresses:[/127.0.0.1]], state=Idle, lastBusy=1763806429093, context=DefaultDaemonContext[uid=6a1271f6-d530-44da-bed3-d26dd11918a7,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=15596,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-XX:MaxMetaspaceSize=384m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]}. Dispatching request Build{id=c9e1bad7-8422-495b-8be5-18d32b03c351, currentDir=G:\12068900\java\JavaCompilerIDE}.
2025-11-22T18:14:40.689+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: dispatching class org.gradle.launcher.daemon.protocol.Build
2025-11-22T18:14:40.710+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Received result org.gradle.launcher.daemon.protocol.BuildStarted@a202ccb from daemon DaemonInfo{pid=15596, address=[2df97824-2d25-4015-94dd-69deb14bf649 port:55248, addresses:[/127.0.0.1]], state=Idle, lastBusy=1763806429093, context=DefaultDaemonContext[uid=6a1271f6-d530-44da-bed3-d26dd11918a7,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=15596,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-XX:MaxMetaspaceSize=384m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]} (build should be starting).
2025-11-22T18:14:40.712+0800 [INFO] [org.gradle.launcher.daemon.server.exec.LogToClient] The client will now receive all logging from the daemon (pid: 15596). The daemon log file: C:\Users\Administrator\.gradle\daemon\8.14\daemon-15596.out.log
2025-11-22T18:14:40.712+0800 [INFO] [org.gradle.launcher.daemon.server.exec.LogAndCheckHealth] Starting 10th build in daemon [uptime: 3 hrs 44 mins 29.031 secs, performance: 88%, GC rate: 0.00/s, heap usage: 0% of 512 MiB, non-heap usage: 22% of 384 MiB]
2025-11-22T18:14:40.713+0800 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] The daemon has started executing the build.
2025-11-22T18:14:40.713+0800 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] Executing build with daemon context: DefaultDaemonContext[uid=6a1271f6-d530-44da-bed3-d26dd11918a7,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=15596,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-XX:MaxMetaspaceSize=384m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]
2025-11-22T18:14:40.715+0800 [INFO] [org.gradle.internal.work.DefaultWorkerLeaseService] Using 4 worker leases.
2025-11-22T18:14:40.715+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on worker lease
2025-11-22T18:14:40.715+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Run build' started
2025-11-22T18:14:40.722+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for fileHashes, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes\fileHashes.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@3e5e5953
2025-11-22T18:14:40.723+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for file hash cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes)
2025-11-22T18:14:40.725+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on file hash cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes).
2025-11-22T18:14:40.725+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on file hash cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes).
2025-11-22T18:14:40.727+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for outputFiles, path G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup\outputFiles.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@154b94bb
2025-11-22T18:14:40.727+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for Build Output Cleanup Cache (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup)
2025-11-22T18:14:40.728+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Build Output Cleanup Cache (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup).
2025-11-22T18:14:40.729+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Build Output Cleanup Cache (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup).
2025-11-22T18:14:40.729+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for resourceHashesCache, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes\resourceHashesCache.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@3e5e5953
2025-11-22T18:14:40.731+0800 [INFO] [org.gradle.internal.watch.registry.impl.WatchableHierarchies] Now considering [G:\12068900\java\JavaCompilerIDE] as hierarchies to watch
2025-11-22T18:14:40.733+0800 [INFO] [org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner] Watching the file system is configured to be enabled if available
2025-11-22T18:14:40.733+0800 [DEBUG] [org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner] Watching the file system computed to be enabled if available
2025-11-22T18:14:40.733+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Build started for file system watching' started
2025-11-22T18:14:40.734+0800 [DEBUG] [org.gradle.internal.watch.vfs.impl.DefaultWatchableFileSystemDetector] Detected NTFS: C:\ from \Device\HarddiskVolume1 (remote: false)
2025-11-22T18:14:40.734+0800 [DEBUG] [org.gradle.internal.watch.vfs.impl.DefaultWatchableFileSystemDetector] Detected NTFS: D:\ from \Device\HarddiskVolume5 (remote: false)
2025-11-22T18:14:40.734+0800 [DEBUG] [org.gradle.internal.watch.vfs.impl.DefaultWatchableFileSystemDetector] Detected NTFS: E:\ from \Device\HarddiskVolume2 (remote: false)
2025-11-22T18:14:40.734+0800 [DEBUG] [org.gradle.internal.watch.vfs.impl.DefaultWatchableFileSystemDetector] Detected NTFS: F:\ from \Device\HarddiskVolume3 (remote: false)
2025-11-22T18:14:40.734+0800 [DEBUG] [org.gradle.internal.watch.vfs.impl.DefaultWatchableFileSystemDetector] Detected NTFS: G:\ from \Device\HarddiskVolume4 (remote: false)
2025-11-22T18:14:40.735+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Build started for file system watching'
2025-11-22T18:14:40.735+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Build started for file system watching' completed
2025-11-22T18:14:40.735+0800 [INFO] [org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner] File system watching is active
2025-11-22T18:14:40.735+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Load build' started
2025-11-22T18:14:40.737+0800 [DEBUG] [org.gradle.initialization.properties.DefaultProjectPropertiesLoader] Found env project properties: []
2025-11-22T18:14:40.737+0800 [DEBUG] [org.gradle.initialization.properties.DefaultProjectPropertiesLoader] Found system project properties: []
2025-11-22T18:14:40.740+0800 [DEBUG] [org.gradle.initialization.DefaultSettingsLoader] Loading build definition for build: ':'
2025-11-22T18:14:40.740+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Evaluate settings' started
2025-11-22T18:14:40.743+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] Starting Build
2025-11-22T18:14:40.744+0800 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Gradle user home: C:\Users\Administrator\.gradle
2025-11-22T18:14:40.744+0800 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Current dir: G:\12068900\java\JavaCompilerIDE
2025-11-22T18:14:40.745+0800 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Settings file: null
2025-11-22T18:14:40.746+0800 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Build file: null
2025-11-22T18:14:40.749+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply settings file 'settings.gradle' to settings 'JavaCompilerIDE'' started
2025-11-22T18:14:40.750+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for md5-checksums, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums\md5-checksums.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@3480fddd
2025-11-22T18:14:40.751+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for checksums cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums)
2025-11-22T18:14:40.753+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on checksums cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums).
2025-11-22T18:14:40.754+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on checksums cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums).
2025-11-22T18:14:40.754+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for sha1-checksums, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums\sha1-checksums.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@3480fddd
2025-11-22T18:14:40.754+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for sha256-checksums, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums\sha256-checksums.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@3480fddd
2025-11-22T18:14:40.755+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for sha512-checksums, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums\sha512-checksums.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@3480fddd
2025-11-22T18:14:40.756+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply settings file 'settings.gradle' to settings 'JavaCompilerIDE''
2025-11-22T18:14:40.756+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply settings file 'settings.gradle' to settings 'JavaCompilerIDE'' completed
2025-11-22T18:14:40.757+0800 [DEBUG] [org.gradle.initialization.ScriptEvaluatingSettingsProcessor] Timing: Processing settings took: 0.016 secs
2025-11-22T18:14:40.757+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] Settings evaluated using settings file 'G:\12068900\java\JavaCompilerIDE\settings.gradle'.
2025-11-22T18:14:40.758+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for workingDirs, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\vcsMetadata\workingDirs.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@2d638ff2
2025-11-22T18:14:40.761+0800 [DEBUG] [org.gradle.api.internal.artifacts.mvnsettings.DefaultLocalMavenRepositoryLocator] No local repository in Settings file defined. Using default path: C:\Users\Administrator\.m2\repository
2025-11-22T18:14:40.775+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for md-supplier, path C:\Users\Administrator\.gradle\caches\8.14\md-supplier\md-supplier.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@479a925
2025-11-22T18:14:40.776+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for cache directory md-supplier (C:\Users\Administrator\.gradle\caches\8.14\md-supplier)
2025-11-22T18:14:40.779+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on cache directory md-supplier (C:\Users\Administrator\.gradle\caches\8.14\md-supplier).
2025-11-22T18:14:40.781+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on cache directory md-supplier (C:\Users\Administrator\.gradle\caches\8.14\md-supplier).
2025-11-22T18:14:40.782+0800 [DEBUG] [org.gradle.internal.locking.LockFileReaderWriter] Lockfiles root: G:\12068900\java\JavaCompilerIDE\gradle\dependency-locks
2025-11-22T18:14:40.783+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for md-rule, path C:\Users\Administrator\.gradle\caches\8.14\md-rule\md-rule.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@30e88d3b
2025-11-22T18:14:40.784+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for cache directory md-rule (C:\Users\Administrator\.gradle\caches\8.14\md-rule)
2025-11-22T18:14:40.788+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on cache directory md-rule (C:\Users\Administrator\.gradle\caches\8.14\md-rule).
2025-11-22T18:14:40.791+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on cache directory md-rule (C:\Users\Administrator\.gradle\caches\8.14\md-rule).
2025-11-22T18:14:40.792+0800 [DEBUG] [org.gradle.caching.configuration.internal.DefaultBuildCacheConfiguration] Found class org.gradle.caching.local.internal.DirectoryBuildCacheServiceFactory registered for class org.gradle.caching.local.DirectoryBuildCache
2025-11-22T18:14:40.792+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Finalize build cache configuration' started
2025-11-22T18:14:40.792+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Finalize build cache configuration'
2025-11-22T18:14:40.792+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Finalize build cache configuration' completed
2025-11-22T18:14:40.793+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Evaluate settings'
2025-11-22T18:14:40.793+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Evaluate settings' completed
2025-11-22T18:14:40.793+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Load build'
2025-11-22T18:14:40.793+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Load build' completed
2025-11-22T18:14:40.793+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Configure build' started
2025-11-22T18:14:40.794+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Load projects' started
2025-11-22T18:14:40.795+0800 [DEBUG] [org.gradle.initialization.ProjectPropertySettingBuildLoader] Looking for project properties from: G:\12068900\java\JavaCompilerIDE\gradle.properties
2025-11-22T18:14:40.795+0800 [DEBUG] [org.gradle.initialization.ProjectPropertySettingBuildLoader] project property file does not exists. We continue!
2025-11-22T18:14:40.796+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Load projects'
2025-11-22T18:14:40.796+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Load projects' completed
2025-11-22T18:14:40.796+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify projectsLoaded listeners' started
2025-11-22T18:14:40.796+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] Projects loaded. Root project using build file 'G:\12068900\java\JavaCompilerIDE\build.gradle'.
2025-11-22T18:14:40.796+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] Included projects: [root project 'JavaCompilerIDE']
2025-11-22T18:14:40.796+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Notify projectsLoaded listeners'
2025-11-22T18:14:40.797+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify projectsLoaded listeners' completed
2025-11-22T18:14:40.797+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Configure project :' started
2025-11-22T18:14:40.797+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify beforeEvaluate listeners of :' started
2025-11-22T18:14:40.797+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Notify beforeEvaluate listeners of :'
2025-11-22T18:14:40.798+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.help-tasks to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:40.799+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :help' started
2025-11-22T18:14:40.799+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :help'
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :projects' started
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :projects'
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :tasks' started
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :tasks'
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :properties' started
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :properties'
2025-11-22T18:14:40.801+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :model' started
2025-11-22T18:14:40.801+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :model'
2025-11-22T18:14:40.801+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.help-tasks to root project 'JavaCompilerIDE''
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.software-reporting-tasks to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dependencyInsight' started
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :dependencyInsight'
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dependencies' started
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :dependencies'
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildEnvironment' started
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :buildEnvironment'
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :components' started
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :components'
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dependentComponents' started
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :dependentComponents'
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :outgoingVariants' started
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :outgoingVariants'
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :resolvableConfigurations' started
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :resolvableConfigurations'
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :artifactTransforms' started
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :artifactTransforms'
2025-11-22T18:14:40.805+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.software-reporting-tasks to root project 'JavaCompilerIDE''
2025-11-22T18:14:40.806+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.build-init to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:40.806+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :init' started
2025-11-22T18:14:40.806+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :init'
2025-11-22T18:14:40.807+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.build-init to root project 'JavaCompilerIDE''
2025-11-22T18:14:40.807+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.wrapper to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:40.808+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :wrapper' started
2025-11-22T18:14:40.808+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :wrapper'
2025-11-22T18:14:40.809+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.wrapper to root project 'JavaCompilerIDE''
2025-11-22T18:14:40.809+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :updateDaemonJvm' started
2025-11-22T18:14:40.809+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :updateDaemonJvm'
2025-11-22T18:14:40.810+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :javaToolchains' started
2025-11-22T18:14:40.810+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :javaToolchains'
2025-11-22T18:14:40.810+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :prepareKotlinBuildScriptModel' started
2025-11-22T18:14:40.810+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :prepareKotlinBuildScriptModel'
2025-11-22T18:14:40.812+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply build file 'build.gradle' to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:40.826+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of detachedConfiguration1' started
2025-11-22T18:14:40.837+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve dependencies of detachedConfiguration1'
2025-11-22T18:14:40.839+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'detachedConfiguration1'' started
2025-11-22T18:14:40.839+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration 'detachedConfiguration1''
2025-11-22T18:14:40.844+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of classpath' started
2025-11-22T18:14:40.900+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve dependencies of classpath'
2025-11-22T18:14:40.910+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' started
2025-11-22T18:14:40.911+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations: acquired lock on worker lease
2025-11-22T18:14:40.911+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)' started
2025-11-22T18:14:40.912+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 2: acquired lock on worker lease
2025-11-22T18:14:40.912+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)' started
2025-11-22T18:14:40.912+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve launch4j-2.5.4.jar (edu.sc.seis.launch4j:launch4j:2.5.4)' started
2025-11-22T18:14:40.912+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)'
2025-11-22T18:14:40.913+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve commons-logging-1.2.jar (commons-logging:commons-logging:1.2)' started
2025-11-22T18:14:40.913+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 3: acquired lock on worker lease
2025-11-22T18:14:40.913+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve launch4j-2.5.4.jar (edu.sc.seis.launch4j:launch4j:2.5.4)'
2025-11-22T18:14:40.913+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)'
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)' started
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve commons-logging-1.2.jar (commons-logging:commons-logging:1.2)'
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve flatlaf-1.0.jar (com.formdev:flatlaf:1.0)' started
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve launch4j-2.5.4.jar (edu.sc.seis.launch4j:launch4j:2.5.4)' completed
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)' completed
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)' started
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve flatlaf-1.0.jar (com.formdev:flatlaf:1.0)'
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)'
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)' started
2025-11-22T18:14:40.916+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)' completed
2025-11-22T18:14:40.916+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 3: released lock on worker lease
2025-11-22T18:14:40.916+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)'
2025-11-22T18:14:40.917+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)'
2025-11-22T18:14:40.917+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)' completed
2025-11-22T18:14:40.917+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)' completed
2025-11-22T18:14:40.917+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 2: released lock on worker lease
2025-11-22T18:14:40.917+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations: released lock on worker lease
2025-11-22T18:14:40.918+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration 'classpath''
2025-11-22T18:14:40.930+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' started
2025-11-22T18:14:40.931+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Fingerprint transform inputs' started
2025-11-22T18:14:40.931+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Fingerprint transform inputs'
2025-11-22T18:14:40.936+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' started
2025-11-22T18:14:40.937+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.939+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.939+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.944+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.945+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.946+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.946+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.947+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.948+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.949+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.949+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.949+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.950+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.950+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.951+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.951+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.952+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration 'classpath''
2025-11-22T18:14:40.953+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Fingerprint transform inputs' started
2025-11-22T18:14:40.953+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Fingerprint transform inputs'
2025-11-22T18:14:40.955+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Fingerprint transform inputs' started
2025-11-22T18:14:40.955+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Fingerprint transform inputs'
2025-11-22T18:14:40.956+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.956+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.957+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.957+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.958+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 4: acquired lock on worker lease
2025-11-22T18:14:40.958+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.958+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: launch4j-2.5.4.jar (edu.sc.seis.launch4j:launch4j:2.5.4)' started
2025-11-22T18:14:40.958+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 5: acquired lock on worker lease
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)' started
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 6: acquired lock on worker lease
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)' started
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)' started
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)'
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)' completed
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: launch4j-2.5.4.jar (edu.sc.seis.launch4j:launch4j:2.5.4)'
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: launch4j-2.5.4.jar (edu.sc.seis.launch4j:launch4j:2.5.4)' completed
2025-11-22T18:14:40.971+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: flatlaf-1.0.jar (com.formdev:flatlaf:1.0)' started
2025-11-22T18:14:40.971+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.973+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.973+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.974+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.974+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.974+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.974+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.975+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.975+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.976+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.976+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.976+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.977+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.977+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.977+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: flatlaf-1.0.jar (com.formdev:flatlaf:1.0)'
2025-11-22T18:14:40.978+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: flatlaf-1.0.jar (com.formdev:flatlaf:1.0)' completed
2025-11-22T18:14:40.978+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)' started
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: commons-logging-1.2.jar (commons-logging:commons-logging:1.2)' started
2025-11-22T18:14:40.979+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.979+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.979+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.981+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.981+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.981+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.981+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.983+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)'
2025-11-22T18:14:40.983+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)' completed
2025-11-22T18:14:40.983+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)' started
2025-11-22T18:14:40.983+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.983+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.984+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.984+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.987+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.987+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.988+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.988+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.987+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: commons-logging-1.2.jar (commons-logging:commons-logging:1.2)'
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: commons-logging-1.2.jar (commons-logging:commons-logging:1.2)' completed
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 5: released lock on worker lease
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)'
2025-11-22T18:14:40.991+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.991+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)' completed
2025-11-22T18:14:40.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.991+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.992+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 4: released lock on worker lease
2025-11-22T18:14:40.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)'
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute transform chain: xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)'
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)' completed
2025-11-22T18:14:40.996+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 6: released lock on worker lease
2025-11-22T18:14:40.997+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration 'classpath''
2025-11-22T18:14:40.998+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' started
2025-11-22T18:14:40.998+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration 'classpath''
2025-11-22T18:14:40.999+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.java to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.000+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.000+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.000+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.001+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :clean' started
2025-11-22T18:14:41.001+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :clean'
2025-11-22T18:14:41.001+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :assemble' started
2025-11-22T18:14:41.002+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :assemble'
2025-11-22T18:14:41.002+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :check' started
2025-11-22T18:14:41.002+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :check'
2025-11-22T18:14:41.003+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :build' started
2025-11-22T18:14:41.003+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :build'
2025-11-22T18:14:41.004+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.008+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.008+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.008+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.009+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.009+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.010+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.JvmEcosystemPlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.011+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.plugins.JvmEcosystemPlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.012+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.012+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.013+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.JvmToolchainsPlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.018+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.plugins.JvmToolchainsPlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.023+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildNeeded' started
2025-11-22T18:14:41.024+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :buildNeeded'
2025-11-22T18:14:41.029+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildDependents' started
2025-11-22T18:14:41.029+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :buildDependents'
2025-11-22T18:14:41.030+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.031+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.jvm-test-suite to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.032+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.testing.base.plugins.TestSuiteBasePlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.032+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.testing.base.plugins.TestSuiteBasePlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.033+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.jvm-test-suite to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.033+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.034+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.034+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.034+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.035+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.035+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.036+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.036+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.036+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.037+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.037+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.039+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.039+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.040+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :processResources' started
2025-11-22T18:14:41.040+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :processResources'
2025-11-22T18:14:41.041+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :compileJava' started
2025-11-22T18:14:41.041+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :compileJava'
2025-11-22T18:14:41.041+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :classes' started
2025-11-22T18:14:41.042+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :classes'
2025-11-22T18:14:41.043+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.043+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :jar' started
2025-11-22T18:14:41.044+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :jar'
2025-11-22T18:14:41.044+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.046+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.047+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.047+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.051+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.051+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.051+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.052+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.052+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :javadoc' started
2025-11-22T18:14:41.053+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :javadoc'
2025-11-22T18:14:41.054+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.054+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.057+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.059+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.060+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.060+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.060+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.061+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.061+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.061+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.062+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.062+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.062+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.063+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.063+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.064+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :processTestResources' started
2025-11-22T18:14:41.064+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :processTestResources'
2025-11-22T18:14:41.064+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :compileTestJava' started
2025-11-22T18:14:41.065+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :compileTestJava'
2025-11-22T18:14:41.065+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :testClasses' started
2025-11-22T18:14:41.066+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :testClasses'
2025-11-22T18:14:41.066+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.067+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.068+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.068+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.068+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :test' started
2025-11-22T18:14:41.069+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :test'
2025-11-22T18:14:41.069+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.069+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.070+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.070+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.070+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.070+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.071+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.071+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.071+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.072+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.072+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.073+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.073+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.073+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.java to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.074+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.application to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.074+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionPlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.074+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionBasePlugin to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.075+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionBasePlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.075+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.076+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :distZip' started
2025-11-22T18:14:41.076+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :distZip'
2025-11-22T18:14:41.076+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :distTar' started
2025-11-22T18:14:41.076+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :distTar'
2025-11-22T18:14:41.077+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :installDist' started
2025-11-22T18:14:41.077+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :installDist'
2025-11-22T18:14:41.077+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :assembleDist' started
2025-11-22T18:14:41.078+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :assembleDist'
2025-11-22T18:14:41.078+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.078+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionPlugin to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.079+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :run' started
2025-11-22T18:14:41.079+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :run'
2025-11-22T18:14:41.079+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :startScripts' started
2025-11-22T18:14:41.080+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :startScripts'
2025-11-22T18:14:41.081+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin org.gradle.application to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.083+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin edu.sc.seis.launch4j to root project 'JavaCompilerIDE'' started
2025-11-22T18:14:41.083+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.083+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.084+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :createExe' started
2025-11-22T18:14:41.095+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :createExe'
2025-11-22T18:14:41.096+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :createAllExecutables' started
2025-11-22T18:14:41.096+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :createAllExecutables'
2025-11-22T18:14:41.097+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :launch4j' started
2025-11-22T18:14:41.097+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :launch4j'
2025-11-22T18:14:41.098+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply plugin edu.sc.seis.launch4j to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.103+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :run' started
2025-11-22T18:14:41.104+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.105+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.106+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :run'
2025-11-22T18:14:41.106+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :jar' started
2025-11-22T18:14:41.107+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.107+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.109+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :jar'
2025-11-22T18:14:41.117+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :copyJdk' started
2025-11-22T18:14:41.118+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :copyJdk'
2025-11-22T18:14:41.119+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildExe' started
2025-11-22T18:14:41.119+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :buildExe'
2025-11-22T18:14:41.120+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dist' started
2025-11-22T18:14:41.120+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :dist'
2025-11-22T18:14:41.121+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :fullBuild' started
2025-11-22T18:14:41.121+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :fullBuild'
2025-11-22T18:14:41.123+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildInfo' started
2025-11-22T18:14:41.123+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Register task :buildInfo'
2025-11-22T18:14:41.124+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Apply build file 'build.gradle' to root project 'JavaCompilerIDE''
2025-11-22T18:14:41.125+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify afterEvaluate listeners of :' started
2025-11-22T18:14:41.125+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute Project.afterEvaluate listener' started
2025-11-22T18:14:41.125+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute Project.afterEvaluate listener'
2025-11-22T18:14:41.126+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute Project.afterEvaluate listener' started
2025-11-22T18:14:41.126+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute Project.afterEvaluate listener'
2025-11-22T18:14:41.126+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Notify afterEvaluate listeners of :'
2025-11-22T18:14:40.797+0800 [LIFECYCLE] [org.gradle.internal.logging.progress.ProgressLoggerFactory] 
2025-11-22T18:14:40.797+0800 [LIFECYCLE] [org.gradle.internal.logging.progress.ProgressLoggerFactory] > Configure project :
2025-11-22T18:14:40.797+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on state of build :
2025-11-22T18:14:40.797+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify beforeEvaluate listeners of :' completed
2025-11-22T18:14:40.799+0800 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' from state Registered to Created
2025-11-22T18:14:40.799+0800 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' to state Discovered.
2025-11-22T18:14:40.799+0800 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' to state Created.
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :help' completed
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :projects' completed
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :tasks' completed
2025-11-22T18:14:40.800+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :properties' completed
2025-11-22T18:14:40.801+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :model' completed
2025-11-22T18:14:40.801+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.help-tasks to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dependencyInsight' completed
2025-11-22T18:14:40.802+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dependencies' completed
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildEnvironment' completed
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :components' completed
2025-11-22T18:14:40.803+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dependentComponents' completed
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :outgoingVariants' completed
2025-11-22T18:14:40.804+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :resolvableConfigurations' completed
2025-11-22T18:14:40.805+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :artifactTransforms' completed
2025-11-22T18:14:40.806+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.software-reporting-tasks to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:40.806+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :init' completed
2025-11-22T18:14:40.807+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.build-init to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:40.809+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :wrapper' completed
2025-11-22T18:14:40.809+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.wrapper to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:40.809+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :updateDaemonJvm' completed
2025-11-22T18:14:40.810+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :javaToolchains' completed
2025-11-22T18:14:40.811+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :prepareKotlinBuildScriptModel' completed
2025-11-22T18:14:40.811+0800 [INFO] [org.gradle.configuration.project.BuildScriptProcessor] Evaluating root project 'JavaCompilerIDE' using build file 'G:\12068900\java\JavaCompilerIDE\build.gradle'.
2025-11-22T18:14:40.825+0800 [INFO] [org.gradle.plugin.use.internal.DefaultPluginRequestApplicator] Resolved plugin [id: 'java']
2025-11-22T18:14:40.825+0800 [INFO] [org.gradle.plugin.use.internal.DefaultPluginRequestApplicator] Resolved plugin [id: 'application']
2025-11-22T18:14:40.831+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Creating new in-memory cache for repo 'Gradle Central Plugin Repository' [2f8748e965ecb2135dad092e9ef808de].
2025-11-22T18:14:40.831+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration unspecified:unspecified:unspecified(detachedConfiguration1).
2025-11-22T18:14:40.834+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.834+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.834+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.835+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [1] from candidates [{org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-runtime}] for {}
2025-11-22T18:14:40.835+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4(runtime).
2025-11-22T18:14:40.835+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4(runtime) has no transitive incoming edges. ignoring outgoing edges.
2025-11-22T18:14:40.837+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\Administrator\.gradle\.tmp\gradle4113957121225793940.bin. Wrote root 3.
2025-11-22T18:14:40.838+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of detachedConfiguration1' completed
2025-11-22T18:14:40.838+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 configuration runtime from candidates [edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 configuration runtime] for {}
2025-11-22T18:14:40.838+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Detected non-existence of artifact 'edu.sc.seis.launch4j.gradle.plugin-2.5.4.jar (edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4)' in resolver cache
2025-11-22T18:14:40.839+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'detachedConfiguration1'' completed
2025-11-22T18:14:40.839+0800 [INFO] [org.gradle.plugin.use.internal.DefaultPluginRequestApplicator] Resolved plugin [id: 'edu.sc.seis.launch4j', version: '2.5.4']
2025-11-22T18:14:40.839+0800 [DEBUG] [org.gradle.internal.locking.LockFileReaderWriter] Lockfiles root: G:\12068900\java\JavaCompilerIDE\gradle\dependency-locks
2025-11-22T18:14:40.843+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration :JavaCompilerIDE:unspecified(classpath).
2025-11-22T18:14:40.843+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 to-conf: null is filtered.
2025-11-22T18:14:40.843+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: org.apache.logging.log4j:log4j-core:{require 2.17.1; reject [2.0, 2.17.1)} to-conf: null is filtered.
2025-11-22T18:14:40.847+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'Gradle Central Plugin Repository' [2f8748e965ecb2135dad092e9ef808de].
2025-11-22T18:14:40.848+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration :JavaCompilerIDE:unspecified(classpath).
2025-11-22T18:14:40.848+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.848+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.849+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.849+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api} attribute org.gradle.usage value {org.gradle.status=release, org.gradle.usage=java-api} doesn't requested value java-runtime
2025-11-22T18:14:40.850+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.dependency.bundling
2025-11-22T18:14:40.850+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.jvm.version
2025-11-22T18:14:40.850+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.plugin.api-version
2025-11-22T18:14:40.850+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation, org.gradle.status=release} doesn't requested value library
2025-11-22T18:14:40.850+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation, org.gradle.status=release} doesn't requested value library
2025-11-22T18:14:40.850+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-api} attribute org.gradle.usage value {org.gradle.status=release, org.gradle.usage=java-api} doesn't requested value java-runtime
2025-11-22T18:14:40.851+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't requested value library
2025-11-22T18:14:40.851+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-api} attribute org.gradle.usage value {org.gradle.status=release, org.gradle.usage=java-api} doesn't requested value java-runtime
2025-11-22T18:14:40.851+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't requested value library
2025-11-22T18:14:40.851+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [1] from candidates [{org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-runtime}] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.852+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4(runtime).
2025-11-22T18:14:40.854+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for edu.sc.seis.launch4j:launch4j:2.5.4 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.854+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'edu.sc.seis.launch4j:launch4j:2.5.4' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.855+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using edu.sc.seis.launch4j:launch4j:2.5.4 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.855+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api} attribute org.gradle.usage value {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.usage=java-api} doesn't requested value java-runtime
2025-11-22T18:14:40.856+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.plugin.api-version
2025-11-22T18:14:40.856+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:40.856+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:40.856+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [1] from candidates [{org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.857+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration edu.sc.seis.launch4j:launch4j:2.5.4(runtimeElements).
2025-11-22T18:14:40.860+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for net.sf.launch4j:launch4j:3.14 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.860+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'net.sf.launch4j:launch4j:3.14' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.860+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using net.sf.launch4j:launch4j:3.14 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.861+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.thoughtworks.xstream:xstream:1.4.19 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.861+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.thoughtworks.xstream:xstream:1.4.19' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.862+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.thoughtworks.xstream:xstream:1.4.19 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.862+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.sf.launch4j:launch4j:3.14(runtime).
2025-11-22T18:14:40.867+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.factories.LoggingExcludeFactory] {"operation": { "name": "anyOf", "operands": [{"exclude group" : "org.apache.ant"}, {"exclude group" : "net.java.abeille"}, {"exclude group" : "foxtrot"}, {"exclude group" : "com.thoughtworks.xstream"}, {"exclude group" : "com.jgoodies"}], "result": { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]} } }
2025-11-22T18:14:40.867+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] net.java.abeille:abeille is excluded from net.sf.launch4j:launch4j:3.14(runtime) by { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}.
2025-11-22T18:14:40.868+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] foxtrot:foxtrot is excluded from net.sf.launch4j:launch4j:3.14(runtime) by { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}.
2025-11-22T18:14:40.868+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] com.jgoodies:jgoodies-common is excluded from net.sf.launch4j:launch4j:3.14(runtime) by { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}.
2025-11-22T18:14:40.868+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] com.jgoodies:forms is excluded from net.sf.launch4j:launch4j:3.14(runtime) by { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}.
2025-11-22T18:14:40.868+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] com.thoughtworks.xstream:xstream is excluded from net.sf.launch4j:launch4j:3.14(runtime) by { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}.
2025-11-22T18:14:40.868+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] org.apache.ant:ant is excluded from net.sf.launch4j:launch4j:3.14(runtime) by { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}.
2025-11-22T18:14:40.875+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-beanutils:commons-beanutils:1.9.4 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.876+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-beanutils:commons-beanutils:1.9.4' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.876+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-beanutils:commons-beanutils:1.9.4 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.879+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-logging:commons-logging:1.2 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.879+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-logging:commons-logging:1.2' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.880+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-logging:commons-logging:1.2 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.880+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.formdev:flatlaf:1.0 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.880+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.formdev:flatlaf:1.0' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.880+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.formdev:flatlaf:1.0 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.881+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api} attribute org.gradle.usage value {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.usage=java-api} doesn't requested value java-runtime
2025-11-22T18:14:40.881+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.plugin.api-version
2025-11-22T18:14:40.881+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:40.881+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:40.881+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [1] from candidates [{org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.882+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.thoughtworks.xstream:xstream:1.4.19(runtime).
2025-11-22T18:14:40.884+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.github.x-stream:mxparser:1.2.2 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.884+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.github.x-stream:mxparser:1.2.2' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.884+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.github.x-stream:mxparser:1.2.2 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.885+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-beanutils:commons-beanutils:1.9.4(runtime).
2025-11-22T18:14:40.886+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.factories.LoggingExcludeFactory] {"operation": { "name": "anyOf", "operands": [{"exclude module id" : "commons-collections:commons-collections"}, { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}], "result": {"any of":  [{"exclude module id" : "commons-collections:commons-collections"}, { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}]} } }
2025-11-22T18:14:40.886+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] commons-collections:commons-collections is excluded from commons-beanutils:commons-beanutils:1.9.4(runtime) by {"any of":  [{"exclude module id" : "commons-collections:commons-collections"}, { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}]}.
2025-11-22T18:14:40.888+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-logging:commons-logging:1.2(runtime).
2025-11-22T18:14:40.890+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.factories.LoggingExcludeFactory] {"operation": { "name": "allOf", "operands": [{ "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}, {"any of":  [{"exclude module id" : "commons-collections:commons-collections"}, { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]}]}], "result": { "groups" : ["org.apache.ant", "net.java.abeille", "foxtrot", "com.thoughtworks.xstream", "com.jgoodies"]} } }
2025-11-22T18:14:40.890+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.formdev:flatlaf:1.0(runtimeElements).
2025-11-22T18:14:40.891+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.github.x-stream:mxparser:1.2.2(runtime).
2025-11-22T18:14:40.895+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for xmlpull:xmlpull:1.1.3.1 using repositories [Gradle Central Plugin Repository]
2025-11-22T18:14:40.895+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'xmlpull:xmlpull:1.1.3.1' in 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.896+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using xmlpull:xmlpull:1.1.3.1 from Maven repository 'Gradle Central Plugin Repository'
2025-11-22T18:14:40.896+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration xmlpull:xmlpull:1.1.3.1(runtime).
2025-11-22T18:14:40.899+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\Administrator\.gradle\.tmp\gradle4113957121225793940.bin. Wrote root 21.
2025-11-22T18:14:40.901+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of classpath' completed
2025-11-22T18:14:40.901+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 configuration runtime from candidates [edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 configuration runtime] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.906+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match edu.sc.seis.launch4j:launch4j:2.5.4 variant runtimeElements from candidates [edu.sc.seis.launch4j:launch4j:2.5.4 variant runtimeElements] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.907+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match adhoc variant for net.sf.launch4j:launch4j:3.14 from candidates [adhoc variant for net.sf.launch4j:launch4j:3.14] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.907+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match com.thoughtworks.xstream:xstream:1.4.19 configuration runtime from candidates [com.thoughtworks.xstream:xstream:1.4.19 configuration runtime] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.907+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match commons-beanutils:commons-beanutils:1.9.4 configuration runtime from candidates [commons-beanutils:commons-beanutils:1.9.4 configuration runtime] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.908+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match commons-logging:commons-logging:1.2 configuration runtime from candidates [commons-logging:commons-logging:1.2 configuration runtime] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.909+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match com.formdev:flatlaf:1.0 variant runtimeElements from candidates [com.formdev:flatlaf:1.0 variant runtimeElements] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.909+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match io.github.x-stream:mxparser:1.2.2 configuration runtime from candidates [io.github.x-stream:mxparser:1.2.2 configuration runtime] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.910+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match xmlpull:xmlpull:1.1.3.1 configuration runtime from candidates [xmlpull:xmlpull:1.1.3.1 configuration runtime] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.912+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\net.sf.launch4j\launch4j\3.14\2176f4fb938eff007ec7015b33a7abc9acef91df\launch4j-3.14-core.jar
2025-11-22T18:14:40.912+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve launch4j-3.14-core.jar (net.sf.launch4j:launch4j:3.14)' completed
2025-11-22T18:14:40.913+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'xstream-1.4.19.jar (com.thoughtworks.xstream:xstream:1.4.19)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.thoughtworks.xstream\xstream\1.4.19\e0e581d812aa92ae12f07234f3398e06af74b112\xstream-1.4.19.jar
2025-11-22T18:14:40.913+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'org.gradle.internal.component.external.model.UrlBackedArtifactMetadata@61d64988' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\edu.sc.seis.launch4j\launch4j\2.5.4\ce45dafbb3c76dfe72350eac17a48a6c9e73c846\launch4j-2.5.4.jar
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'commons-logging-1.2.jar (commons-logging:commons-logging:1.2)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\commons-logging\commons-logging\1.2\4bfc12adfe4842bf07b657f0369c4cb522955686\commons-logging-1.2.jar
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve commons-logging-1.2.jar (commons-logging:commons-logging:1.2)' completed
2025-11-22T18:14:40.914+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\commons-beanutils\commons-beanutils\1.9.4\d52b9abcd97f38c81342bb7e7ae1eee9b73cba51\commons-beanutils-1.9.4.jar
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'org.gradle.internal.component.external.model.UrlBackedArtifactMetadata@7650b192' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.formdev\flatlaf\1.0\a807c984f00b683c65503803720821f12e136e93\flatlaf-1.0.jar
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve flatlaf-1.0.jar (com.formdev:flatlaf:1.0)' completed
2025-11-22T18:14:40.916+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on state of build :
2025-11-22T18:14:40.916+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on worker lease
2025-11-22T18:14:40.915+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'xmlpull-1.1.3.1.jar (xmlpull:xmlpull:1.1.3.1)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\xmlpull\xmlpull\1.1.3.1\2b8e230d2ab644e4ecaa94db7cdedbc40c805dfa\xmlpull-1.1.3.1.jar
2025-11-22T18:14:40.916+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'mxparser-1.2.2.jar (io.github.x-stream:mxparser:1.2.2)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\io.github.x-stream\mxparser\1.2.2\476fb3b3bb3716cad797cd054ce45f89445794e9\mxparser-1.2.2.jar
2025-11-22T18:14:40.917+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on state of build :
2025-11-22T18:14:40.918+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on worker lease
2025-11-22T18:14:40.918+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' completed
2025-11-22T18:14:40.919+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.922+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate edu.sc.seis.launch4j:launch4j:2.5.4 variant runtimeElements doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.923+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate adhoc variant for net.sf.launch4j:launch4j:3.14 doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.927+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate com.thoughtworks.xstream:xstream:1.4.19 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.928+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate commons-beanutils:commons-beanutils:1.9.4 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.928+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate commons-logging:commons-logging:1.2 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.928+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate com.formdev:flatlaf:1.0 variant runtimeElements doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.929+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate io.github.x-stream:mxparser:1.2.2 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.930+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate xmlpull:xmlpull:1.1.3.1 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=instrumented-and-upgraded, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.931+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Fingerprint transform inputs' completed
2025-11-22T18:14:40.932+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate edu.sc.seis.launch4j:edu.sc.seis.launch4j.gradle.plugin:2.5.4 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.932+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate edu.sc.seis.launch4j:launch4j:2.5.4 variant runtimeElements doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.934+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate adhoc variant for net.sf.launch4j:launch4j:3.14 doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.935+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate com.thoughtworks.xstream:xstream:1.4.19 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.935+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate commons-beanutils:commons-beanutils:1.9.4 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.935+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate commons-logging:commons-logging:1.2 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.936+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate com.formdev:flatlaf:1.0 variant runtimeElements doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.936+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate io.github.x-stream:mxparser:1.2.2 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.936+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate xmlpull:xmlpull:1.1.3.1 configuration runtime doesn't match attributes {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.internal.instrumented=analyzed-artifact, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.plugin.api-version=8.14, org.gradle.usage=java-runtime}
2025-11-22T18:14:40.939+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.944+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.946+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.947+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.949+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.949+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.950+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.952+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.952+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' completed
2025-11-22T18:14:40.954+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Fingerprint transform inputs' completed
2025-11-22T18:14:40.955+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Fingerprint transform inputs' completed
2025-11-22T18:14:40.956+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.957+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.959+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.960+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.961+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.962+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.963+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.964+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.965+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.966+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.967+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.968+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.969+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.973+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.974+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.974+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.975+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.976+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.976+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.977+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.979+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.980+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.970+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.981+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.981+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.982+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.984+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.985+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.987+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.987+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.986+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.989+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.990+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.991+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute transform chain: commons-beanutils-1.9.4.jar (commons-beanutils:commons-beanutils:1.9.4)' completed
2025-11-22T18:14:40.995+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on state of build :
2025-11-22T18:14:40.996+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on worker lease
2025-11-22T18:14:40.996+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on state of build :
2025-11-22T18:14:40.996+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on worker lease
2025-11-22T18:14:40.997+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' completed
2025-11-22T18:14:40.998+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration 'classpath'' completed
2025-11-22T18:14:41.001+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :clean' completed
2025-11-22T18:14:41.002+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :assemble' completed
2025-11-22T18:14:41.002+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :check' completed
2025-11-22T18:14:41.003+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :build' completed
2025-11-22T18:14:41.004+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.007+0800 [DEBUG] [org.gradle.internal.locking.LockFileReaderWriter] Lockfiles root: G:\12068900\java\JavaCompilerIDE\gradle\dependency-locks
2025-11-22T18:14:41.008+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.009+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.010+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.011+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.JvmEcosystemPlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.012+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.018+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.JvmToolchainsPlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.024+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildNeeded' completed
2025-11-22T18:14:41.030+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildDependents' completed
2025-11-22T18:14:41.030+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.032+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.testing.base.plugins.TestSuiteBasePlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.033+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.jvm-test-suite to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.034+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.035+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.036+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.037+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.037+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.040+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.041+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :processResources' completed
2025-11-22T18:14:41.041+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :compileJava' completed
2025-11-22T18:14:41.042+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :classes' completed
2025-11-22T18:14:41.043+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.044+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :jar' completed
2025-11-22T18:14:41.047+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.047+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.051+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.052+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.053+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :javadoc' completed
2025-11-22T18:14:41.056+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.060+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.060+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.061+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.062+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.062+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.063+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.064+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :processTestResources' completed
2025-11-22T18:14:41.065+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :compileTestJava' completed
2025-11-22T18:14:41.066+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :testClasses' completed
2025-11-22T18:14:41.066+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.068+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.069+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :test' completed
2025-11-22T18:14:41.069+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.070+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.071+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.071+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.071+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.073+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.073+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.073+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.java to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.075+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionBasePlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.076+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :distZip' completed
2025-11-22T18:14:41.077+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :distTar' completed
2025-11-22T18:14:41.077+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :installDist' completed
2025-11-22T18:14:41.078+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :assembleDist' completed
2025-11-22T18:14:41.078+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.078+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionPlugin to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.079+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :run' completed
2025-11-22T18:14:41.080+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :startScripts' completed
2025-11-22T18:14:41.081+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin org.gradle.application to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.084+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.084+0800 [DEBUG] [org.gradle.api.Project] Adding the mavenCentral repository to retrieve the launch4j files.
2025-11-22T18:14:41.095+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :createExe' completed
2025-11-22T18:14:41.096+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :createAllExecutables' completed
2025-11-22T18:14:41.097+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :launch4j' completed
2025-11-22T18:14:41.099+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply plugin edu.sc.seis.launch4j to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.105+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.106+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :run' completed
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.108+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.109+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :jar' completed
2025-11-22T18:14:41.118+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :copyJdk' completed
2025-11-22T18:14:41.120+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildExe' completed
2025-11-22T18:14:41.120+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :dist' completed
2025-11-22T18:14:41.123+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :fullBuild' completed
2025-11-22T18:14:41.123+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Register task :buildInfo' completed
2025-11-22T18:14:41.124+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Apply build file 'build.gradle' to root project 'JavaCompilerIDE'' completed
2025-11-22T18:14:41.125+0800 [DEBUG] [org.gradle.configuration.project.BuildScriptProcessor] Timing: Running the build script took 0.313 secs
2025-11-22T18:14:41.125+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute Project.afterEvaluate listener' completed
2025-11-22T18:14:41.126+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute Project.afterEvaluate listener' completed
2025-11-22T18:14:41.127+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify afterEvaluate listeners of :' completed
2025-11-22T18:14:41.127+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on state of build :
2025-11-22T18:14:41.127+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Configure project :'
2025-11-22T18:14:41.127+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Configure project :' completed
2025-11-22T18:14:41.127+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify projectsEvaluated listeners' started
2025-11-22T18:14:41.127+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] All projects evaluated.
2025-11-22T18:14:41.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Notify projectsEvaluated listeners'
2025-11-22T18:14:41.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify projectsEvaluated listeners' completed
2025-11-22T18:14:41.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Configure build'
2025-11-22T18:14:41.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Configure build' completed
2025-11-22T18:14:41.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Calculate build tree task graph' started
2025-11-22T18:14:41.129+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Calculate task graph' started
2025-11-22T18:14:41.129+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on All projects of :
2025-11-22T18:14:41.129+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :clean' started
2025-11-22T18:14:41.130+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.131+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.131+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.131+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :clean'
2025-11-22T18:14:41.131+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :clean' completed
2025-11-22T18:14:41.131+0800 [INFO] [org.gradle.execution.DefaultTaskSelector] Task name matched 'clean'
2025-11-22T18:14:41.132+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :build' started
2025-11-22T18:14:41.132+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.133+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.133+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.133+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :build'
2025-11-22T18:14:41.133+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :build' completed
2025-11-22T18:14:41.133+0800 [INFO] [org.gradle.execution.DefaultTaskSelector] Task name matched 'build'
2025-11-22T18:14:41.134+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :copyJdk' started
2025-11-22T18:14:41.135+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.135+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.136+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.136+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :copyJdk'
2025-11-22T18:14:41.136+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :copyJdk' completed
2025-11-22T18:14:41.136+0800 [INFO] [org.gradle.execution.DefaultTaskSelector] Task name matched 'copyJdk'
2025-11-22T18:14:41.137+0800 [INFO] [org.gradle.execution.DefaultTaskSelector] Task name matched 'createExe'
2025-11-22T18:14:41.139+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :dist' started
2025-11-22T18:14:41.140+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.140+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.140+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.141+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.141+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :buildExe' started
2025-11-22T18:14:41.141+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.142+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.142+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.142+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :buildExe'
2025-11-22T18:14:41.142+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :buildExe' completed
2025-11-22T18:14:41.144+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.144+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.144+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :dist'
2025-11-22T18:14:41.147+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :dist' completed
2025-11-22T18:14:41.147+0800 [INFO] [org.gradle.execution.DefaultTaskSelector] Task name matched 'dist'
2025-11-22T18:14:41.148+0800 [INFO] [org.gradle.execution.TaskNameResolvingBuildTaskScheduler] Selected primary task 'clean' from project :
2025-11-22T18:14:41.149+0800 [INFO] [org.gradle.execution.TaskNameResolvingBuildTaskScheduler] Selected primary task 'build' from project :
2025-11-22T18:14:41.149+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :check' started
2025-11-22T18:14:41.150+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.150+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.150+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.150+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.151+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.151+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.151+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :check'
2025-11-22T18:14:41.151+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :check' completed
2025-11-22T18:14:41.151+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :assemble' started
2025-11-22T18:14:41.152+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.153+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.153+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.153+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.153+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.157+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.158+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.158+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.158+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.158+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.159+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :distZip' started
2025-11-22T18:14:41.160+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.160+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.160+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.161+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.161+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.161+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.161+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :distZip'
2025-11-22T18:14:41.161+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :distZip' completed
2025-11-22T18:14:41.162+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :distTar' started
2025-11-22T18:14:41.162+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.162+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.163+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.163+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.163+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.163+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.164+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :distTar'
2025-11-22T18:14:41.164+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :distTar' completed
2025-11-22T18:14:41.164+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.164+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.164+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :assemble'
2025-11-22T18:14:41.164+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :assemble' completed
2025-11-22T18:14:41.165+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :startScripts' started
2025-11-22T18:14:41.166+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.166+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.166+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.167+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :startScripts'
2025-11-22T18:14:41.167+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :startScripts' completed
2025-11-22T18:14:41.168+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :compileJava' started
2025-11-22T18:14:41.168+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.169+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.169+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.169+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.169+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.171+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.171+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.171+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.172+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.172+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :compileJava'
2025-11-22T18:14:41.173+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :compileJava' completed
2025-11-22T18:14:41.174+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(runtimeClasspath).
2025-11-22T18:14:41.174+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.fifesoft:rsyntaxtextarea:3.3.4 to-conf: null is filtered.
2025-11-22T18:14:41.174+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.formdev:flatlaf:3.2.1 to-conf: null is filtered.
2025-11-22T18:14:41.178+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :runtimeClasspath' started
2025-11-22T18:14:41.180+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Creating new in-memory cache for repo 'MavenRepo' [26c913274550a0b2221f47a0fe2d2358].
2025-11-22T18:14:41.181+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo2' [26c913274550a0b2221f47a0fe2d2358].
2025-11-22T18:14:41.181+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(runtimeClasspath).
2025-11-22T18:14:41.185+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fifesoft:rsyntaxtextarea:3.3.4 using repositories [MavenRepo, MavenRepo2]
2025-11-22T18:14:41.186+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fifesoft:rsyntaxtextarea:3.3.4' in 'MavenRepo'
2025-11-22T18:14:41.186+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fifesoft:rsyntaxtextarea:3.3.4 from Maven repository 'MavenRepo'
2025-11-22T18:14:41.187+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api} attribute org.gradle.usage value {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.usage=java-api} doesn't requested value java-runtime
2025-11-22T18:14:41.187+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.jvm.environment
2025-11-22T18:14:41.187+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:41.187+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:41.188+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [1] from candidates [{org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.environment=standard-jvm, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.usage=java-runtime}
2025-11-22T18:14:41.189+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.formdev:flatlaf:3.2.1 using repositories [MavenRepo, MavenRepo2]
2025-11-22T18:14:41.189+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.formdev:flatlaf:3.2.1' in 'MavenRepo'
2025-11-22T18:14:41.189+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.formdev:flatlaf:3.2.1 from Maven repository 'MavenRepo'
2025-11-22T18:14:41.190+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fifesoft:rsyntaxtextarea:3.3.4(runtimeElements).
2025-11-22T18:14:41.190+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.formdev:flatlaf:3.2.1(runtimeElements).
2025-11-22T18:14:41.191+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\Administrator\.gradle\.tmp\gradle4113957121225793940.bin. Wrote root 110.
2025-11-22T18:14:41.192+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve dependencies of :runtimeClasspath'
2025-11-22T18:14:41.192+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :runtimeClasspath' completed
2025-11-22T18:14:41.193+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match com.fifesoft:rsyntaxtextarea:3.3.4 variant runtimeElements from candidates [com.fifesoft:rsyntaxtextarea:3.3.4 variant runtimeElements] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.environment=standard-jvm, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.usage=java-runtime}
2025-11-22T18:14:41.193+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match com.formdev:flatlaf:3.2.1 variant runtimeElements from candidates [com.formdev:flatlaf:3.2.1 variant runtimeElements] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.environment=standard-jvm, org.gradle.jvm.version=21, org.gradle.libraryelements=jar, org.gradle.usage=java-runtime}
2025-11-22T18:14:41.193+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:41.194+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve rsyntaxtextarea-3.3.4.jar (com.fifesoft:rsyntaxtextarea:3.3.4)' started
2025-11-22T18:14:41.196+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 7: acquired lock on worker lease
2025-11-22T18:14:41.196+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'org.gradle.internal.component.external.model.UrlBackedArtifactMetadata@61b286a3' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.fifesoft\rsyntaxtextarea\3.3.4\1cc552e413b9a88a2c9611190dd1ac8003ac222e\rsyntaxtextarea-3.3.4.jar
2025-11-22T18:14:41.196+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve flatlaf-3.2.1.jar (com.formdev:flatlaf:3.2.1)' started
2025-11-22T18:14:41.196+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve rsyntaxtextarea-3.3.4.jar (com.fifesoft:rsyntaxtextarea:3.3.4)'
2025-11-22T18:14:41.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve rsyntaxtextarea-3.3.4.jar (com.fifesoft:rsyntaxtextarea:3.3.4)' completed
2025-11-22T18:14:41.198+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on All projects of :
2025-11-22T18:14:41.198+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on worker lease
2025-11-22T18:14:41.199+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'org.gradle.internal.component.external.model.UrlBackedArtifactMetadata@3fe2169' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.formdev\flatlaf\3.2.1\90f4bd7e9208c38cc065e84555a423e871aade18\flatlaf-3.2.1.jar
2025-11-22T18:14:41.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve flatlaf-3.2.1.jar (com.formdev:flatlaf:3.2.1)'
2025-11-22T18:14:41.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve flatlaf-3.2.1.jar (com.formdev:flatlaf:3.2.1)' completed
2025-11-22T18:14:41.199+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Unconstrained build operations Thread 7: released lock on worker lease
2025-11-22T18:14:41.200+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on All projects of :
2025-11-22T18:14:41.200+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on worker lease
2025-11-22T18:14:41.200+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:41.200+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:41.202+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :classes' started
2025-11-22T18:14:41.202+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.203+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.203+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.204+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :classes'
2025-11-22T18:14:41.204+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :classes' completed
2025-11-22T18:14:41.206+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :processResources' started
2025-11-22T18:14:41.206+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.207+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.207+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.207+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :processResources'
2025-11-22T18:14:41.207+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :processResources' completed
2025-11-22T18:14:41.213+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(compileClasspath).
2025-11-22T18:14:41.213+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.fifesoft:rsyntaxtextarea:3.3.4 to-conf: null is filtered.
2025-11-22T18:14:41.213+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.formdev:flatlaf:3.2.1 to-conf: null is filtered.
2025-11-22T18:14:41.215+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :test' started
2025-11-22T18:14:41.217+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.217+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.217+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.217+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.218+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.218+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.218+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.218+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.218+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.218+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.219+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.220+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.220+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.220+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.220+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :test'
2025-11-22T18:14:41.220+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :test' completed
2025-11-22T18:14:41.226+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.226+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.226+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.227+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.227+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.227+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.228+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :compileTestJava' started
2025-11-22T18:14:41.229+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.229+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.229+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.230+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.231+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.231+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.231+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.232+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.232+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.232+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.232+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.232+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.233+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :compileTestJava'
2025-11-22T18:14:41.233+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :compileTestJava' completed
2025-11-22T18:14:41.234+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(testRuntimeClasspath).
2025-11-22T18:14:41.235+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.fifesoft:rsyntaxtextarea:3.3.4 to-conf: null is filtered.
2025-11-22T18:14:41.235+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.formdev:flatlaf:3.2.1 to-conf: null is filtered.
2025-11-22T18:14:41.236+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :testClasses' started
2025-11-22T18:14:41.236+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.237+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.237+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.237+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :testClasses'
2025-11-22T18:14:41.237+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :testClasses' completed
2025-11-22T18:14:41.247+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.247+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.247+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.249+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(testCompileClasspath).
2025-11-22T18:14:41.249+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.fifesoft:rsyntaxtextarea:3.3.4 to-conf: null is filtered.
2025-11-22T18:14:41.250+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] dependency: com.formdev:flatlaf:3.2.1 to-conf: null is filtered.
2025-11-22T18:14:41.251+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :processTestResources' started
2025-11-22T18:14:41.252+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' started
2025-11-22T18:14:41.252+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute container callback action'
2025-11-22T18:14:41.253+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute container callback action' completed
2025-11-22T18:14:41.253+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Realize task :processTestResources'
2025-11-22T18:14:41.253+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Realize task :processTestResources' completed
2025-11-22T18:14:41.254+0800 [INFO] [org.gradle.execution.TaskNameResolvingBuildTaskScheduler] Selected primary task 'copyJdk' from project :
2025-11-22T18:14:41.254+0800 [INFO] [org.gradle.execution.TaskNameResolvingBuildTaskScheduler] Selected primary task 'createExe' from project :
2025-11-22T18:14:41.256+0800 [INFO] [org.gradle.execution.TaskNameResolvingBuildTaskScheduler] Selected primary task 'dist' from project :
2025-11-22T18:14:41.258+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on All projects of :
2025-11-22T18:14:41.262+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Calculate task graph'
2025-11-22T18:14:41.262+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Calculate task graph' completed
2025-11-22T18:14:41.263+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on All projects of :
2025-11-22T18:14:41.263+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify task graph whenReady listeners' started
2025-11-22T18:14:41.263+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] Tasks to be executed: [task ':clean', task ':compileJava', task ':processResources', task ':classes', task ':jar', task ':startScripts', task ':distTar', task ':distZip', task ':assemble', task ':compileTestJava', task ':processTestResources', task ':testClasses', task ':test', task ':check', task ':build', task ':copyJdk', task ':createExe', task ':buildExe', task ':dist']
2025-11-22T18:14:41.263+0800 [INFO] [org.gradle.internal.buildevents.BuildLogger] Tasks that were excluded: []
2025-11-22T18:14:41.263+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Notify task graph whenReady listeners'
2025-11-22T18:14:41.263+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Notify task graph whenReady listeners' completed
2025-11-22T18:14:41.264+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on All projects of :
2025-11-22T18:14:41.264+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Calculate build tree task graph'
2025-11-22T18:14:41.264+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Calculate build tree task graph' completed
2025-11-22T18:14:41.264+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Run main tasks' started
2025-11-22T18:14:41.265+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on worker lease
2025-11-22T18:14:41.265+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:41.265+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Run tasks' started
2025-11-22T18:14:41.266+0800 [DEBUG] [org.gradle.execution.plan.DefaultPlanExecutor] Using 4 parallel executor threads
2025-11-22T18:14:41.266+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:41.267+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:41.267+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:41.267+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.267+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :clean (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:41.267+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.267+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :clean' started
2025-11-22T18:14:41.267+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:41.268+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:41.268+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.268+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :clean'
2025-11-22T18:14:41.268+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.268+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :clean' completed
2025-11-22T18:14:41.268+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:41.269+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:41.269+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:41.269+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.269+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.269+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :clean completed, executed: true
2025-11-22T18:14:41.269+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :clean finished executing
2025-11-22T18:14:41.270+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:41.270+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:41.270+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:41.270+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:41.270+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:41.270+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :clean (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:41.270+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] destroyer locations for task group 0 (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:41.270+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.271+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.271+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Creating new cache for executionHistory, path G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory\executionHistory.bin, access org.gradle.cache.internal.DefaultCacheCoordinator@2cb53a9
2025-11-22T18:14:41.271+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:41.271+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:41.273+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for execution history cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory)
2025-11-22T18:14:41.273+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 0 completed, executed: true
2025-11-22T18:14:41.275+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 0 finished executing
2025-11-22T18:14:41.275+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on execution history cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory).
2025-11-22T18:14:41.275+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.276+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.276+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.277+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.277+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.277+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.277+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] destroyer locations for task group 1 (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:41.277+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.278+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.278+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.278+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.278+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 1 completed, executed: true
2025-11-22T18:14:41.278+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 1 finished executing
2025-11-22T18:14:41.278+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:41.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.279+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on execution history cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory).
2025-11-22T18:14:41.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.280+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.280+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:41.280+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] destroyer locations for task group 2 (Thread[#312,Execution worker Thread 2,5,main]) started.
2025-11-22T18:14:41.280+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.280+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.280+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :clean' started
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 2 completed, executed: true
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 2 finished executing
2025-11-22T18:14:41.282+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:41.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:41.282+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :clean' started
2025-11-22T18:14:41.282+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.282+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.283+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.283+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :clean'
2025-11-22T18:14:41.283+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:41.284+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.284+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] destroyer locations for task group 3 (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':clean'' started
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:41.286+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute clean for :clean' started
2025-11-22T18:14:41.286+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.286+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.286+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 3 completed, executed: true
2025-11-22T18:14:41.286+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node destroyer locations for task group 3 finished executing
2025-11-22T18:14:41.287+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:41.287+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileJava
2025-11-22T18:14:41.287+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:41.287+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:41.287+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:41.291+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:41.293+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:41.293+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:41.293+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:41.296+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:41.298+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:42.386+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:14:42.387+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:14:42.387+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:14:42.389+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:14:42.390+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:14:42.390+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:14:42.551+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute clean for :clean'
2025-11-22T18:14:42.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':clean''
2025-11-22T18:14:41.281+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:41.281+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :clean
2025-11-22T18:14:41.281+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':clean' into context took 0.0 secs.
2025-11-22T18:14:41.282+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:41.282+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':clean' because:
  Build cache is disabled
2025-11-22T18:14:41.283+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :clean' completed
2025-11-22T18:14:41.284+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':clean' is up-to-date
2025-11-22T18:14:41.284+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':clean' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build]
2025-11-22T18:14:41.285+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':clean'.
2025-11-22T18:14:41.286+0800 [DEBUG] [org.gradle.internal.file.impl.DefaultDeleter] Deleting G:\12068900\java\JavaCompilerIDE\build
2025-11-22T18:14:42.551+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute clean for :clean' completed
2025-11-22T18:14:42.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':clean'' completed
2025-11-22T18:14:42.552+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build]
2025-11-22T18:14:42.552+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':clean' from context.
2025-11-22T18:14:42.553+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :clean'
2025-11-22T18:14:42.553+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :clean' completed
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :clean completed, executed: true
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :clean finished executing
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:42.554+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:42.554+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :compileJava (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:42.555+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:42.555+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :compileJava' started
2025-11-22T18:14:42.555+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:42.555+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:42.555+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:42.556+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:42.556+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:42.556+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:42.556+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:42.556+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :compileJava'
2025-11-22T18:14:42.557+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :compileJava' completed
2025-11-22T18:14:42.557+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :compileJava completed, executed: true
2025-11-22T18:14:42.557+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :compileJava finished executing
2025-11-22T18:14:42.557+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:42.557+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:42.557+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:42.558+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:42.558+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :compileJava (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:42.558+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:42.558+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processResources
2025-11-22T18:14:42.559+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:42.559+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:42.559+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:42.558+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :compileJava' started
2025-11-22T18:14:42.560+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:42.561+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:42.561+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:42.561+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:42.561+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:42.562+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:42.562+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :compileJava' started
2025-11-22T18:14:42.563+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':compileJava'' started
2025-11-22T18:14:42.566+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :compileClasspath' started
2025-11-22T18:14:42.578+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve dependencies of :compileClasspath'
2025-11-22T18:14:42.578+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':compileClasspath'' started
2025-11-22T18:14:42.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':compileClasspath''
2025-11-22T18:14:42.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :annotationProcessor' started
2025-11-22T18:14:42.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve dependencies of :annotationProcessor'
2025-11-22T18:14:42.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':compileJava''
2025-11-22T18:14:42.581+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':compileClasspath'' started
2025-11-22T18:14:42.581+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':compileClasspath''
2025-11-22T18:14:42.583+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :compileJava'
2025-11-22T18:14:42.593+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':compileJava'' started
2025-11-22T18:14:42.594+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute compile for :compileJava' started
2025-11-22T18:14:42.595+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':compileClasspath'' started
2025-11-22T18:14:42.595+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':compileClasspath''
2025-11-22T18:14:42.595+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Compile Java for :compileJava' started
2025-11-22T18:14:43.118+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache fileHashes.bin (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes\fileHashes.bin)
2025-11-22T18:14:43.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Create incremental compile snapshot for C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.fifesoft\rsyntaxtextarea\3.3.4\1cc552e413b9a88a2c9611190dd1ac8003ac222e\rsyntaxtextarea-3.3.4.jar' started
2025-11-22T18:14:43.128+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations: acquired lock on worker lease
2025-11-22T18:14:43.128+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Create incremental compile snapshot for C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.formdev\flatlaf\3.2.1\90f4bd7e9208c38cc065e84555a423e871aade18\flatlaf-3.2.1.jar' started
2025-11-22T18:14:43.129+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Create incremental compile snapshot for C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.formdev\flatlaf\3.2.1\90f4bd7e9208c38cc065e84555a423e871aade18\flatlaf-3.2.1.jar'
2025-11-22T18:14:43.129+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Create incremental compile snapshot for C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.formdev\flatlaf\3.2.1\90f4bd7e9208c38cc065e84555a423e871aade18\flatlaf-3.2.1.jar' completed
2025-11-22T18:14:43.129+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Create incremental compile snapshot for C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.fifesoft\rsyntaxtextarea\3.3.4\1cc552e413b9a88a2c9611190dd1ac8003ac222e\rsyntaxtextarea-3.3.4.jar'
2025-11-22T18:14:43.129+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations: released lock on worker lease
2025-11-22T18:14:43.130+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:43.130+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:43.130+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.130+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.130+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.130+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.137+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Compile Java for :compileJava'
2025-11-22T18:14:43.138+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute compile for :compileJava'
2025-11-22T18:14:43.138+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':compileJava''
2025-11-22T18:14:43.139+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':compileJava'' started
2025-11-22T18:14:43.143+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':compileJava''
2025-11-22T18:14:43.143+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache executionHistory.bin (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory\executionHistory.bin)
2025-11-22T18:14:43.143+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache outputFiles.bin (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup\outputFiles.bin)
2025-11-22T18:14:42.560+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:42.560+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :compileJava
2025-11-22T18:14:42.561+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':compileJava' into context took 0.0 secs.
2025-11-22T18:14:42.561+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:42.565+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':compileJava': org.gradle.api.tasks.compile.JavaCompile_Decorated@4dde1b201d56076a8799cefa5975283b
2025-11-22T18:14:42.565+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':compileJava': [org.gradle.api.tasks.compile.JavaCompile_Decorated@4dde1b201d56076a8799cefa5975283b]
2025-11-22T18:14:42.571+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [26c913274550a0b2221f47a0fe2d2358].
2025-11-22T18:14:42.572+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo2' [26c913274550a0b2221f47a0fe2d2358].
2025-11-22T18:14:42.572+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(compileClasspath).
2025-11-22T18:14:42.573+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fifesoft:rsyntaxtextarea:3.3.4 using repositories [MavenRepo, MavenRepo2]
2025-11-22T18:14:42.573+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fifesoft:rsyntaxtextarea:3.3.4' in 'MavenRepo'
2025-11-22T18:14:42.573+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fifesoft:rsyntaxtextarea:3.3.4 from Maven repository 'MavenRepo'
2025-11-22T18:14:42.573+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api} doesn't have attribute org.gradle.jvm.environment
2025-11-22T18:14:42.574+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime} doesn't have attribute org.gradle.jvm.environment
2025-11-22T18:14:42.574+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:42.574+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Candidate {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime} attribute org.gradle.category value {org.gradle.category=documentation} doesn't requested value library
2025-11-22T18:14:42.575+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [0] from candidates [{org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.version=8, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.environment=standard-jvm, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.usage=java-api}
2025-11-22T18:14:42.575+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.formdev:flatlaf:3.2.1 using repositories [MavenRepo, MavenRepo2]
2025-11-22T18:14:42.575+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.formdev:flatlaf:3.2.1' in 'MavenRepo'
2025-11-22T18:14:42.575+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.formdev:flatlaf:3.2.1 from Maven repository 'MavenRepo'
2025-11-22T18:14:42.575+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fifesoft:rsyntaxtextarea:3.3.4(apiElements).
2025-11-22T18:14:42.576+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.formdev:flatlaf:3.2.1(apiElements).
2025-11-22T18:14:42.577+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\Administrator\.gradle\.tmp\gradle16846400277156925714.bin. Wrote root 138.
2025-11-22T18:14:42.578+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :compileClasspath' completed
2025-11-22T18:14:42.578+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match com.fifesoft:rsyntaxtextarea:3.3.4 variant apiElements from candidates [com.fifesoft:rsyntaxtextarea:3.3.4 variant apiElements] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.environment=standard-jvm, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.usage=java-api}
2025-11-22T18:14:42.578+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match com.formdev:flatlaf:3.2.1 variant apiElements from candidates [com.formdev:flatlaf:3.2.1 variant apiElements] for {org.gradle.category=library, org.gradle.dependency.bundling=external, org.gradle.jvm.environment=standard-jvm, org.gradle.jvm.version=21, org.gradle.libraryelements=classes, org.gradle.usage=java-api}
2025-11-22T18:14:42.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':compileClasspath'' completed
2025-11-22T18:14:42.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :annotationProcessor' completed
2025-11-22T18:14:42.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':compileJava'' completed
2025-11-22T18:14:42.581+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':compileClasspath'' completed
2025-11-22T18:14:42.583+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':compileJava' because:
  Build cache is disabled
2025-11-22T18:14:42.583+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :compileJava' completed
2025-11-22T18:14:42.583+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':compileJava' is up-to-date
2025-11-22T18:14:42.583+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':compileJava' is not up-to-date because:
  Output property 'destinationDirectory' file G:\12068900\java\JavaCompilerIDE\build\classes\java\main has been removed.
  Output property 'destinationDirectory' file G:\12068900\java\JavaCompilerIDE\build\classes\java\main\com has been removed.
  Output property 'destinationDirectory' file G:\12068900\java\JavaCompilerIDE\build\classes\java\main\com\javacompileride has been removed.
  and more...
2025-11-22T18:14:42.584+0800 [INFO] [org.gradle.internal.execution.steps.ResolveInputChangesStep] The input changes require a full rebuild for incremental task ':compileJava'.
2025-11-22T18:14:42.584+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\classes\java\main, G:\12068900\java\JavaCompilerIDE\build\generated\sources\annotationProcessor\java\main, G:\12068900\java\JavaCompilerIDE\build\generated\sources\headers\java\main, G:\12068900\java\JavaCompilerIDE\build\tmp\compileJava\previous-compilation-data.bin]
2025-11-22T18:14:42.585+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring directory exists for property destinationDirectory at G:\12068900\java\JavaCompilerIDE\build\classes\java\main
2025-11-22T18:14:42.587+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring directory exists for property options.generatedSourceOutputDirectory at G:\12068900\java\JavaCompilerIDE\build\generated\sources\annotationProcessor\java\main
2025-11-22T18:14:42.589+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring directory exists for property options.headerOutputDirectory at G:\12068900\java\JavaCompilerIDE\build\generated\sources\headers\java\main
2025-11-22T18:14:42.591+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring parent directory exists for property previousCompilationData at G:\12068900\java\JavaCompilerIDE\build\tmp\compileJava\previous-compilation-data.bin
2025-11-22T18:14:42.594+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':compileJava'.
2025-11-22T18:14:42.594+0800 [INFO] [org.gradle.api.internal.tasks.compile.AbstractJavaCompileSpecFactory] Compilation mode: in-process compilation
2025-11-22T18:14:42.595+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':compileClasspath'' completed
2025-11-22T18:14:42.595+0800 [INFO] [org.gradle.api.internal.tasks.compile.incremental.SelectiveCompiler] Full recompilation is required because no incremental change information is available. This is usually caused by clean builds or changing compiler arguments.
2025-11-22T18:14:42.596+0800 [INFO] [org.gradle.jvm.toolchain.internal.DefaultToolchainJavaCompiler] Compiling with toolchain 'C:\Program Files\Java\jdk-21'.
2025-11-22T18:14:42.601+0800 [DEBUG] [org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler] Compiler arguments: -source 21 -target 21 -d G:\12068900\java\JavaCompilerIDE\build\classes\java\main -encoding UTF-8 -h G:\12068900\java\JavaCompilerIDE\build\generated\sources\headers\java\main -g -sourcepath "" -proc:none -s G:\12068900\java\JavaCompilerIDE\build\generated\sources\annotationProcessor\java\main -XDuseUnsharedTable=true -classpath C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.fifesoft\rsyntaxtextarea\3.3.4\1cc552e413b9a88a2c9611190dd1ac8003ac222e\rsyntaxtextarea-3.3.4.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.formdev\flatlaf\3.2.1\90f4bd7e9208c38cc065e84555a423e871aade18\flatlaf-3.2.1.jar -encoding utf8 G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\compiler\JavaCompiler.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\compiler\JDKManager.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\compiler\ProcessRunner.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\Main.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\TestChinese.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\ui\EditorPanel.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\ui\MainFrame.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\ui\OutputPanel.java G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\util\FileUtils.java
2025-11-22T18:14:42.601+0800 [INFO] [org.gradle.api.internal.tasks.compile.JdkJavaCompiler] Compiling with JDK Java compiler API.
2025-11-22T18:14:43.105+0800 [ERROR] [system.err] 娉? G:\12068900\java\JavaCompilerIDE\src\main\java\com\javacompileride\ui\MainFrame.java浣跨敤鎴栬鐩栦簡宸 茶繃鏃剁殑 API銆?
                 2025-11-22T18:14:43.106+0800 [ERROR] [system.err] 娉? 鏈夊叧璇︾粏淇℃伅, 璇蜂娇鐢?-Xlint:deprecation 閲嶆柊缂栬瘧銆?
                                                                                                                                     2025-11-22T18:14:43.127+0800 [INFO] [org.gradle.api.internal.tasks.compile.incremental.recomp.CurrentCompilationAccess] Class dependency analysis for incremental compilation took 0.016 secs.
2025-11-22T18:14:43.129+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Create incremental compile snapshot for C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.fifesoft\rsyntaxtextarea\3.3.4\1cc552e413b9a88a2c9611190dd1ac8003ac222e\rsyntaxtextarea-3.3.4.jar' completed
2025-11-22T18:14:43.131+0800 [INFO] [org.gradle.api.internal.tasks.compile.incremental.recomp.CurrentCompilationAccess] Created classpath snapshot for incremental compilation in 0.003 secs.
2025-11-22T18:14:43.138+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Compile Java for :compileJava' completed
2025-11-22T18:14:43.138+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute compile for :compileJava' completed
2025-11-22T18:14:43.138+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':compileJava'' completed
2025-11-22T18:14:43.138+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\classes\java\main, G:\12068900\java\JavaCompilerIDE\build\generated\sources\annotationProcessor\java\main, G:\12068900\java\JavaCompilerIDE\build\generated\sources\headers\java\main, G:\12068900\java\JavaCompilerIDE\build\tmp\compileJava\previous-compilation-data.bin]
2025-11-22T18:14:43.143+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':compileJava'' completed
2025-11-22T18:14:43.143+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':compileJava' from context.
2025-11-22T18:14:43.143+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :compileJava'
<2025-11-22T18:14:43.144+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :compileJava' completed
2025-11-22T18:14:43.152+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :compileJava completed, executed: true
2025-11-22T18:14:43.152+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :compileJava finished executing
2025-11-22T18:14:43.152+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:43.153+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:43.153+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:43.153+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:43.153+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:43.153+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.153+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :processResources (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:43.153+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.154+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :processResources' started
2025-11-22T18:14:43.154+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:43.154+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.154+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.154+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :processResources'
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :processResources' completed
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :processResources completed, executed: true
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :processResources finished executing
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:43.155+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:43.156+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:43.156+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:43.156+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:43.156+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :processResources (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:43.156+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :processResources' started
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.158+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:43.158+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.158+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.159+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :processResources' started
2025-11-22T18:14:43.159+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :processResources'
2025-11-22T18:14:43.157+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:43.157+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :processResources NO-SOURCE
2025-11-22T18:14:43.157+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':processResources' into context took 0.0 secs.
2025-11-22T18:14:43.158+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:43.159+0800 [INFO] [org.gradle.internal.execution.steps.SkipEmptyIncrementalWorkStep] Skipping task ':processResources' as it has no source files and no previous output files.
2025-11-22T18:14:43.160+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :processResources' completed
2025-11-22T18:14:43.160+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':processResources' from context.
2025-11-22T18:14:43.160+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :processResources'
2025-11-22T18:14:43.161+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :processResources' completed
2025-11-22T18:14:43.162+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :processResources completed, executed: true
2025-11-22T18:14:43.162+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :processResources finished executing
2025-11-22T18:14:43.163+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:43.163+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:43.164+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:43.164+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:43.165+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :classes (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:43.165+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :classes' started
2025-11-22T18:14:43.165+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :classes'
2025-11-22T18:14:43.165+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :classes' completed
2025-11-22T18:14:43.165+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :classes completed, executed: true
2025-11-22T18:14:43.166+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :classes finished executing
2025-11-22T18:14:43.166+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:43.166+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:43.166+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:43.166+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:43.166+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:43.167+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :classes (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:43.167+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.167+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :classes' started
2025-11-22T18:14:43.167+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.167+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:43.167+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.167+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:43.167+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :classes
2025-11-22T18:14:43.167+0800 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':classes' as it has no actions.
2025-11-22T18:14:43.168+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.168+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :classes'
2025-11-22T18:14:43.168+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :classes' completed
2025-11-22T18:14:43.168+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.168+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.168+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :classes completed, executed: true
2025-11-22T18:14:43.169+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :classes finished executing
2025-11-22T18:14:43.169+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:43.169+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:43.169+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:43.169+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:43.169+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:43.170+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :jar (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:43.170+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:43.170+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :jar' started
2025-11-22T18:14:43.172+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :jar'
2025-11-22T18:14:43.173+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :jar' completed
2025-11-22T18:14:43.170+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.173+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.173+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:43.173+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :jar completed, executed: true
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :jar finished executing
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:43.174+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:43.175+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:43.175+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:43.175+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:43.175+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :jar (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:43.175+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:43.175+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :jar' started
2025-11-22T18:14:43.175+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.176+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.176+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:43.176+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:43.177+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:43.178+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :jar' started
2025-11-22T18:14:43.180+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:43.181+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:43.183+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.184+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.184+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.185+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.191+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':jar'' started
2025-11-22T18:14:43.193+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':jar''
2025-11-22T18:14:43.194+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:43.194+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:43.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :jar'
2025-11-22T18:14:43.201+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':jar'' started
2025-11-22T18:14:43.201+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :jar' started
2025-11-22T18:14:43.206+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:43.209+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:43.830+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute copy for :jar'
2025-11-22T18:14:43.831+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':jar''
2025-11-22T18:14:43.832+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':jar'' started
2025-11-22T18:14:43.841+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':jar''
2025-11-22T18:14:43.176+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:43.176+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :jar
2025-11-22T18:14:43.176+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':jar' into context took 0.0 secs.
2025-11-22T18:14:43.177+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:43.181+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:43.186+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\tmp\jar\MANIFEST.MF]
2025-11-22T18:14:43.192+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':jar': org.gradle.api.tasks.bundling.Jar_Decorated@4dde1b201d56076a8799cefa5975283b
2025-11-22T18:14:43.192+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':jar': [org.gradle.api.tasks.bundling.Jar_Decorated@fa83017b3e35e3f153b54a37ae344110]
2025-11-22T18:14:43.193+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':jar'' completed
2025-11-22T18:14:43.195+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:43.198+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':jar' because:
  Build cache is disabled
  Not worth caching
2025-11-22T18:14:43.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :jar' completed
2025-11-22T18:14:43.199+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':jar' is up-to-date
2025-11-22T18:14:43.199+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':jar' is not up-to-date because:
  Output property 'archiveFile' file G:\12068900\java\JavaCompilerIDE\build\libs\JavaCompilerIDE-1.0.0.jar has been removed.
2025-11-22T18:14:43.199+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\libs\JavaCompilerIDE-1.0.0.jar]
2025-11-22T18:14:43.200+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring parent directory exists for property archiveFile at G:\12068900\java\JavaCompilerIDE\build\libs\JavaCompilerIDE-1.0.0.jar
2025-11-22T18:14:43.201+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':jar'.
2025-11-22T18:14:43.209+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:43.253+0800 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'G:\12068900\java\JavaCompilerIDE\build\resources\main', not found
2025-11-22T18:14:43.264+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for Compressed Files Expansion Cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\expanded)
2025-11-22T18:14:43.265+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Compressed Files Expansion Cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\expanded).
2025-11-22T18:14:43.266+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Compressed Files Expansion Cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\expanded).
2025-11-22T18:14:43.830+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :jar' completed
2025-11-22T18:14:43.831+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':jar'' completed
2025-11-22T18:14:43.831+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\libs\JavaCompilerIDE-1.0.0.jar]
2025-11-22T18:14:43.841+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':jar'' completed
2025-11-22T18:14:43.841+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':jar' from context.
2025-11-22T18:14:43.842+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :jar'
2025-11-22T18:14:43.842+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :jar' completed
2025-11-22T18:14:43.842+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :jar completed, executed: true
2025-11-22T18:14:43.842+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :jar finished executing
2025-11-22T18:14:43.842+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:43.842+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:43.843+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :startScripts (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :startScripts' started
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.843+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :startScripts'
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :startScripts' completed
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.844+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :startScripts completed, executed: true
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :startScripts finished executing
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:43.845+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:43.846+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :startScripts (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:43.846+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:43.846+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :startScripts' started
2025-11-22T18:14:43.846+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:43.846+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:43.846+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:43.847+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:43.847+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:43.848+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :startScripts' started
2025-11-22T18:14:43.849+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':startScripts'' started
2025-11-22T18:14:43.851+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:43.852+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:43.852+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:43.853+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:43.847+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:43.856+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:43.857+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:43.857+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:43.857+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache resourceHashesCache.bin (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes\resourceHashesCache.bin)
2025-11-22T18:14:43.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':startScripts''
2025-11-22T18:14:43.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:43.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:43.994+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :startScripts'
2025-11-22T18:14:43.997+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':startScripts'' started
2025-11-22T18:14:43.997+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute generate for :startScripts' started
2025-11-22T18:14:44.000+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.000+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.190+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute generate for :startScripts'
2025-11-22T18:14:44.191+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':startScripts''
2025-11-22T18:14:44.191+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':startScripts'' started
2025-11-22T18:14:44.193+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':startScripts''
2025-11-22T18:14:43.846+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:43.846+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :startScripts
2025-11-22T18:14:43.846+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':startScripts' into context took 0.0 secs.
2025-11-22T18:14:43.847+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:43.849+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':startScripts': org.gradle.api.tasks.application.CreateStartScripts_Decorated@4dde1b201d56076a8799cefa5975283b
2025-11-22T18:14:43.850+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':startScripts': [org.gradle.api.tasks.application.CreateStartScripts_Decorated@4dde1b201d56076a8799cefa5975283b]
2025-11-22T18:14:43.852+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:43.853+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:43.992+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':startScripts'' completed
2025-11-22T18:14:43.993+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:43.994+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':startScripts' because:
  Build cache is disabled
  Not worth caching
2025-11-22T18:14:43.995+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :startScripts' completed
2025-11-22T18:14:43.995+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':startScripts' is up-to-date
2025-11-22T18:14:43.995+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':startScripts' is not up-to-date because:
  Output property 'outputDir' file G:\12068900\java\JavaCompilerIDE\build\scripts has been removed.
  Output property 'outputDir' file G:\12068900\java\JavaCompilerIDE\build\scripts\JavaCompilerIDE has been removed.
  Output property 'outputDir' file G:\12068900\java\JavaCompilerIDE\build\scripts\JavaCompilerIDE.bat has been removed.
2025-11-22T18:14:43.995+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\scripts]
2025-11-22T18:14:43.996+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring directory exists for property outputDir at G:\12068900\java\JavaCompilerIDE\build\scripts
2025-11-22T18:14:43.997+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':startScripts'.
2025-11-22T18:14:44.000+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.149+0800 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Adding reference: ant.PropertyHelper
2025-11-22T18:14:44.150+0800 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Detected Java version: 21 in: C:\Program Files\Java\jdk-21
2025-11-22T18:14:44.150+0800 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Detected OS: Windows 10
2025-11-22T18:14:44.151+0800 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Adding reference: ant.ComponentHelper
2025-11-22T18:14:44.152+0800 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Project base dir set to: C:\Users\Administrator\.gradle\daemon\8.14
2025-11-22T18:14:44.190+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute generate for :startScripts' completed
2025-11-22T18:14:44.191+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':startScripts'' completed
2025-11-22T18:14:44.191+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\scripts]
2025-11-22T18:14:44.193+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':startScripts'' completed
2025-11-22T18:14:44.194+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':startScripts' from context.
2025-11-22T18:14:44.194+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :startScripts'
2025-11-22T18:14:44.194+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :startScripts' completed
2025-11-22T18:14:44.194+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :startScripts completed, executed: true
2025-11-22T18:14:44.194+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :startScripts finished executing
2025-11-22T18:14:44.195+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.195+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.195+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.195+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.195+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.195+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :distTar (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.195+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :distZip
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :distTar' started
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :distTar'
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :distTar' completed
2025-11-22T18:14:44.196+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :distTar completed, executed: true
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :distTar finished executing
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.197+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.198+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :distTar (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :distZip
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :distTar' started
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.200+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.200+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :distTar' started
2025-11-22T18:14:44.200+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.200+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.201+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.201+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':distTar'' started
2025-11-22T18:14:44.203+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':distTar''
2025-11-22T18:14:44.204+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.204+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.205+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :distTar'
2025-11-22T18:14:44.212+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':distTar'' started
2025-11-22T18:14:44.212+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :distTar' started
2025-11-22T18:14:44.214+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.214+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.301+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute copy for :distTar'
2025-11-22T18:14:44.301+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':distTar''
2025-11-22T18:14:44.302+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':distTar'' started
2025-11-22T18:14:44.313+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':distTar''
2025-11-22T18:14:44.198+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.198+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :distTar
2025-11-22T18:14:44.198+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':distTar' into context took 0.0 secs.
2025-11-22T18:14:44.199+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:44.201+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.202+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':distTar': org.gradle.api.tasks.bundling.Tar_Decorated@fa83017b3e35e3f153b54a37ae344110
2025-11-22T18:14:44.202+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':distTar': [org.gradle.api.tasks.bundling.Tar_Decorated@fa83017b3e35e3f153b54a37ae344110]
2025-11-22T18:14:44.203+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':distTar'' completed
2025-11-22T18:14:44.204+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.205+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':distTar' because:
  Build cache is disabled
  Not worth caching
2025-11-22T18:14:44.205+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :distTar' completed
2025-11-22T18:14:44.205+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':distTar' is up-to-date
2025-11-22T18:14:44.205+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':distTar' is not up-to-date because:
  Output property 'archiveFile' file G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.tar has been removed.
2025-11-22T18:14:44.205+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.tar]
2025-11-22T18:14:44.206+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring parent directory exists for property archiveFile at G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.tar
2025-11-22T18:14:44.212+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':distTar'.
2025-11-22T18:14:44.213+0800 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'G:\12068900\java\JavaCompilerIDE\src\main\dist', not found
2025-11-22T18:14:44.213+0800 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'G:\12068900\java\JavaCompilerIDE\src\dist', not found
2025-11-22T18:14:44.214+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.301+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :distTar' completed
2025-11-22T18:14:44.302+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':distTar'' completed
2025-11-22T18:14:44.302+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.tar]
2025-11-22T18:14:44.313+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':distTar'' completed
2025-11-22T18:14:44.313+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':distTar' from context.
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :distTar'
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :distTar' completed
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :distTar completed, executed: true
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :distTar finished executing
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.314+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.315+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :distZip (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :distZip' started
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.315+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.316+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.316+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.316+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :distZip'
2025-11-22T18:14:44.316+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :distZip' completed
2025-11-22T18:14:44.317+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :distZip completed, executed: true
2025-11-22T18:14:44.319+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :distZip finished executing
2025-11-22T18:14:44.319+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.319+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.319+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.319+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.319+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.320+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :distZip (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.320+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:44.320+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :distZip' started
2025-11-22T18:14:44.320+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.320+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.320+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :distZip' started
2025-11-22T18:14:44.322+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.322+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.323+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':distZip'' started
2025-11-22T18:14:44.324+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':distZip''
2025-11-22T18:14:44.325+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.325+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.326+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :distZip'
2025-11-22T18:14:44.327+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':distZip'' started
2025-11-22T18:14:44.328+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :distZip' started
2025-11-22T18:14:44.330+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:44.330+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:44.551+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute copy for :distZip'
2025-11-22T18:14:44.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':distZip''
2025-11-22T18:14:44.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':distZip'' started
2025-11-22T18:14:44.562+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':distZip''
2025-11-22T18:14:44.320+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.320+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :distZip
2025-11-22T18:14:44.320+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':distZip' into context took 0.0 secs.
2025-11-22T18:14:44.321+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:44.322+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.323+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':distZip': org.gradle.api.tasks.bundling.Zip_Decorated@fa83017b3e35e3f153b54a37ae344110
2025-11-22T18:14:44.323+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':distZip': [org.gradle.api.tasks.bundling.Zip_Decorated@fa83017b3e35e3f153b54a37ae344110]
2025-11-22T18:14:44.324+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':distZip'' completed
2025-11-22T18:14:44.325+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.326+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':distZip' because:
  Build cache is disabled
  Not worth caching
2025-11-22T18:14:44.326+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :distZip' completed
2025-11-22T18:14:44.327+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':distZip' is up-to-date
2025-11-22T18:14:44.327+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':distZip' is not up-to-date because:
  Output property 'archiveFile' file G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.zip has been removed.
2025-11-22T18:14:44.327+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.zip]
2025-11-22T18:14:44.327+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring parent directory exists for property archiveFile at G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.zip
2025-11-22T18:14:44.327+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':distZip'.
2025-11-22T18:14:44.329+0800 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'G:\12068900\java\JavaCompilerIDE\src\main\dist', not found
2025-11-22T18:14:44.329+0800 [INFO] [org.gradle.api.internal.file.collections.DirectoryFileTree] file or directory 'G:\12068900\java\JavaCompilerIDE\src\dist', not found
2025-11-22T18:14:44.330+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:44.551+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :distZip' completed
2025-11-22T18:14:44.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':distZip'' completed
2025-11-22T18:14:44.552+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0.zip]
2025-11-22T18:14:44.562+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':distZip'' completed
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':distZip' from context.
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :distZip'
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :distZip' completed
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :distZip completed, executed: true
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :distZip finished executing
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.563+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.564+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.564+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :assemble (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :assemble' started
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :assemble'
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :assemble' completed
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :assemble completed, executed: true
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :assemble finished executing
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.565+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :compileTestJava
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.566+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :assemble (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.566+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :assemble' started
2025-11-22T18:14:44.567+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.567+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :assemble
2025-11-22T18:14:44.567+0800 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':assemble' as it has no actions.
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :assemble'
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :assemble' completed
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :assemble completed, executed: true
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :assemble finished executing
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.567+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.568+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.568+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.568+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :compileTestJava (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.568+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.569+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :compileTestJava' started
2025-11-22T18:14:44.569+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.569+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.569+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.569+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.569+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.570+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.570+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :compileTestJava'
2025-11-22T18:14:44.570+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :compileTestJava' completed
2025-11-22T18:14:44.571+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :compileTestJava completed, executed: true
2025-11-22T18:14:44.571+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :compileTestJava finished executing
2025-11-22T18:14:44.571+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.571+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.571+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.571+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.572+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :compileTestJava (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.572+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.572+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :compileTestJava' started
2025-11-22T18:14:44.572+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :processTestResources
2025-11-22T18:14:44.572+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.572+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.573+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:44.573+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.573+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:44.573+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.573+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.574+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.574+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :compileTestJava' started
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :compileTestJava'
2025-11-22T18:14:44.572+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.572+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :compileTestJava NO-SOURCE
2025-11-22T18:14:44.572+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':compileTestJava' into context took 0.0 secs.
2025-11-22T18:14:44.573+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:44.575+0800 [INFO] [org.gradle.internal.execution.steps.SkipEmptyIncrementalWorkStep] Skipping task ':compileTestJava' as it has no source files and no previous output files.
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :compileTestJava' completed
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':compileTestJava' from context.
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :compileTestJava'
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :compileTestJava' completed
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :compileTestJava completed, executed: true
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :compileTestJava finished executing
2025-11-22T18:14:44.575+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.576+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :processTestResources (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :processTestResources' started
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.576+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :processTestResources'
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :processTestResources' completed
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :processTestResources completed, executed: true
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :processTestResources finished executing
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.577+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.578+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :processTestResources (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :processTestResources' started
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:44.579+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:44.579+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :processTestResources' started
2025-11-22T18:14:44.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :processTestResources'
2025-11-22T18:14:44.578+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.578+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :processTestResources NO-SOURCE
2025-11-22T18:14:44.578+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':processTestResources' into context took 0.0 secs.
2025-11-22T18:14:44.579+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:44.580+0800 [INFO] [org.gradle.internal.execution.steps.SkipEmptyIncrementalWorkStep] Skipping task ':processTestResources' as it has no source files and no previous output files.
2025-11-22T18:14:44.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :processTestResources' completed
2025-11-22T18:14:44.580+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':processTestResources' from context.
2025-11-22T18:14:44.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :processTestResources'
2025-11-22T18:14:44.580+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :processTestResources' completed
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :processTestResources completed, executed: true
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :processTestResources finished executing
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.581+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :testClasses (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.581+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :testClasses' started
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :testClasses'
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :testClasses' completed
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :testClasses completed, executed: true
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :testClasses finished executing
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.582+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.583+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :testClasses (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :testClasses' started
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.583+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.584+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.584+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.583+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.583+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :testClasses UP-TO-DATE
2025-11-22T18:14:44.583+0800 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':testClasses' as it has no actions.
2025-11-22T18:14:44.585+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :testClasses'
2025-11-22T18:14:44.585+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :testClasses' completed
2025-11-22T18:14:44.585+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :testClasses completed, executed: true
2025-11-22T18:14:44.585+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :testClasses finished executing
2025-11-22T18:14:44.585+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.585+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.586+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.586+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.586+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.586+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :test (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.586+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.586+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :test' started
2025-11-22T18:14:44.587+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.587+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.587+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.587+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.587+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.588+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :test'
2025-11-22T18:14:44.588+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :test' completed
2025-11-22T18:14:44.588+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :test completed, executed: true
2025-11-22T18:14:44.589+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :test finished executing
2025-11-22T18:14:44.589+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.589+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.589+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.589+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.590+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.590+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.590+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :test (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.590+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.590+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.590+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :test' started
2025-11-22T18:14:44.591+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.591+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.591+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.591+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:44.592+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:44.593+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :test' started
2025-11-22T18:14:44.594+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :test'
2025-11-22T18:14:44.591+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.591+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :test NO-SOURCE
2025-11-22T18:14:44.591+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':test' into context took 0.0 secs.
2025-11-22T18:14:44.592+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:44.594+0800 [INFO] [org.gradle.internal.execution.steps.SkipEmptyIncrementalWorkStep] Skipping task ':test' as it has no source files and no previous output files.
2025-11-22T18:14:44.594+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :test' completed
2025-11-22T18:14:44.594+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':test' from context.
2025-11-22T18:14:44.595+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :test'
2025-11-22T18:14:44.595+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :test' completed
2025-11-22T18:14:44.595+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :test completed, executed: true
2025-11-22T18:14:44.595+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :test finished executing
2025-11-22T18:14:44.595+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.595+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.596+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.596+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.596+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :check (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.596+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.596+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.596+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.596+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :check' started
2025-11-22T18:14:44.597+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.597+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.597+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :check'
2025-11-22T18:14:44.597+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :check' completed
2025-11-22T18:14:44.597+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :check completed, executed: true
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :check finished executing
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.598+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.599+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.599+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.599+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.599+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :check (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.599+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.599+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.599+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :check' started
2025-11-22T18:14:44.600+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.601+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.601+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.601+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :check UP-TO-DATE
2025-11-22T18:14:44.601+0800 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':check' as it has no actions.
2025-11-22T18:14:44.601+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :check'
2025-11-22T18:14:44.601+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :check' completed
2025-11-22T18:14:44.602+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :check completed, executed: true
2025-11-22T18:14:44.602+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :check finished executing
2025-11-22T18:14:44.602+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.602+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.602+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.602+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.603+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :build (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.603+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :build' started
2025-11-22T18:14:44.603+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :build'
2025-11-22T18:14:44.603+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :build' completed
2025-11-22T18:14:44.603+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :build completed, executed: true
2025-11-22T18:14:44.604+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :build finished executing
2025-11-22T18:14:44.604+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:44.604+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:44.604+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:44.604+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.604+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.604+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :build (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.605+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Cannot acquire project lock for node Resolve mutations for :copyJdk
2025-11-22T18:14:44.605+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.605+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :build' started
2025-11-22T18:14:44.605+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.606+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.605+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.605+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :build
2025-11-22T18:14:44.605+0800 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':build' as it has no actions.
2025-11-22T18:14:44.606+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :build'
2025-11-22T18:14:44.606+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :build' completed
2025-11-22T18:14:44.606+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.606+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.607+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :build completed, executed: true
2025-11-22T18:14:44.607+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :build finished executing
2025-11-22T18:14:44.607+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.607+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.607+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:44.607+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:44.608+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :copyJdk (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :copyJdk' started
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.608+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.609+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :copyJdk'
2025-11-22T18:14:44.609+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :copyJdk' completed
2025-11-22T18:14:44.609+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :copyJdk completed, executed: true
2025-11-22T18:14:44.609+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :copyJdk finished executing
2025-11-22T18:14:44.609+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:44.609+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:44.610+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:44.610+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on state of build :
2025-11-22T18:14:44.610+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on task execution for build :
2025-11-22T18:14:44.610+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :copyJdk (Thread[#311,Execution worker,5,main]) started.
2025-11-22T18:14:44.610+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:14:44.610+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :copyJdk' started
2025-11-22T18:14:44.610+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :copyJdk' started
2025-11-22T18:14:44.650+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':copyJdk'' started
2025-11-22T18:14:44.653+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':copyJdk''
2025-11-22T18:14:44.656+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :copyJdk'
2025-11-22T18:14:44.659+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':copyJdk'' started
2025-11-22T18:14:44.659+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :copyJdk' started
2025-11-22T18:14:44.610+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:44.610+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :copyJdk
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':copyJdk' into context took 0.0 secs.
2025-11-22T18:14:44.611+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:44.652+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':copyJdk': org.gradle.api.tasks.Copy_Decorated@fa83017b3e35e3f153b54a37ae344110
2025-11-22T18:14:44.652+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':copyJdk': [org.gradle.api.tasks.Copy_Decorated@fa83017b3e35e3f153b54a37ae344110, _BuildScript_$_run_closure9$_closure17_8c06f1a0ef8743364e1f1a617b1895c6@78b952e47bb1b20aef3143ad5b36f497]
2025-11-22T18:14:44.653+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':copyJdk'' completed
2025-11-22T18:14:44.655+0800 [INFO] [org.gradle.api.internal.tasks.execution.TaskExecution] Custom actions are attached to task ':copyJdk'.
2025-11-22T18:14:44.656+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':copyJdk' because:
  Build cache is disabled
  Not worth caching
2025-11-22T18:14:44.656+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :copyJdk' completed
2025-11-22T18:14:44.656+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':copyJdk' is up-to-date
2025-11-22T18:14:44.656+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':copyJdk' is not up-to-date because:
  Output property 'destinationDir' file G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk has been removed.
  Output property 'destinationDir' file G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk\bin has been removed.
  Output property 'destinationDir' file G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk\bin\api-ms-win-core-console-l1-1-0.dll has been removed.
  and more...
2025-11-22T18:14:44.657+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk]
2025-11-22T18:14:44.657+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring directory exists for property destinationDir at G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk
2025-11-22T18:14:44.659+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':copyJdk'.
2025-11-22T18:14:47.243+0800 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationRunner] 
2025-11-22T18:14:47.243+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute copy for :copyJdk'
2025-11-22T18:14:47.244+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute doLast {} action for :copyJdk' started
2025-11-22T18:14:47.245+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute doLast {} action for :copyJdk'
2025-11-22T18:14:47.246+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':copyJdk''
2025-11-22T18:14:47.247+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':copyJdk'' started
2025-11-22T18:14:48.530+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':copyJdk''
2025-11-22T18:14:46.645+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:46.645+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :copyJdk
2025-11-22T18:14:47.243+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :copyJdk' completed
2025-11-22T18:14:47.245+0800 [QUIET] [system.out] JDK 澶嶅埗瀹屾垚: G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk
2025-11-22T18:14:47.245+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute doLast {} action for :copyJdk' completed
2025-11-22T18:14:47.246+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':copyJdk'' completed
2025-11-22T18:14:47.246+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\launch4j\jdk]
2025-11-22T18:14:48.530+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':copyJdk'' completed
2025-11-22T18:14:48.530+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':copyJdk' from context.
2025-11-22T18:14:48.530+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :copyJdk'
2025-11-22T18:14:48.530+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :copyJdk' completed
2025-11-22T18:14:48.530+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :copyJdk completed, executed: true
2025-11-22T18:14:48.531+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :copyJdk finished executing
2025-11-22T18:14:48.531+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on state of build :
2025-11-22T18:14:48.531+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on task execution for build :
2025-11-22T18:14:48.535+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on worker lease
2025-11-22T18:14:48.535+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:48.536+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:48.536+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:48.536+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :createExe (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:48.536+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:48.537+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :createExe' started
2025-11-22T18:14:48.537+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:48.537+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:48.537+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :createExe'
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :createExe' completed
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :createExe completed, executed: true
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :createExe finished executing
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:48.539+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:48.540+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :createExe (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :createExe' started
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :createExe' started
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':createExe'' started
2025-11-22T18:14:48.545+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':createExe''
2025-11-22T18:14:48.550+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :createExe'
2025-11-22T18:14:48.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':createExe'' started
2025-11-22T18:14:48.552+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute run for :createExe' started
2025-11-22T18:14:48.555+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :launch4jBin' started
2025-11-22T18:14:48.562+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve dependencies of :launch4jBin'
2025-11-22T18:14:48.563+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':launch4jBin'' started
2025-11-22T18:14:48.564+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve launch4j-3.14-workdir-win32.jar (net.sf.launch4j:launch4j:3.14)' started
2025-11-22T18:14:48.568+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve launch4j-3.14-workdir-win32.jar (net.sf.launch4j:launch4j:3.14)'
2025-11-22T18:14:48.568+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':launch4jBin''
2025-11-22T18:14:49.228+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' started
2025-11-22T18:14:49.229+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve files of configuration ':runtimeClasspath''
2025-11-22T18:14:50.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute run for :createExe'
2025-11-22T18:14:50.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':createExe''
2025-11-22T18:14:50.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':createExe'' started
2025-11-22T18:14:50.276+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':createExe''
2025-11-22T18:14:48.540+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:48.540+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :createExe
2025-11-22T18:14:48.540+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':createExe' into context took 0.0 secs.
2025-11-22T18:14:48.541+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:48.543+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':createExe': edu.sc.seis.launch4j.tasks.Launch4jLibraryTask_Decorated@e2e257cfab992cbbef4c94b334918a9e
2025-11-22T18:14:48.543+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':createExe': [edu.sc.seis.launch4j.tasks.Launch4jLibraryTask_Decorated@e2e257cfab992cbbef4c94b334918a9e]
2025-11-22T18:14:48.545+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':createExe'' completed
2025-11-22T18:14:48.549+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':createExe' because:
  Build cache is disabled
  Caching has not been enabled for the task
2025-11-22T18:14:48.550+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :createExe' completed
2025-11-22T18:14:48.550+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':createExe' is up-to-date
2025-11-22T18:14:48.550+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':createExe' is not up-to-date because:
  Output property 'dest' file G:\12068900\java\JavaCompilerIDE\build\launch4j\JavaCompilerIDE.exe has been removed.
  Output property 'outputDirectory' file G:\12068900\java\JavaCompilerIDE\build\launch4j\JavaCompilerIDE.exe has been removed.
  Output property 'outputDirectory' file G:\12068900\java\JavaCompilerIDE\build\launch4j\lib has been removed.
  and more...
2025-11-22T18:14:48.551+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\launch4j\JavaCompilerIDE.exe, G:\12068900\java\JavaCompilerIDE\build\launch4j]
2025-11-22T18:14:48.552+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring parent directory exists for property dest at G:\12068900\java\JavaCompilerIDE\build\launch4j\JavaCompilerIDE.exe
2025-11-22T18:14:48.552+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring directory exists for property outputDirectory at G:\12068900\java\JavaCompilerIDE\build\launch4j
2025-11-22T18:14:48.552+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':createExe'.
2025-11-22T18:14:48.557+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [26c913274550a0b2221f47a0fe2d2358].
2025-11-22T18:14:48.557+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo2' [26c913274550a0b2221f47a0fe2d2358].
2025-11-22T18:14:48.558+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.javacompileride:JavaCompilerIDE:1.0.0(launch4jBin).
2025-11-22T18:14:48.560+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for net.sf.launch4j:launch4j:3.14 using repositories [MavenRepo, MavenRepo2]
2025-11-22T18:14:48.560+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'net.sf.launch4j:launch4j:3.14' in 'MavenRepo'
2025-11-22T18:14:48.560+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using net.sf.launch4j:launch4j:3.14 from Maven repository 'MavenRepo'
2025-11-22T18:14:48.561+0800 [DEBUG] [org.gradle.api.internal.attributes.matching.DefaultAttributeMatcher] Selected matches [1] from candidates [{org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=library, org.gradle.libraryelements=jar, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=sources, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=documentation, org.gradle.dependency.bundling=external, org.gradle.docstype=javadoc, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=platform, org.gradle.status=release, org.gradle.usage=java-runtime}, {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-api}, {org.gradle.category=enforced-platform, org.gradle.status=release, org.gradle.usage=java-runtime}] for {}
2025-11-22T18:14:48.561+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration net.sf.launch4j:launch4j:3.14(runtime).
2025-11-22T18:14:48.561+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.NodeState] net.sf.launch4j:launch4j:3.14(runtime) has no transitive incoming edges. ignoring outgoing edges.
2025-11-22T18:14:48.562+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\Administrator\.gradle\.tmp\gradle16846400277156925714.bin. Wrote root 146.
2025-11-22T18:14:48.562+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve dependencies of :launch4jBin' completed
2025-11-22T18:14:48.563+0800 [DEBUG] [org.gradle.internal.component.model.LoggingAttributeMatchingExplanationBuilder] Selected match adhoc variant for net.sf.launch4j:launch4j:3.14 from candidates [adhoc variant for net.sf.launch4j:launch4j:3.14] for {}
2025-11-22T18:14:48.568+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'launch4j-3.14-workdir-win32.jar (net.sf.launch4j:launch4j:3.14)' in resolver cache: C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\net.sf.launch4j\launch4j\3.14\331e6f64ac7277735f4c45413809e617a0b7ba1f\launch4j-3.14-workdir-win32.jar
2025-11-22T18:14:48.568+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve launch4j-3.14-workdir-win32.jar (net.sf.launch4j:launch4j:3.14)' completed
2025-11-22T18:14:48.569+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':launch4jBin'' completed
2025-11-22T18:14:49.229+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve files of configuration ':runtimeClasspath'' completed
2025-11-22T18:14:49.357+0800 [INFO] [org.gradle.api.Project] Launch4j
2025-11-22T18:14:49.817+0800 [INFO] [org.gradle.api.Project] Launch4j
2025-11-22T18:14:50.166+0800 [INFO] [org.gradle.api.Project] Launch4j
2025-11-22T18:14:50.194+0800 [INFO] [org.gradle.api.Project] Launch4j
2025-11-22T18:14:50.196+0800 [DEBUG] [org.gradle.internal.file.impl.DefaultDeleter] Deleting G:\12068900\java\JavaCompilerIDE\build\launch4j\createExe.xml
2025-11-22T18:14:50.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute run for :createExe' completed
2025-11-22T18:14:50.197+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':createExe'' completed
2025-11-22T18:14:50.197+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\launch4j\JavaCompilerIDE.exe, G:\12068900\java\JavaCompilerIDE\build\launch4j]
2025-11-22T18:14:50.276+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':createExe'' completed
2025-11-22T18:14:50.276+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':createExe' from context.
2025-11-22T18:14:50.276+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :createExe'
2025-11-22T18:14:50.276+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :createExe' completed
2025-11-22T18:14:50.276+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :createExe completed, executed: true
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :createExe finished executing
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:50.277+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :buildExe (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:50.277+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:50.278+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :buildExe' started
2025-11-22T18:14:50.278+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:50.278+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:50.278+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :buildExe'
2025-11-22T18:14:50.278+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :buildExe' completed
2025-11-22T18:14:50.278+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :buildExe completed, executed: true
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :buildExe finished executing
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:50.279+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:50.280+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:50.279+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :buildExe (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:50.280+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:50.280+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :buildExe' started
2025-11-22T18:14:50.280+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:50.280+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:50.280+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:50.280+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:50.280+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :buildExe
2025-11-22T18:14:50.280+0800 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':buildExe' as it has no actions.
2025-11-22T18:14:50.281+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :buildExe'
2025-11-22T18:14:50.281+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :buildExe' completed
2025-11-22T18:14:50.281+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :buildExe completed, executed: true
2025-11-22T18:14:50.281+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :buildExe finished executing
2025-11-22T18:14:50.281+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:50.282+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] Resolve mutations for :dist (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :dist' started
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:50.282+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Resolve mutations for task :dist'
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Resolve mutations for task :dist' completed
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :dist completed, executed: true
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node Resolve mutations for :dist finished executing
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:14:50.283+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on state of build :
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: acquired lock on task execution for build :
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:14:50.284+0800 [INFO] [org.gradle.execution.plan.DefaultPlanExecutor] :dist (Thread[#310,included builds,5,main]) started.
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :dist' started
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:14:50.285+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:14:50.285+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' started
2025-11-22T18:14:50.285+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Identifying work'
2025-11-22T18:14:50.286+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :dist' started
2025-11-22T18:14:50.292+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':dist'' started
2025-11-22T18:14:50.293+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot inputs and outputs before executing task ':dist''
2025-11-22T18:14:50.296+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot task inputs for :dist'
2025-11-22T18:14:50.297+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':dist'' started
2025-11-22T18:14:50.297+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :dist' started
2025-11-22T18:14:50.284+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:50.284+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :dist
2025-11-22T18:14:50.284+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Putting task artifact state for task ':dist' into context took 0.0 secs.
2025-11-22T18:14:50.285+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Identifying work' completed
2025-11-22T18:14:50.292+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Implementation for task ':dist': org.gradle.api.tasks.bundling.Zip_Decorated@fa83017b3e35e3f153b54a37ae344110
2025-11-22T18:14:50.292+0800 [DEBUG] [org.gradle.internal.execution.steps.AbstractCaptureStateBeforeExecutionStep] Additional implementations for task ':dist': [org.gradle.api.tasks.bundling.Zip_Decorated@fa83017b3e35e3f153b54a37ae344110, _BuildScript_$_run_closure11$_closure21_814a269806e3166f4294c3fa143c5bd7@78b952e47bb1b20aef3143ad5b36f497]
2025-11-22T18:14:50.293+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot inputs and outputs before executing task ':dist'' completed
2025-11-22T18:14:50.295+0800 [INFO] [org.gradle.api.internal.tasks.execution.TaskExecution] Custom actions are attached to task ':dist'.
2025-11-22T18:14:50.295+0800 [INFO] [org.gradle.internal.execution.steps.AbstractResolveCachingStateStep] Caching disabled for task ':dist' because:
  Build cache is disabled
  Not worth caching
2025-11-22T18:14:50.296+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot task inputs for :dist' completed
2025-11-22T18:14:50.296+0800 [DEBUG] [org.gradle.internal.execution.steps.SkipUpToDateStep] Determining if task ':dist' is up-to-date
2025-11-22T18:14:50.296+0800 [INFO] [org.gradle.internal.execution.steps.SkipUpToDateStep] Task ':dist' is not up-to-date because:
  Output property 'archiveFile' file G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0-with-jdk.zip has been removed.
2025-11-22T18:14:50.296+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0-with-jdk.zip]
2025-11-22T18:14:50.296+0800 [DEBUG] [org.gradle.internal.execution.steps.PreCreateOutputParentsStep] Ensuring parent directory exists for property archiveFile at G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0-with-jdk.zip
2025-11-22T18:14:50.297+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.TaskExecution] Executing actions for task ':dist'.
2025-11-22T18:14:52.381+0800 [LIFECYCLE] [org.gradle.cache.internal.DefaultFileLockManager] 
2025-11-22T18:14:52.381+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:14:52.382+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:14:52.382+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:14:52.383+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:14:52.384+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:14:52.384+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:15:02.390+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:15:02.393+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:15:02.393+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:15:02.397+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2025-11-22T18:15:02.398+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2025-11-22T18:15:02.398+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2025-11-22T18:15:09.434+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute copy for :dist'
2025-11-22T18:15:09.435+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute doLast {} action for :dist' started
2025-11-22T18:15:09.435+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Execute doLast {} action for :dist'
2025-11-22T18:15:09.435+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Executing task ':dist''
2025-11-22T18:15:09.436+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':dist'' started
2025-11-22T18:14:52.349+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:14:52.349+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :dist
2025-11-22T18:15:09.434+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute copy for :dist' completed
2025-11-22T18:15:09.435+0800 [QUIET] [system.out] 鍒嗗彂鍖呭垱寤哄畬鎴? G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0-with-jdk.zip
2025-11-22T18:15:09.435+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Execute doLast {} action for :dist' completed
2025-11-22T18:15:09.435+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Executing task ':dist'' completed
2025-11-22T18:15:09.435+0800 [DEBUG] [org.gradle.internal.vfs.impl.AbstractVirtualFileSystem] Invalidating VFS paths: [G:\12068900\java\JavaCompilerIDE\build\distributions\JavaCompilerIDE-1.0.0-with-jdk.zip]
<2025-11-22T18:15:09.921+0800 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationRunner] 
2025-11-22T18:15:09.921+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Snapshot outputs after executing task ':dist''
2025-11-22T18:15:09.548+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] 
2025-11-22T18:15:09.548+0800 [LIFECYCLE] [class org.gradle.internal.buildevents.TaskExecutionLogger] > Task :dist
2025-11-22T18:15:09.921+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Snapshot outputs after executing task ':dist'' completed
2025-11-22T18:15:09.922+0800 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter] Removed task artifact state for task ':dist' from context.
2025-11-22T18:15:09.922+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Task :dist'
2025-11-22T18:15:09.922+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Task :dist' completed
2025-11-22T18:15:09.922+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :dist completed, executed: true
2025-11-22T18:15:09.922+0800 [DEBUG] [org.gradle.execution.plan.DefaultFinalizedExecutionPlan] Node :dist finished executing
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on state of build :
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on task execution for build :
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:15:09.923+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Run tasks'
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Run tasks' completed
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] included builds: released lock on worker lease
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: acquired lock on worker lease
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker: released lock on worker lease
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: acquired lock on worker lease
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Run main tasks'
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Run main tasks' completed
2025-11-22T18:15:09.924+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: acquired lock on worker lease
2025-11-22T18:15:09.925+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 2: released lock on worker lease
2025-11-22T18:15:09.925+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: acquired lock on worker lease
2025-11-22T18:15:09.925+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 3: released lock on worker lease
2025-11-22T18:15:09.925+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Finish root build tree' started
2025-11-22T18:15:09.925+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Finish root build tree'
2025-11-22T18:15:09.925+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Finish root build tree' completed
2025-11-22T18:15:09.935+0800 [WARN] [org.gradle.problems.internal.impl.DefaultProblemsReportCreator] 
[Incubating] Problems report is available at: file:///G:/12068900/java/JavaCompilerIDE/build/reports/problems/problems-report.html
2025-11-22T18:15:09.936+0800 [WARN] [org.gradle.internal.featurelifecycle.LoggingDeprecatedFeatureHandler] 
Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.14/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
2025-11-22T18:15:09.936+0800 [LIFECYCLE] [org.gradle.internal.buildevents.BuildResultLogger] 
2025-11-22T18:15:09.936+0800 [LIFECYCLE] [org.gradle.internal.buildevents.BuildResultLogger] BUILD SUCCESSFUL in 31s
2025-11-22T18:15:09.936+0800 [LIFECYCLE] [org.gradle.internal.buildevents.TaskExecutionStatisticsReporter] 9 actionable tasks: 9 executed
2025-11-22T18:15:09.936+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Build finished for file system watching' started
2025-11-22T18:15:09.937+0800 [INFO] [org.gradle.internal.watch.registry.impl.HierarchicalFileWatcherUpdater] Watched directory hierarchies: [G:\12068900\java\JavaCompilerIDE]
2025-11-22T18:15:09.937+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Build finished for file system watching'
2025-11-22T18:15:09.937+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Build finished for file system watching' completed
2025-11-22T18:15:09.940+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for cache directory md-supplier (C:\Users\Administrator\.gradle\caches\8.14\md-supplier)
2025-11-22T18:15:09.940+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on cache directory md-supplier (C:\Users\Administrator\.gradle\caches\8.14\md-supplier).
2025-11-22T18:15:09.941+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for Build Output Cleanup Cache (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup)
2025-11-22T18:15:09.941+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache outputFiles.bin (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup\outputFiles.bin)
2025-11-22T18:15:09.941+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Build Output Cleanup Cache (G:\12068900\java\JavaCompilerIDE\.gradle\buildOutputCleanup).
2025-11-22T18:15:09.943+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for execution history cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory)
2025-11-22T18:15:09.943+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache executionHistory.bin (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory\executionHistory.bin)
2025-11-22T18:15:09.943+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on execution history cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\executionHistory).
2025-11-22T18:15:09.944+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for cache directory md-rule (C:\Users\Administrator\.gradle\caches\8.14\md-rule)
2025-11-22T18:15:09.944+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on cache directory md-rule (C:\Users\Administrator\.gradle\caches\8.14\md-rule).
2025-11-22T18:15:09.947+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.CachedStoreFactory] Resolution result cache closed. Cache reads: 0, disk reads: 0 (avg: 0.0 secs, total: 0.0 secs)
2025-11-22T18:15:09.948+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.CachedStoreFactory] Resolution result cache closed. Cache reads: 0, disk reads: 0 (avg: 0.0 secs, total: 0.0 secs)
2025-11-22T18:15:09.949+0800 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.ResolutionResultsStoreFactory] Deleted 4 resolution results binary files in 0.004 secs
2025-11-22T18:15:09.950+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Run build'
2025-11-22T18:15:09.950+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Run build' completed
2025-11-22T18:15:09.950+0800 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 7: released lock on worker lease
2025-11-22T18:15:09.951+0800 [DEBUG] [org.gradle.deployment.internal.DefaultDeploymentRegistry] Stopping 0 deployment handles
2025-11-22T18:15:09.951+0800 [DEBUG] [org.gradle.deployment.internal.DefaultDeploymentRegistry] Stopped deployment handles
2025-11-22T18:15:09.952+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for file hash cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes)
2025-11-22T18:15:09.952+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache fileHashes.bin (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes\fileHashes.bin)
2025-11-22T18:15:09.953+0800 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache resourceHashesCache.bin (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes\resourceHashesCache.bin)
2025-11-22T18:15:09.953+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on file hash cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\fileHashes).
2025-11-22T18:15:09.954+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for checksums cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums)
2025-11-22T18:15:09.954+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on checksums cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\checksums).
2025-11-22T18:15:09.955+0800 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for Compressed Files Expansion Cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\expanded)
2025-11-22T18:15:09.955+0800 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Compressed Files Expansion Cache (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\expanded).
2025-11-22T18:15:09.956+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCleanupExecutor] VCS Checkout Cache (G:\12068900\java\JavaCompilerIDE\.gradle\vcs-1) has last been fully cleaned up 21 hours ago
2025-11-22T18:15:09.956+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCleanupExecutor] Skipping cleanup for VCS Checkout Cache (G:\12068900\java\JavaCompilerIDE\.gradle\vcs-1) as it is not yet due
2025-11-22T18:15:09.956+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Cache VCS Checkout Cache (G:\12068900\java\JavaCompilerIDE\.gradle\vcs-1) was closed 0 times.
2025-11-22T18:15:09.956+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Cache VCS metadata (G:\12068900\java\JavaCompilerIDE\.gradle\8.14\vcsMetadata) was closed 0 times.
2025-11-22T18:15:09.956+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Deleting unused version-specific caches in G:\12068900\java\JavaCompilerIDE\.gradle' started
2025-11-22T18:15:09.957+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Completing Build operation 'Deleting unused version-specific caches in G:\12068900\java\JavaCompilerIDE\.gradle'
2025-11-22T18:15:09.957+0800 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationRunner] Build operation 'Deleting unused version-specific caches in G:\12068900\java\JavaCompilerIDE\.gradle' completed
2025-11-22T18:15:09.957+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCleanupExecutor] dependencies-accessors (C:\Users\Administrator\.gradle\caches\8.14\dependencies-accessors) has last been fully cleaned up 21 hours ago
2025-11-22T18:15:09.958+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCleanupExecutor] Skipping cleanup for dependencies-accessors (C:\Users\Administrator\.gradle\caches\8.14\dependencies-accessors) as it is not yet due
2025-11-22T18:15:09.958+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Cache dependencies-accessors (C:\Users\Administrator\.gradle\caches\8.14\dependencies-accessors) was closed 0 times.
2025-11-22T18:15:09.974+0800 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] The daemon has finished executing the build.
2025-11-22T18:15:09.997+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: dispatching class org.gradle.launcher.daemon.protocol.CloseInput
2025-11-22T18:15:09.998+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClient] Received result Success[value=org.gradle.launcher.exec.BuildActionResult@20a8a64e] from daemon DaemonInfo{pid=15596, address=[2df97824-2d25-4015-94dd-69deb14bf649 port:55248, addresses:[/127.0.0.1]], state=Idle, lastBusy=1763806429093, context=DefaultDaemonContext[uid=6a1271f6-d530-44da-bed3-d26dd11918a7,javaHome=C:\Program Files\Java\jdk-21,javaVersion=21,javaVendor=Oracle Corporation,daemonRegistryDir=C:\Users\Administrator\.gradle\daemon,pid=15596,idleTimeout=10800000,priority=NORMAL,applyInstrumentationAgent=true,nativeServicesMode=ENABLED,daemonOpts=-XX:MaxMetaspaceSize=384m,-XX:+HeapDumpOnOutOfMemoryError,-Xms256m,-Xmx512m,-Dfile.encoding=UTF-8,-Duser.country=CN,-Duser.language=zh,-Duser.variant]} (build should be done).
2025-11-22T18:15:09.999+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: dispatching class org.gradle.launcher.daemon.protocol.Finished
2025-11-22T18:15:09.999+0800 [DEBUG] [org.gradle.launcher.daemon.client.DaemonClientConnection] thread 1: connection stop
2025-11-22T18:15:10.003+0800 [DEBUG] [org.gradle.cache.internal.DefaultCacheCoordinator] Cache cache directory jvms (C:\Users\Administrator\.gradle\caches\8.14\jvms) was closed 0 times.
2025-11-22T18:15:10.003+0800 [LIFECYCLE] [org.gradle.launcher.cli.DebugLoggerWarningAction] 
#############################################################################
   WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING

   Debug level logging will leak security sensitive information!

   For more details, please refer to https://docs.gradle.org/8.14/userguide/logging.html#sec:debug_security in the Gradle documentation.
#############################################################################
````