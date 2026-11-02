package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends ClassLoader {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(byte b) {
        super(Object.class.getClassLoader());
        this.a = b;
        switch (b) {
            case 1:
                break;
            default:
                break;
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.a) {
            case 1:
                return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? ha9.class : super.loadClass(str, z);
            default:
                return super.loadClass(str, z);
        }
    }
}
