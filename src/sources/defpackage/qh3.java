package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class qh3 extends IOException {
    public boolean X;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class a extends qh3 {
    }

    public static qh3 a() {
        return new qh3("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static qh3 c() {
        return new qh3("CodedInputStream encountered a malformed varint.");
    }

    public static qh3 d() {
        return new qh3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static qh3 e() {
        return new qh3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
