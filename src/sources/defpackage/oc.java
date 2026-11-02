package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import io.sentry.c2;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final zy0 b = new zy0(7276577, false, new cz0(0));
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public static final jw0 d;
    public static final float e;
    public static final jw0 f;
    public static final float g;
    public static final jw0 h;
    public static final float i;
    public static final jw0 j;
    public static final jw0 k;
    public static final float l;
    public static final jw0 m;
    public static final jw0 n;
    public static final jw0 o;
    public static final float p;
    public static final jw0 q;
    public static final float r;
    public static final jw0 s;

    static {
        jw0 jw0Var = jw0.h0;
        d = jw0Var;
        e = 0.38f;
        f = jw0Var;
        g = 0.38f;
        h = jw0Var;
        i = 0.38f;
        j = jw0Var;
        jw0 jw0Var2 = jw0.i0;
        k = jw0Var2;
        l = 24.0f;
        m = jw0Var2;
        n = jw0Var;
        o = jw0Var;
        p = 20.0f;
        q = jw0.k0;
        r = 40.0f;
        s = jw0Var2;
    }

    public static final void A(float[] fArr, float[] fArr2) {
        float fL = l(fArr2, 0, fArr, 0);
        float fL2 = l(fArr2, 0, fArr, 1);
        float fL3 = l(fArr2, 0, fArr, 2);
        float fL4 = l(fArr2, 0, fArr, 3);
        float fL5 = l(fArr2, 1, fArr, 0);
        float fL6 = l(fArr2, 1, fArr, 1);
        float fL7 = l(fArr2, 1, fArr, 2);
        float fL8 = l(fArr2, 1, fArr, 3);
        float fL9 = l(fArr2, 2, fArr, 0);
        float fL10 = l(fArr2, 2, fArr, 1);
        float fL11 = l(fArr2, 2, fArr, 2);
        float fL12 = l(fArr2, 2, fArr, 3);
        float fL13 = l(fArr2, 3, fArr, 0);
        float fL14 = l(fArr2, 3, fArr, 1);
        float fL15 = l(fArr2, 3, fArr, 2);
        float fL16 = l(fArr2, 3, fArr, 3);
        fArr[0] = fL;
        fArr[1] = fL2;
        fArr[2] = fL3;
        fArr[3] = fL4;
        fArr[4] = fL5;
        fArr[5] = fL6;
        fArr[6] = fL7;
        fArr[7] = fL8;
        fArr[8] = fL9;
        fArr[9] = fL10;
        fArr[10] = fL11;
        fArr[11] = fL12;
        fArr[12] = fL13;
        fArr[13] = fL14;
        fArr[14] = fL15;
        fArr[15] = fL16;
    }

    public static final void B(float[] fArr, float f2, float f3, float[] fArr2) {
        or4.d(fArr2);
        or4.g(fArr2, f2, f3);
        A(fArr, fArr2);
    }

    public static void D(g55 g55Var) {
        oh7 oh7Var;
        lm5 lm5Var;
        lm5 lm5Var2;
        do {
            oh7Var = p86.z;
            lm5Var = (lm5) oh7Var.getValue();
            ml5 ml5VarF = lm5Var.Z;
            bb4 bb4Var = (bb4) ml5VarF.get(g55Var);
            if (bb4Var == null) {
                lm5Var2 = lm5Var;
            } else {
                Object obj = bb4Var.a;
                Object obj2 = bb4Var.b;
                jf8 jf8Var = ml5VarF.X;
                jf8 jf8VarV = jf8Var.v(g55Var != null ? g55Var.hashCode() : 0, 0, g55Var);
                if (jf8Var != jf8VarV) {
                    ml5VarF = jf8VarV == null ? ml5.Z : new ml5(jf8VarV, ml5VarF.Y - 1);
                }
                oy1 oy1Var = oy1.w0;
                if (obj != oy1Var) {
                    Object obj3 = ml5VarF.get(obj);
                    obj3.getClass();
                    ml5VarF = ml5VarF.f(obj, new bb4(((bb4) obj3).a, obj2));
                }
                if (obj2 != oy1Var) {
                    Object obj4 = ml5VarF.get(obj2);
                    obj4.getClass();
                    ml5VarF = ml5VarF.f(obj2, new bb4(obj, ((bb4) obj4).b));
                }
                Object obj5 = obj != oy1Var ? lm5Var.X : obj2;
                if (obj2 != oy1Var) {
                    obj = lm5Var.Y;
                }
                lm5Var2 = new lm5(obj5, obj, ml5VarF);
            }
            if (lm5Var == lm5Var2) {
                return;
            }
        } while (!oh7Var.k(lm5Var, lm5Var2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E(ny6 ny6Var, float f2, s51 s51Var) {
        ox6 ox6Var;
        ba6 ba6Var;
        if (s51Var instanceof ox6) {
            ox6Var = (ox6) s51Var;
            int i2 = ox6Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ox6Var.h0 = i2 - Integer.MIN_VALUE;
            } else {
                ox6Var = new ox6(s51Var);
            }
        } else {
            ox6Var = new ox6(s51Var);
        }
        Object obj = ox6Var.g0;
        int i3 = ox6Var.h0;
        if (i3 == 0) {
            w39.n0(obj);
            ba6 ba6Var2 = new ba6();
            rn2 px6Var = new px6(ba6Var2, f2, null);
            ox6Var.f0 = ba6Var2;
            ox6Var.h0 = 1;
            Object objI = ny6Var.i(f15.X, px6Var, ox6Var);
            Object obj2 = c71.X;
            if (objI == obj2) {
                return obj2;
            }
            ba6Var = ba6Var2;
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba6Var = ox6Var.f0;
            w39.n0(obj);
        }
        return new Float(ba6Var.X);
    }

    public static String F(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        return i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i2) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(String str, kx4 kx4Var, lp2 lp2Var, int i2) {
        str.getClass();
        zc1.g(str, kx4Var, o88.a(((ds) lp2Var.j(es.a)).b, ((dp) lp2Var.j(ep.z)).c.d, 0L, dj2.f0, null, 0L, 0L, null, 16777210), 0, 0, 0, 0, false, null, lp2Var, i2 & WebSocketProtocol.PAYLOAD_SHORT, 504);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    public static final void c(final om6 om6Var, final gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        lp2 lp2Var2;
        ?? r0;
        Object obj;
        boolean z;
        lp2 lp2Var3 = lp2Var;
        gn2Var.getClass();
        lp2Var3.X(1795447854);
        int i3 = i2 | (lp2Var3.f(om6Var) ? 4 : 2) | (lp2Var3.h(gn2Var) ? 32 : 16) | (lp2Var3.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        final byte b2 = 0;
        if (lp2Var3.N(i3 & 1, (i3 & 147) != 146)) {
            o50 o50Var = pz2.o0;
            ft ftVar = new ft(12.0f, new bt());
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z2 = (i4 == 32) | (i5 == 4);
            Object objK = lp2Var3.K();
            Object obj2 = zz0.a;
            Object obj3 = objK;
            if (z2 || objK == obj2) {
                Object obj4 = new dn2() { // from class: mv5
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b3 = b2;
                        dn8 dn8Var = dn8.a;
                        om6 om6Var2 = om6Var;
                        gn2 gn2Var2 = gn2Var;
                        switch (b3) {
                            case 0:
                                RouteProfile routeProfile = om6Var2.a;
                                routeProfile.getClass();
                                gn2Var2.B(new sv5(routeProfile));
                                break;
                            default:
                                RouteProfile routeProfile2 = om6Var2.a;
                                routeProfile2.getClass();
                                gn2Var2.B(new sv5(routeProfile2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var3.g0(obj4);
                obj3 = obj4;
            }
            kx4 kx4VarX = vj8.x(kx4Var, false, null, null, null, (dn2) obj3, lp2Var3, 31);
            wq6 wq6VarA = vq6.a(ftVar, o50Var, lp2Var3, 54);
            int iHashCode = Long.hashCode(lp2Var3.T);
            kl5 kl5VarL = lp2Var3.l();
            kx4 kx4VarQ = w45.Q(lp2Var3, kx4VarX);
            uz0.j.getClass();
            lp2Var3.Z();
            if (lp2Var3.S) {
                lp2Var3.k();
            } else {
                lp2Var3.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var3, wq6VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var3, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var3, numValueOf);
            pn7.l(lp2Var3);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var3, kx4VarQ);
            boolean z3 = om6Var.c;
            boolean z4 = (i5 == 4) | (i4 == 32);
            Object objK2 = lp2Var3.K();
            if (z4 || objK2 == obj2) {
                r0 = 1;
                final boolean z5 = true ? 1 : 0;
                Object obj5 = new dn2() { // from class: mv5
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b3 = z5;
                        dn8 dn8Var = dn8.a;
                        om6 om6Var2 = om6Var;
                        gn2 gn2Var2 = gn2Var;
                        switch (b3) {
                            case 0:
                                RouteProfile routeProfile = om6Var2.a;
                                routeProfile.getClass();
                                gn2Var2.B(new sv5(routeProfile));
                                break;
                            default:
                                RouteProfile routeProfile2 = om6Var2.a;
                                routeProfile2.getClass();
                                gn2Var2.B(new sv5(routeProfile2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var3.g0(obj5);
                obj = obj5;
            } else {
                r0 = 1;
                obj = objK2;
            }
            wl7.c(z3, false, (dn2) obj, lp2Var3, 0, 6);
            kx4 kx4VarZ = os4.z(new d44(1.0f, r0), 0.0f, 12.0f, r0);
            tw0 tw0VarA = rw0.a(new ft(4.0f, new bt()), pz2.q0, lp2Var3, 6);
            int iHashCode2 = Long.hashCode(lp2Var3.T);
            kl5 kl5VarL2 = lp2Var3.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var3, kx4VarZ);
            lp2Var3.Z();
            if (lp2Var3.S) {
                lp2Var3.k();
            } else {
                lp2Var3.j0();
            }
            pn7.m(dx0Var, lp2Var3, tw0VarA);
            pn7.m(dx0Var2, lp2Var3, kl5VarL2);
            oi0.u(iHashCode2, lp2Var3, dx0Var3, lp2Var3);
            pn7.m(dx0Var4, lp2Var3, kx4VarQ2);
            String name = om6Var.a.getData().getName();
            FillElement fillElement = b.a;
            q06 q06Var = es.a;
            o88 o88Var = ((ds) lp2Var3.j(q06Var)).b;
            q06 q06Var2 = ep.z;
            o88 o88VarA = o88.a(o88Var, ((dp) lp2Var3.j(q06Var2)).c.a, 0L, null, null, 0L, 0L, null, 16777214);
            boolean z6 = r0;
            lp2 lp2Var4 = lp2Var;
            zc1.g(name, fillElement, o88VarA, 0, 0, 1, 0, false, null, lp2Var4, 196656, 472);
            SubscriptionItem subscriptionItem = om6Var.b;
            String strW = subscriptionItem != null ? subscriptionItem.getRemarks() : null;
            if (strW == null) {
                lp2Var4.W(-1001855298);
                strW = vj8.j0(y46.title_server_list, lp2Var4);
                z = false;
            } else {
                z = false;
                lp2Var4.W(-1001856941);
            }
            lp2Var4.p(z);
            zc1.g(strW, fillElement, o88.a(((ds) lp2Var4.j(q06Var)).d, ((dp) lp2Var4.j(q06Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, null, lp2Var4, 196656, 472);
            lp2Var4.p(z6);
            lp2Var4.p(z6);
            lp2Var2 = lp2Var4;
        } else {
            lp2Var3.Q();
            lp2Var2 = lp2Var3;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) om6Var, (Object) gn2Var, kx4Var, i2, (byte) 12);
        }
    }

    public static final kx4 d(kx4 kx4Var, d67 d67Var) {
        return kx4Var.y(new f7(d67Var));
    }

    public static final gp2 e(gp2 gp2Var) {
        if (gp2Var == null) {
            gp2Var = null;
        }
        if (gp2Var != null) {
            return gp2Var;
        }
        d01.b("Inconsistent composition");
        b61.n();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(defpackage.bz7 r6, defpackage.r10 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.yk6
            if (r0 == 0) goto L13
            r0 = r7
            yk6 r0 = (defpackage.yk6) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            yk6 r0 = new yk6
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.g0
            int r1 = r0.h0
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bz7 r6 = r0.f0
            defpackage.w39.n0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.w39.n0(r7)
        L31:
            r0.f0 = r6
            r0.h0 = r2
            bq5 r7 = defpackage.bq5.Y
            java.lang.Object r7 = r6.a(r7, r0)
            c71 r1 = defpackage.c71.X
            if (r7 != r1) goto L40
            return r1
        L40:
            aq5 r7 = (defpackage.aq5) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            hq5 r5 = (defpackage.hq5) r5
            boolean r5 = defpackage.vr3.j(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc.f(bz7, r10):java.lang.Object");
    }

    public static final void g(View view) {
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.clearAnimation();
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                gv3.g(th, th2);
            }
        }
    }

    public static final boolean i(s86 s86Var, float f2, float f3) {
        float f4 = s86Var.a;
        if (f2 > s86Var.c || f4 > f2) {
            return false;
        }
        return f3 <= s86Var.d && s86Var.b <= f3;
    }

    public static dp j(boolean z) {
        return z ? new dp(ep.c, uo.c, xr.f, ap.b, bs.i, rr.c, ir.k, kr.d, to.c, er.c, yr.d, qr.d, bp.b, wr.c, vr.k) : new dp(ep.c, uo.d, xr.g, ap.c, bs.i, rr.c, ir.l, kr.d, to.c, er.d, yr.d, qr.e, bp.c, wr.d, vr.k);
    }

    public static pi2 k(Context context) {
        ProviderInfo providerInfo;
        ni2 ni2Var;
        ApplicationInfo applicationInfo;
        byte b2 = 20;
        be le1Var = Build.VERSION.SDK_INT >= 28 ? new le1(b2) : new be(b2);
        PackageManager packageManager = context.getPackageManager();
        mb6.r(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            ni2Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrJ = le1Var.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrJ) {
                    arrayList.add(signature.toByteArray());
                }
                ni2Var = new ni2(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                ni2Var = null;
            }
        }
        if (ni2Var == null) {
            return null;
        }
        return new pi2(new oi2(context, ni2Var));
    }

    public static final float l(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final sx4 m(vx4 vx4Var, qs0 qs0Var) {
        vx4Var.getClass();
        qs0Var.getClass();
        ot0 ot0VarN = n(vx4Var, qs0Var);
        if (ot0VarN instanceof sx4) {
            return (sx4) ot0VarN;
        }
        return null;
    }

    public static final ot0 n(vx4 vx4Var, qs0 qs0Var) {
        vx4Var.getClass();
        qs0Var.getClass();
        if (vx4Var.W(df6.a) != null) {
            c2.m();
            return null;
        }
        n74 n74VarB0 = vx4Var.b0(qs0Var.a);
        gk2 gk2Var = qs0Var.b.a;
        gk2Var.getClass();
        List listF = gk2.f(gk2Var);
        p74 p74Var = n74VarB0.k0;
        v15 v15Var = (v15) wv0.r0(listF);
        x45 x45Var = x45.i0;
        ot0 ot0VarE = p74Var.e(v15Var, x45Var);
        if (ot0VarE != null) {
            for (v15 v15Var2 : listF.subList(1, listF.size())) {
                if (ot0VarE instanceof sx4) {
                    ot0 ot0VarE2 = ((sx4) ot0VarE).q0().e(v15Var2, x45Var);
                    ot0VarE = ot0VarE2 instanceof sx4 ? (sx4) ot0VarE2 : null;
                    if (ot0VarE != null) {
                    }
                }
            }
            return ot0VarE;
        }
        return null;
    }

    public static final sx4 o(vx4 vx4Var, qs0 qs0Var, z47 z47Var) {
        vx4Var.getClass();
        qs0Var.getClass();
        z47Var.getClass();
        sx4 sx4VarM = m(vx4Var, qs0Var);
        return sx4VarM != null ? sx4VarM : z47Var.E(qs0Var, w27.n0(w27.l0(w27.i0(qs0Var, oa2.X), cl1.h0)));
    }

    public static final int p(int i2, List list) {
        int i3;
        byte b2;
        int i4 = ((tg5) wv0.A0(list)).c;
        if (i2 > ((tg5) wv0.A0(list)).c) {
            xc3.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        byte b3 = 1;
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            tg5 tg5Var = (tg5) list.get(i3);
            if (tg5Var.b > i2) {
                b2 = 1;
            } else {
                b2 = tg5Var.c <= i2 ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        int size2 = list.size();
        String strA = tb4.a(list, null, new dx4(b3), 31);
        StringBuilder sbR = oi0.r(i3, "Found paragraph index ", size2, " should be in range [0, ", ").\nDebug info: index=");
        sbR.append(i2);
        sbR.append(", paragraphs=[");
        sbR.append(strA);
        sbR.append("]");
        xc3.a(sbR.toString());
        return i3;
    }

    public static final int q(int i2, List list) {
        byte b2;
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            tg5 tg5Var = (tg5) list.get(i4);
            if (tg5Var.d > i2) {
                b2 = 1;
            } else {
                b2 = tg5Var.e <= i2 ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int r(ArrayList arrayList, float f2) {
        byte b2;
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((tg5) wv0.A0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            tg5 tg5Var = (tg5) arrayList.get(i3);
            if (tg5Var.f > f2) {
                b2 = 1;
            } else {
                b2 = tg5Var.g <= f2 ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void s(ArrayList arrayList, long j2, gn2 gn2Var) {
        int size = arrayList.size();
        for (int iP = p(f88.d(j2), arrayList); iP < size; iP++) {
            tg5 tg5Var = (tg5) arrayList.get(iP);
            if (tg5Var.b >= f88.c(j2)) {
                return;
            }
            if (tg5Var.b != tg5Var.c) {
                gn2Var.B(tg5Var);
            }
        }
    }

    public static final boolean t(lp2 lp2Var) {
        return ue3.y((Context) lp2Var.j(pc.b));
    }

    public static boolean u(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static h61 w(li5 li5Var, String str, h61 h61Var) throws gi5, IOException {
        String string;
        h61Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListN = i21.N(new ii5(h61Var, li5Var, 0));
        while (true) {
            ii5 ii5Var = (ii5) bw0.k0(arrayListN);
            if (ii5Var != null) {
                h61 h61Var2 = (h61) ((h61) ii5Var.a).a();
                int iIntValue = ii5Var.c;
                li5 li5Var2 = ii5Var.b;
                List list = li5Var2.a;
                List list2 = li5Var2.b;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (!list2.isEmpty()) {
                            int size2 = list2.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i3 = size2 - 1;
                                arrayListN.add(new ii5(h61Var2, (li5) list2.get(size2), iIntValue));
                                if (i3 < 0) {
                                    break;
                                }
                                size2 = i3;
                            }
                        } else {
                            if (iIntValue != str.length()) {
                                arrayList.add(new fi5(iIntValue, tz.q0));
                                break;
                            }
                            return h61Var2;
                        }
                    } else {
                        Object objA = ((ki5) li5Var2.a.get(i2)).a(h61Var2, str, iIntValue);
                        if (!(objA instanceof Integer)) {
                            if (objA instanceof fi5) {
                                arrayList.add((fi5) objA);
                                break;
                            }
                            b61.o(objA, "Unexpected parse result: ");
                            return null;
                        }
                        iIntValue = ((Number) objA).intValue();
                        i2++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    aw0.c0(arrayList, new mv4((byte) 2));
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((fi5) arrayList.get(0)).a + ": " + ((String) ((fi5) arrayList.get(0)).b.invoke());
                } else {
                    StringBuilder sb = new StringBuilder(arrayList.size() * 33);
                    wv0.x0(arrayList, sb, ", ", "Errors: ", null, new dx4((byte) 18), 56);
                    string = sb.toString();
                }
                throw new gi5(string);
            }
        }
    }

    public static final km5 x(c83 c83Var, Object obj) {
        c83Var.getClass();
        km5 km5Var = km5.f0;
        km5Var.getClass();
        mm5 mm5Var = new mm5(km5Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : c83Var) {
            if (!dh3.f(obj2, obj)) {
                arrayList.add(obj2);
            }
        }
        mm5Var.addAll(arrayList);
        return mm5Var.b();
    }

    public static List y(bc7 bc7Var, int i2, bc7 bc7Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = bc7Var.t(i2);
        int i3 = i2 + iT;
        int iF = bc7Var.f(bc7Var.b, bc7Var.q(i2));
        int iF2 = bc7Var.f(bc7Var.b, bc7Var.q(i3));
        int i4 = iF2 - iF;
        boolean z5 = i2 >= 0 && (bc7Var.b[(bc7Var.q(i2) * 5) + 1] & 201326592) != 0;
        bc7Var2.v(iT);
        bc7Var2.w(i4, bc7Var2.t);
        if (bc7Var.g < i3) {
            bc7Var.A(i3);
        }
        if (bc7Var.k < iF2) {
            bc7Var.B(iF2, i3);
        }
        int[] iArr = bc7Var2.b;
        int i5 = bc7Var2.t;
        int i6 = i5 * 5;
        eu.e0(i6, i2 * 5, i3 * 5, bc7Var.b, iArr);
        Object[] objArr = bc7Var2.c;
        int i7 = bc7Var2.i;
        System.arraycopy(bc7Var.c, iF, objArr, i7, i4);
        int i8 = bc7Var2.v;
        iArr[i6 + 2] = i8;
        int i9 = i5 - i2;
        int i10 = i5 + iT;
        int iF3 = i7 - bc7Var2.f(iArr, i5);
        int i11 = bc7Var2.m;
        int i12 = bc7Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i13 = i11;
        int i14 = i5;
        while (i14 < i10) {
            if (i14 != i5) {
                int i15 = (i14 * 5) + 2;
                iArr[i15] = iArr[i15] + i9;
            }
            int[] iArr2 = iArr;
            iArr2[(i14 * 5) + 4] = bc7.h(bc7Var2.f(iArr, i14) + iF3, i13 < i14 ? 0 : bc7Var2.k, i12, length);
            if (i14 == i13) {
                i13++;
            }
            i14++;
            i5 = i5;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        bc7Var2.m = i13;
        int iB = ac7.b(bc7Var.d, i2, bc7Var.o());
        int iB2 = ac7.b(bc7Var.d, i3, bc7Var.o());
        if (iB < iB2) {
            ArrayList arrayList = bc7Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i16 = iB; i16 < iB2; i16++) {
                gp2 gp2Var = (gp2) arrayList.get(i16);
                gp2Var.a += i9;
                arrayList2.add(gp2Var);
            }
            bc7Var2.d.addAll(ac7.b(bc7Var2.d, bc7Var2.t, bc7Var2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = d02.X;
        }
        if (!list.isEmpty()) {
            HashMap map = bc7Var.e;
            HashMap map2 = bc7Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                }
            }
        }
        int i18 = bc7Var2.v;
        bc7Var2.N(i8);
        int iD = bc7Var.D(bc7Var.b, i2);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                bc7Var.O();
                bc7Var.a(iD - bc7Var.t);
                bc7Var.O();
            }
            bc7Var.a(i2 - bc7Var.t);
            boolean zG = bc7Var.G();
            if (z7) {
                bc7Var.L();
                bc7Var.i();
                bc7Var.L();
                bc7Var.i();
            }
            z4 = zG;
        } else {
            boolean zH = bc7Var.H(i2, iT);
            bc7Var.I(iF, i4, i2 - 1);
            z4 = zH;
        }
        if (z4) {
            d01.a("Unexpectedly removed anchors");
        }
        int i19 = bc7Var2.o;
        int i20 = iArr3[i6 + 1];
        bc7Var2.o = i19 + ((1073741824 & i20) != 0 ? 1 : i20 & 67108863);
        if (z2) {
            bc7Var2.t = i10;
            bc7Var2.i = i7 + i4;
        }
        if (z6) {
            bc7Var2.S(i8);
        }
        return list;
    }

    public static final km5 z(c83 c83Var, Object obj) {
        c83Var.getClass();
        km5 km5Var = km5.f0;
        km5Var.getClass();
        mm5 mm5Var = new mm5(km5Var);
        mm5Var.addAll(c83Var);
        mm5Var.add(obj);
        return mm5Var.b();
    }

    public x14 C(x14 x14Var) {
        x14Var.getClass();
        return x14Var;
    }

    public boolean v(String str) {
        return kx3.t.matcher(str).matches();
    }
}
