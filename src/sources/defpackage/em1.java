package defpackage;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 implements dn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;
    public final Object f0;

    public /* synthetic */ em1(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        Object obj = this.f0;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                return ((au3) obj3).a((ByteArrayInputStream) obj2, ((hl1) ((gm1) obj).b.X).p);
            case 1:
                vk3 vk3Var = (vk3) obj3;
                g44 g44Var = vk3Var.j0;
                ov3 ov3Var = (ov3) obj2;
                yu3 yu3Var = (yu3) obj;
                if (Modifier.isStatic(vk3Var.X().getModifiers())) {
                    return null;
                }
                ov3Var.getClass();
                ev3 ev3Var = (ev3) ov3Var;
                if (ev3Var.i0() != null) {
                    return null;
                }
                ArrayList arrayListB = y72.b(ev3Var, y72.h(vk3Var, a32.i));
                if (yu3Var.c() && arrayListB.size() == 1) {
                    return null;
                }
                ub6 ub6Var = new ub6(km.METHOD_RETURN_TYPE, false);
                u1 u1Var = (u1) g44Var.getValue();
                ArrayList arrayList = new ArrayList(xv0.Z(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    pw3 pw3VarJ = ((nb6) it.next()).j();
                    pw3VarJ.getClass();
                    arrayList.add((u1) pw3VarJ);
                }
                d3 d3VarM = ub6Var.m(u1Var, arrayList, null, false);
                u1 u1Var2 = (u1) g44Var.getValue();
                u1Var2.getClass();
                u1 u1Var3 = (u1) g33.q(u1Var2, d3VarM, 0).c;
                if (u1Var3 != null) {
                    u1Var2 = u1Var3;
                }
                List<ob6> list = (List) vk3Var.i0.getValue();
                ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
                for (ob6 wk3Var : list) {
                    ub6 ub6Var2 = new ub6(km.VALUE_PARAMETER, wk3Var.G());
                    if (wk3Var instanceof wk3) {
                        wk3 wk3Var2 = (wk3) wk3Var;
                        pw3 pw3Var = wk3Var2.Z;
                        pw3Var.getClass();
                        u1 u1Var4 = (u1) pw3Var;
                        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayListB, 10));
                        Iterator it2 = arrayListB.iterator();
                        while (it2.hasNext()) {
                            pw3 pw3VarB = ((ob6) ((nb6) it2.next()).g().get(wk3Var2.f0)).B();
                            pw3VarB.getClass();
                            arrayList3.add((u1) pw3VarB);
                        }
                        d3 d3VarM2 = ub6Var2.m(u1Var4, arrayList3, null, false);
                        mk3 mk3Var = wk3Var2.X;
                        String str = wk3Var2.Y;
                        u1 u1Var5 = (u1) g33.q(u1Var4, d3VarM2, 0).c;
                        wk3Var = new wk3(mk3Var, str, u1Var5 == null ? u1Var4 : u1Var5, wk3Var2.f0, wk3Var2.g0, wk3Var2.h0);
                    }
                    arrayList2.add(wk3Var);
                }
                return new uk3(arrayList2, u1Var2);
            case 2:
                ev3 ev3Var2 = (ev3) obj3;
                Class cls = (Class) obj2;
                qs0 qs0Var = (qs0) obj;
                Class cls2 = ev3Var2.Y;
                if (dh3.f(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iV0 = eu.v0(cls, interfaces);
                if (iV0 < 0) {
                    b61.p("No superclass of ", ev3Var2, " in Java reflection for ", qs0Var);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iV0];
                type.getClass();
                return type;
            default:
                f54 f54Var = (f54) obj3;
                return new se4((ve4) ((c6) f54Var.b.Y).f0, new c3(f54Var, (za6) obj2, (ea6) obj));
        }
    }
}
