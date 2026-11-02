package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tx4 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:21:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x015a  */
    /* JADX WARN: Code duplicated, block: B:31:0x016c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0179  */
    /* JADX WARN: Code duplicated, block: B:41:0x024c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0255 A[LOOP:0: B:38:0x023a->B:44:0x0255, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0254 A[SYNTHETIC] */
    public static final gr6 a(Class cls) {
        y45 y45Var;
        je6 je6Var;
        je6 je6Var2;
        a09 a09Var;
        ConcurrentHashMap concurrentHashMap;
        rs3 rs3Var;
        i7 i7VarL;
        po5 po5VarL;
        gr6 gr6Var;
        a09 a09Var2;
        ConcurrentHashMap concurrentHashMap2;
        WeakReference weakReference;
        gr6 gr6Var2;
        cls.getClass();
        ClassLoader classLoaderD = ia6.d(cls);
        a09 a09Var3 = new a09(classLoaderD);
        ConcurrentHashMap concurrentHashMap3 = a;
        WeakReference weakReference2 = (WeakReference) concurrentHashMap3.get(a09Var3);
        if (weakReference2 != null) {
            gr6 gr6Var3 = (gr6) weakReference2.get();
            if (gr6Var3 != null) {
                return gr6Var3;
            }
            concurrentHashMap3.remove(a09Var3, weakReference2);
        }
        oy1 oy1Var = oy1.G0;
        y45 y45Var2 = new y45(classLoaderD);
        ClassLoader classLoader = dn8.class.getClassLoader();
        classLoader.getClass();
        y45 y45Var3 = new y45(classLoader);
        lr5 lr5Var = new lr5((Object) classLoaderD, (byte) 5);
        qe4 qe4Var = qe4.r0;
        ve4 ve4Var = new ve4("DeserializationComponentsForJava.ModuleData");
        rs3 rs3Var2 = new rs3(ve4Var);
        wx4 wx4Var = new wx4(v15.g("<" + ("runtime module for " + classLoaderD) + '>'), ve4Var, rs3Var2, 56);
        t97 t97Var = ve4Var.a;
        t97Var.lock();
        try {
            if (rs3Var2.a != null) {
                throw new AssertionError("Built-ins module is already set: " + rs3Var2.a + " (attempting to reset to " + wx4Var + ")");
            }
            rs3Var2.a = wx4Var;
            t97Var.unlock();
            rs3Var2.f = new ps3(wx4Var, (byte) 0);
            zl1 zl1Var = new zl1();
            lr5 lr5Var2 = new lr5((byte) 13, false);
            z47 z47Var = new z47(ve4Var, wx4Var);
            qe4 qe4Var2 = qe4.m0;
            b24 b24Var = new b24(1, 9, 0);
            fl3 fl3Var = el3.d;
            b24 b24Var2 = fl3Var.b;
            if (b24Var2 != null) {
                y45Var = y45Var3;
                if (b24Var2.f0 - b24Var.f0 <= 0) {
                    je6Var = fl3Var.c;
                }
                je6Var.getClass();
                if (je6Var == je6.WARN) {
                    je6Var2 = null;
                } else {
                    je6Var2 = je6Var;
                }
                o8 o8Var = new o8(new is3(je6Var, je6Var2), new f0(b24Var, (byte) 17));
                g55 g55Var = new g55(ve4Var);
                hc6 hc6Var = new hc6(wx4Var, z47Var);
                mm mmVar = new mm(o8Var);
                we5 we5Var = new we5(new k32(), (byte) 22);
                p45.b.getClass();
                q45 q45Var = o45.b;
                y45 y45Var4 = y45Var;
                a09Var = a09Var3;
                concurrentHashMap = concurrentHashMap3;
                w44 w44Var = new w44(new c6(ve4Var, lr5Var, y45Var2, zl1Var, g55Var, lr5Var2, qe4Var2, wx4Var, hc6Var, mmVar, we5Var, q45Var, o8Var, new ra((byte) 25, false)));
                hv4 hv4Var = hv4.g;
                hv4Var.getClass();
                zz2 zz2Var = new zz2(y45Var2, zl1Var, (byte) 5);
                fu6 fu6Var = new fu6(wx4Var, z47Var, ve4Var, y45Var2);
                fu6Var.i0 = hv4Var;
                List listK = i21.K(qg1.a);
                zz3 zz3Var = wx4Var.h0;
                rs3Var = zz3Var instanceof rs3 ? (rs3) zz3Var : null;
                oy1 oy1Var2 = oy1.D0;
                if (rs3Var != null || (i7VarL = rs3Var.L()) == null) {
                    i7VarL = oy1.Z;
                }
                if (rs3Var != null || (po5VarL = rs3Var.L()) == null) {
                    po5VarL = qe4.o0;
                }
                hl1 hl1Var = new hl1(ve4Var, wx4Var, zz2Var, fu6Var, w44Var, qe4Var, oy1Var2, d02.X, z47Var, i7VarL, po5VarL, mu3.a, q45Var, new g55(ve4Var), listK, oy1Var);
                zl1Var.a = hl1Var;
                lr5Var2.Y = new q02((Object) w44Var, (byte) 10);
                us3 us3VarL = rs3Var2.L();
                us3 us3VarL2 = rs3Var2.L();
                g55 g55Var2 = new g55(ve4Var);
                us3VarL.getClass();
                us3VarL2.getClass();
                ws3 ws3Var = new ws3(ve4Var, y45Var4, wx4Var);
                vk1 vk1Var = new vk1((Object) ws3Var, (byte) 1);
                ja0 ja0Var = ja0.m;
                ws3Var.c = new hl1(ve4Var, wx4Var, vk1Var, new dq(wx4Var, z47Var, ja0Var), ws3Var, i21.L(new ha0(ve4Var, wx4Var), new os3(ve4Var, wx4Var)), z47Var, us3VarL, us3VarL2, ja0Var.a, q45Var, g55Var2, 262144);
                wx4Var.k0 = new ux4(eu.K0(new wx4[]{wx4Var}));
                wx4Var.l0 = new j01(i21.L(w44Var, ws3Var), "CompositeProvider@RuntimeModuleData for " + wx4Var);
                gr6Var = new gr6(hl1Var, new f63(zl1Var, y45Var2));
                while (true) {
                    a09Var2 = a09Var;
                    concurrentHashMap2 = concurrentHashMap;
                    weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(a09Var2, new WeakReference(gr6Var));
                    if (weakReference == null) {
                        return gr6Var;
                    }
                    gr6Var2 = (gr6) weakReference.get();
                    if (gr6Var2 != null) {
                        return gr6Var2;
                    }
                    concurrentHashMap2.remove(a09Var2, weakReference);
                    a09Var = a09Var2;
                    concurrentHashMap = concurrentHashMap2;
                }
            } else {
                y45Var = y45Var3;
            }
            je6Var = fl3Var.a;
            je6Var.getClass();
            if (je6Var == je6.WARN) {
                je6Var2 = null;
            } else {
                je6Var2 = je6Var;
            }
            o8 o8Var2 = new o8(new is3(je6Var, je6Var2), new f0(b24Var, (byte) 17));
            g55 g55Var3 = new g55(ve4Var);
            hc6 hc6Var2 = new hc6(wx4Var, z47Var);
            mm mmVar2 = new mm(o8Var2);
            we5 we5Var2 = new we5(new k32(), (byte) 22);
            p45.b.getClass();
            q45 q45Var2 = o45.b;
            y45 y45Var5 = y45Var;
            a09Var = a09Var3;
            concurrentHashMap = concurrentHashMap3;
            w44 w44Var2 = new w44(new c6(ve4Var, lr5Var, y45Var2, zl1Var, g55Var3, lr5Var2, qe4Var2, wx4Var, hc6Var2, mmVar2, we5Var2, q45Var2, o8Var2, new ra((byte) 25, false)));
            hv4 hv4Var2 = hv4.g;
            hv4Var2.getClass();
            zz2 zz2Var2 = new zz2(y45Var2, zl1Var, (byte) 5);
            fu6 fu6Var2 = new fu6(wx4Var, z47Var, ve4Var, y45Var2);
            fu6Var2.i0 = hv4Var2;
            List listK2 = i21.K(qg1.a);
            zz3 zz3Var2 = wx4Var.h0;
            if (zz3Var2 instanceof rs3) {
            }
            oy1 oy1Var3 = oy1.D0;
            if (rs3Var != null) {
                i7VarL = oy1.Z;
            } else {
                i7VarL = oy1.Z;
            }
            if (rs3Var != null) {
                po5VarL = qe4.o0;
            } else {
                po5VarL = qe4.o0;
            }
            hl1 hl1Var2 = new hl1(ve4Var, wx4Var, zz2Var2, fu6Var2, w44Var2, qe4Var, oy1Var3, d02.X, z47Var, i7VarL, po5VarL, mu3.a, q45Var2, new g55(ve4Var), listK2, oy1Var);
            zl1Var.a = hl1Var2;
            lr5Var2.Y = new q02((Object) w44Var2, (byte) 10);
            us3 us3VarL3 = rs3Var2.L();
            us3 us3VarL4 = rs3Var2.L();
            g55 g55Var4 = new g55(ve4Var);
            us3VarL3.getClass();
            us3VarL4.getClass();
            ws3 ws3Var2 = new ws3(ve4Var, y45Var5, wx4Var);
            vk1 vk1Var2 = new vk1((Object) ws3Var2, (byte) 1);
            ja0 ja0Var2 = ja0.m;
            ws3Var2.c = new hl1(ve4Var, wx4Var, vk1Var2, new dq(wx4Var, z47Var, ja0Var2), ws3Var2, i21.L(new ha0(ve4Var, wx4Var), new os3(ve4Var, wx4Var)), z47Var, us3VarL3, us3VarL4, ja0Var2.a, q45Var2, g55Var4, 262144);
            wx4Var.k0 = new ux4(eu.K0(new wx4[]{wx4Var}));
            wx4Var.l0 = new j01(i21.L(w44Var2, ws3Var2), "CompositeProvider@RuntimeModuleData for " + wx4Var);
            gr6Var = new gr6(hl1Var2, new f63(zl1Var, y45Var2));
            while (true) {
                a09Var2 = a09Var;
                concurrentHashMap2 = concurrentHashMap;
                weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(a09Var2, new WeakReference(gr6Var));
                if (weakReference == null) {
                    return gr6Var;
                }
                gr6Var2 = (gr6) weakReference.get();
                if (gr6Var2 != null) {
                    return gr6Var2;
                }
                concurrentHashMap2.remove(a09Var2, weakReference);
                a09Var = a09Var2;
                concurrentHashMap = concurrentHashMap2;
            }
        } catch (Throwable th) {
            try {
                ve4Var.b.getClass();
                throw th;
            } catch (Throwable th2) {
                t97Var.unlock();
                throw th2;
            }
        }
    }
}
