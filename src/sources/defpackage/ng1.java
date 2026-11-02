package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ng1 {
    public static final or5 a = new or5(30);

    public static final void a(h30 h30Var, g38 g38Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        Context context;
        lp2Var.X(1904307118);
        int i2 = (lp2Var.f(h30Var) ? 4 : 2) | i | (lp2Var.h(g38Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                lp2Var.W(-1009482584);
                context = (Context) lp2Var.j(pc.b);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1009433480);
                lp2Var.p(false);
                context = null;
            }
            boolean zH = lp2Var.h(g38Var) | ((i2 & 14) == 4) | lp2Var.h(context);
            Object objK = lp2Var.K();
            if (zH || objK == zz0.a) {
                objK = new sn((Object) g38Var, (Object) context, (Object) h30Var, (byte) 5);
                lp2Var.g0(objK);
            }
            lp2Var2 = lp2Var;
            l51.b(null, null, (gn2) objK, lp2Var2, 0, 3);
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 8, i, h30Var, g38Var);
        }
    }

    public static final void b(final int i, final long j, lp2 lp2Var, final int i2) throws XmlPullParserException, IOException {
        final int i3;
        int i4;
        TypedValue typedValue;
        og5 bitmapPainter;
        lp2Var.X(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (lp2Var.d(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.e(j) ? 32 : 16;
        }
        if (lp2Var.N(i4 & 1, (i4 & 19) != 18)) {
            q06 q06Var = pc.b;
            Context context = (Context) lp2Var.j(q06Var);
            boolean zF = ((i4 & 14) == 4) | lp2Var.f(context);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                lp2Var.g0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                j86 j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    final byte b = 1;
                    j86VarR.d = new rn2() { // from class: lg1
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) throws XmlPullParserException, IOException {
                            byte b2 = b;
                            dn8 dn8Var = dn8.a;
                            int i5 = i2;
                            long j2 = j;
                            int i6 = i3;
                            lp2 lp2Var2 = (lp2) obj;
                            ((Integer) obj2).getClass();
                            switch (b2) {
                                case 0:
                                    ng1.b(i6, j2, lp2Var2, w79.P(i5 | 1));
                                    break;
                                default:
                                    ng1.b(i6, j2, lp2Var2, w79.P(i5 | 1));
                                    break;
                            }
                            return dn8Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) lp2Var.j(q06Var);
            Resources resources = (Resources) lp2Var.j(pc.c);
            pf6 pf6Var = (pf6) lp2Var.j(pc.e);
            synchronized (pf6Var) {
                typedValue = (TypedValue) pf6Var.a.b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    vz4 vz4Var = pf6Var.a;
                    int iD = vz4Var.d(iIntValue);
                    Object[] objArr = vz4Var.c;
                    Object obj = objArr[iD];
                    vz4Var.b[iD] = iIntValue;
                    objArr[iD] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !fm7.i0(charSequence, ".xml")) {
                lp2Var.W(-1771643000);
                boolean zF2 = lp2Var.f(context2.getTheme()) | lp2Var.f(charSequence) | lp2Var.d(iIntValue);
                Object objK2 = lp2Var.K();
                if (zF2 || objK2 == zz0.a) {
                    try {
                        Drawable drawable = resources.getDrawable(iIntValue, null);
                        drawable.getClass();
                        objK2 = new je(((BitmapDrawable) drawable).getBitmap());
                        lp2Var.g0(objK2);
                    } catch (Exception e) {
                        throw new tf6("Error attempting to load resource: " + ((Object) charSequence), e);
                    }
                }
                je jeVar = (je) objK2;
                bitmapPainter = new BitmapPainter(jeVar, (((long) jeVar.a.getWidth()) << 32) | (((long) jeVar.a.getHeight()) & 4294967295L));
                lp2Var.p(false);
            } else {
                lp2Var.W(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i5 = typedValue.changingConfigurations;
                j73 j73Var = (j73) lp2Var.j(pc.d);
                i73 i73Var = new i73(theme, iIntValue);
                WeakReference weakReference = (WeakReference) j73Var.a.get(i73Var);
                h73 h73VarJ = weakReference != null ? (h73) weakReference.get() : null;
                if (h73VarJ == null) {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!dh3.f(xml.getName(), "vector")) {
                        bt.q("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    } else {
                        h73VarJ = u28.j(theme, resources, xml, i5);
                        j73Var.a.put(i73Var, new WeakReference(h73VarJ));
                    }
                }
                bitmapPainter = g28.m(h73VarJ.a, lp2Var);
                lp2Var.p(false);
            }
            boolean z = (i4 & 112) == 32;
            Object objK3 = lp2Var.K();
            if (z || objK3 == zz0.a) {
                Object g60Var = j == 16 ? null : new g60(j, 5);
                lp2Var.g0(g60Var);
                objK3 = g60Var;
            }
            g80.a(a.a(b.g(hx4.X, j51.e), bitmapPainter, (g60) objK3), lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR2 = lp2Var.r();
        if (j86VarR2 != null) {
            final byte b2 = 0;
            j86VarR2.d = new rn2() { // from class: lg1
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    byte b3 = b2;
                    dn8 dn8Var = dn8.a;
                    int i6 = i2;
                    long j2 = j;
                    int i7 = i;
                    lp2 lp2Var2 = (lp2) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            ng1.b(i7, j2, lp2Var2, w79.P(i6 | 1));
                            break;
                        default:
                            ng1.b(i7, j2, lp2Var2, w79.P(i6 | 1));
                            break;
                    }
                    return dn8Var;
                }
            };
        }
    }

    public static final void c(h30 h30Var, h38 h38Var, dn2 dn2Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? lp2Var.f(h30Var) : lp2Var.h(h30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? lp2Var.f(h38Var) : lp2Var.h(h38Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(dn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        boolean z = false;
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && lp2Var.f(h38Var));
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (z2 || objK == beVar) {
                objK = new bp4(new wl6(new p5(h38Var, dn2Var, (byte) 19), (byte) 22));
                lp2Var.g0(objK);
            }
            bp4 bp4Var = (bp4) objK;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && lp2Var.h(h30Var))) {
                z = true;
            }
            Object objK2 = lp2Var.K();
            if (z || objK2 == beVar) {
                objK2 = new o7(h30Var, (byte) 26);
                lp2Var.g0(objK2);
            }
            bg.a(bp4Var, (dn2) objK2, a, jm4.U(1315155414, new i9(h38Var, h30Var, (byte) 7), lp2Var), lp2Var, 3456, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(h30Var, h38Var, dn2Var, i);
        }
    }

    public static final void d(kx4 kx4Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(1392105195);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            x97.d(kx4Var, r38.a, zy0Var, lp2Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new dh(kx4Var, zy0Var, i, b);
        }
    }
}
