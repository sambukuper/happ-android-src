package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hi5 implements rd1, f01 {
    public static final c71 X = c71.X;
    public static final StackTraceElement[] Y = new StackTraceElement[0];
    public static final Object Z = new Object();
    public static byte f0 = 3;

    public static int A0(Parcel parcel) {
        int i = parcel.readInt();
        int iV0 = v0(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new av6("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iV0 + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new av6(sb.toString(), parcel);
    }

    public static final void B0(int i, int i2) {
        if (i < 0 || i >= i2) {
            kp5.k(pc6.k(i, "index (", i2, ") is out of bound of [0, ", ")"));
        }
    }

    public static final kx4 C0(kx4 kx4Var) {
        return kx4Var.y(new yg3());
    }

    public static void D0(Parcel parcel, int i, int i2) {
        int iV0 = v0(parcel, i);
        if (iV0 == i2) {
            return;
        }
        String hexString = Integer.toHexString(iV0);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iV0).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iV0);
        throw new av6(p61.n(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void F(boolean z, dn2 dn2Var, lp2 lp2Var, int i) {
        lp2Var.X(-361453782);
        int i2 = i | 6 | (lp2Var.h(dn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (j25) lp2Var.j(sd4.a);
            if (obj == null) {
                lp2Var.W(950836184);
                View view = (View) lp2Var.j(pc.f);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(x36.view_tree_navigation_event_dispatcher_owner);
                    Object obj2 = tag instanceof j25 ? (j25) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        Object objD = ts7.d(view);
                        view = objD instanceof View ? (View) objD : null;
                    }
                }
                lp2Var.p(false);
            } else {
                lp2Var.W(950834231);
                lp2Var.p(false);
            }
            if (obj == null) {
                lp2Var.W(535274673);
                obj = (aa5) lp2Var.j(td4.a);
                if (obj == null) {
                    lp2Var.W(1208426157);
                    View view2 = (View) lp2Var.j(pc.f);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(n46.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj3 = tag2 instanceof aa5 ? (aa5) tag2 : null;
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        } else {
                            Object objD2 = ts7.d(view2);
                            view2 = objD2 instanceof View ? (View) objD2 : null;
                        }
                    }
                } else {
                    lp2Var.W(1208423708);
                }
                lp2Var.p(false);
                if (obj == null) {
                    lp2Var.W(1208428160);
                    Object baseContext = (Context) lp2Var.j(pc.b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof aa5) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    obj = (aa5) baseContext;
                } else {
                    lp2Var.W(1208423789);
                }
                lp2Var.p(false);
            } else {
                lp2Var.W(535271790);
            }
            lp2Var.p(false);
            if (obj == null) {
                bt.i("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = lp2Var.f(obj);
            Object objK = lp2Var.K();
            Object obj4 = zz0.a;
            if (zF || objK == obj4) {
                j25 j25Var = obj instanceof j25 ? (j25) obj : null;
                z47 z47VarA = j25Var != null ? j25Var.a() : null;
                aa5 aa5Var = obj instanceof aa5 ? (aa5) obj : null;
                objK = new m00(z47VarA, aa5Var != null ? aa5Var.b() : null);
                lp2Var.g0(objK);
            }
            Object obj5 = (m00) objK;
            long j = lp2Var.T;
            boolean zF2 = lp2Var.f(obj5) | lp2Var.e(j);
            Object objK2 = lp2Var.K();
            Object obj6 = objK2;
            if (zF2 || objK2 == obj4) {
                fz0 fz0Var = new fz0(new n00(j, obj));
                fz0Var.c = new w60((byte) 13);
                lp2Var.g0(fz0Var);
                obj6 = fz0Var;
            }
            Object obj7 = (fz0) obj6;
            lp2Var.W(-585307852);
            boolean zH = lp2Var.h(obj7) | ((i2 & 112) == 32);
            Object objK3 = lp2Var.K();
            byte b = 6;
            if (zH || objK3 == obj4) {
                objK3 = new p5(obj7, dn2Var, b);
                lp2Var.g0(objK3);
            }
            u70.q((dn2) objK3, lp2Var);
            boolean zH2 = lp2Var.h(obj7);
            Object objK4 = lp2Var.K();
            if (zH2 || objK4 == obj4) {
                objK4 = new y0(obj7, (byte) 9);
                lp2Var.g0(objK4);
            }
            yn0.j(true, obj7, null, (gn2) objK4, lp2Var, 6);
            boolean zH3 = lp2Var.h(obj5) | lp2Var.h(obj7);
            Object objK5 = lp2Var.K();
            if (zH3 || objK5 == obj4) {
                objK5 = new p0(obj5, obj7, b);
                lp2Var.g0(objK5);
            }
            u70.b(obj5, obj7, (gn2) objK5, lp2Var);
            lp2Var.p(false);
            z = true;
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ad(z, dn2Var, i);
        }
    }

    public static final long G(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final r62 H(gn2 gn2Var) {
        r62 r62Var = new r62();
        gn2Var.B(r62Var);
        return new r62(r62Var);
    }

    public static final void I(Object obj, kx4 kx4Var, kx4 kx4Var2, zy0 zy0Var, lp2 lp2Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            kx4Var2 = hx4.X;
        }
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = new ya2((byte) 14);
            lp2Var.g0(objK);
        }
        gn2 gn2Var = (gn2) objK;
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = new ya2((byte) 15);
            lp2Var.g0(objK2);
        }
        z91.c(obj, kx4Var, gn2Var, null, "HappCrossfadeLoader", (gn2) objK2, jm4.U(-2059515175, new fx2(kx4Var2, zy0Var, (byte) 0), lp2Var), lp2Var, 1794480);
    }

    public static final void J(boolean z, kx4 kx4Var, kx4 kx4Var2, zy0 zy0Var, lp2 lp2Var, int i) {
        km4.c(Boolean.valueOf(z), kx4Var, null, null, jm4.U(-1784122858, new o90((Object) kx4Var2, (Object) zy0Var, (byte) 3), lp2Var), lp2Var, 24576 | (i & 112));
    }

    public static final void K(kx4 kx4Var, dn2 dn2Var, long j, lp2 lp2Var) {
        long j2 = ((dp) lp2Var.j(ep.z)).l.c;
        if (dn2Var == null) {
            lp2Var.W(-617476235);
            xw5.c(kx4Var, j, j2, 0, 0.0f, lp2Var, 6);
            lp2Var.p(false);
        } else {
            lp2Var.W(-1961756304);
            xw5.b(dn2Var, kx4Var, j, j2, 0, 0.0f, null, lp2Var, 48);
            lp2Var.p(false);
        }
    }

    public static final void L(lp2 lp2Var, kx4 kx4Var) {
        xw5.a(kx4Var, ((dp) lp2Var.j(ep.z)).l.a, 0.0f, 0L, 0, 0.0f, lp2Var, 0);
    }

    public static final void M(boolean z, dn2 dn2Var, kx4 kx4Var, boolean z2, j66 j66Var, lp2 lp2Var, int i) {
        int i2;
        long j;
        Object objP;
        lp2Var.X(408580840);
        if ((i & 6) == 0) {
            i2 = (lp2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(dn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.f(j66Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2 | 196608;
        if (lp2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            lh7 lh7VarA = ri.a(z ? 6.0f : 0.0f, w39.q0(ly4.Y, lp2Var), lp2Var);
            if (z2 && z) {
                j = j66Var.a;
            } else if (!z2 || z) {
                j = (z2 || !z) ? j66Var.d : j66Var.c;
            } else {
                j = j66Var.b;
            }
            if (z2) {
                lp2Var.W(1194696477);
                objP = oa7.a(j, w39.q0(ly4.Z, lp2Var), null, lp2Var, 0, 12);
                lp2Var.p(false);
            } else {
                lp2Var.W(1194874138);
                objP = z51.P(new dw0(j), lp2Var);
                lp2Var.p(false);
            }
            kx4 kx4Var2 = hx4.X;
            kx4 kx4VarU = dn2Var != null ? gv3.U(z, hl6.a(oc.r / 2.0f, 4, 0L, false), z2, new kl6(3), dn2Var) : kx4Var2;
            if (dn2Var != null) {
                t03 t03Var = yf3.a;
                kx4Var2 = xv4.X;
            }
            kx4 kx4VarD = b.d(os4.x(b.n(kx4Var.y(kx4Var2).y(kx4VarU)), 2.0f), oc.p);
            boolean zF = lp2Var.f(objP) | lp2Var.f(lh7VarA);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = new zw2(objP, lh7VarA, (byte) 23);
                lp2Var.g0(objK);
            }
            yn0.b(0, (gn2) objK, lp2Var, kx4VarD);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new k66(z, dn2Var, kx4Var, z2, j66Var, i, (byte) 0);
        }
    }

    public static final boolean N(wh7 wh7Var, int i, k2 k2Var, boolean z) {
        boolean z2;
        synchronized (Z) {
            try {
                int i2 = wh7Var.d;
                if (i2 == i) {
                    wh7Var.c = k2Var;
                    z2 = true;
                    if (z) {
                        wh7Var.e++;
                    }
                    wh7Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final int O(int i, c15 c15Var) {
        int i2 = c15Var.Z - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c15Var.X;
            int i5 = ((rg3) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((rg3) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final kx4 P(kx4 kx4Var, q80 q80Var) {
        return kx4Var.y(new o80(q80Var));
    }

    public static void Q(long j, i90 i90Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            bt.q("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((kb0) arrayList4.get(i8)).e() < i7) {
                bt.q("Failed requirement.");
                return;
            }
        }
        kb0 kb0Var = (kb0) arrayList.get(i2);
        kb0 kb0Var2 = (kb0) arrayList4.get(i3 - 1);
        if (i7 == kb0Var.e()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            kb0 kb0Var3 = (kb0) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            kb0Var = kb0Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (kb0Var.j(i7) == kb0Var2.j(i7)) {
            int iMin = Math.min(kb0Var.e(), kb0Var2.e());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && kb0Var.j(i11) == kb0Var2.j(i11); i11++) {
                i10++;
            }
            long j3 = (i90Var.Y / 4) + j + 2 + ((long) i10) + 1;
            i90Var.Z0(-i10);
            i90Var.Z0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                i90Var.Z0(kb0Var.j(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((kb0) arrayList4.get(i4)).e()) {
                    i90Var.Z0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    bt.i("Check failed.");
                    return;
                }
            }
            i90 i90Var2 = new i90();
            i90Var.Z0(((int) ((i90Var2.Y / 4) + j3)) * (-1));
            Q(j3, i90Var2, i12, arrayList4, i4, i3, arrayList5);
            i90Var.M(i90Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((kb0) arrayList4.get(i14 - 1)).j(i7) != ((kb0) arrayList4.get(i14)).j(i7)) {
                i13++;
            }
        }
        long j4 = (i90Var.Y / 4) + j + 2 + ((long) (i13 * 2));
        i90Var.Z0(i13);
        i90Var.Z0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iJ = ((kb0) arrayList4.get(i15)).j(i7);
            if (i15 == i4 || iJ != ((kb0) arrayList4.get(i15 - 1)).j(i7)) {
                i90Var.Z0(iJ & 255);
            }
        }
        i90 i90Var3 = new i90();
        int i16 = i4;
        while (i16 < i3) {
            byte bJ = ((kb0) arrayList4.get(i16)).j(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bJ != ((kb0) arrayList4.get(i18)).j(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((kb0) arrayList4.get(i16)).e()) {
                i90Var.Z0(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                i90Var.Z0(((int) ((i90Var3.Y / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                Q(j2, i90Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        i90Var.M(i90Var3);
    }

    public static void R(Object obj) {
        if (obj != null) {
            return;
        }
        b61.i("Cannot return null from a non-@Nullable @Provides method");
    }

    public static Bundle S(Parcel parcel, int i) {
        int iV0 = v0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iV0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iV0);
        return bundle;
    }

    public static Parcelable T(Parcel parcel, int i, Parcelable.Creator creator) {
        int iV0 = v0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iV0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iV0);
        return parcelable;
    }

    public static String U(Parcel parcel, int i) {
        int iV0 = v0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iV0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iV0);
        return string;
    }

    public static Object[] V(Parcel parcel, int i, Parcelable.Creator creator) {
        int iV0 = v0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iV0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iV0);
        return objArrCreateTypedArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object W(s01 s01Var, q06 q06Var) {
        if (!((jx4) s01Var).X.p0) {
            wc3.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        kl5 kl5Var = (kl5) yn0.Z(s01Var).D0;
        kl5Var.getClass();
        return x97.S(kl5Var, q06Var);
    }

    public static void Y(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new av6(sb.toString(), parcel);
    }

    public static sv4 Z(sv4 sv4Var, z24 z24Var, o88 o88Var, fi1 fi1Var, fi2 fi2Var) {
        if (sv4Var != null && z24Var == sv4Var.a && xt7.d(o88Var, z24Var).equals(sv4Var.b) && fi1Var.getDensity() == sv4Var.c.X && fi2Var == sv4Var.d) {
            return sv4Var;
        }
        sv4 sv4Var2 = sv4.h;
        if (sv4Var2 != null && z24Var == sv4Var2.a && xt7.d(o88Var, z24Var).equals(sv4Var2.b) && fi1Var.getDensity() == sv4Var2.c.X && fi2Var == sv4Var2.d) {
            return sv4Var2;
        }
        sv4 sv4Var3 = new sv4(z24Var, xt7.d(o88Var, z24Var), new ii1(fi1Var.getDensity(), fi1Var.b0()), fi2Var);
        sv4.h = sv4Var3;
        return sv4Var3;
    }

    public static final Context a0(f91 f91Var) {
        f91Var.getClass();
        Context context = f91Var.q().getRoot().getContext();
        context.getClass();
        return context;
    }

    public static Collection b0(et4 et4Var, pk1 pk1Var, int i) {
        if ((i & 1) != 0) {
            pk1Var = pk1.m;
        }
        et4.a.getClass();
        return et4Var.a(pk1Var, cl1.F0);
    }

    public static final wh7 c0(vd7 vd7Var) {
        wh7 wh7Var = vd7Var.X;
        wh7Var.getClass();
        return (wh7) kd7.s(wh7Var, vd7Var);
    }

    public static final int d0(vd7 vd7Var) {
        wh7 wh7Var = vd7Var.X;
        wh7Var.getClass();
        return ((wh7) kd7.f(wh7Var)).e;
    }

    public static final Object e0(h65 h65Var, nw3 nw3Var) {
        h65Var.getClass();
        nw3Var.getClass();
        return h65Var.invoke();
    }

    public static final kx4 f0(kx4 kx4Var) {
        return kx4Var.y(new sg3());
    }

    public static uw3 g0(pw3 pw3Var) {
        pw3Var.getClass();
        return new uw3(pw3Var, yw3.X);
    }

    public static final boolean h0(zh0 zh0Var, String str) throws pc3 {
        str.getClass();
        zh0Var.getClass();
        if (dh3.f(Build.FINGERPRINT, "robolectric")) {
            i0("CXCP");
            return true;
        }
        try {
            vi0.a(str);
            jj0 jj0VarB = zh0.b(zh0Var, str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((lf0) jj0VarB).c(key);
            if (iArr != null) {
                return eu.a0(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e) {
            j0();
            throw new pc3(e);
        }
    }

    public static boolean i0(String str) {
        return l0(3, z0(str));
    }

    public static boolean j0() {
        return l0(6, z0("CXCP"));
    }

    public static boolean k0() {
        return l0(4, z0("CXCP"));
    }

    public static boolean l0(int i, String str) {
        return f0 <= i || Log.isLoggable(str, i);
    }

    public static boolean m0() {
        return l0(5, z0("CXCP"));
    }

    public static final t67 n0(t67 t67Var, t67 t67Var2, float f) {
        long jE = z51.E(t67Var.a, t67Var2.a, f);
        long j = t67Var.b;
        long j2 = t67Var2.b;
        float fH = w51.H(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fH2 = w51.H(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new t67(jE, (((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH2)) & 4294967295L), w51.H(t67Var.c, t67Var2.c, f));
    }

    public static float o0(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static final boolean p0(vd7 vd7Var, gn2 gn2Var) {
        int i;
        k2 k2Var;
        Object objB;
        dd7 dd7VarH;
        boolean zN;
        do {
            synchronized (Z) {
                wh7 wh7Var = vd7Var.X;
                wh7Var.getClass();
                wh7 wh7Var2 = (wh7) kd7.f(wh7Var);
                i = wh7Var2.d;
                k2Var = wh7Var2.c;
            }
            k2Var.getClass();
            rm5 rm5VarF = k2Var.f();
            objB = gn2Var.B(rm5VarF);
            k2 k2VarC = rm5VarF.c();
            if (dh3.f(k2VarC, k2Var)) {
                break;
            }
            wh7 wh7Var3 = vd7Var.X;
            wh7Var3.getClass();
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                zN = N((wh7) kd7.w(wh7Var3, vd7Var, dd7VarH), i, k2VarC, true);
            }
            kd7.l(dd7VarH, vd7Var);
        } while (!zN);
        return ((Boolean) objB).booleanValue();
    }

    public static od5 q0(kb0... kb0VarArr) {
        if (kb0VarArr.length == 0) {
            return new od5(new kb0[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new jt(kb0VarArr, false));
        aw0.b0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = kb0VarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(i21.i(arrayList, kb0VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((kb0) arrayList.get(0)).e() <= 0) {
            bt.q("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            kb0 kb0Var = (kb0) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                kb0 kb0Var2 = (kb0) arrayList.get(i6);
                kb0Var2.getClass();
                kb0Var.getClass();
                if (!kb0Var2.m(0, kb0Var, kb0Var.e())) {
                    break;
                }
                if (kb0Var2.e() == kb0Var.e()) {
                    xw3.z(kb0Var2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        i90 i90Var = new i90();
        Q(0L, i90Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (i90Var.Y / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = i90Var.readInt();
        }
        return new od5((kb0[]) Arrays.copyOf(kb0VarArr, kb0VarArr.length), iArr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final void r0(rf rfVar, kd8 kd8Var, y78 y78Var, s73 s73Var, gn2 gn2Var, dn2 dn2Var, mj0 mj0Var, w05 w05Var, fw8 fw8Var, gn2 gn2Var2, s51 s51Var) {
        jh jhVar;
        if (s51Var instanceof jh) {
            jhVar = (jh) s51Var;
            int i = jhVar.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jhVar.g0 = i - Integer.MIN_VALUE;
            } else {
                jhVar = new jh(s51Var);
            }
        } else {
            jhVar = new jh(s51Var);
        }
        Object obj = jhVar.f0;
        int i2 = jhVar.g0;
        if (i2 == 0) {
            w39.n0(obj);
            nh nhVar = new nh(w05Var, kd8Var, y78Var, mj0Var, rfVar, s73Var, gn2Var, dn2Var, fw8Var, gn2Var2, null);
            jhVar.g0 = 1;
            if (gv3.n(nhVar, jhVar) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        b61.n();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final void s0(rf rfVar, kd8 kd8Var, y78 y78Var, s73 s73Var, kx6 kx6Var, s48 s48Var, w05 w05Var, fw8 fw8Var, t48 t48Var, s51 s51Var) {
        ih ihVar;
        if (s51Var instanceof ih) {
            ihVar = (ih) s51Var;
            int i = ihVar.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ihVar.g0 = i - Integer.MIN_VALUE;
            } else {
                ihVar = new ih(s51Var);
            }
        } else {
            ihVar = new ih(s51Var);
        }
        ih ihVar2 = ihVar;
        Object obj = ihVar2.f0;
        int i2 = ihVar2.g0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                w39.n0(obj);
                b61.n();
                return;
            }
        }
        w39.n0(obj);
        View view = rfVar.X;
        mj0 iz0Var = Build.VERSION.SDK_INT >= 34 ? new iz0(view) : new mj0(view);
        ihVar2.g0 = 1;
        r0(rfVar, kd8Var, y78Var, s73Var, kx6Var, s48Var, iz0Var, w05Var, fw8Var, t48Var, ihVar2);
    }

    public static boolean t0(Parcel parcel, int i) {
        D0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int u0(Parcel parcel, int i) {
        D0(parcel, i, 4);
        return parcel.readInt();
    }

    public static int v0(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final n44 w0(z47 z47Var, vj3 vj3Var) {
        z47Var.getClass();
        vj3Var.getClass();
        return new n44(z47Var, vj3Var, false);
    }

    public static boolean x0(Object obj, Set set, Set set2) {
        if (set == null && set2 == null) {
            return false;
        }
        if (set2 == null) {
            return set.contains(obj);
        }
        if (set == null) {
            return !set2.contains(obj);
        }
        return !set2.contains(obj) || set.contains(obj);
    }

    public static void y0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + v0(parcel, i));
    }

    public static String z0(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    @Override // defpackage.rd1
    public abstract byte A();

    @Override // defpackage.rd1
    public abstract short B();

    @Override // defpackage.rd1
    public float C() {
        X();
        throw null;
    }

    @Override // defpackage.f01
    public long D(e37 e37Var, int i) {
        e37Var.getClass();
        return v();
    }

    @Override // defpackage.rd1
    public double E() {
        X();
        throw null;
    }

    public void X() {
        throw new m37(yb6.a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.f01
    public rd1 b(xt5 xt5Var, int i) {
        return p(xt5Var.h(i));
    }

    @Override // defpackage.rd1
    public boolean c() {
        X();
        throw null;
    }

    @Override // defpackage.rd1
    public char d() {
        X();
        throw null;
    }

    @Override // defpackage.f01
    public double f(xt5 xt5Var, int i) {
        return E();
    }

    @Override // defpackage.f01
    public char g(xt5 xt5Var, int i) {
        return d();
    }

    @Override // defpackage.f01
    public float h(xt5 xt5Var, int i) {
        return C();
    }

    @Override // defpackage.f01
    public byte j(xt5 xt5Var, int i) {
        return A();
    }

    @Override // defpackage.f01
    public String k(e37 e37Var, int i) {
        e37Var.getClass();
        return s();
    }

    @Override // defpackage.rd1
    public abstract int l();

    @Override // defpackage.f01
    public short m(xt5 xt5Var, int i) {
        return B();
    }

    @Override // defpackage.f01
    public void n(e37 e37Var) {
        e37Var.getClass();
    }

    @Override // defpackage.rd1
    public rd1 p(e37 e37Var) {
        e37Var.getClass();
        return this;
    }

    @Override // defpackage.f01
    public Object q(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        e37Var.getClass();
        ow3Var.getClass();
        return a(ow3Var);
    }

    @Override // defpackage.f01
    public int r(e37 e37Var, int i) {
        e37Var.getClass();
        return l();
    }

    @Override // defpackage.rd1
    public String s() {
        X();
        throw null;
    }

    @Override // defpackage.rd1
    public f01 t(e37 e37Var) {
        e37Var.getClass();
        return this;
    }

    @Override // defpackage.rd1
    public int u(e37 e37Var) {
        e37Var.getClass();
        X();
        throw null;
    }

    @Override // defpackage.rd1
    public abstract long v();

    @Override // defpackage.rd1
    public boolean w() {
        return true;
    }

    @Override // defpackage.f01
    public Object x(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        e37Var.getClass();
        ow3Var.getClass();
        if (ow3Var.d().c() || w()) {
            return a(ow3Var);
        }
        return null;
    }

    @Override // defpackage.f01
    public boolean z(e37 e37Var, int i) {
        e37Var.getClass();
        return c();
    }
}
