package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kl7 {
    public static final zx a;
    public static final ip4 b;
    public static final ip4 c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        a = new zx("camera2.streamSpec.streamUseCase", cls, null);
        ip4 ip4Var = new ip4();
        int i = Build.VERSION.SDK_INT;
        gr8 gr8Var = gr8.f0;
        gr8 gr8Var2 = gr8.X;
        gr8 gr8Var3 = gr8.Y;
        if (i >= 33) {
            gr8 gr8Var4 = gr8.h0;
            gr8 gr8Var5 = gr8.Z;
            ip4Var.put(4L, eu.L0(new gr8[]{gr8Var3, gr8Var4, gr8Var5}));
            ip4Var.put(1L, eu.L0(new gr8[]{gr8Var3, gr8Var4, gr8Var5}));
            ip4Var.put(2L, w45.U(gr8Var2));
            ip4Var.put(3L, w45.U(gr8Var));
        }
        b = ip4Var.b();
        ip4 ip4Var2 = new ip4();
        if (i >= 33) {
            ip4Var2.put(4L, eu.L0(new gr8[]{gr8Var3, gr8Var2, gr8Var}));
            ip4Var2.put(3L, eu.L0(new gr8[]{gr8Var3, gr8Var}));
        }
        c = ip4Var2.b();
    }

    public static boolean a(jj0 jj0Var, List list) {
        jj0Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((lf0) jj0Var).c(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((rx7) it.next()).c.X))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static gg0 b(l11 l11Var, Long l) {
        zx zxVar = a;
        if (l11Var.h(zxVar) && dh3.f(l11Var.d(zxVar), l)) {
            return null;
        }
        k05 k05VarK = k05.k(l11Var);
        k05VarK.o(zxVar, l);
        return new gg0(k05VarK, (byte) 18);
    }

    public static boolean c(gr8 gr8Var, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (gr8Var != gr8.g0) {
            Long lValueOf = Long.valueOf(j);
            ip4 ip4Var = b;
            if (!ip4Var.containsKey(lValueOf)) {
                return false;
            }
            Object obj = ip4Var.get(Long.valueOf(j));
            obj.getClass();
            return ((Set) obj).contains(gr8Var);
        }
        Long lValueOf2 = Long.valueOf(j);
        ip4 ip4Var2 = c;
        if (!ip4Var2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = ip4Var2.get(Long.valueOf(j));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((gr8) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(jj0 jj0Var) {
        jj0Var.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        key.getClass();
        long[] jArr = (long[]) ((lf0) jj0Var).c(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(l11 l11Var, gr8 gr8Var) {
        Object objA = l11Var.a(er8.U, Boolean.FALSE);
        objA.getClass();
        if (((Boolean) objA).booleanValue()) {
            return false;
        }
        zx zxVar = y53.Y;
        if (!l11Var.h(zxVar)) {
            return false;
        }
        Object objD = l11Var.d(zxVar);
        objD.getClass();
        return gr8Var.ordinal() == 0 && ((Number) objD).intValue() == 2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    public static boolean f(jj0 jj0Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        boolean z2;
        jj0Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<er8> arrayList2 = new ArrayList(linkedHashMap.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((rx) it.next()).f == null) {
                    bt.i("Required value was null.");
                    return false;
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object obj = linkedHashMap.get((er8) it2.next());
                if (obj == null) {
                    bt.i("Required value was null.");
                    return false;
                }
                if (((iz) obj).f == null) {
                    bt.i("Required value was null.");
                    return false;
                }
            }
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((lf0) jj0Var).c(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    rx rxVar = (rx) it3.next();
                    l11 l11Var = rxVar.f;
                    l11Var.getClass();
                    zx zxVar = gg0.n0;
                    if (l11Var.h(zxVar)) {
                        l11 l11Var2 = rxVar.f;
                        l11Var2.getClass();
                        Object objD = l11Var2.d(zxVar);
                        objD.getClass();
                        if (((Number) objD).longValue() == 0) {
                            z = false;
                            z2 = true;
                        } else {
                            z2 = false;
                            z = true;
                        }
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                for (er8 er8Var : arrayList2) {
                    zx zxVar2 = gg0.n0;
                    if (er8Var.h(zxVar2)) {
                        Object objD2 = er8Var.d(zxVar2);
                        objD2.getClass();
                        long jLongValue = ((Number) objD2).longValue();
                        if (jLongValue != 0) {
                            if (z2) {
                                bt.q("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(jLongValue));
                            z = true;
                        } else if (z) {
                            bt.q("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        bt.q("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        rx rxVar2 = (rx) it5.next();
                        l11 l11Var3 = rxVar2.f;
                        l11Var3.getClass();
                        gg0 gg0VarB = b(l11Var3, (Long) l11Var3.d(gg0.n0));
                        if (gg0VarB != null) {
                            xy0 xy0VarA = iz.a(rxVar2.c);
                            xy0VarA.g0 = Integer.valueOf(rxVar2.g);
                            Range range = rxVar2.h;
                            if (range == null) {
                                b61.i("Null expectedFrameRateRange");
                                return false;
                            }
                            xy0VarA.h0 = range;
                            px1 px1Var = rxVar2.d;
                            if (px1Var == null) {
                                b61.i("Null dynamicRange");
                                return false;
                            }
                            xy0VarA.f0 = px1Var;
                            xy0VarA.i0 = gg0VarB;
                            linkedHashMap2.put(rxVar2, xy0VarA.b());
                        }
                    }
                    for (er8 er8Var2 : arrayList2) {
                        iz izVar = (iz) linkedHashMap.get(er8Var2);
                        izVar.getClass();
                        l11 l11Var4 = izVar.f;
                        l11Var4.getClass();
                        gg0 gg0VarB2 = b(l11Var4, (Long) l11Var4.d(gg0.n0));
                        if (gg0VarB2 != null) {
                            xy0 xy0VarB = izVar.b();
                            xy0VarB.i0 = gg0VarB2;
                            linkedHashMap.put(er8Var2, xy0VarB.b());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
