package libxray;

import go.Seq;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ConsoleLogWriter implements Seq.Proxy {
    private final int refnum;

    static {
        Libxray.touch();
    }

    public ConsoleLogWriter() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }

    private static native int __New();

    public native void close() throws Exception;

    public native void disable();

    public native void enable();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ConsoleLogWriter)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public String toString() {
        return "ConsoleLogWriter{}";
    }

    public native void write(String str) throws Exception;

    public ConsoleLogWriter(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
