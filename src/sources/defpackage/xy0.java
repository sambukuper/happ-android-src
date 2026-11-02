package defpackage;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.Member;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xy0 implements ny0, v06 {
    public static final vy0 k0 = new vy0((byte) 0);
    public static final f50[] l0 = new f50[0];
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;
    public Object i0;
    public Object j0;

    public xy0(ArrayList arrayList, List list) {
        Object next;
        String strConcat;
        String str;
        String str2;
        boolean zH;
        this.X = (byte) 4;
        list.getClass();
        Object obj = iz.h;
        obj.getClass();
        this.Y = list;
        this.Z = obj;
        this.f0 = m02.X;
        this.g0 = d02.X;
        List listY0 = wv0.Y0(wv0.b1(arrayList));
        this.h0 = listY0;
        this.i0 = new bn0((byte) 6);
        ScheduledExecutorService scheduledExecutorServiceJ = km4.J();
        scheduledExecutorServiceJ.getClass();
        this.j0 = scheduledExecutorServiceJ;
        if (!obj.equals(obj)) {
            Iterator it = listY0.iterator();
            while (it.hasNext()) {
                if (((hq8) it.next()).f.h(er8.R)) {
                    bt.q("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list2 = (List) this.g0;
        Set set = (Set) this.f0;
        if (set.isEmpty() && list2.isEmpty()) {
            return;
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(xv0.Z(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ru2) it2.next()).a());
        }
        for (s82 s82Var : wv0.Y0(wv0.b1(arrayList2))) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : set2) {
                if (((ru2) obj2).a() == s82Var) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() > 1) {
                xw3.z(arrayList3, "requiredFeatures has conflicting feature values: ");
                throw null;
            }
        }
        if (wv0.n0(list2).size() != list2.size()) {
            u52.f(41, list2, "Duplicate values in preferredFeatures(");
            throw null;
        }
        LinkedHashSet linkedHashSetV0 = wv0.v0(set2, list2);
        if (!linkedHashSetV0.isEmpty()) {
            xw3.z(linkedHashSetV0, "requiredFeatures and preferredFeatures have duplicate values: ");
            throw null;
        }
        for (hq8 hq8Var : (List) this.h0) {
            s18 s18Var = qr8.Y;
            s18Var.getClass();
            if (s18.c(hq8Var) == qr8.UNDEFINED) {
                throw new IllegalArgumentException((hq8Var + " is not supported with feature group").toString());
            }
            String str3 = hq8Var instanceof lt5 ? "Preview" : hq8Var instanceof x53 ? "ImageCapture" : hq8Var instanceof k53 ? "ImageAnalysis" : ts7.f(hq8Var) ? "VideoCapture" : "UseCase";
            Iterator it3 = s82.h0.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                s18Var.getClass();
                int iOrdinal = ((s82) next).ordinal();
                if (iOrdinal == 0) {
                    zH = hq8Var.f.h(e63.r);
                } else if (iOrdinal == 1) {
                    zH = hq8Var.f.h(er8.R);
                } else if (iOrdinal == 2) {
                    zH = hq8Var.f.h(er8.a0) || hq8Var.f.h(er8.b0);
                } else if (iOrdinal == 3) {
                    zH = hq8Var.f.h(y53.g0);
                } else {
                    if (iOrdinal != 4) {
                        b61.c();
                        throw null;
                    }
                    zH = dh3.f(hq8Var.f.a(er8.c0, Boolean.TRUE), Boolean.FALSE);
                }
            } while (!zH);
            s82 s82Var2 = (s82) next;
            if (s82Var2 != null) {
                StringBuilder sb = new StringBuilder("A ");
                sb.append(s82Var2.name());
                sb.append(" value is set to ");
                sb.append(str3);
                sb.append(" despite using feature groups. Do not use APIs like ");
                int iOrdinal2 = s82Var2.ordinal();
                if (iOrdinal2 == 0) {
                    strConcat = str3.concat(".Builder.setDynamicRange");
                } else if (iOrdinal2 == 1) {
                    strConcat = str3.concat(".Builder.setTargetFrameRateRange");
                } else if (iOrdinal2 == 2) {
                    strConcat = ts7.f(hq8Var) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                } else if (iOrdinal2 == 3) {
                    strConcat = str3.concat(".Builder.setOutputFormat");
                } else {
                    if (iOrdinal2 != 4) {
                        b61.c();
                        throw null;
                    }
                    strConcat = "Recorder.Builder.setQualitySelector";
                }
                sb.append(strConcat);
                sb.append(" while using feature groups. If, for example, ");
                int iOrdinal3 = s82Var2.ordinal();
                if (iOrdinal3 == 0) {
                    str = "HDR";
                } else if (iOrdinal3 == 1) {
                    str = "60 FPS";
                } else if (iOrdinal3 == 2) {
                    str = "stabilization";
                } else if (iOrdinal3 == 3) {
                    str = "JPEG_R output format";
                } else {
                    if (iOrdinal3 != 4) {
                        b61.c();
                        throw null;
                    }
                    str = "UHD recording quality";
                }
                sb.append(str);
                sb.append(" is required, instead set ");
                int iOrdinal4 = s82Var2.ordinal();
                if (iOrdinal4 == 0) {
                    str2 = "GroupableFeature.HDR_HLG10";
                } else if (iOrdinal4 == 1) {
                    str2 = "GroupableFeature.FPS_60";
                } else if (iOrdinal4 == 2) {
                    str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                } else if (iOrdinal4 == 3) {
                    str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                } else {
                    if (iOrdinal4 != 4) {
                        b61.c();
                        throw null;
                    }
                    str2 = "GroupableFeatures.UHD_RECORDING";
                }
                em7.c(oi0.p(sb, str2, " as either a required or preferred feature."));
                throw null;
            }
        }
    }

    public iz b() {
        String strConcat = ((Size) this.Y) == null ? " resolution" : _UrlKt.FRAGMENT_ENCODE_SET;
        if (((Size) this.Z) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((px1) this.f0) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.g0) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.h0) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.j0) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new iz((Size) this.Y, (Size) this.Z, (px1) this.f0, ((Integer) this.g0).intValue(), (Range) this.h0, (l11) this.i0, ((Boolean) this.j0).booleanValue());
        }
        bt.i("Missing required properties:".concat(strConcat));
        return null;
    }

    public g50 c() {
        f50[] f50VarArr;
        if (((gl) this.i0) != null && ((l37) this.Z).f(xp4.q0)) {
            gl glVar = (gl) this.i0;
            boolean zF = ((l37) this.Z).f(xp4.r0);
            Member memberB0 = glVar.B0();
            if (memberB0 != null) {
                it0.d(memberB0, zF);
            }
        }
        List list = (List) this.f0;
        if (list == null || list.isEmpty()) {
            if (((wg) this.j0) == null) {
                return null;
            }
            f50VarArr = l0;
        } else {
            List list2 = (List) this.f0;
            f50VarArr = (f50[]) list2.toArray(new f50[list2.size()]);
            if (((l37) this.Z).f(xp4.q0)) {
                for (f50 f50Var : f50VarArr) {
                    f50Var.h((l37) this.Z);
                }
            }
        }
        f50[] f50VarArr2 = (f50[]) this.g0;
        if (f50VarArr2 == null || f50VarArr2.length == ((List) this.f0).size()) {
            return new g50(((z20) this.Y).a, this, f50VarArr, (f50[]) this.g0);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(((List) this.f0).size()), Integer.valueOf(((f50[]) this.g0).length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            cy0 cy0Var = (cy0) entry.getKey();
            w06 w06Var = (w06) entry.getValue();
            boolean z2 = cy0Var.d;
            if (z2 == 1 || (z2 == 2 && z)) {
                w06Var.get();
            }
        }
        b42 b42Var = (b42) this.h0;
        synchronized (b42Var) {
            try {
                arrayDeque = b42Var.b;
                if (arrayDeque != null) {
                    b42Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw p61.k(it);
            }
        }
    }

    public void g() {
        for (cy0 cy0Var : ((HashMap) this.Y).keySet()) {
            for (li1 li1Var : cy0Var.c) {
                if (li1Var.b == 2 && !((HashMap) this.f0).containsKey(li1Var.a)) {
                    HashMap map = (HashMap) this.f0;
                    e26 e26Var = li1Var.a;
                    Set set = Collections.EMPTY_SET;
                    q74 q74Var = new q74();
                    q74Var.b = null;
                    q74Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    q74Var.a.addAll(set);
                    map.put(e26Var, q74Var);
                } else if (((HashMap) this.Z).containsKey(li1Var.a)) {
                    continue;
                } else {
                    byte b = li1Var.b;
                    if (b == 1) {
                        throw new bw4("Unsatisfied dependency for component " + cy0Var + ": " + li1Var.a);
                    }
                    if (b != 2) {
                        HashMap map2 = (HashMap) this.Z;
                        e26 e26Var2 = li1Var.a;
                        xw3 xw3Var = nd5.c;
                        vy0 vy0Var = nd5.d;
                        nd5 nd5Var = new nd5();
                        nd5Var.a = xw3Var;
                        nd5Var.b = vy0Var;
                        map2.put(e26Var2, nd5Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.v06
    public Object get() {
        return new jl1((Context) ((v06) this.Y).get(), (zu4) ((v06) this.Z).get(), (wr6) ((v06) this.f0).get(), (f63) ((f63) this.g0).get(), (Executor) ((v06) this.h0).get(), (wr6) ((v06) this.i0).get(), new f08((byte) 13), new f08((byte) 9), (wr6) ((v06) this.j0).get());
    }

    public ArrayList h(ArrayList arrayList) {
        HashMap map = (HashMap) this.Z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cy0 cy0Var = (cy0) it.next();
            if (!cy0Var.e) {
                w06 w06Var = (w06) ((HashMap) this.Y).get(cy0Var);
                for (e26 e26Var : cy0Var.b) {
                    if (map.containsKey(e26Var)) {
                        arrayList2.add(new sc((nd5) ((w06) map.get(e26Var)), w06Var, (byte) 14));
                    } else {
                        map.put(e26Var, w06Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // defpackage.ny0
    public synchronized w06 i(e26 e26Var) {
        q74 q74Var = (q74) ((HashMap) this.f0).get(e26Var);
        if (q74Var != null) {
            return q74Var;
        }
        return k0;
    }

    @Override // defpackage.ny0
    public synchronized w06 j(e26 e26Var) {
        jb5.i(e26Var, "Null interface requested.");
        return (w06) ((HashMap) this.Z).get(e26Var);
    }

    public ArrayList l() {
        HashMap map = (HashMap) this.f0;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.Y).entrySet()) {
            cy0 cy0Var = (cy0) entry.getKey();
            if (cy0Var.e) {
                w06 w06Var = (w06) entry.getValue();
                for (e26 e26Var : cy0Var.b) {
                    if (!map2.containsKey(e26Var)) {
                        map2.put(e26Var, new HashSet());
                    }
                    ((Set) map2.get(e26Var)).add(w06Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                q74 q74Var = (q74) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new sc(q74Var, (w06) it.next(), (byte) 15));
                }
            } else {
                e26 e26Var2 = (e26) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                q74 q74Var2 = new q74();
                q74Var2.b = null;
                q74Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                q74Var2.a.addAll(set);
                map.put(e26Var2, q74Var2);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.X) {
            case 4:
                return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.h0) + ", frameRateRange=" + ((Range) this.Z) + ", requiredFeatureGroup=" + ((Set) this.f0) + ", preferredFeatureGroup=" + ((List) this.g0) + ", effects=" + ((List) this.Y) + ", viewPort=null}";
            default:
                return super.toString();
        }
    }

    public xy0(v06 v06Var, v06 v06Var2, v06 v06Var3, f63 f63Var, v06 v06Var4, v06 v06Var5, v06 v06Var6) {
        this.X = (byte) 5;
        this.Y = v06Var;
        this.Z = v06Var2;
        this.f0 = v06Var3;
        this.g0 = f63Var;
        this.h0 = v06Var4;
        this.i0 = v06Var5;
        this.j0 = v06Var6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xy0(mj0 mj0Var) {
        Object objX;
        Executor executorD1;
        Executor executorD2;
        this.X = (byte) 3;
        Executor rp1Var = (ExecutorService) mj0Var.Y;
        if (rp1Var == null) {
            u61 u61VarC1 = tp1.a.c1(Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
            s52 s52Var = u61VarC1 instanceof s52 ? (s52) u61VarC1 : null;
            rp1Var = (s52Var == null || (executorD2 = s52Var.d1()) == null) ? new rp1(u61VarC1) : executorD2;
        }
        this.Y = rp1Var;
        if (((ExecutorService) mj0Var.Y) != null) {
            objX = nr4.x(rp1Var);
        } else {
            objX = tp1.a;
        }
        this.Z = objX;
        nf1 nf1Var = tp1.a;
        nf1 nf1Var2 = nf1Var != null ? nf1Var : null;
        this.f0 = (nf1Var2 == null || (executorD1 = nf1Var2.d1()) == null) ? new rp1(nf1Var) : executorD1;
        this.g0 = new f08((byte) 0);
        this.h0 = new yr2((byte) 22);
        this.i0 = (String) mj0Var.Z;
        this.j0 = new ra((byte) 14, 0 == true ? 1 : 0);
    }

    public xy0(z20 z20Var) {
        this.X = (byte) 1;
        this.f0 = Collections.EMPTY_LIST;
        this.Y = z20Var;
    }

    public xy0(ArrayList arrayList, ArrayList arrayList2, ra raVar) {
        byte b = 0;
        this.X = (byte) 0;
        nl8 nl8Var = nl8.X;
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f0 = new HashMap();
        this.g0 = new HashSet();
        this.i0 = new AtomicReference();
        b42 b42Var = new b42();
        this.h0 = b42Var;
        this.j0 = raVar;
        ArrayList<cy0> arrayList3 = new ArrayList();
        arrayList3.add(cy0.b(b42Var, b42.class, bq7.class, y16.class));
        arrayList3.add(cy0.b(this, xy0.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            cy0 cy0Var = (cy0) it.next();
            if (cy0Var != null) {
                arrayList3.add(cy0Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((w06) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((ra) this.j0).m(componentRegistrar));
                        it3.remove();
                    }
                } catch (sh3 unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((cy0) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.g0).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.g0).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.Y).isEmpty()) {
                os4.n(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.Y).keySet());
                arrayList6.addAll(arrayList3);
                os4.n(arrayList6);
            }
            for (cy0 cy0Var2 : arrayList3) {
                ((HashMap) this.Y).put(cy0Var2, new h44(new wy0(this, cy0Var2, b)));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(l());
            g();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.i0).get();
        if (bool != null) {
            d((HashMap) this.Y, bool.booleanValue());
        }
    }

    public /* synthetic */ xy0() {
        this.X = (byte) 2;
    }
}
