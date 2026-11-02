package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h01 extends jb5 {
    public final /* synthetic */ byte l0;
    public final Object m0;

    public /* synthetic */ h01(Object obj, byte b) {
        this.l0 = b;
        this.m0 = obj;
    }

    @Override // defpackage.jb5
    public final Object A() {
        switch (this.l0) {
            case 0:
                return (PrintStream) this.m0;
            default:
                return (PrintWriter) this.m0;
        }
    }

    @Override // defpackage.jb5
    public final void J(String str) {
        byte b = this.l0;
        Object obj = this.m0;
        switch (b) {
            case 0:
                ((PrintStream) obj).println((Object) str);
                break;
            default:
                ((PrintWriter) obj).println((Object) str);
                break;
        }
    }
}
