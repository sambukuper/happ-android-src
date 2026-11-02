package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Property;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.camera.core.ImageProcessingUtil;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.divider.MaterialDividerItemDecoration;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.RealWebSocket;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w39 implements hb7 {
    public static final zy0 X = new zy0(636288403, false, new bz0(0));
    public static final zy0 Y = new zy0(-1357803046, false, new bz0(1));
    public static final Class[] Z = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final byte[] f0 = {112, 114, 111, 0};
    public static final byte[] g0 = {112, 114, 109, 0};
    public static final zx6 h0 = new zx6(29);

    public static final Rect D(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        wa.r(textPaint2, charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            wa.r(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final bq1 J(v63 v63Var, yg1 yg1Var) {
        r18 r18Var = v63Var.c;
        if (!(r18Var instanceof lq2)) {
            return new y45(yg1Var);
        }
        yx8 yx8VarD = bs7.d(((lq2) r18Var).getView());
        synchronized (yx8VarD) {
            n97 n97Var = yx8VarD.X;
            if (n97Var != null) {
                Bitmap.Config[] configArr = at8.a;
                if (dh3.f(Looper.myLooper(), Looper.getMainLooper()) && yx8VarD.f0) {
                    yx8VarD.f0 = false;
                    n97Var.X = yg1Var;
                    return n97Var;
                }
            }
            og7 og7Var = yx8VarD.Y;
            if (og7Var != null) {
                og7Var.m(null);
            }
            yx8VarD.Y = null;
            n97 n97Var2 = new n97();
            n97Var2.X = yg1Var;
            yx8VarD.X = n97Var2;
            return n97Var2;
        }
    }

    public static final long N(KeyEvent keyEvent) {
        return pu.d(keyEvent.getKeyCode());
    }

    public static int Q(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (hi5.l0(2, hi5.z0("CameraOrientationUtil"))) {
            StringBuilder sbR = oi0.r(i, "getRelativeImageRotation: destRotationDegrees=", i2, ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbR.append(z);
            sbR.append(", result=");
            sbR.append(i3);
            hi5.z0("CameraOrientationUtil");
        }
        return i3;
    }

    public static final int S(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if (defpackage.el1.g(r1).equals(defpackage.el1.g(r2)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.su3 a0(defpackage.ho2 r6, defpackage.ot8 r7) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w39.a0(ho2, ot8):su3");
    }

    public static final d73 b0(d73 d73Var, boolean z) {
        if (!z) {
            return d73Var;
        }
        ba0 ba0VarSource = d73Var.source();
        return (ba0VarSource.q(0L, pd1.b) || ba0VarSource.q(0L, pd1.a)) ? vj8.j(new j76(new im2(d73Var.source())), d73Var.getFileSystem()) : d73Var;
    }

    public static MaterialDividerItemDecoration c(BaseActivity baseActivity) {
        MaterialDividerItemDecoration materialDividerItemDecoration = new MaterialDividerItemDecoration(baseActivity, null, 1);
        materialDividerItemDecoration.g = false;
        int iQ = os4.q(baseActivity, v26.settingsBorder);
        materialDividerItemDecoration.c = iQ;
        ShapeDrawable shapeDrawable = materialDividerItemDecoration.a;
        materialDividerItemDecoration.a = shapeDrawable;
        shapeDrawable.setTint(iQ);
        materialDividerItemDecoration.b = nr4.O(TypedValue.applyDimension(1, 1.0f, baseActivity.getResources().getDisplayMetrics()));
        return materialDividerItemDecoration;
    }

    public static int[] c0(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iR = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iR += (int) ys0.R(byteArrayInputStream, 2);
            iArr[i2] = iR;
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0298  */
    /* JADX WARN: Code duplicated, block: B:197:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:211:0x0316  */
    /* JADX WARN: Code duplicated, block: B:214:0x0333  */
    /* JADX WARN: Code duplicated, block: B:225:0x035c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0374  */
    /* JADX WARN: Code duplicated, block: B:230:0x0382  */
    /* JADX WARN: Code duplicated, block: B:231:0x0384  */
    /* JADX WARN: Code duplicated, block: B:237:0x0390  */
    /* JADX WARN: Code duplicated, block: B:257:0x03f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r48v0, types: [lp2] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    public static final void d(final kx4 kx4Var, j74 j74Var, final gg5 gg5Var, final he2 he2Var, final boolean z, final td tdVar, final p8 p8Var, final gt gtVar, final gn2 gn2Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        int i4;
        j74 j74Var2;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean zF;
        Object d74Var;
        j74 j74Var3;
        ?? r12;
        jw3 jw3Var;
        sd5 sd5Var;
        kx4 kx4VarC;
        ?? r5;
        Object objK;
        dn2 dn2Var;
        w80 w80Var;
        z24 z24Var;
        ?? r6;
        Object objK2;
        ?? r2;
        Object objK3;
        lp2Var.X(924924659);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.f(j74Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.f(gg5Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.g(true) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= lp2Var.f(he2Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((i & 1572864) == 0) {
            i3 |= lp2Var.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= lp2Var.f(tdVar) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= lp2Var.f(p8Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (lp2Var.f(gtVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i5 |= lp2Var.h(gn2Var) ? 2048 : 1024;
        }
        if (lp2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            int i6 = i3 & (-234881025);
            lp2Var.q();
            int i7 = i6 >> 3;
            int i8 = i7 & 14;
            int i9 = i8 | ((i5 >> 6) & 112);
            y05 y05VarP = z51.P(gn2Var, lp2Var);
            byte b = 6;
            boolean z5 = (((i9 & 14) ^ 6) > 4 && lp2Var.f(j74Var)) || (i9 & 6) == 4;
            Object objK4 = lp2Var.K();
            be beVar = zz0.a;
            if (z5 || objK4 == beVar) {
                k44 k44Var = new k44();
                k44Var.a = new oh5(Integer.MAX_VALUE);
                k44Var.b = new oh5(Integer.MAX_VALUE);
                lh4 lh4Var = lh4.x0;
                eh ehVar = new eh(y05VarP, b);
                f63 f63Var = rd7.a;
                objK4 = new a74(new zi1(new g00((Object) new zi1(ehVar, lh4Var), (Object) j74Var, (Object) k44Var, (byte) 10), lh4Var), lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 0);
                lp2Var.g0(objK4);
            }
            jw3 jw3Var2 = (jw3) objK4;
            int i10 = i6 >> 9;
            int i11 = i10 & 112;
            int i12 = i8 | i11;
            boolean z6 = ((((i12 & 112) ^ 48) > 32 && lp2Var.g(true)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && lp2Var.f(j74Var)) || (i12 & 6) == 4);
            Object objK5 = lp2Var.K();
            if (z6 || objK5 == beVar) {
                objK5 = new s64(j74Var);
                lp2Var.g0(objK5);
            }
            s64 s64Var = (s64) objK5;
            Object objK6 = lp2Var.K();
            if (objK6 == beVar) {
                objK6 = u70.D(lp2Var);
                lp2Var.g0(objK6);
            }
            b71 b71Var = (b71) objK6;
            vt2 vt2Var = (vt2) lp2Var.j(y01.g);
            we5 we5Var = !((Boolean) lp2Var.j(y01.x)).booleanValue() ? qj7.a : null;
            int i13 = i6 & 112;
            int i14 = i5 << 18;
            int i15 = (i6 & 65520) | (i10 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z7 = ((((i15 & 896) ^ 384) > 256 && lp2Var.f(gg5Var)) || (i15 & 384) == 256) | ((((i15 & 112) ^ 48) > 32 && lp2Var.f(j74Var)) || (i15 & 48) == 32) | ((((i15 & 7168) ^ 3072) > 2048 && lp2Var.g(false)) || (i15 & 3072) == 2048);
            if (((57344 & i15) ^ 24576) > 16384 && lp2Var.g(true)) {
                z2 = true;
            } else if ((i15 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zD = z7 | z2 | lp2Var.d(0) | ((((i15 & 3670016) ^ 1572864) > 1048576 && lp2Var.f(p8Var)) || (i15 & 1572864) == 1048576);
            if (((i15 & 29360128) ^ 12582912) > 8388608) {
                obj = null;
                if (lp2Var.f(null)) {
                    z3 = true;
                }
                boolean z8 = zD | z3;
                if (((i15 & 234881024) ^ 100663296) > 67108864 || !lp2Var.f(obj)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                zF = z4 | z8 | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && lp2Var.f(gtVar)) || (i15 & 805306368) == 536870912) | lp2Var.f(vt2Var) | lp2Var.f(we5Var);
                Object objK7 = lp2Var.K();
                if (!zF || objK7 == beVar) {
                    j74Var3 = j74Var;
                    r12 = 0;
                    d74Var = new d74(j74Var3, gg5Var, jw3Var2, gtVar, b71Var, vt2Var, we5Var, p8Var);
                    jw3Var = jw3Var2;
                    lp2Var.g0(d74Var);
                } else {
                    d74Var = objK7;
                    jw3Var = jw3Var2;
                    r12 = 0;
                    j74Var3 = j74Var;
                }
                d74 d74Var2 = (d74) d74Var;
                sd5Var = sd5.X;
                if (z) {
                    lp2Var.W(-2077147368);
                    r2 = (((((i7 & 14) ^ 6) > 4 || !lp2Var.f(j74Var3)) && (i7 & 6) != 4) ? r12 : 1) | (lp2Var.d(r12) ? 1 : 0);
                    objK3 = lp2Var.K();
                    if (r2 == 0 || objK3 == beVar) {
                        objK3 = new x64(j74Var3);
                        lp2Var.g0(objK3);
                    }
                    kx4VarC = ci8.C((x64) objK3, j74Var3.q0, sd5Var);
                    lp2Var.p(r12);
                } else {
                    lp2Var.W(-2076718545);
                    lp2Var.p(r12);
                    kx4VarC = hx4.X;
                }
                if (i13 == 32) {
                    r5 = 1;
                } else {
                    r5 = r12;
                }
                objK = lp2Var.K();
                if (r5 == 0 || objK == beVar) {
                    objK = new r64(j74Var3, (byte) 1);
                    lp2Var.g0(objK);
                }
                dn2Var = (dn2) objK;
                w80Var = (w80) lp2Var.j(y80.a);
                z24Var = (z24) lp2Var.j(y01.n);
                r6 = ((((((((i10 & 14) ^ 6) > 4 || !lp2Var.g(r12)) && (i10 & 6) != 4) ? r12 : 1) | (lp2Var.f(dn2Var) ? 1 : 0)) | (lp2Var.d(z24Var.ordinal()) ? 1 : 0)) == true ? 1 : 0) | (lp2Var.f(w80Var) ? 1 : 0) | ((((i11 ^ 48) > 32 || !lp2Var.g(true)) && (i10 & 48) != 32) ? r12 : 1);
                objK2 = lp2Var.K();
                if (r6 == 0 || objK2 == beVar) {
                    objK2 = new pj7(dn2Var, z24Var, w80Var);
                    lp2Var.g0(objK2);
                }
                j74Var2 = j74Var3;
                ci8.b(jw3Var, vr3.Z(w79.J(kx4Var.y(j74Var3.n0).y(j74Var3.o0), jw3Var, s64Var, sd5Var, z).y(kx4VarC).y(new zp1(j74Var3.p0)), j74Var3, sd5Var, tdVar, z, he2Var, j74Var3.i0, (pj7) objK2), j74Var2.r0, d74Var2, lp2Var, 0);
            } else {
                obj = null;
            }
            z3 = false;
            boolean z9 = zD | z3;
            if (((i15 & 234881024) ^ 100663296) > 67108864) {
                z4 = false;
            } else {
                z4 = false;
            }
            zF = z4 | z9 | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && lp2Var.f(gtVar)) || (i15 & 805306368) == 536870912) | lp2Var.f(vt2Var) | lp2Var.f(we5Var);
            Object objK8 = lp2Var.K();
            if (zF) {
                j74Var3 = j74Var;
                r12 = 0;
                d74Var = new d74(j74Var3, gg5Var, jw3Var2, gtVar, b71Var, vt2Var, we5Var, p8Var);
                jw3Var = jw3Var2;
                lp2Var.g0(d74Var);
            } else {
                j74Var3 = j74Var;
                r12 = 0;
                d74Var = new d74(j74Var3, gg5Var, jw3Var2, gtVar, b71Var, vt2Var, we5Var, p8Var);
                jw3Var = jw3Var2;
                lp2Var.g0(d74Var);
            }
            d74 d74Var3 = (d74) d74Var;
            sd5Var = sd5.X;
            if (z) {
                lp2Var.W(-2077147368);
                r2 = (((((i7 & 14) ^ 6) > 4 || !lp2Var.f(j74Var3)) && (i7 & 6) != 4) ? r12 : 1) | (lp2Var.d(r12) ? 1 : 0);
                objK3 = lp2Var.K();
                if (r2 == 0) {
                    objK3 = new x64(j74Var3);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = new x64(j74Var3);
                    lp2Var.g0(objK3);
                }
                kx4VarC = ci8.C((x64) objK3, j74Var3.q0, sd5Var);
                lp2Var.p(r12);
            } else {
                lp2Var.W(-2076718545);
                lp2Var.p(r12);
                kx4VarC = hx4.X;
            }
            if (i13 == 32) {
                r5 = 1;
            } else {
                r5 = r12;
            }
            objK = lp2Var.K();
            if (r5 == 0) {
                objK = new r64(j74Var3, (byte) 1);
                lp2Var.g0(objK);
            } else {
                objK = new r64(j74Var3, (byte) 1);
                lp2Var.g0(objK);
            }
            dn2Var = (dn2) objK;
            w80Var = (w80) lp2Var.j(y80.a);
            z24Var = (z24) lp2Var.j(y01.n);
            r6 = ((((((((i10 & 14) ^ 6) > 4 || !lp2Var.g(r12)) && (i10 & 6) != 4) ? r12 : 1) | (lp2Var.f(dn2Var) ? 1 : 0)) | (lp2Var.d(z24Var.ordinal()) ? 1 : 0)) == true ? 1 : 0) | (lp2Var.f(w80Var) ? 1 : 0) | ((((i11 ^ 48) > 32 || !lp2Var.g(true)) && (i10 & 48) != 32) ? r12 : 1);
            objK2 = lp2Var.K();
            if (r6 == 0) {
                objK2 = new pj7(dn2Var, z24Var, w80Var);
                lp2Var.g0(objK2);
            } else {
                objK2 = new pj7(dn2Var, z24Var, w80Var);
                lp2Var.g0(objK2);
            }
            j74Var2 = j74Var3;
            ci8.b(jw3Var, vr3.Z(w79.J(kx4Var.y(j74Var3.n0).y(j74Var3.o0), jw3Var, s64Var, sd5Var, z).y(kx4VarC).y(new zp1(j74Var3.p0)), j74Var3, sd5Var, tdVar, z, he2Var, j74Var3.i0, (pj7) objK2), j74Var2.r0, d74Var3, lp2Var, 0);
        } else {
            j74Var2 = j74Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final j74 j74Var4 = j74Var2;
            j86VarR.d = new rn2() { // from class: b74
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    w39.d(kx4Var, j74Var4, gg5Var, he2Var, z, tdVar, p8Var, gtVar, gn2Var, (lp2) obj2, w79.P(i | 1), w79.P(i2));
                    return dn8.a;
                }
            };
        }
    }

    public static vm1[] d0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, vm1[] vm1VarArr) throws IOException {
        byte[] bArr3 = z39.l0;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, z39.m0)) {
                bt.i("Unsupported meta version");
                return null;
            }
            int iR = (int) ys0.R(fileInputStream, 2);
            byte[] bArrQ = ys0.Q(fileInputStream, (int) ys0.R(fileInputStream, 4), (int) ys0.R(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                bt.i("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrQ);
            try {
                vm1[] vm1VarArrF0 = f0(byteArrayInputStream, bArr2, iR, vm1VarArr);
                byteArrayInputStream.close();
                return vm1VarArrF0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(z39.g0, bArr2)) {
            bt.i("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            bt.i("Unsupported meta version");
            return null;
        }
        int iR2 = (int) ys0.R(fileInputStream, 1);
        byte[] bArrQ2 = ys0.Q(fileInputStream, (int) ys0.R(fileInputStream, 4), (int) ys0.R(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            bt.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrQ2);
        try {
            vm1[] vm1VarArrE0 = e0(byteArrayInputStream2, iR2, vm1VarArr);
            byteArrayInputStream2.close();
            return vm1VarArrE0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void e(MainViewModel mainViewModel, sq6 sq6Var, gw5 gw5Var, dr2 dr2Var, za3 za3Var, kr7 kr7Var, lp2 lp2Var, int i) {
        wm4 wm4Var;
        Object obj;
        dr2 dr2Var2;
        Object obj2;
        za3 za3Var2;
        mainViewModel.getClass();
        sq6Var.getClass();
        gw5Var.getClass();
        dr2Var.getClass();
        za3Var.getClass();
        kr7Var.getClass();
        lp2Var.X(1574779048);
        y05 y05VarO = i21.o(mainViewModel.x, lp2Var);
        o87 o87VarF = zw4.f(null, lp2Var, 6, 2);
        o87 o87VarF2 = zw4.f(null, lp2Var, 0, 3);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = new uh3((byte) 24);
            lp2Var.g0(objK);
        }
        o87 o87VarF3 = zw4.f((gn2) objK, lp2Var, 54, 0);
        o87 o87VarF4 = zw4.f(null, lp2Var, 6, 2);
        wm4 wm4Var2 = ((xm4) y05VarO.getValue()).k;
        if (wm4Var2 instanceof um4) {
            lp2Var.W(1534214385);
            lp2Var.p(false);
            obj = mainViewModel;
        } else {
            if (!(wm4Var2 instanceof vm4)) {
                lp2Var.W(1534211017);
                lp2Var.p(false);
                b61.c();
                return;
            }
            lp2Var.W(316112507);
            boolean zH = lp2Var.h(mainViewModel);
            Object objK2 = lp2Var.K();
            if (zH || objK2 == beVar) {
                wm4Var = wm4Var2;
                ub ubVar = new ub(0, mainViewModel, MainViewModel.class, "onDismissSubscriptionSelectSheet", "onDismissSubscriptionSelectSheet()V", 0, (byte) 19);
                lp2Var.g0(ubVar);
                objK2 = ubVar;
            } else {
                wm4Var = wm4Var2;
            }
            dn2 dn2Var = (dn2) ((pv3) objK2);
            boolean zH2 = lp2Var.h(obj) | lp2Var.f(wm4Var);
            Object objK3 = lp2Var.K();
            if (zH2 || objK3 == beVar) {
                objK3 = new d3(mainViewModel, wm4Var, (byte) 14);
                lp2Var.g0(objK3);
            }
            ch3.e(sq6Var, dn2Var, (gn2) objK3, o87VarF, lp2Var, 8);
            lp2Var.p(false);
        }
        if (((xm4) y05VarO.getValue()).l) {
            lp2Var.W(316603640);
            boolean zH3 = lp2Var.h(obj);
            Object objK4 = lp2Var.K();
            if (zH3 || objK4 == beVar) {
                objK4 = new em4(obj, (byte) 0);
                lp2Var.g0(objK4);
            }
            dn2 dn2Var2 = (dn2) objK4;
            boolean zH4 = lp2Var.h(obj);
            Object objK5 = lp2Var.K();
            if (zH4 || objK5 == beVar) {
                ub ubVar2 = new ub(0, mainViewModel, MainViewModel.class, "onProfileReplaced", "onProfileReplaced()V", 0, (byte) 20);
                obj = mainViewModel;
                lp2Var.g0(ubVar2);
                objK5 = ubVar2;
            }
            yn0.l(gw5Var, dn2Var2, (dn2) ((pv3) objK5), lp2Var, 8, 4);
            lp2Var.p(false);
        } else {
            lp2Var.W(316882330);
            lp2Var.p(false);
        }
        if (((xm4) y05VarO.getValue()).n) {
            lp2Var.W(316947089);
            boolean zH5 = lp2Var.h(obj);
            Object objK6 = lp2Var.K();
            if (zH5 || objK6 == beVar) {
                obj2 = mainViewModel;
                ub ubVar3 = new ub(0, obj2, MainViewModel.class, "onDismissGeoDownloadSheet", "onDismissGeoDownloadSheet()V", 0, (byte) 21);
                lp2Var.g0(ubVar3);
                objK6 = ubVar3;
            } else {
                obj2 = obj;
            }
            dr2Var2 = dr2Var;
            pu.a(dr2Var2, (dn2) ((pv3) objK6), o87VarF2, lp2Var, 8);
            lp2Var.p(false);
        } else {
            dr2Var2 = dr2Var;
            obj2 = obj;
            lp2Var.W(317146202);
            lp2Var.p(false);
        }
        if (((xm4) y05VarO.getValue()).o) {
            lp2Var.W(317199553);
            boolean zH6 = lp2Var.h(obj2);
            Object objK7 = lp2Var.K();
            if (zH6 || objK7 == beVar) {
                ub ubVar4 = new ub(0, obj2, MainViewModel.class, "onDismissUpdateSheet", "onDismissUpdateSheet()V", 0, (byte) 22);
                lp2Var.g0(ubVar4);
                objK7 = ubVar4;
            }
            za3Var2 = za3Var;
            pu.c(za3Var2, (dn2) ((pv3) objK7), o87VarF3, lp2Var, 8);
            lp2Var.p(false);
        } else {
            za3Var2 = za3Var;
            lp2Var.W(317383290);
            lp2Var.p(false);
        }
        if (((xm4) y05VarO.getValue()).p instanceof sm4) {
            lp2Var.W(317474244);
            boolean zH7 = lp2Var.h(obj2);
            Object objK8 = lp2Var.K();
            if (zH7 || objK8 == beVar) {
                ub ubVar5 = new ub(0, obj2, MainViewModel.class, "onHideSubscriptionEditSheet", "onHideSubscriptionEditSheet()V", 0, (byte) 23);
                lp2Var.g0(ubVar5);
                objK8 = ubVar5;
            }
            dn2 dn2Var3 = (dn2) ((pv3) objK8);
            boolean zH8 = lp2Var.h(obj2);
            Object objK9 = lp2Var.K();
            if (zH8 || objK9 == beVar) {
                gm4 gm4Var = new gm4(4, obj2, MainViewModel.class, "onSaveSub", "onSaveSub(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", 0);
                lp2Var.g0(gm4Var);
                objK9 = gm4Var;
            }
            tn2 tn2Var = (tn2) ((pv3) objK9);
            boolean zH9 = lp2Var.h(obj2);
            Object objK10 = lp2Var.K();
            if (zH9 || objK10 == beVar) {
                yn1 yn1Var = new yn1(2, obj2, MainViewModel.class, "onSubSaved", "onSubSaved-SHcGJD0(Ljava/lang/String;Z)V", 0, (byte) 7);
                lp2Var.g0(yn1Var);
                objK10 = yn1Var;
            }
            rq7.a(kr7Var, dn2Var3, tn2Var, (rn2) ((pv3) objK10), o87VarF4, lp2Var, 8);
            lp2Var.p(false);
        } else {
            lp2Var.W(317772154);
            lp2Var.p(false);
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fm4(mainViewModel, sq6Var, gw5Var, dr2Var2, za3Var2, kr7Var, i);
        }
    }

    public static vm1[] e0(ByteArrayInputStream byteArrayInputStream, int i, vm1[] vm1VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new vm1[0];
        }
        if (i != vm1VarArr.length) {
            bt.i("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iR = (int) ys0.R(byteArrayInputStream, 2);
            iArr[i2] = (int) ys0.R(byteArrayInputStream, 2);
            strArr[i2] = new String(ys0.P(byteArrayInputStream, iR), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            vm1 vm1Var = vm1VarArr[i3];
            if (!vm1Var.b.equals(strArr[i3])) {
                bt.i("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            vm1Var.e = i4;
            vm1Var.h = c0(byteArrayInputStream, i4);
        }
        return vm1VarArr;
    }

    public static vm1[] f0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, vm1[] vm1VarArr) throws IOException {
        vm1 vm1Var;
        if (byteArrayInputStream.available() == 0) {
            return new vm1[0];
        }
        if (i != vm1VarArr.length) {
            bt.i("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ys0.R(byteArrayInputStream, 2);
            String str = new String(ys0.P(byteArrayInputStream, (int) ys0.R(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jR = ys0.R(byteArrayInputStream, 4);
            int iR = (int) ys0.R(byteArrayInputStream, 2);
            if (vm1VarArr.length <= 0) {
                vm1Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= vm1VarArr.length) {
                    vm1Var = null;
                    break;
                }
                if (vm1VarArr[i3].b.equals(strSubstring)) {
                    vm1Var = vm1VarArr[i3];
                    break;
                }
                i3++;
            }
            if (vm1Var == null) {
                bt.i("Missing profile key: ".concat(str));
                return null;
            }
            vm1Var.d = jR;
            int[] iArrC0 = c0(byteArrayInputStream, iR);
            if (Arrays.equals(bArr, z39.k0)) {
                vm1Var.e = iR;
                vm1Var.h = iArrC0;
            }
        }
        return vm1VarArr;
    }

    public static final void g(s05 s05Var, Object obj, Object obj2) {
        int iF = s05Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : s05Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof t05) {
                ((t05) obj3).a(obj2);
            } else if (obj3 != obj2) {
                t05 t05Var = new t05();
                t05Var.a(obj3);
                t05Var.a(obj2);
                obj2 = t05Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            s05Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        s05Var.b[i] = obj;
        s05Var.c[i] = obj2;
    }

    public static vm1[] g0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, z39.h0)) {
            bt.i("Unsupported version");
            return null;
        }
        int iR = (int) ys0.R(fileInputStream, 1);
        byte[] bArrQ = ys0.Q(fileInputStream, (int) ys0.R(fileInputStream, 4), (int) ys0.R(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            bt.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrQ);
        try {
            vm1[] vm1VarArrH0 = h0(byteArrayInputStream, str, iR);
            byteArrayInputStream.close();
            return vm1VarArrH0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void h(e38 e38Var, Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (f88.b(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) vj8.g0.B(context2);
        if (list.isEmpty()) {
            return;
        }
        j05 j05Var = e38Var.a;
        j05 j05Var2 = e38Var.a;
        s38 s38Var = s38.b;
        j05Var.a(s38Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            j05Var2.a(new n38(new av5(i), resolveInfo.loadLabel(packageManager).toString(), 0, new gn2() { // from class: bv5
                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    vj8.h0.N(context2, resolveInfo, Boolean.valueOf(z), charSequence, new f88(j));
                    ((t38) obj).close();
                    return dn8.a;
                }
            }));
            i++;
            context2 = context;
        }
        j05Var2.a(s38Var);
    }

    public static vm1[] h0(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new vm1[0];
        }
        vm1[] vm1VarArr = new vm1[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iR = (int) ys0.R(byteArrayInputStream, 2);
            int iR2 = (int) ys0.R(byteArrayInputStream, 2);
            vm1VarArr[i3] = new vm1(str, new String(ys0.P(byteArrayInputStream, iR), StandardCharsets.UTF_8), ys0.R(byteArrayInputStream, 4), iR2, (int) ys0.R(byteArrayInputStream, 4), (int) ys0.R(byteArrayInputStream, 4), new int[iR2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            vm1 vm1Var = vm1VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = vm1Var.f;
            int i6 = vm1Var.g;
            TreeMap treeMap = vm1Var.i;
            int i7 = iAvailable - i5;
            int iR3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iR3 += (int) ys0.R(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iR3), 1);
                int iR4 = (int) ys0.R(byteArrayInputStream, 2);
                while (iR4 > 0) {
                    ys0.R(byteArrayInputStream, 2);
                    int iR5 = (int) ys0.R(byteArrayInputStream, 1);
                    if (iR5 != 6 && iR5 != 7) {
                        while (iR5 > 0) {
                            ys0.R(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iR6 = (int) ys0.R(byteArrayInputStream, 1); iR6 > 0; iR6--) {
                                ys0.R(byteArrayInputStream, 2);
                            }
                            iR5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iR4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                bt.i("Read too much data during profile line parse");
                return null;
            }
            vm1Var.h = c0(byteArrayInputStream, vm1Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(ys0.P(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return vm1VarArr;
    }

    public static final void i(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final boolean i0(s05 s05Var, Object obj, Object obj2) {
        Object objG = s05Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof t05)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            s05Var.j(obj);
            return true;
        }
        t05 t05Var = (t05) objG;
        boolean zL = t05Var.l(obj2);
        if (zL && t05Var.g()) {
            s05Var.j(obj);
        }
        return zL;
    }

    public static final boolean j(Object obj) {
        if (obj instanceof od7) {
            od7 od7Var = (od7) obj;
            if (od7Var.d() == lh4.i0 || od7Var.d() == qe4.v0 || od7Var.d() == lh4.x0) {
                Object value = od7Var.getValue();
                if (value == null) {
                    return true;
                }
                return j(value);
            }
        } else if (!(obj instanceof on2) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (Z[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void j0(s05 s05Var, Object obj) {
        boolean zG;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = s05Var.b[i4];
                        Object obj3 = s05Var.c[i4];
                        if (obj3 instanceof t05) {
                            t05 t05Var = (t05) obj3;
                            t05Var.l(obj);
                            zG = t05Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            s05Var.k(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final kx4 k(kx4 kx4Var, x67 x67Var) {
        return jm4.J(kx4Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, x67Var, true, 0L, 0L, 1042431);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k0(File file, gn2 gn2Var, s51 s51Var) throws IOException {
        q92 q92Var;
        if (s51Var instanceof q92) {
            q92Var = (q92) s51Var;
            int i = q92Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                q92Var.h0 = i - Integer.MIN_VALUE;
            } else {
                q92Var = new q92(s51Var);
            }
        } else {
            q92Var = new q92(s51Var);
        }
        Object obj = q92Var.g0;
        int i2 = q92Var.h0;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = q92Var.f0;
                n0(obj);
                return obj;
            }
            n0(obj);
            q92Var.f0 = file;
            q92Var.h0 = 1;
            Object objB = gn2Var.B(q92Var);
            Object obj2 = c71.X;
            return objB == obj2 ? obj2 : objB;
        } catch (IOException e) {
            if (e instanceof j71) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw vj8.p(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw vj8.p(file, e);
                    }
                    throw vj8.p(file, e);
                }
                if (file.canWrite()) {
                    throw vj8.p(file, e);
                }
                throw vj8.p(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw vj8.p(file, e);
                }
                throw vj8.p(file, e);
            }
            if (file.canWrite()) {
                throw vj8.p(file, e);
            }
            throw vj8.p(file, e);
        }
    }

    public static final kx4 l(kx4 kx4Var) {
        return jm4.J(kx4Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044479);
    }

    public static final Object l0(ai2 ai2Var, int i, gn2 gn2Var) {
        int i2;
        int i3;
        Object objB;
        jx4 jx4VarT;
        v54 v54VarC1;
        int i4;
        t6 t6Var;
        if (!ai2Var.X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var = ai2Var.X.g0;
        LayoutNode layoutNodeZ = yn0.Z(ai2Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objB = null;
            if (layoutNodeZ == null) {
                jx4VarT = null;
                break;
            }
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                while (jx4Var != null) {
                    if ((jx4Var.Z & 1024) != 0) {
                        jx4VarT = jx4Var;
                        c15 c15Var = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                break loop0;
                            }
                            if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i5 = 0;
                                for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                    if ((jx4Var2.Z & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            jx4VarT = jx4Var2;
                                        } else {
                                            if (c15Var == null) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var.b(jx4Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var);
                        }
                    }
                    jx4Var = jx4Var.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
        ai2 ai2Var2 = (ai2) jx4VarT;
        if ((ai2Var2 == null || !dh3.f(ai2Var2.c1(), ai2Var.c1())) && (v54VarC1 = ai2Var.c1()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                bt.i("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (v54VarC1.q0.a.d().o <= 0 || v54VarC1.q0.a.d().l.isEmpty() || !v54VarC1.p0) {
                return gn2Var.B(v54.t0);
            }
            boolean zZ0 = v54VarC1.Z0(i6);
            x64 x64Var = v54VarC1.q0;
            int iMin = zZ0 ? Math.min(x64Var.a.d().o - 1, ((f74) wv0.A0(x64Var.a.d().l)).a) : Math.max(0, x64Var.a.c());
            ea6 ea6Var = new ea6();
            vk1 vk1Var = v54VarC1.r0;
            vk1Var.getClass();
            r54 r54Var = new r54(iMin, iMin);
            ((c15) vk1Var.Y).b(r54Var);
            ea6Var.X = r54Var;
            j74 j74Var = v54VarC1.q0.a;
            if (j74Var.d().l.isEmpty()) {
                i3 = 0;
            } else {
                e74 e74VarD = j74Var.d();
                int i7 = (int) (e74VarD.p == sd5.X ? e74VarD.i() & 4294967295L : e74VarD.i() >> 32);
                int iK = z39.K(j74Var.d());
                if (iK != 0 && (i4 = i7 / iK) >= 1) {
                    i3 = i4;
                }
            }
            int i8 = i3 * 2;
            int i9 = v54VarC1.q0.a.d().o;
            if (i8 > i9) {
                i8 = i9;
            }
            while (objB == null && v54VarC1.Y0((r54) ea6Var.X, i6) && i2 < i8) {
                r54 r54Var2 = (r54) ea6Var.X;
                int i10 = r54Var2.a;
                int i11 = r54Var2.b;
                if (v54VarC1.Z0(i6)) {
                    i11++;
                } else {
                    i10--;
                }
                vk1 vk1Var2 = v54VarC1.r0;
                vk1Var2.getClass();
                r54 r54Var3 = new r54(i10, i11);
                ((c15) vk1Var2.Y).b(r54Var3);
                ((c15) v54VarC1.r0.Y).j((r54) ea6Var.X);
                ea6Var.X = r54Var3;
                i2++;
                yn0.Z(v54VarC1).k();
                objB = gn2Var.B(new u54(v54VarC1, ea6Var, i6));
            }
            ((c15) v54VarC1.r0.Y).j((r54) ea6Var.X);
            yn0.Z(v54VarC1).k();
            return objB;
        }
        return null;
    }

    public static int m0(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        bt.q(pc6.j(i, "Unsupported surface rotation: "));
        return 0;
    }

    public static s05 n() {
        long[] jArr = uw6.a;
        return new s05();
    }

    public static final void n0(Object obj) {
        if (obj instanceof rj6) {
            throw ((rj6) obj).X;
        }
    }

    public static final long o(long j, lx1 lx1Var) {
        long j2;
        int iOrdinal = lx1Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                b61.o(lx1Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static final Object p(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        byte b = 3;
        vz7 vz7Var = new vz7(new f3(map, b));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fm(cls, map, new vz7(new c3(cls, map, b)), vz7Var, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static boolean p0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, vm1[] vm1VarArr) throws IOException {
        int i;
        int i2;
        int length;
        byte[] bArr2 = z39.k0;
        byte[] bArr3 = z39.j0;
        byte[] bArr4 = z39.g0;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = z39.h0;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrS = s(vm1VarArr, bArr5);
                ys0.f0(byteArrayOutputStream, vm1VarArr.length, 1);
                ys0.f0(byteArrayOutputStream, bArrS.length, 4);
                byte[] bArrN = ys0.n(bArrS);
                ys0.f0(byteArrayOutputStream, bArrN.length, 4);
                byteArrayOutputStream.write(bArrN);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                ys0.f0(byteArrayOutputStream, vm1VarArr.length, 1);
                for (vm1 vm1Var : vm1VarArr) {
                    int size = vm1Var.i.size() * 4;
                    String strZ = z(vm1Var.a, vm1Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    ys0.g0(byteArrayOutputStream, strZ.getBytes(charset).length);
                    ys0.g0(byteArrayOutputStream, vm1Var.h.length);
                    ys0.f0(byteArrayOutputStream, size, 4);
                    ys0.f0(byteArrayOutputStream, vm1Var.c, 4);
                    byteArrayOutputStream.write(strZ.getBytes(charset));
                    Iterator it = vm1Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        ys0.g0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        ys0.g0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : vm1Var.h) {
                        ys0.g0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = z39.i0;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrS2 = s(vm1VarArr, bArr6);
                ys0.f0(byteArrayOutputStream, vm1VarArr.length, 1);
                ys0.f0(byteArrayOutputStream, bArrS2.length, 4);
                byte[] bArrN2 = ys0.n(bArrS2);
                ys0.f0(byteArrayOutputStream, bArrN2.length, 4);
                byteArrayOutputStream.write(bArrN2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            ys0.g0(byteArrayOutputStream, vm1VarArr.length);
            for (vm1 vm1Var2 : vm1VarArr) {
                String str = vm1Var2.a;
                TreeMap treeMap = vm1Var2.i;
                String strZ2 = z(str, vm1Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                ys0.g0(byteArrayOutputStream, strZ2.getBytes(charset2).length);
                ys0.g0(byteArrayOutputStream, treeMap.size());
                ys0.g0(byteArrayOutputStream, vm1Var2.h.length);
                ys0.f0(byteArrayOutputStream, vm1Var2.c, 4);
                byteArrayOutputStream.write(strZ2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    ys0.g0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : vm1Var2.h) {
                    ys0.g0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            ys0.g0(byteArrayOutputStream2, vm1VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (vm1 vm1Var3 : vm1VarArr) {
                ys0.f0(byteArrayOutputStream2, vm1Var3.c, 4);
                ys0.f0(byteArrayOutputStream2, vm1Var3.d, 4);
                ys0.f0(byteArrayOutputStream2, vm1Var3.g, 4);
                String strZ3 = z(vm1Var3.a, vm1Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strZ3.getBytes(charset3).length;
                ys0.g0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strZ3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            o59 o59Var = new o59(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(o59Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < vm1VarArr.length) {
                try {
                    vm1 vm1Var4 = vm1VarArr[i8];
                    ys0.g0(byteArrayOutputStream3, i8);
                    ys0.g0(byteArrayOutputStream3, vm1Var4.e);
                    i9 = i9 + 4 + (vm1Var4.e * i6);
                    int[] iArr = vm1Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        ys0.g0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            o59 o59Var2 = new o59(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(o59Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < vm1VarArr.length; i14++) {
                try {
                    vm1 vm1Var5 = vm1VarArr[i14];
                    Iterator it3 = vm1Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        t0(byteArrayOutputStream5, iIntValue, vm1Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            u0(byteArrayOutputStream6, vm1Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            ys0.g0(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            ys0.f0(byteArrayOutputStream4, length4, 4);
                            ys0.g0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i15 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            o59 o59Var3 = new o59(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(o59Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            ys0.f0(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                o59 o59Var4 = (o59) arrayList.get(i16);
                int i17 = o59Var4.a;
                byte[] bArr7 = o59Var4.b;
                if (i17 != 1) {
                    i = i12;
                    if (i17 == i) {
                        i2 = 1;
                    } else if (i17 == 3) {
                        i2 = i;
                    } else if (i17 == 4) {
                        i2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        i2 = 4;
                    }
                } else {
                    i = i12;
                    i2 = 0;
                }
                ys0.f0(byteArrayOutputStream, i2, 4);
                ys0.f0(byteArrayOutputStream, size2, 4);
                if (o59Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrN3 = ys0.n(bArr7);
                    arrayList2.add(bArrN3);
                    ys0.f0(byteArrayOutputStream, bArrN3.length, 4);
                    ys0.f0(byteArrayOutputStream, length5, 4);
                    length = bArrN3.length;
                } else {
                    arrayList2.add(bArr7);
                    ys0.f0(byteArrayOutputStream, bArr7.length, 4);
                    ys0.f0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static /* synthetic */ Object q(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(xv0.Z(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return p(cls, map, arrayList);
    }

    public static final wf7 q0(ly4 ly4Var, lp2 lp2Var) {
        return y((ky4) lp2Var.j(lr4.a), ly4Var);
    }

    public static Bitmap r(n63 n63Var) {
        int format = n63Var.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(n63Var.b(), n63Var.a(), Bitmap.Config.ARGB_8888);
            n63Var.n()[0].c().rewind();
            ImageProcessingUtil.d(bitmapCreateBitmap, n63Var.n()[0].c(), n63Var.n()[0].j());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.b(n63Var);
        }
        if (format != 256 && format != 4101) {
            om0.c(n63Var.getFormat(), ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported", "Incorrect image format of the input image proxy: ");
            return null;
        }
        int format2 = n63Var.getFormat();
        if (format2 != 256 && format2 != 4101) {
            xw3.h(n63Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferC = n63Var.n()[0].c();
        int iCapacity = byteBufferC.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        u52.k("Decode jpeg byte array failed");
        return null;
    }

    public static void r0(ByteArrayOutputStream byteArrayOutputStream, vm1 vm1Var) throws IOException {
        u0(byteArrayOutputStream, vm1Var);
        int i = vm1Var.g;
        int[] iArr = vm1Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            ys0.g0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : vm1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] s(vm1[] vm1VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (vm1 vm1Var : vm1VarArr) {
            length += ((((vm1Var.g * 2) + 7) & (-8)) / 8) + (vm1Var.e * 2) + z(vm1Var.a, vm1Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + vm1Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, z39.i0)) {
            int length2 = vm1VarArr.length;
            while (i < length2) {
                vm1 vm1Var2 = vm1VarArr[i];
                s0(byteArrayOutputStream, vm1Var2, z(vm1Var2.a, vm1Var2.b, bArr));
                r0(byteArrayOutputStream, vm1Var2);
                i++;
            }
        } else {
            for (vm1 vm1Var3 : vm1VarArr) {
                s0(byteArrayOutputStream, vm1Var3, z(vm1Var3.a, vm1Var3.b, bArr));
            }
            int length3 = vm1VarArr.length;
            while (i < length3) {
                r0(byteArrayOutputStream, vm1VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static void s0(ByteArrayOutputStream byteArrayOutputStream, vm1 vm1Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        ys0.g0(byteArrayOutputStream, str.getBytes(charset).length);
        ys0.g0(byteArrayOutputStream, vm1Var.e);
        ys0.f0(byteArrayOutputStream, vm1Var.f, 4);
        ys0.f0(byteArrayOutputStream, vm1Var.c, 4);
        ys0.f0(byteArrayOutputStream, vm1Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final rj6 t(Throwable th) {
        th.getClass();
        return new rj6(th);
    }

    public static void t0(ByteArrayOutputStream byteArrayOutputStream, int i, vm1 vm1Var) throws IOException {
        int i2 = vm1Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : vm1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean u(jd0 jd0Var, jd0 jd0Var2) {
        jd0Var.getClass();
        jd0Var2.getClass();
        if (!(jd0Var2 instanceof dl3) || !(jd0Var instanceof ho2)) {
            return false;
        }
        dl3 dl3Var = (dl3) jd0Var2;
        dl3Var.L().size();
        ho2 ho2Var = (ho2) jd0Var;
        ho2Var.L().size();
        List listL = dl3Var.G0().L();
        listL.getClass();
        List listL2 = ho2Var.a().L();
        listL2.getClass();
        for (qg5 qg5Var : wv0.e1(listL, listL2)) {
            ot8 ot8Var = (ot8) qg5Var.X;
            ot8 ot8Var2 = (ot8) qg5Var.Y;
            ot8Var.getClass();
            boolean z = a0((ho2) jd0Var2, ot8Var) instanceof ru3;
            ot8Var2.getClass();
            if (z != (a0(ho2Var, ot8Var2) instanceof ru3)) {
                return true;
            }
        }
        return false;
    }

    public static void u0(ByteArrayOutputStream byteArrayOutputStream, vm1 vm1Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : vm1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                ys0.g0(byteArrayOutputStream, iIntValue - i);
                ys0.g0(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static void w(Object obj, ArrayList arrayList, d3 d3Var) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) d3Var.B(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                w(it.next(), arrayList, d3Var);
            }
        }
    }

    public static final wf7 y(ky4 ky4Var, ly4 ly4Var) {
        int iOrdinal = ly4Var.ordinal();
        if (iOrdinal == 0) {
            ky4Var.getClass();
            wf7 wf7Var = ky4.b;
            wf7Var.getClass();
            return wf7Var;
        }
        if (iOrdinal == 1) {
            ky4Var.getClass();
            wf7 wf7Var2 = ky4.c;
            wf7Var2.getClass();
            return wf7Var2;
        }
        if (iOrdinal == 2) {
            ky4Var.getClass();
            wf7 wf7Var3 = ky4.d;
            wf7Var3.getClass();
            return wf7Var3;
        }
        if (iOrdinal == 3) {
            ky4Var.getClass();
            wf7 wf7Var4 = ky4.e;
            wf7Var4.getClass();
            return wf7Var4;
        }
        if (iOrdinal == 4) {
            ky4Var.getClass();
            wf7 wf7Var5 = ky4.f;
            wf7Var5.getClass();
            return wf7Var5;
        }
        if (iOrdinal != 5) {
            b61.c();
            return null;
        }
        ky4Var.getClass();
        wf7 wf7Var6 = ky4.g;
        wf7Var6.getClass();
        return wf7Var6;
    }

    public static String z(String str, String str2, byte[] bArr) {
        byte[] bArr2 = z39.j0;
        byte[] bArr3 = z39.k0;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return oi0.p(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public e0 A() {
        return ha6.d;
    }

    public Iterable B(x14 x14Var) {
        x14Var.getClass();
        return ((u1) x14Var).Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g39 C(ji8 ji8Var) {
        List list;
        h75 h75Var;
        xi8 xi8VarT = T();
        if (!X(ji8Var)) {
            return null;
        }
        List listN = xi8VarT.n(ji8Var);
        if (listN.isEmpty()) {
            return null;
        }
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            if (!xi8VarT.J0((x14) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN) {
                    if (P((x14) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                g44 g44VarP = x97.P(w74.Y, new c3((Object) listN, (Object) this, (byte) (0 == true ? 1 : 0)));
                boolean zIsEmpty = arrayList.isEmpty();
                h75 h75Var2 = h75.X;
                if (!zIsEmpty) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            ((x14) it2.next()).getClass();
                            list = listN;
                        }
                    }
                    return new g39(h75Var2, false);
                }
                if (((List) g44VarP.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) g44VarP.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        ((x14) it3.next()).getClass();
                        list = (List) g44VarP.getValue();
                    }
                }
                return new g39(h75Var2, true);
                if (list != null && list.isEmpty()) {
                    h75Var = h75.Y;
                    break;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        h75Var = h75.Y;
                        break;
                    }
                    if (!xi8VarT.G0((x14) it4.next())) {
                        h75Var = h75.Z;
                        break;
                    }
                }
                return new g39(h75Var, list != listN);
            }
        }
        return null;
    }

    public Iterable E() {
        return d02.X;
    }

    public abstract km F();

    public rl3 G() {
        return null;
    }

    public abstract boolean H();

    public g39 I(g39 g39Var, bk3 bk3Var) {
        g39 g39Var2 = null;
        g39 g39Var3 = bk3Var != null ? bk3Var.a : null;
        if (g39Var3 != null) {
            g39 g39Var4 = bk3Var.d ? g39Var3 : null;
            if (g39Var4 != null) {
                return g39Var4;
            }
        }
        if (g39Var != null) {
            if (g39Var.a != h75.Z) {
                g39Var = null;
            }
            g39Var2 = g39Var;
        }
        return g39Var2 == null ? g39Var3 : g39Var2;
    }

    public boolean K() {
        return true;
    }

    public x14 L(x14 x14Var) {
        x14Var.getClass();
        return null;
    }

    public abstract gk2 M(zk6 zk6Var);

    public mz4 O(x14 x14Var) {
        xi8 xi8VarT = T();
        String str = ll3.a;
        if (ll3.k.containsKey(M(xi8VarT.A(x14Var)))) {
            return mz4.X;
        }
        if (ll3.j.containsKey(M(xi8VarT.a0(x14Var)))) {
            return mz4.Y;
        }
        return null;
    }

    public h75 P(x14 x14Var) {
        xi8 xi8VarT = T();
        if (xi8VarT.C0(xi8VarT.A(x14Var))) {
            return h75.Y;
        }
        if (xi8VarT.C0(xi8VarT.a0(x14Var))) {
            return null;
        }
        return h75.Z;
    }

    public boolean R() {
        return false;
    }

    public xi8 T() {
        return qe4.q0;
    }

    public boolean U(x14 x14Var) {
        x14Var.getClass();
        t14 t14Var = (t14) x14Var;
        return zz3.z(t14Var) || zz3.G(t14Var);
    }

    public abstract boolean V();

    public boolean W(x14 x14Var, x14 x14Var2) {
        x14Var.getClass();
        x14Var2.getClass();
        return wl7.l((pw3) x14Var, (pw3) x14Var2);
    }

    public boolean X(ji8 ji8Var) {
        ji8Var.getClass();
        return ji8Var instanceof j54;
    }

    public boolean Y() {
        return true;
    }

    public boolean Z(x14 x14Var) {
        x14Var.getClass();
        return false;
    }

    @Override // defpackage.hb7
    public float b(View view) {
        return view.getTranslationX();
    }

    @Override // defpackage.hb7
    public Property f() {
        return View.TRANSLATION_X;
    }

    public d3 m(x14 x14Var, List list, rh8 rh8Var, boolean z) {
        boolean z2;
        ArrayList arrayList;
        h75 h75Var;
        boolean z3;
        mz4 mz4Var;
        ql3 ql3Var;
        ql3 ql3Var2;
        x14 x14Var2;
        h75 h75VarP;
        mz4 mz4VarO;
        bk3 bk3Var;
        w39 w39Var = this;
        x14Var.getClass();
        ArrayList arrayListO0 = o0(x14Var);
        ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(w39Var.o0((x14) it.next()));
        }
        boolean z4 = true;
        if (!w39Var.V() || list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (!w39Var.W(x14Var, (x14) it2.next())) {
                z2 = true;
                break;
            }
        }
        int size = arrayListO0.size();
        ql3[] ql3VarArr = new ql3[size];
        int i = 0;
        while (i < size) {
            g44 g44VarP = x97.P(w74.Y, new vs4((byte) 2, i, w39Var, arrayListO0));
            if (i <= 0 || !z2) {
                ql3 ql3VarV = w39Var.v((e3) arrayListO0.get(i), (bk3) g44VarP.getValue());
                boolean z5 = ql3VarV.d;
                ArrayList<ql3> arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    e3 e3Var = (e3) wv0.u0(i, (List) it3.next());
                    if (e3Var == null || (x14Var2 = e3Var.a) == null) {
                        arrayListO0 = arrayListO0;
                        ql3Var2 = null;
                    } else {
                        h75 h75VarP2 = w39Var.P(x14Var2);
                        if (h75VarP2 == null) {
                            x14 x14VarL = w39Var.L(x14Var2);
                            h75VarP = x14VarL != null ? w39Var.P(x14VarL) : null;
                        } else {
                            h75VarP = h75VarP2;
                        }
                        mz4 mz4VarO2 = w39Var.O(x14Var2);
                        mz4 mz4VarO3 = w39Var.O(x14Var2);
                        if (mz4VarO3 == null) {
                            x14 x14VarL2 = w39Var.L(x14Var2);
                            mz4VarO = x14VarL2 != null ? w39Var.O(x14VarL2) : null;
                        } else {
                            mz4VarO = mz4VarO3;
                        }
                        ql3Var2 = new ql3(h75VarP, mz4VarO, w39Var.T().H(x14Var2) || w39Var.Z(x14Var2), h75VarP != h75VarP2, mz4VarO != mz4VarO2);
                    }
                    if (ql3Var2 != null) {
                        arrayList3.add(ql3Var2);
                    }
                    arrayListO0 = arrayListO0;
                }
                arrayList = arrayListO0;
                boolean z6 = i == 0 && w39Var.V();
                boolean z7 = i == 0 && w39Var.H();
                mz4 mz4Var2 = ql3VarV.b;
                h75 h75Var2 = ql3VarV.a;
                ArrayList arrayList4 = new ArrayList();
                for (ql3 ql3Var3 : arrayList3) {
                    h75 h75Var3 = ql3Var3.d ? null : ql3Var3.a;
                    if (h75Var3 != null) {
                        arrayList4.add(h75Var3);
                    }
                }
                Set setC1 = wv0.c1(arrayList4);
                h75 h75Var4 = z5 ? null : h75Var2;
                h75 h75Var5 = h75.X;
                h75 h75Var6 = h75.Y;
                h75 h75Var7 = h75.Z;
                h75 h75Var8 = h75Var4 == h75Var5 ? h75Var5 : (h75) xt7.e(setC1, h75Var7, h75Var6, h75Var4, z6);
                if (h75Var8 == null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        h75 h75Var9 = h75Var8;
                        h75 h75Var10 = ((ql3) it4.next()).a;
                        if (h75Var10 != null) {
                            arrayList5.add(h75Var10);
                        }
                        h75Var8 = h75Var9;
                    }
                    h75Var = h75Var8;
                    Set setC2 = wv0.c1(arrayList5);
                    if (h75Var2 != h75Var5) {
                        h75Var5 = (h75) xt7.e(setC2, h75Var7, h75Var6, h75Var2, z6);
                    }
                } else {
                    h75Var = h75Var8;
                    h75Var5 = h75Var;
                }
                if (h75Var5 == null || z || (z7 && h75Var5 == h75Var6)) {
                    h75Var5 = null;
                }
                boolean z8 = h75Var5 != null && h75Var == null;
                if (h75Var5 != h75Var7) {
                    z3 = false;
                } else {
                    if (z5 != z8 || !ql3VarV.c) {
                        if (!arrayList3.isEmpty()) {
                            Iterator it5 = arrayList3.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    ql3 ql3Var4 = (ql3) it5.next();
                                    if (ql3Var4.d != z8 || !ql3Var4.c) {
                                    }
                                }
                            }
                        }
                        z3 = false;
                    }
                    z3 = true;
                }
                ArrayList arrayList6 = new ArrayList();
                for (ql3 ql3Var5 : arrayList3) {
                    mz4 mz4Var3 = ql3Var5.e ? null : ql3Var5.b;
                    if (mz4Var3 != null) {
                        arrayList6.add(mz4Var3);
                    }
                }
                Set setC3 = wv0.c1(arrayList6);
                mz4 mz4Var4 = ql3VarV.e ? null : mz4Var2;
                mz4 mz4Var5 = mz4.Y;
                mz4 mz4Var6 = mz4.X;
                mz4 mz4Var7 = (mz4) xt7.e(setC3, mz4Var5, mz4Var6, mz4Var4, z6);
                if (mz4Var7 == null) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        mz4 mz4Var8 = ((ql3) it6.next()).b;
                        if (mz4Var8 != null) {
                            arrayList7.add(mz4Var8);
                        }
                    }
                    mz4Var = (mz4) xt7.e(wv0.c1(arrayList7), mz4Var5, mz4Var6, mz4Var2, z6);
                } else {
                    mz4Var = mz4Var7;
                }
                ql3Var = new ql3(h75Var5, mz4Var, z3, z8, mz4Var != null && mz4Var7 == null);
            } else {
                ql3Var = (w39Var.Y() && (bk3Var = (bk3) g44VarP.getValue()) != null && bk3Var.e == z4) ? w39Var.v((e3) arrayListO0.get(i), (bk3) g44VarP.getValue()) : ql3.f;
                arrayList = arrayListO0;
            }
            ql3VarArr[i] = ql3Var;
            i++;
            w39Var = this;
            arrayList2 = arrayList2;
            arrayListO0 = arrayList;
            z4 = true;
        }
        return new d3(rh8Var, ql3VarArr, (byte) 0);
    }

    public ArrayList o0(x14 x14Var) {
        xi8 xi8VarT = T();
        e3 e3Var = new e3(x14Var, e0.b(A(), G(), B(x14Var)), null);
        d3 d3Var = new d3(this, xi8VarT, (byte) 1);
        ArrayList arrayList = new ArrayList(1);
        w(e3Var, arrayList, d3Var);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    public ql3 v(e3 e3Var, bk3 bk3Var) {
        Iterable iterableF0;
        g39 g39VarC;
        boolean z;
        g39 g39VarJ;
        boolean z2;
        mh8 mh8VarP0;
        x14 x14Var = e3Var.a;
        x14 x14Var2 = e3Var.a;
        ji8 ji8Var = e3Var.c;
        if (x14Var == null) {
            if ((ji8Var != null ? T().x(ji8Var) : null) == dj8.IN) {
                return ql3.f;
            }
        }
        boolean z3 = ji8Var == null;
        if (x14Var == null || (iterableF0 = B(x14Var)) == null) {
            iterableF0 = d02.X;
        }
        xi8 xi8VarT = T();
        ji8 ji8VarQ = (x14Var == null || (mh8VarP0 = xi8VarT.p0(x14Var)) == null) ? null : xi8VarT.Q(mh8VarP0);
        boolean z4 = F() == km.TYPE_PARAMETER_BOUNDS;
        if (z3) {
            if (z4 || !K() || x14Var == null || !U(x14Var)) {
                iterableF0 = wv0.F0(E(), iterableF0);
            } else {
                Iterable iterableE = E();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableE) {
                    if (!A().i(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableF0 = wv0.H0(arrayList, iterableF0);
            }
        }
        e0 e0VarA = A();
        e0VarA.getClass();
        d0 d0Var = new d0(1, e0VarA, e0.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/WithMigrationStatus;", 0, (byte) 0);
        Iterator it = iterableF0.iterator();
        g39 g39Var = null;
        while (it.hasNext()) {
            g39 g39Var2 = (g39) d0Var.B(it.next());
            if (g39Var != null) {
                boolean z5 = g39Var.b;
                if (g39Var2 != null && !g39Var2.equals(g39Var) && (!(z2 = g39Var2.b) || z5)) {
                    if (z2 || !z5) {
                        g39Var = null;
                        break;
                    }
                }
            }
            g39Var = g39Var2;
        }
        e0 e0VarA2 = A();
        e0VarA2.getClass();
        g39 g39Var3 = null;
        for (Object obj2 : iterableF0) {
            obj2.getClass();
            g39 g39VarJ2 = e0VarA2.j(obj2, x(obj2, x14Var2));
            if (g39VarJ2 == null) {
                Object objL = e0VarA2.l(obj2);
                if (objL != null) {
                    je6 je6VarK = e0VarA2.k(obj2);
                    if (je6VarK == null) {
                        je6VarK = ((is3) e0VarA2.a.Z).a;
                    }
                    if (je6VarK == je6.IGNORE || (g39VarJ = e0VarA2.j(objL, x(objL, x14Var2))) == null) {
                        g39VarJ2 = null;
                    } else {
                        g39VarJ2 = g39.a(g39VarJ, null, je6VarK.a(), 1);
                    }
                } else {
                    g39VarJ2 = null;
                }
            }
            if (g39Var3 != null) {
                boolean z6 = g39Var3.b;
                if (g39VarJ2 != null && !g39VarJ2.equals(g39Var3) && (!(z = g39VarJ2.b) || z6)) {
                    if (z || !z6) {
                        g39Var3 = null;
                        break;
                    }
                }
            }
            g39Var3 = g39VarJ2;
        }
        h75 h75Var = h75.Z;
        if (g39Var3 != null) {
            Object obj3 = g39Var3.a;
            return new ql3((h75) obj3, g39Var != null ? (mz4) g39Var.a : null, obj3 == h75Var && ji8VarQ != null, g39Var3.b, g39Var != null && g39Var.b);
        }
        g39 g39VarC2 = ji8VarQ != null ? C(ji8VarQ) : null;
        g39 g39VarI = I(g39VarC2, bk3Var);
        boolean z7 = (g39VarC2 != null ? (h75) g39VarC2.a : null) == h75Var || !(ji8VarQ == null || bk3Var == null || !bk3Var.c);
        if (ji8Var == null || (g39VarC = C(ji8Var)) == null) {
            g39VarC = null;
        } else if (g39VarC.a == h75.Y) {
            g39VarC = g39.a(g39VarC, h75.X, false, 2);
        }
        if (g39VarC != null) {
            Object obj4 = g39VarC.a;
            if (g39VarI == null) {
                g39VarI = g39VarC;
            } else {
                Object obj5 = g39VarI.a;
                boolean z8 = g39VarI.b;
                boolean z9 = g39VarC.b;
                if (!z9 || z8) {
                    if (z9 || !z8) {
                        h75 h75Var2 = (h75) obj4;
                        Enum r2 = (Enum) obj5;
                        if (h75Var2.compareTo(r2) >= 0 && h75Var2.compareTo(r2) > 0) {
                            g39VarI = g39VarC;
                        }
                    } else {
                        g39VarI = g39VarC;
                    }
                }
            }
        }
        return new ql3(g39VarI != null ? (h75) g39VarI.a : null, g39Var != null ? (mz4) g39Var.a : null, z7, g39VarI != null && g39VarI.b, g39Var != null && g39Var.b);
    }

    public boolean x(Object obj, x14 x14Var) {
        return false;
    }
}
