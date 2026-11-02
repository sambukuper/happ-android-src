package defpackage;

import android.widget.LinearLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hu implements u27 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ hu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new w1((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new ma4(this);
            case 3:
                return jm4.P((rn2) obj);
            case 4:
                return (Iterator) obj;
            case 5:
                return new y27(obj, (byte) 0);
            case 6:
                return new la4((CharSequence) obj);
            case 7:
                return new fq2(this);
            default:
                return new w1((LinearLayout) obj, (byte) 7);
        }
    }
}
