class Constants {
    static final String[] IGNORE_LABELS = ['.ignore'];
    static final String REMOTE_FS = "/home/jenkins";
    static final String WIN_REMOTE_FS = "C:\\Users\\jenkins";
    
    // This the key that'll be used for SSHLauncher in CreateNewNode
    static final String SSH_CREDENTIAL_ID = "";
    
    static final String SLAVE_JAR_LOCATION = "<jenkins_URL/>/jnlpJars/slave.jar";
    static final String WGET_SLAVE_JAR = "\"wget -q --no-check-certificate -O slave.jar ${SLAVE_JAR_LOCATION} ; java -jar slave.jar\"";
    static final String SSH_COMMAND = "ssh -C -i ${SSH_KEY_LOCATION} <userName/>@";
    static final String SSH_KEY_LOCATION = "";

    static final String JENKINS_URL = "https://ci.adoptopenjdk.net/";

    static final String OS_LABEL_FORMAT = "%s.%s.%s";
    static final String GENERIC_LABEL_FORMAT = "%s.%s";
    static final String OS_LABEL_PREFIX = "sw.os";
    static final String ENDIAN_LABEL_PREFIX = "hw.endian";
    static final String PLATFORM_LABEL_PREFIX = "hw.platform";
    static final String ARCH_LABEL_PREFIX = "hw.arch";
    static final String KERNEL_LABEL_PREFIX = "hw.kernel";
    static final String HYPERVISOR_LABEL_PREFIX = "hw.hypervisor";
}
