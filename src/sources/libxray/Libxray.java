package libxray;

import go.Seq;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Libxray {

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class proxyProcessFinder implements Seq.Proxy, ProcessFinder {
        private final int refnum;

        public proxyProcessFinder(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // libxray.ProcessFinder
        public native long findProcessByConnection(String str, String str2, long j, String str3, long j2);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class proxyXRayVPNServiceSupportsSet implements Seq.Proxy, XRayVPNServiceSupportsSet {
        private final int refnum;

        public proxyXRayVPNServiceSupportsSet(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // libxray.XRayVPNServiceSupportsSet
        public native long onEmitStatus(long j, String str);

        @Override // libxray.XRayVPNServiceSupportsSet
        public native long shutdown();

        @Override // libxray.XRayVPNServiceSupportsSet
        public native long startup();
    }

    static {
        Seq.touch();
        _init();
    }

    private Libxray() {
    }

    private static native void _init();

    public static native String checkVersionX();

    public static native void cutGeoData(String str, String str2, String str3) throws Exception;

    public static native void disableWrapperLogs();

    public static native void enableWrapperLogs();

    public static native String getCoreVersion();

    public static native String getWrapperVersion();

    public static native void initXEnv(String str, String str2);

    public static native String loadGeoFileRuleNames(String str) throws Exception;

    public static native long measureOutboundDelay(String str, String str2, long j) throws Exception;

    public static native long measureOutboundDelayWithType(String str, String str2, String str3, String str4, long j) throws Exception;

    public static native XRayPoint newXRayPoint(XRayVPNServiceSupportsSet xRayVPNServiceSupportsSet, boolean z);

    public static void touch() {
    }
}
