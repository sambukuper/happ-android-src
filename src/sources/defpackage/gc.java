package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gc extends t3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final uz4 P0;
    public dc A0;
    public vz4 B0;
    public final wz4 C0;
    public final tz4 D0;
    public final tz4 E0;
    public final String F0;
    public final String G0;
    public final zv7 H0;
    public final vz4 I0;
    public z07 J0;
    public boolean K0;
    public final tz4 L0;
    public final c1 M0;
    public final ArrayList N0;
    public final ac O0;
    public final AndroidComposeView f0;
    public int g0 = Integer.MIN_VALUE;
    public final ac h0;
    public final AccessibilityManager i0;
    public long j0;
    public List k0;
    public final cc l0;
    public int m0;
    public int n0;
    public h4 o0;
    public h4 p0;
    public boolean q0;
    public final vz4 r0;
    public final vz4 s0;
    public final ue7 t0;
    public final ue7 u0;
    public int v0;
    public Integer w0;
    public final bu x0;
    public final x90 y0;
    public boolean z0;

    static {
        int[] iArr = {g46.accessibility_custom_action_0, g46.accessibility_custom_action_1, g46.accessibility_custom_action_2, g46.accessibility_custom_action_3, g46.accessibility_custom_action_4, g46.accessibility_custom_action_5, g46.accessibility_custom_action_6, g46.accessibility_custom_action_7, g46.accessibility_custom_action_8, g46.accessibility_custom_action_9, g46.accessibility_custom_action_10, g46.accessibility_custom_action_11, g46.accessibility_custom_action_12, g46.accessibility_custom_action_13, g46.accessibility_custom_action_14, g46.accessibility_custom_action_15, g46.accessibility_custom_action_16, g46.accessibility_custom_action_17, g46.accessibility_custom_action_18, g46.accessibility_custom_action_19, g46.accessibility_custom_action_20, g46.accessibility_custom_action_21, g46.accessibility_custom_action_22, g46.accessibility_custom_action_23, g46.accessibility_custom_action_24, g46.accessibility_custom_action_25, g46.accessibility_custom_action_26, g46.accessibility_custom_action_27, g46.accessibility_custom_action_28, g46.accessibility_custom_action_29, g46.accessibility_custom_action_30, g46.accessibility_custom_action_31};
        uz4 uz4Var = ef3.a;
        uz4 uz4Var2 = new uz4(32);
        int i = uz4Var2.b;
        if (i < 0) {
            kp5.k(_UrlKt.FRAGMENT_ENCODE_SET);
            return;
        }
        int i2 = i + 32;
        uz4Var2.b(i2);
        int[] iArr2 = uz4Var2.a;
        int i3 = uz4Var2.b;
        if (i != i3) {
            eu.e0(i2, i, i3, iArr2, iArr2);
        }
        eu.h0(i, 0, 12, iArr, iArr2);
        uz4Var2.b += 32;
        P0 = uz4Var2;
    }

    public gc(AndroidComposeView androidComposeView) {
        this.f0 = androidComposeView;
        byte b = 0;
        this.h0 = new ac(this, b);
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.i0 = (AccessibilityManager) systemService;
        this.j0 = 100L;
        new Handler(Looper.getMainLooper());
        this.l0 = new cc(this, b);
        this.m0 = Integer.MIN_VALUE;
        this.n0 = Integer.MIN_VALUE;
        this.r0 = new vz4();
        this.s0 = new vz4();
        this.t0 = new ue7(0);
        this.u0 = new ue7(0);
        this.v0 = -1;
        this.x0 = new bu(0);
        this.y0 = gv3.b(1, null, null, 6);
        this.z0 = true;
        vz4 vz4Var = gf3.a;
        vz4Var.getClass();
        this.B0 = vz4Var;
        this.C0 = new wz4();
        this.D0 = new tz4();
        this.E0 = new tz4();
        this.F0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.G0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.H0 = new zv7((byte) 10);
        this.I0 = new vz4();
        this.J0 = new z07(androidComposeView.getSemanticsOwner().a(), vz4Var);
        int i = cf3.a;
        this.L0 = new tz4();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.M0 = new c1(this, (byte) 2);
        this.N0 = new ArrayList();
        this.O0 = new ac(this, (byte) 1);
    }

    public static /* synthetic */ void E(gc gcVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        gcVar.D(i, i2, num, null);
    }

    public static Rect L(mb6 mb6Var, float f, float f2) {
        if (!(mb6Var instanceof ae5) && !(mb6Var instanceof be5)) {
            return null;
        }
        s86 s86VarD = mb6Var.D();
        return new Rect((int) (s86VarD.a + f), (int) (s86VarD.b + f2), (int) (s86VarD.c + f), (int) (s86VarD.d + f2));
    }

    public static float[] N(mb6 mb6Var) {
        if (!(mb6Var instanceof be5)) {
            return null;
        }
        em6 em6Var = ((be5) mb6Var).j0;
        long j = em6Var.h;
        long j2 = em6Var.g;
        long j3 = em6Var.f;
        long j4 = em6Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(mb6 mb6Var, float f, float f2) {
        if (mb6Var instanceof zd5) {
            zd5 zd5Var = (zd5) mb6Var;
            s86 s86VarJ = zd5Var.D().j(f, f2);
            Region region = new Region(new Rect((int) (s86VarJ.a + 0.0f), (int) (s86VarJ.b + 0.0f), (int) (s86VarJ.c + 0.0f), (int) (s86VarJ.d + 0.0f)));
            Region region2 = new Region();
            lf lfVar = zd5Var.j0;
            if (lfVar instanceof lf) {
                Path path = lfVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            u52.k("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(y07 y07Var) {
        ql qlVar;
        if (y07Var != null) {
            t07 t07Var = y07Var.d;
            s05 s05Var = t07Var.X;
            e17 e17Var = c17.a;
            if (s05Var.c(e17Var)) {
                return tb4.a((List) t07Var.c(e17Var), ",", null, 62);
            }
            e17 e17Var2 = c17.G;
            if (s05Var.c(e17Var2)) {
                Object objG = s05Var.g(e17Var2);
                if (objG == null) {
                    objG = null;
                }
                ql qlVar2 = (ql) objG;
                if (qlVar2 != null) {
                    return qlVar2.Y;
                }
            } else {
                Object objG2 = s05Var.g(c17.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (qlVar = (ql) wv0.t0(list)) != null) {
                    return qlVar.Y;
                }
            }
        }
        return null;
    }

    public static final boolean x(jx6 jx6Var, float f) {
        dn2 dn2Var = jx6Var.a;
        if (f >= 0.0f || ((Number) dn2Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) dn2Var.invoke()).floatValue() < ((Number) jx6Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(jx6 jx6Var) {
        dn2 dn2Var = jx6Var.a;
        if (((Number) dn2Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) dn2Var.invoke()).floatValue();
        ((Number) jx6Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(jx6 jx6Var) {
        dn2 dn2Var = jx6Var.a;
        if (((Number) dn2Var.invoke()).floatValue() < ((Number) jx6Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) dn2Var.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.f0.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(y07 y07Var, z07 z07Var) {
        int[] iArr = of3.a;
        wz4 wz4Var = new wz4();
        List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
        LayoutNode layoutNode = y07Var.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            y07 y07Var2 = (y07) listI.get(i);
            ff3 ff3VarS = s();
            int i2 = y07Var2.f;
            if (ff3VarS.a(i2)) {
                if (!z07Var.b.b(i2)) {
                    w(layoutNode);
                    return;
                }
                wz4Var.a(i2);
            }
        }
        wz4 wz4Var2 = z07Var.b;
        int[] iArr2 = wz4Var2.b;
        long[] jArr = wz4Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !wz4Var.b(iArr2[(i3 << 3) + i5])) {
                            w(layoutNode);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            y07 y07Var3 = (y07) listI2.get(i6);
            z07 z07Var2 = (z07) this.I0.b(y07Var3.f);
            if (z07Var2 != null && s().a(y07Var3.f)) {
                B(y07Var3, z07Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.q0 = true;
        }
        try {
            return ((Boolean) this.h0.B(accessibilityEvent)).booleanValue();
        } finally {
            this.q0 = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(tb4.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        dc dcVar = this.A0;
        if (dcVar != null) {
            y07 y07Var = dcVar.a;
            if (i != y07Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - dcVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(y07Var.f), 131072);
                accessibilityEventO.setFromIndex(dcVar.d);
                accessibilityEventO.setToIndex(dcVar.e);
                accessibilityEventO.setAction(dcVar.b);
                accessibilityEventO.setMovementGranularity(dcVar.c);
                accessibilityEventO.getText().add(t(y07Var));
                C(accessibilityEventO);
            }
        }
        this.A0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0256  */
    /* JADX WARN: Code duplicated, block: B:102:0x0263  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02da  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    /* JADX WARN: Code duplicated, block: B:130:0x030e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0316  */
    /* JADX WARN: Code duplicated, block: B:137:0x0323 A[LOOP:4: B:132:0x0312->B:137:0x0323, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0331  */
    /* JADX WARN: Code duplicated, block: B:145:0x0345 A[LOOP:5: B:140:0x032d->B:145:0x0345, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x036b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0376  */
    /* JADX WARN: Code duplicated, block: B:162:0x039e  */
    /* JADX WARN: Code duplicated, block: B:165:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:169:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:174:0x0405  */
    /* JADX WARN: Code duplicated, block: B:176:0x040b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0455  */
    /* JADX WARN: Code duplicated, block: B:253:0x0543  */
    /* JADX WARN: Code duplicated, block: B:256:0x0556 A[LOOP:6: B:252:0x0541->B:256:0x0556, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x0567  */
    /* JADX WARN: Code duplicated, block: B:263:0x0574  */
    /* JADX WARN: Code duplicated, block: B:266:0x0581  */
    /* JADX WARN: Code duplicated, block: B:267:0x0584  */
    /* JADX WARN: Code duplicated, block: B:293:0x066e  */
    /* JADX WARN: Code duplicated, block: B:315:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x032c A[EDGE_INSN: B:316:0x032c->B:139:0x032c BREAK  A[LOOP:4: B:132:0x0312->B:137:0x0323], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x034a A[EDGE_INSN: B:318:0x034a->B:147:0x034a BREAK  A[LOOP:5: B:140:0x032d->B:145:0x0345], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x021d  */
    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x023e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    /* JADX WARN: Code duplicated, block: B:96:0x024d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0251  */
    public final void H(ff3 ff3Var) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num4;
        int i5;
        byte b;
        t07 t07Var;
        y07 y07Var;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        s05 s05Var;
        LayoutNode layoutNode;
        int i7;
        t07 t07Var2;
        long j;
        int i8;
        int i9;
        Integer num5;
        wx6 wx6Var;
        boolean z4;
        e17 e17Var;
        int i10;
        e17 e17Var2;
        ArrayList arrayList5;
        e17 e17Var3;
        boolean zF;
        String str;
        e17 e17Var4;
        int size;
        int i11;
        wx6 wx6Var2;
        Object objG;
        Object objG2;
        on2 on2Var;
        boolean z5;
        int i12;
        Object objG3;
        ql qlVar;
        String str2;
        Object objG4;
        ql qlVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        int i13;
        Integer num6;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zC;
        boolean z6;
        boolean z7;
        AccessibilityEvent accessibilityEventP;
        Object objG6;
        kl6 kl6Var;
        Object objG7;
        AccessibilityEvent accessibilityEventO;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i18;
        gc gcVar = this;
        ff3 ff3Var2 = ff3Var;
        Integer num7 = 64;
        ArrayList arrayList6 = gcVar.N0;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        arrayList6.clear();
        int[] iArr3 = ff3Var2.b;
        long[] jArr3 = ff3Var2.a;
        byte b2 = 2;
        int length3 = jArr3.length - 2;
        int i19 = 0;
        Integer num8 = 0;
        if (length3 < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j2 = jArr3[i20];
            byte b3 = b2;
            int i21 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i22 = 8;
                int i23 = 8 - ((~(i20 - i21)) >>> 31);
                long j3 = j2;
                int i24 = i19;
                while (i24 < i23) {
                    if ((j3 & 255) < 128) {
                        int i25 = iArr3[(i20 << 3) + i24];
                        z07 z07Var = (z07) gcVar.I0.b(i25);
                        if (z07Var == null) {
                            i2 = i24;
                            num3 = num7;
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList6;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i23;
                            i4 = i20;
                            num4 = num8;
                            i5 = i22;
                            b = b3;
                        } else {
                            t07 t07Var3 = z07Var.a;
                            s05 s05Var2 = t07Var3.X;
                            a17 a17Var = (a17) ff3Var2.b(i25);
                            int i26 = i22;
                            y07 y07Var2 = a17Var != null ? a17Var.a : null;
                            if (y07Var2 == null) {
                                throw p61.j("no value for specified key");
                            }
                            LayoutNode layoutNode2 = y07Var2.c;
                            t07 t07Var4 = y07Var2.d;
                            iArr2 = iArr3;
                            int i27 = y07Var2.f;
                            jArr2 = jArr3;
                            s05 s05Var3 = t07Var4.X;
                            i4 = i20;
                            Object[] objArr = s05Var3.b;
                            Object[] objArr2 = s05Var3.c;
                            long[] jArr4 = s05Var3.a;
                            i2 = i24;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                LayoutNode layoutNode3 = layoutNode2;
                                i3 = i23;
                                int i28 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i28];
                                    y07 y07Var3 = y07Var2;
                                    int i29 = i28;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i29 - length4)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i29 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length4;
                                                Object obj2 = objArr2[i32];
                                                t07Var2 = t07Var3;
                                                e17 e17Var5 = (e17) obj;
                                                j = j4;
                                                e17 e17Var6 = c17.v;
                                                if (dh3.f(e17Var5, e17Var6) || dh3.f(e17Var5, c17.w)) {
                                                    int size2 = arrayList7.size();
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= size2) {
                                                            wx6Var = null;
                                                            break;
                                                        }
                                                        int i35 = size2;
                                                        if (((wx6) arrayList7.get(i34)).X == i25) {
                                                            wx6Var = (wx6) arrayList7.get(i34);
                                                            break;
                                                        } else {
                                                            i34++;
                                                            size2 = i35;
                                                        }
                                                    }
                                                    if (wx6Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        wx6Var = new wx6(i25, arrayList6);
                                                        z4 = true;
                                                    }
                                                    arrayList6.add(wx6Var);
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    e17Var = c17.d;
                                                    if (dh3.f(e17Var5, e17Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = s05Var2.c(e17Var);
                                                        i18 = i26;
                                                        if (zC2) {
                                                            gcVar.F(i25, i18, str3);
                                                        }
                                                    } else {
                                                        i10 = i26;
                                                        if (dh3.f(e17Var5, c17.b)) {
                                                            E(gcVar, gcVar.A(i25), 2048, num7, i10);
                                                            E(gcVar, gcVar.A(i25), 2048, num8, i10);
                                                        } else if (dh3.f(e17Var5, c17.L)) {
                                                            E(gcVar, gcVar.A(i25), 2048, 8192, 8);
                                                            E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                        } else if (dh3.f(e17Var5, c17.O)) {
                                                            E(gcVar, gcVar.A(i25), 2048, 3072, 8);
                                                        } else if (dh3.f(e17Var5, c17.c)) {
                                                            E(gcVar, gcVar.A(i25), 2048, num7, 8);
                                                            E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                        } else {
                                                            e17Var2 = c17.K;
                                                            arrayList7 = arrayList7;
                                                            if (dh3.f(e17Var5, e17Var2)) {
                                                                objG6 = s05Var3.g(c17.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                kl6Var = (kl6) objG6;
                                                                if (kl6Var == null && kl6Var.a == 4) {
                                                                    objG7 = s05Var3.g(e17Var2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (dh3.f(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventO = gcVar.o(gcVar.A(i25), 4);
                                                                        y07Var3 = y07Var3;
                                                                        layoutNode3 = layoutNode3;
                                                                        y07 y07Var4 = new y07(y07Var3.a, true, layoutNode3, t07Var4);
                                                                        objG8 = y07Var4.k().X.g(c17.a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        strA = list2 != null ? tb4.a(list2, ",", null, 62) : null;
                                                                        objG9 = y07Var4.k().X.g(c17.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        if (list != null) {
                                                                            strA2 = tb4.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventO.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventO.getText().add(strA2);
                                                                        }
                                                                        gcVar.C(accessibilityEventO);
                                                                    } else {
                                                                        layoutNode3 = layoutNode3;
                                                                        y07Var3 = y07Var3;
                                                                        E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    layoutNode3 = layoutNode3;
                                                                    y07Var3 = y07Var3;
                                                                    E(gcVar, gcVar.A(i25), 2048, num7, 8);
                                                                    E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                                }
                                                                num5 = num8;
                                                                i9 = i25;
                                                                s05Var2 = s05Var2;
                                                                num7 = num7;
                                                                b3 = b3;
                                                                arrayList6 = arrayList6;
                                                                i8 = i33;
                                                            } else {
                                                                arrayList5 = arrayList6;
                                                                layoutNode3 = layoutNode3;
                                                                y07Var3 = y07Var3;
                                                                i30 = i30;
                                                                if (dh3.f(e17Var5, c17.a)) {
                                                                    int iA = gcVar.A(i25);
                                                                    obj2.getClass();
                                                                    gcVar.D(iA, 2048, 4, (List) obj2);
                                                                    num5 = num8;
                                                                    i9 = i25;
                                                                    s05Var2 = s05Var2;
                                                                    num7 = num7;
                                                                } else {
                                                                    e17Var3 = c17.G;
                                                                    zF = dh3.f(e17Var5, e17Var3);
                                                                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                                                                    if (zF) {
                                                                        if (s05Var3.c(s07.k)) {
                                                                            objG4 = s05Var2.g(e17Var3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            qlVar2 = (ql) objG4;
                                                                            if (qlVar2 == null) {
                                                                                qlVar2 = _UrlKt.FRAGMENT_ENCODE_SET;
                                                                            }
                                                                            objG5 = s05Var3.g(e17Var3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (ql) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
                                                                            }
                                                                            charSequenceP = P(charSequence);
                                                                            length = qlVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i13 = length2;
                                                                            } else {
                                                                                i13 = length;
                                                                            }
                                                                            num6 = num8;
                                                                            i14 = 0;
                                                                            while (true) {
                                                                                num7 = num7;
                                                                                if (i14 < i13) {
                                                                                    i15 = length;
                                                                                    break;
                                                                                }
                                                                                i15 = length;
                                                                                if (qlVar2.charAt(i14) != charSequence.charAt(i14)) {
                                                                                    break;
                                                                                }
                                                                                i14++;
                                                                                length = i15;
                                                                                num7 = num7;
                                                                            }
                                                                            i16 = 0;
                                                                            while (true) {
                                                                                if (i16 < i13 - i14) {
                                                                                    i17 = i16;
                                                                                    break;
                                                                                }
                                                                                i17 = i16;
                                                                                if (qlVar2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                    break;
                                                                                } else {
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                            }
                                                                            int i36 = (i15 - i17) - i14;
                                                                            int i37 = (length2 - i17) - i14;
                                                                            e17 e17Var7 = c17.N;
                                                                            boolean zC3 = s05Var2.c(e17Var7);
                                                                            boolean zC4 = s05Var3.c(e17Var7);
                                                                            zC = s05Var2.c(c17.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z7 = false;
                                                                            } else {
                                                                                z7 = true;
                                                                            }
                                                                            if (!z6 || z7) {
                                                                                i9 = i25;
                                                                                num8 = num6;
                                                                                accessibilityEventP = gcVar.p(gcVar.A(i25), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                            } else {
                                                                                accessibilityEventP = gcVar.o(gcVar.A(i25), 16);
                                                                                accessibilityEventP.setFromIndex(i14);
                                                                                accessibilityEventP.setRemovedCount(i36);
                                                                                accessibilityEventP.setAddedCount(i37);
                                                                                accessibilityEventP.setBeforeText(qlVar2);
                                                                                accessibilityEventP.getText().add(charSequenceP);
                                                                                i9 = i25;
                                                                                num8 = num6;
                                                                            }
                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                bc.b(y07Var3, accessibilityEventP);
                                                                            }
                                                                            gcVar.C(accessibilityEventP);
                                                                            if (z6 || z7) {
                                                                                long j5 = ((f88) t07Var4.c(c17.H)).a;
                                                                                accessibilityEventP.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventP.setToIndex((int) (j5 & 4294967295L));
                                                                                gcVar.C(accessibilityEventP);
                                                                            }
                                                                        } else {
                                                                            i9 = i25;
                                                                            s05Var2 = s05Var2;
                                                                            num7 = num7;
                                                                            E(gcVar, gcVar.A(i9), 2048, Integer.valueOf(b3), 8);
                                                                        }
                                                                        num5 = num8;
                                                                    } else {
                                                                        i9 = i25;
                                                                        s05Var2 = s05Var2;
                                                                        num7 = num7;
                                                                        i8 = i33;
                                                                        e17Var4 = c17.H;
                                                                        if (dh3.f(e17Var5, e17Var4)) {
                                                                            objG3 = s05Var3.g(e17Var3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            qlVar = (ql) objG3;
                                                                            if (qlVar != null && (str2 = qlVar.Y) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((f88) t07Var4.c(e17Var4)).a;
                                                                            num5 = num8;
                                                                            gcVar = this;
                                                                            gcVar.C(gcVar.p(gcVar.A(i9), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                            gcVar.G(i27);
                                                                        } else {
                                                                            num5 = num8;
                                                                            if (!dh3.f(e17Var5, e17Var6) || dh3.f(e17Var5, c17.w)) {
                                                                                gcVar.w(layoutNode3);
                                                                                size = arrayList5.size();
                                                                                i11 = 0;
                                                                                while (true) {
                                                                                    if (i11 < size) {
                                                                                        arrayList6 = arrayList5;
                                                                                        wx6Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList6 = arrayList5;
                                                                                    if (((wx6) arrayList6.get(i11)).X == i9) {
                                                                                        wx6Var2 = (wx6) arrayList6.get(i11);
                                                                                        break;
                                                                                    } else {
                                                                                        i11++;
                                                                                        arrayList5 = arrayList6;
                                                                                    }
                                                                                }
                                                                                wx6Var2.getClass();
                                                                                objG = s05Var3.g(e17Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                wx6Var2.g0 = (jx6) objG;
                                                                                objG2 = s05Var3.g(c17.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                wx6Var2.h0 = (jx6) objG2;
                                                                                if (wx6Var2.Y.contains(wx6Var2)) {
                                                                                    b3 = b3;
                                                                                    gcVar.f0.getSnapshotObserver().a.c(wx6Var2, gcVar.O0, new p5(wx6Var2, gcVar, b3));
                                                                                } else {
                                                                                    b3 = b3;
                                                                                }
                                                                            } else if (dh3.f(e17Var5, c17.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    gcVar.C(gcVar.o(gcVar.A(i27), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                E(gcVar, gcVar.A(i27), 2048, num5, i12);
                                                                            } else {
                                                                                e17 e17Var8 = s07.x;
                                                                                if (dh3.f(e17Var5, e17Var8)) {
                                                                                    List list3 = (List) t07Var4.c(e17Var8);
                                                                                    Object objG10 = s05Var2.g(e17Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        t05 t05Var = vw6.a;
                                                                                        t05 t05Var2 = new t05();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            c2.m();
                                                                                            return;
                                                                                        }
                                                                                        t05 t05Var3 = new t05();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            c2.m();
                                                                                            return;
                                                                                        }
                                                                                        z5 = z2 || !t05Var2.equals(t05Var3);
                                                                                    } else {
                                                                                        z5 = z2 || !list3.isEmpty();
                                                                                    }
                                                                                    z2 = z5;
                                                                                } else if (z2 || !(obj2 instanceof q3)) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    q3 q3Var = (q3) obj2;
                                                                                    Object objG11 = s05Var2.g(e17Var5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (q3Var != objG11) {
                                                                                        if (objG11 instanceof q3) {
                                                                                            String str4 = q3Var.a;
                                                                                            q3 q3Var2 = (q3) objG11;
                                                                                            on2 on2Var2 = q3Var2.b;
                                                                                            if (dh3.f(str4, q3Var2.a) && (((on2Var = q3Var.b) != null || on2Var2 == null) && (on2Var == null || on2Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        z2 = true;
                                                                                    }
                                                                                    z2 = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        b3 = b3;
                                                                        arrayList6 = arrayList5;
                                                                    }
                                                                }
                                                                b3 = b3;
                                                                arrayList6 = arrayList5;
                                                                i8 = i33;
                                                            }
                                                        }
                                                    }
                                                    i8 = i33;
                                                } else {
                                                    Object objG12 = s05Var2.g(e17Var5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (!dh3.f(obj2, objG12)) {
                                                        e17Var = c17.d;
                                                        if (dh3.f(e17Var5, e17Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = s05Var2.c(e17Var);
                                                            i18 = i26;
                                                            if (zC2) {
                                                                gcVar.F(i25, i18, str3);
                                                            }
                                                        } else {
                                                            i10 = i26;
                                                            if (dh3.f(e17Var5, c17.b)) {
                                                                E(gcVar, gcVar.A(i25), 2048, num7, i10);
                                                                E(gcVar, gcVar.A(i25), 2048, num8, i10);
                                                            } else if (dh3.f(e17Var5, c17.L)) {
                                                                E(gcVar, gcVar.A(i25), 2048, 8192, 8);
                                                                E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                            } else if (dh3.f(e17Var5, c17.O)) {
                                                                E(gcVar, gcVar.A(i25), 2048, 3072, 8);
                                                            } else if (dh3.f(e17Var5, c17.c)) {
                                                                E(gcVar, gcVar.A(i25), 2048, num7, 8);
                                                                E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                            } else {
                                                                e17Var2 = c17.K;
                                                                arrayList7 = arrayList7;
                                                                if (dh3.f(e17Var5, e17Var2)) {
                                                                    objG6 = s05Var3.g(c17.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    kl6Var = (kl6) objG6;
                                                                    if (kl6Var == null) {
                                                                        layoutNode3 = layoutNode3;
                                                                        y07Var3 = y07Var3;
                                                                        E(gcVar, gcVar.A(i25), 2048, num7, 8);
                                                                        E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                                    } else {
                                                                        objG7 = s05Var3.g(e17Var2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (dh3.f(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventO = gcVar.o(gcVar.A(i25), 4);
                                                                            y07Var3 = y07Var3;
                                                                            layoutNode3 = layoutNode3;
                                                                            y07 y07Var5 = new y07(y07Var3.a, true, layoutNode3, t07Var4);
                                                                            objG8 = y07Var5.k().X.g(c17.a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = y07Var5.k().X.g(c17.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            if (list != null) {
                                                                                strA2 = tb4.a(list, ",", null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventO.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventO.getText().add(strA2);
                                                                            }
                                                                            gcVar.C(accessibilityEventO);
                                                                        } else {
                                                                            layoutNode3 = layoutNode3;
                                                                            y07Var3 = y07Var3;
                                                                            E(gcVar, gcVar.A(i25), 2048, num8, 8);
                                                                        }
                                                                    }
                                                                    num5 = num8;
                                                                    i9 = i25;
                                                                    s05Var2 = s05Var2;
                                                                    num7 = num7;
                                                                    b3 = b3;
                                                                    arrayList6 = arrayList6;
                                                                    i8 = i33;
                                                                } else {
                                                                    arrayList5 = arrayList6;
                                                                    layoutNode3 = layoutNode3;
                                                                    y07Var3 = y07Var3;
                                                                    i30 = i30;
                                                                    if (dh3.f(e17Var5, c17.a)) {
                                                                        int iA2 = gcVar.A(i25);
                                                                        obj2.getClass();
                                                                        gcVar.D(iA2, 2048, 4, (List) obj2);
                                                                        num5 = num8;
                                                                        i9 = i25;
                                                                        s05Var2 = s05Var2;
                                                                        num7 = num7;
                                                                    } else {
                                                                        e17Var3 = c17.G;
                                                                        zF = dh3.f(e17Var5, e17Var3);
                                                                        str = _UrlKt.FRAGMENT_ENCODE_SET;
                                                                        if (zF) {
                                                                            if (s05Var3.c(s07.k)) {
                                                                                objG4 = s05Var2.g(e17Var3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                qlVar2 = (ql) objG4;
                                                                                if (qlVar2 == null) {
                                                                                    qlVar2 = _UrlKt.FRAGMENT_ENCODE_SET;
                                                                                }
                                                                                objG5 = s05Var3.g(e17Var3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (ql) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
                                                                                }
                                                                                charSequenceP = P(charSequence);
                                                                                length = qlVar2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i13 = length2;
                                                                                } else {
                                                                                    i13 = length;
                                                                                }
                                                                                num6 = num8;
                                                                                i14 = 0;
                                                                                while (true) {
                                                                                    num7 = num7;
                                                                                    if (i14 < i13) {
                                                                                        i15 = length;
                                                                                        break;
                                                                                    }
                                                                                    i15 = length;
                                                                                    if (qlVar2.charAt(i14) != charSequence.charAt(i14)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i14++;
                                                                                        length = i15;
                                                                                        num7 = num7;
                                                                                    }
                                                                                }
                                                                                i16 = 0;
                                                                                while (true) {
                                                                                    if (i16 < i13 - i14) {
                                                                                        i17 = i16;
                                                                                        break;
                                                                                    }
                                                                                    i17 = i16;
                                                                                    if (qlVar2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                                int i38 = (i15 - i17) - i14;
                                                                                int i39 = (length2 - i17) - i14;
                                                                                e17 e17Var9 = c17.N;
                                                                                boolean zC5 = s05Var2.c(e17Var9);
                                                                                boolean zC6 = s05Var3.c(e17Var9);
                                                                                zC = s05Var2.c(c17.G);
                                                                                if (zC) {
                                                                                    z6 = false;
                                                                                } else {
                                                                                    z6 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z7 = false;
                                                                                } else {
                                                                                    z7 = false;
                                                                                }
                                                                                if (z6) {
                                                                                    i9 = i25;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = gcVar.p(gcVar.A(i25), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                } else {
                                                                                    i9 = i25;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = gcVar.p(gcVar.A(i25), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                }
                                                                                accessibilityEventP.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    bc.b(y07Var3, accessibilityEventP);
                                                                                }
                                                                                gcVar.C(accessibilityEventP);
                                                                                if (z6) {
                                                                                    long j7 = ((f88) t07Var4.c(c17.H)).a;
                                                                                    accessibilityEventP.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j7 & 4294967295L));
                                                                                    gcVar.C(accessibilityEventP);
                                                                                } else {
                                                                                    long j8 = ((f88) t07Var4.c(c17.H)).a;
                                                                                    accessibilityEventP.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j8 & 4294967295L));
                                                                                    gcVar.C(accessibilityEventP);
                                                                                }
                                                                            } else {
                                                                                i9 = i25;
                                                                                s05Var2 = s05Var2;
                                                                                num7 = num7;
                                                                                E(gcVar, gcVar.A(i9), 2048, Integer.valueOf(b3), 8);
                                                                            }
                                                                            num5 = num8;
                                                                        } else {
                                                                            i9 = i25;
                                                                            s05Var2 = s05Var2;
                                                                            num7 = num7;
                                                                            i8 = i33;
                                                                            e17Var4 = c17.H;
                                                                            if (dh3.f(e17Var5, e17Var4)) {
                                                                                objG3 = s05Var3.g(e17Var3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                qlVar = (ql) objG3;
                                                                                if (qlVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((f88) t07Var4.c(e17Var4)).a;
                                                                                num5 = num8;
                                                                                gcVar = this;
                                                                                gcVar.C(gcVar.p(gcVar.A(i9), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                                gcVar.G(i27);
                                                                            } else {
                                                                                num5 = num8;
                                                                                if (dh3.f(e17Var5, e17Var6)) {
                                                                                }
                                                                                gcVar.w(layoutNode3);
                                                                                size = arrayList5.size();
                                                                                i11 = 0;
                                                                                while (true) {
                                                                                    if (i11 < size) {
                                                                                        arrayList6 = arrayList5;
                                                                                        wx6Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList6 = arrayList5;
                                                                                    if (((wx6) arrayList6.get(i11)).X == i9) {
                                                                                        wx6Var2 = (wx6) arrayList6.get(i11);
                                                                                        break;
                                                                                    } else {
                                                                                        i11++;
                                                                                        arrayList5 = arrayList6;
                                                                                    }
                                                                                }
                                                                                wx6Var2.getClass();
                                                                                objG = s05Var3.g(e17Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                wx6Var2.g0 = (jx6) objG;
                                                                                objG2 = s05Var3.g(c17.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                wx6Var2.h0 = (jx6) objG2;
                                                                                if (wx6Var2.Y.contains(wx6Var2)) {
                                                                                    b3 = b3;
                                                                                } else {
                                                                                    b3 = b3;
                                                                                    gcVar.f0.getSnapshotObserver().a.c(wx6Var2, gcVar.O0, new p5(wx6Var2, gcVar, b3));
                                                                                }
                                                                            }
                                                                            b3 = b3;
                                                                            arrayList6 = arrayList5;
                                                                        }
                                                                    }
                                                                    b3 = b3;
                                                                    arrayList6 = arrayList5;
                                                                    i8 = i33;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i8 = i33;
                                                }
                                                i26 = 8;
                                                b3 = b3;
                                                s05Var2 = s05Var2;
                                                layoutNode3 = layoutNode3;
                                                i30 = i30;
                                                i31++;
                                                i25 = i9;
                                                y07Var3 = y07Var3;
                                                j4 = j >> 8;
                                                arrayList6 = arrayList6;
                                                length4 = i8;
                                                num8 = num5;
                                                t07Var3 = t07Var2;
                                                arrayList7 = arrayList7;
                                                num7 = num7;
                                            } else {
                                                t07Var2 = t07Var3;
                                                j = j4;
                                                i31 = i31;
                                                i8 = length4;
                                            }
                                            num5 = num8;
                                            i9 = i25;
                                            i30 = i30;
                                            s05Var2 = s05Var2;
                                            i26 = 8;
                                            b3 = b3;
                                            s05Var2 = s05Var2;
                                            layoutNode3 = layoutNode3;
                                            i30 = i30;
                                            i31++;
                                            i25 = i9;
                                            y07Var3 = y07Var3;
                                            j4 = j >> 8;
                                            arrayList6 = arrayList6;
                                            length4 = i8;
                                            num8 = num5;
                                            t07Var3 = t07Var2;
                                            arrayList7 = arrayList7;
                                            num7 = num7;
                                        }
                                        t07Var = t07Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList6;
                                        b = b3;
                                        layoutNode = layoutNode3;
                                        y07Var = y07Var3;
                                        z = true;
                                        i7 = length4;
                                        num4 = num8;
                                        i6 = i25;
                                        int i40 = i30;
                                        s05Var = s05Var2;
                                        if (i40 != i26) {
                                            break;
                                        }
                                    } else {
                                        t07Var = t07Var3;
                                        s05Var = s05Var2;
                                        num3 = num7;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList6;
                                        b = b3;
                                        layoutNode = layoutNode3;
                                        y07Var = y07Var3;
                                        z = true;
                                        i7 = length4;
                                        num4 = num8;
                                        i6 = i25;
                                    }
                                    if (i29 == i7) {
                                        break;
                                    }
                                    num8 = num4;
                                    i25 = i6;
                                    b3 = b;
                                    s05Var2 = s05Var;
                                    layoutNode3 = layoutNode;
                                    arrayList7 = arrayList3;
                                    i26 = 8;
                                    i28 = i29 + 1;
                                    arrayList6 = arrayList4;
                                    length4 = i7;
                                    y07Var2 = y07Var;
                                    t07Var3 = t07Var;
                                    num7 = num3;
                                }
                            } else {
                                t07Var = t07Var3;
                                num3 = num7;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList6;
                                i3 = i23;
                                y07Var = y07Var2;
                                b = b3;
                                z = true;
                                num4 = num8;
                                i6 = i25;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = t07Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!y07Var.k().X.c((e17) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i5 = 8;
                                E(gcVar, gcVar.A(i6), 2048, num4, 8);
                            } else {
                                i5 = 8;
                            }
                        }
                    } else {
                        i2 = i24;
                        num3 = num7;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList6;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i23;
                        i4 = i20;
                        num4 = num8;
                        i5 = i22;
                        b = b3;
                    }
                    j3 >>= i5;
                    i24 = i2 + 1;
                    ff3Var2 = ff3Var;
                    arrayList6 = arrayList4;
                    num8 = num4;
                    b3 = b;
                    i22 = i5;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i20 = i4;
                    i23 = i3;
                    arrayList7 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                iArr = iArr3;
                jArr = jArr3;
                int i41 = i23;
                int i42 = i20;
                num2 = num8;
                int i43 = i22;
                b2 = b3;
                if (i41 != i43) {
                    return;
                } else {
                    i = i42;
                }
            } else {
                num = num7;
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                iArr = iArr3;
                jArr = jArr3;
                b2 = b3;
                num2 = num8;
                i = i20;
            }
            if (i == i21) {
                return;
            }
            i20 = i + 1;
            ff3Var2 = ff3Var;
            length3 = i21;
            arrayList6 = arrayList2;
            num8 = num2;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList7 = arrayList;
            num7 = num;
            i19 = 0;
        }
    }

    public final void I(LayoutNode layoutNode, wz4 wz4Var) {
        t07 t07VarY;
        if (layoutNode.K() && !this.f0.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            LayoutNode layoutNode2 = null;
            if (!layoutNode.H0.j(8)) {
                layoutNode = layoutNode.w();
                while (true) {
                    if (layoutNode == null) {
                        layoutNode = null;
                        break;
                    } else if (layoutNode.H0.j(8)) {
                        break;
                    } else {
                        layoutNode = layoutNode.w();
                    }
                }
            }
            if (layoutNode == null || (t07VarY = layoutNode.y()) == null) {
                return;
            }
            if (!t07VarY.Z) {
                for (LayoutNode layoutNodeW = layoutNode.w(); layoutNodeW != null; layoutNodeW = layoutNodeW.w()) {
                    t07 t07VarY2 = layoutNodeW.y();
                    if (t07VarY2 != null && t07VarY2.Z) {
                        layoutNode2 = layoutNodeW;
                        break;
                    }
                }
                if (layoutNode2 != null) {
                    layoutNode = layoutNode2;
                }
            }
            int i = layoutNode.Y;
            if (wz4Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(LayoutNode layoutNode) {
        if (layoutNode.K() && !this.f0.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i = layoutNode.Y;
            jx6 jx6Var = (jx6) this.r0.b(i);
            jx6 jx6Var2 = (jx6) this.s0.b(i);
            if (jx6Var == null && jx6Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (jx6Var != null) {
                accessibilityEventO.setScrollX((int) ((Number) jx6Var.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) jx6Var.b.invoke()).floatValue());
            }
            if (jx6Var2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) jx6Var2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) jx6Var2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(y07 y07Var, int i, int i2, boolean z) {
        String strT;
        t07 t07Var = y07Var.d;
        int i3 = y07Var.f;
        e17 e17Var = s07.j;
        if (t07Var.X.c(e17Var) && vr3.t(y07Var)) {
            sn2 sn2Var = (sn2) ((q3) y07Var.d.c(e17Var)).b;
            if (sn2Var != null) {
                return ((Boolean) sn2Var.x(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.v0) && (strT = t(y07Var)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.v0 = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.v0) : null, z2 ? Integer.valueOf(this.v0) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        AndroidComposeView androidComposeView = this.f0;
        long jP = androidComposeView.p(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jP2 = androidComposeView.p((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jP >> 32);
        int i2 = (int) (jP2 >> 32);
        int i3 = (int) (jP & 4294967295L);
        int i4 = (int) (jP2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        z07 z07Var;
        wz4 wz4Var = new wz4();
        wz4 wz4Var2 = this.C0;
        int[] iArr = wz4Var2.b;
        long[] jArr3 = wz4Var2.a;
        int length = jArr3.length - 2;
        vz4 vz4Var = this.I0;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            a17 a17Var = (a17) s().b(i6);
                            Object obj = null;
                            y07 y07Var = a17Var != null ? a17Var.a : null;
                            if (y07Var != null) {
                                if (!y07Var.d.X.c(c17.d)) {
                                    wz4Var.a(i6);
                                    z07Var = (z07) vz4Var.b(i6);
                                    if (z07Var != null) {
                                        Object objG = z07Var.a.X.g(c17.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i6, 32, obj);
                                }
                            } else {
                                wz4Var.a(i6);
                                z07Var = (z07) vz4Var.b(i6);
                                if (z07Var != null) {
                                    Object objG2 = z07Var.a.X.g(c17.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = wz4Var.b;
        long[] jArr4 = wz4Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = wz4Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = wz4Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (wz4Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                wz4Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        vz4Var.c();
        ff3 ff3VarS = s();
        int[] iArr3 = ff3VarS.b;
        Object[] objArr = ff3VarS.c;
        long[] jArr6 = ff3VarS.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            y07 y07Var2 = ((a17) objArr[i25]).a;
                            t07 t07Var = y07Var2.d;
                            e17 e17Var = c17.d;
                            if (t07Var.X.c(e17Var) && wz4Var2.a(i26)) {
                                F(i26, 16, (String) y07Var2.d.c(e17Var));
                            }
                            vz4Var.h(i26, new z07(y07Var2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.J0 = new z07(this.f0.getSemanticsOwner().a(), s());
    }

    @Override // defpackage.t3
    public final wl6 b(View view) {
        return this.l0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    public final void j(int i, h4 h4Var, String str, Bundle bundle) {
        y07 y07Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        RectF[] rectFArr;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo2 = h4Var.a;
        a17 a17Var = (a17) s().b(i);
        if (a17Var == null || (y07Var = a17Var.a) == null) {
            return;
        }
        LayoutNode layoutNode = y07Var.c;
        t07 t07Var = y07Var.d;
        s05 s05Var = t07Var.X;
        String strT = t(y07Var);
        if (dh3.f(str, this.F0)) {
            int iD = this.D0.d(i);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (dh3.f(str, this.G0)) {
            int iD2 = this.E0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = s05Var.c(s07.a);
        AndroidComposeView androidComposeView = this.f0;
        if (zC && bundle != null && dh3.f(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 <= 0 || i3 < 0) {
                return;
            }
            if (i3 >= (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                return;
            }
            x78 x78VarC = gv3.C(t07Var);
            if (x78VarC == null) {
                accessibilityNodeInfo = accessibilityNodeInfo2;
                rectFArr = null;
            } else {
                fd3 fd3Var = (fd3) layoutNode.H0.f0;
                if (!fd3Var.e1.p0) {
                    fd3Var = null;
                }
                if (fd3Var != null) {
                    long jI = fd3Var.I(0L);
                    s86 s86VarG = y07Var.g();
                    RectF[] rectFArr2 = new RectF[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        if (i6 >= x78VarC.a.a.Y.length()) {
                            i2 = i5;
                        } else {
                            s86 s86VarK = x78VarC.b(i6).k(jI);
                            s86 s86VarG2 = s86VarK.i(s86VarG) ? s86VarK.g(s86VarG) : null;
                            if (s86VarG2 != null) {
                                i2 = i5;
                                long jP = androidComposeView.p((((long) Float.floatToRawIntBits(s86VarG2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(s86VarG2.a)) << 32));
                                long jP2 = androidComposeView.p((((long) Float.floatToRawIntBits(s86VarG2.c)) << 32) | (((long) Float.floatToRawIntBits(s86VarG2.d)) & 4294967295L));
                                int i7 = (int) (jP >> 32);
                                int i8 = (int) (jP2 >> 32);
                                int i9 = (int) (jP & 4294967295L);
                                int i10 = (int) (jP2 & 4294967295L);
                                rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                            } else {
                                i2 = i5;
                            }
                        }
                        i5 = i2 + 1;
                        i3 = i3;
                        i4 = i4;
                        accessibilityNodeInfo2 = accessibilityNodeInfo2;
                        s86VarG = s86VarG;
                    }
                    accessibilityNodeInfo = accessibilityNodeInfo2;
                    rectFArr = rectFArr2;
                } else {
                    accessibilityNodeInfo = accessibilityNodeInfo2;
                    rectFArr = null;
                }
            }
            if (rectFArr == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
            return;
        }
        e17 e17Var = c17.A;
        if (s05Var.c(e17Var) && bundle != null && dh3.f(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = s05Var.g(e17Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (dh3.f(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, y07Var.f);
            return;
        }
        if (dh3.f(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = s05Var.g(c17.S);
            x67 x67Var = (x67) (objG2 == null ? null : objG2);
            if (x67Var != null) {
                Rect rect = new Rect();
                h4Var.f(rect);
                s86 s86VarU = u(y07Var, rect, x67Var);
                float f = s86VarU.b;
                float f2 = s86VarU.a;
                mb6 mb6VarA = x67Var.a(s86VarU.e(), layoutNode.B0, androidComposeView.getDensity());
                if (mb6VarA instanceof ae5) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(mb6VarA, f2, f));
                    return;
                } else if (mb6VarA instanceof be5) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(mb6VarA, f2, f));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(mb6VarA));
                    return;
                } else if (!(mb6VarA instanceof zd5)) {
                    b61.c();
                    return;
                } else {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(mb6VarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (dh3.f(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = s05Var.g(c17.S);
            x67 x67Var2 = (x67) (objG3 == null ? null : objG3);
            if (x67Var2 != null) {
                Rect rect2 = new Rect();
                h4Var.f(rect2);
                s86 s86VarU2 = u(y07Var, rect2, x67Var2);
                Rect rectL = L(x67Var2.a(s86VarU2.e(), layoutNode.B0, androidComposeView.getDensity()), s86VarU2.a, s86VarU2.b);
                if (rectL != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (dh3.f(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = s05Var.g(c17.S);
            x67 x67Var3 = (x67) (objG4 == null ? null : objG4);
            if (x67Var3 != null) {
                Rect rect3 = new Rect();
                h4Var.f(rect3);
                float[] fArrN = N(x67Var3.a(u(y07Var, rect3, x67Var3).e(), layoutNode.B0, androidComposeView.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (dh3.f(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = s05Var.g(c17.S);
            x67 x67Var4 = (x67) (objG5 == null ? null : objG5);
            if (x67Var4 != null) {
                Rect rect4 = new Rect();
                h4Var.f(rect4);
                s86 s86VarU3 = u(y07Var, rect4, x67Var4);
                Region regionO = O(x67Var4.a(s86VarU3.e(), layoutNode.B0, androidComposeView.getDensity()), s86VarU3.a, s86VarU3.b);
                if (regionO != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(a17 a17Var) {
        lf3 lf3Var = a17Var.b;
        return M(lf3Var.a, lf3Var.b, lf3Var.c, lf3Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:20:0x0046, B:23:0x004d), top: B:67:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:20:0x0046, B:23:0x004d), top: B:67:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x0099, LOOP:0: B:34:0x0088->B:35:0x008a, LOOP_END, TryCatch #3 {all -> 0x0099, blocks: (B:33:0x0084, B:35:0x008a, B:38:0x009c, B:40:0x00a4), top: B:69:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #3 {all -> 0x0099, blocks: (B:33:0x0084, B:35:0x008a, B:38:0x009c, B:40:0x00a4), top: B:69:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (defpackage.u70.F(r4, r2) == r7) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0107 -> B:58:0x010a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.s51 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.l(s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(boolean z, int i, long j) {
        e17 e17Var;
        int i2;
        if (dh3.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            ff3 ff3VarS = s();
            if (!z85.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    e17Var = c17.w;
                } else {
                    if (z) {
                        b61.c();
                        return false;
                    }
                    e17Var = c17.v;
                }
                Object[] objArr = ff3VarS.c;
                long[] jArr = ff3VarS.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    a17 a17Var = (a17) objArr[(i3 << 3) + i6];
                                    lf3 lf3Var = a17Var.b;
                                    float f = lf3Var.a;
                                    i2 = i4;
                                    float f2 = lf3Var.b;
                                    float f3 = lf3Var.c;
                                    float f4 = lf3Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = a17Var.a.d.X.g(e17Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        jx6 jx6Var = (jx6) objG;
                                        if (jx6Var != null) {
                                            dn2 dn2Var = jx6Var.a;
                                            if (i < 0) {
                                                if (((Number) dn2Var.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) dn2Var.invoke()).floatValue() < ((Number) jx6Var.b.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f0.getSemanticsOwner().a(), this.J0);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        a17 a17Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f0;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (a17Var = (a17) s().b(i)) != null) {
            y07 y07Var = a17Var.a;
            accessibilityEventObtain.setPassword(y07Var.d.X.c(c17.N));
            Object objG = y07Var.d.X.g(c17.o);
            if (objG == null) {
                objG = null;
            }
            boolean zF = dh3.f(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                u3.C(accessibilityEventObtain, zF);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.k0 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.k0 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.i0;
        if (accessibilityManager.isEnabled()) {
            this.k0 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f0.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.M0);
        AccessibilityManager accessibilityManager = this.i0;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(y07 y07Var) {
        t07 t07Var = y07Var.d;
        if (!t07Var.X.c(c17.a)) {
            e17 e17Var = c17.H;
            if (t07Var.X.c(e17Var)) {
                return (int) (((f88) t07Var.c(e17Var)).a & 4294967295L);
            }
        }
        return this.v0;
    }

    public final int r(y07 y07Var) {
        t07 t07Var = y07Var.d;
        if (!t07Var.X.c(c17.a)) {
            e17 e17Var = c17.H;
            if (t07Var.X.c(e17Var)) {
                return (int) (((f88) t07Var.c(e17Var)).a >> 32);
            }
        }
        return this.v0;
    }

    public final ff3 s() {
        if (this.z0) {
            this.z0 = false;
            AndroidComposeView androidComposeView = this.f0;
            this.B0 = jm4.A(androidComposeView.getSemanticsOwner(), new y2((byte) 8));
            if (v()) {
                vz4 vz4Var = this.B0;
                Resources resources = androidComposeView.getContext().getResources();
                tz4 tz4Var = this.D0;
                tz4Var.a();
                tz4 tz4Var2 = this.E0;
                tz4Var2.a();
                a17 a17Var = (a17) vz4Var.b(-1);
                y07 y07Var = a17Var != null ? a17Var.a : null;
                y07Var.getClass();
                ArrayList arrayListB = g17.b(y07Var, new y0((Object) vz4Var, (byte) 6), new y0((Object) resources, (byte) 7), i21.K(y07Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((y07) arrayListB.get(i - 1)).f;
                        int i3 = ((y07) arrayListB.get(i)).f;
                        tz4Var.f(i2, i3);
                        tz4Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.B0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final s86 u(y07 y07Var, Rect rect, x67 x67Var) {
        fc fcVar = new fc(x67Var);
        LayoutNode layoutNode = y07Var.c;
        jx4 jx4Var = (jx4) layoutNode.H0.i0;
        nh1 nh1Var = null;
        if ((jx4Var.f0 & 8) != 0) {
            loop0: while (jx4Var != null) {
                if ((jx4Var.Z & 8) == 0) {
                    if ((jx4Var.f0 & 8) != 0) {
                        break;
                        break;
                    }
                    jx4Var = jx4Var.h0;
                } else {
                    jx4 jx4VarT = jx4Var;
                    c15 c15Var = null;
                    while (jx4VarT != null) {
                        if (jx4VarT instanceof w07) {
                            ((w07) jx4VarT).h(fcVar);
                            if (fcVar.X) {
                                nh1Var = jx4VarT;
                                break loop0;
                            }
                        } else if ((jx4VarT.Z & 8) != 0 && (jx4VarT instanceof oh1)) {
                            int i = 0;
                            for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                if ((jx4Var2.Z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        jx4VarT = yn0.T(c15Var);
                    }
                    if ((jx4Var.f0 & 8) != 0) {
                        break;
                    }
                    jx4Var = jx4Var.h0;
                }
            }
        }
        nh1 nh1Var2 = (w07) nh1Var;
        if (nh1Var2 == null || !((jx4) nh1Var2).X.p0) {
            return jm4.r(layoutNode.getOuterCoordinator$ui(), false);
        }
        i55 i55VarY = yn0.Y(nh1Var2);
        s86 s86VarH = jm4.x(i55VarY).H(i55VarY, false);
        Rect rectM = M(s86VarH.a, s86VarH.b, s86VarH.c, s86VarH.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new s86(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.i0;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.k0;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.k0 = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(LayoutNode layoutNode) {
        if (this.x0.add(layoutNode)) {
            this.y0.b(dn8.a);
        }
    }
}
