package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 {
    public final int a;

    public static String a(int i) {
        String str;
        StringBuilder sb = new StringBuilder("CameraError(");
        if (i == 0) {
            str = "ERROR_UNDETERMINED";
        } else if (i == 1) {
            str = "ERROR_CAMERA_IN_USE";
        } else if (i == 2) {
            str = "ERROR_CAMERA_LIMIT_EXCEEDED";
        } else if (i == 3) {
            str = "ERROR_CAMERA_DISABLED";
        } else if (i == 4) {
            str = "ERROR_CAMERA_DEVICE";
        } else if (i == 5) {
            str = "ERROR_CAMERA_SERVICE";
        } else if (i == 6) {
            str = "ERROR_CAMERA_DISCONNECTED";
        } else if (i == 7) {
            str = "ERROR_ILLEGAL_ARGUMENT_EXCEPTION";
        } else if (i == 8) {
            str = "ERROR_SECURITY_EXCEPTION";
        } else if (i == 9) {
            str = "ERROR_GRAPH_CONFIG";
        } else if (i == 10) {
            str = "ERROR_DO_NOT_DISTURB_ENABLED";
        } else if (i == 11) {
            str = "ERROR_UNKNOWN_EXCEPTION";
        } else if (i == 12) {
            str = "ERROR_CAMERA_OPENER";
        } else {
            str = i == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN";
        }
        return oi0.o(sb, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai0) {
            return this.a == ((ai0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
