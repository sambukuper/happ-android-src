package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a33 {
    public final String a;
    public final /* synthetic */ byte b;
    public final Comparable c;

    public a33(String str, Comparable comparable, byte b) {
        this.b = b;
        this.a = str;
        this.c = comparable;
    }

    public final String a() {
        return this.a;
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return ((File) this.c).toString();
            default:
                return a();
        }
    }
}
