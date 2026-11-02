package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b73 {
    public static final f4 a = new f4(td8.a);
    public static final f4 b = new f4(at8.b);
    public static final f4 c = new f4(null);
    public static final f4 d;
    public static final f4 e;
    public static final f4 f;
    public static final f4 g;
    public static final f4 h;

    static {
        Boolean bool = Boolean.TRUE;
        d = new f4(bool);
        e = new f4(null);
        f = new f4(bool);
        g = new f4(bool);
        h = new f4(Boolean.FALSE);
    }

    public static final Bitmap.Config a(pd5 pd5Var) {
        return (Bitmap.Config) z68.G(pd5Var, b);
    }

    public static final ColorSpace b(pd5 pd5Var) {
        return bt.a(z68.G(pd5Var, c));
    }
}
