package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.node.LayoutNode;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g55 implements h55, u14, wp5, hw5, w4, cn2, v06, rx6, ke7, i87, kd3 {
    public final /* synthetic */ byte X;

    public g55(ve4 ve4Var) {
        this.X = (byte) 18;
        String str = ve4.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static ArrayList o(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p06) obj) != p06.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p06) it.next()).X);
        }
        return arrayList2;
    }

    public static byte[] p(List list) {
        i90 i90Var = new i90();
        for (String str : o(list)) {
            i90Var.H0(str.length());
            i90Var.d1(str);
        }
        return i90Var.D0(i90Var.Y);
    }

    public static Typeface q(String str, dj2 dj2Var, int i) {
        if (i == 0 && dh3.f(dj2Var, dj2.g0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iH = km4.H(dj2Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iH) : Typeface.create(str, iH);
    }

    public static oi5 r(String str) {
        str.getClass();
        kb0 kb0Var = f.a;
        i90 i90Var = new i90();
        i90Var.d1(str);
        return f.d(i90Var, false);
    }

    public static oi5 s(File file) {
        String str = oi5.Y;
        String string = file.toString();
        string.getClass();
        return r(string);
    }

    public static oi5 t(Path path) {
        String str = oi5.Y;
        path.getClass();
        return r(path.toString());
    }

    public static boolean u() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static bf7 v(String str, String str2, String str3, String str4) {
        return new bf7(str, v15.e(str2), str3, str4);
    }

    public static jf6 w(aj0 aj0Var, xy0 xy0Var) {
        r82 r82VarO;
        yr2 yr2Var = new yr2((Object) aj0Var, (byte) 21);
        List list = (List) xy0Var.g0;
        xy0Var.toString();
        aj0Var.j();
        hi5.z0("ResolvedFeatureGroup");
        Set set = (Set) xy0Var.f0;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) xy0Var.h0;
        if (set.isEmpty() && list.isEmpty()) {
            bt.q("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                hq8 hq8Var = (hq8) it.next();
                qr8.Y.getClass();
                if (s18.c(hq8Var) == qr8.UNDEFINED) {
                    r82VarO = new p82(hq8Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            q82 q82VarP = yr2.p((ru2) obj, list2);
                            if (q82VarP != null) {
                                q82VarP.toString();
                                hi5.z0("DefaultFeatureGroupResolver");
                            } else {
                                q82VarP = null;
                            }
                            if (q82VarP == null) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList.toString();
                        hi5.z0("DefaultFeatureGroupResolver");
                        r82VarO = yr2Var.o(xy0Var, arrayList, 0, d02.X);
                        break;
                    }
                    q82 q82VarP2 = yr2.p((ru2) it2.next(), list2);
                    if (q82VarP2 != null) {
                        r82VarO = q82VarP2;
                        break;
                    }
                }
            }
        }
        if (r82VarO instanceof n82) {
            jf6 jf6Var = ((n82) r82VarO).a;
            Objects.toString(jf6Var);
            hi5.z0("ResolvedFeatureGroup");
            return jf6Var;
        }
        if (r82VarO instanceof o82) {
            bt.q("Feature group is not supported");
            return null;
        }
        if (r82VarO instanceof p82) {
            throw new IllegalArgumentException(((p82) r82VarO).a + " is not supported");
        }
        if (!(r82VarO instanceof q82)) {
            b61.c();
            return null;
        }
        q82 q82Var = (q82) r82VarO;
        u52.m(q82Var.a, " must be added for ", q82Var.b);
        return null;
    }

    @Override // defpackage.cn2
    public Object a(Object obj) {
        switch (this.X) {
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                cq7 cq7Var = (cq7) obj;
                mr6.c.b().getClass();
                return cq7Var;
            default:
                p85 p85Var = (p85) obj;
                mr6.c.b().getClass();
                return p85Var;
        }
    }

    @Override // defpackage.i87
    public xe2 b(lq7 lq7Var) {
        return new ef2();
    }

    @Override // defpackage.h55
    public boolean c(jx4 jx4Var) {
        return false;
    }

    @Override // defpackage.wp5
    public Typeface d(dj2 dj2Var, int i) {
        return q(null, dj2Var, i);
    }

    @Override // defpackage.h55
    public int e() {
        return 8;
    }

    @Override // defpackage.h55
    public boolean f(jx4 jx4Var) {
        return jm4.M(dh3.c(yn0.Z(jx4Var), false));
    }

    @Override // defpackage.u14
    public boolean g(lh8 lh8Var, lh8 lh8Var2) {
        return lh8Var.equals(lh8Var2);
    }

    @Override // defpackage.v06
    public Object get() {
        f08 f08Var = new f08((byte) 13);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            b61.i("Null flags");
            return null;
        }
        map.put(fu5.X, new ez(30000L, 86400000L, set));
        if (set == null) {
            b61.i("Null flags");
            return null;
        }
        map.put(fu5.Z, new ez(1000L, 86400000L, set));
        if (set == null) {
            b61.i("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(yw6.Y)));
        if (setUnmodifiableSet == null) {
            b61.i("Null flags");
            return null;
        }
        map.put(fu5.Y, new ez(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= fu5.values().length) {
            new HashMap();
            return new dz(f08Var, map);
        }
        bt.i("Not all priorities have been configured");
        return null;
    }

    @Override // defpackage.h55
    public void h(LayoutNode layoutNode, long j, q03 q03Var, int i, boolean z) {
        i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        dx4 dx4Var = i55.X0;
        layoutNode.getOuterCoordinator$ui().b1(i55.d1, outerCoordinator$ui.S0(j), q03Var, 1, z);
    }

    @Override // defpackage.kd3
    public boolean j(q02 q02Var, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((md3) q02Var.Y).f();
                Object objH = ((md3) q02Var.Y).h();
                objH.getClass();
                Parcelable parcelable = (Parcelable) objH;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription clipDescriptionA = ((md3) q02Var.Y).a();
        md3 md3Var = (md3) q02Var.Y;
        new ClipData(clipDescriptionA, new ClipData.Item(md3Var.e()));
        md3Var.a();
        md3Var.g();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    @Override // defpackage.wp5
    public Typeface k(iq2 iq2Var, dj2 dj2Var, int i) {
        String strConcat = iq2Var.f;
        int i2 = dj2Var.X / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceQ = q(strConcat, dj2Var, i);
            if (!dh3.f(typefaceQ, Typeface.create(Typeface.DEFAULT, km4.H(dj2Var, i))) && !dh3.f(typefaceQ, q(null, dj2Var, i))) {
                typeface = typefaceQ;
            }
        }
        return typeface == null ? q(iq2Var.f, dj2Var, i) : typeface;
    }

    @Override // defpackage.h55
    public boolean l(q03 q03Var, LayoutNode layoutNode) {
        return false;
    }

    @Override // defpackage.h55
    public boolean n(LayoutNode layoutNode) {
        t07 t07VarY = layoutNode.y();
        boolean z = false;
        if (t07VarY != null && t07VarY.f0) {
            z = true;
        }
        return !z;
    }

    public String toString() {
        switch (this.X) {
            case 19:
                int iHashCode = hashCode();
                km4.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return pc6.q("CreationExtras.Key@", string, "<", yb6.a.b(fx8.class).E(), ">");
            case 23:
                return "NO_SOURCE";
            case 25:
                return "SharingStarted.Eagerly";
            case 27:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g55(byte b) {
        this.X = b;
    }

    public g55(di7 di7Var) {
        this.X = (byte) 26;
    }

    @Override // defpackage.w4
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo8a(Object obj) {
        mr6.c.a().getClass();
    }

    @Override // defpackage.hw5
    public void i(int i, Object obj) {
    }

    @Override // defpackage.rx6
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.rx6
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
