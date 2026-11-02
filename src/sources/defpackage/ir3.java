package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ir3 extends t1 {
    public final aq3 h0;
    public final e37 i0;
    public int j0;
    public boolean k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir3(vm3 vm3Var, aq3 aq3Var, String str, e37 e37Var) {
        super(vm3Var, str);
        vm3Var.getClass();
        this.h0 = aq3Var;
        this.i0 = e37Var;
    }

    @Override // defpackage.t1
    public ao3 F(String str) {
        str.getClass();
        return (ao3) zp4.H(T(), str);
    }

    @Override // defpackage.t1
    public String R(e37 e37Var, int i) {
        e37Var.getClass();
        vm3 vm3Var = this.Z;
        sp3.d(vm3Var, e37Var);
        String strF = e37Var.f(i);
        if (this.g0.f && !T().X.keySet().contains(strF)) {
            yr2 yr2Var = vm3Var.c;
            a23 a23Var = new a23((Object) e37Var, (Object) vm3Var, (byte) 1);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) yr2Var.Y;
            Map map = (Map) concurrentHashMap.get(e37Var);
            Object obj = null;
            be beVar = sp3.a;
            Object objInvoke = map != null ? map.get(beVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = a23Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(e37Var);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(e37Var, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(beVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : T().X.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // defpackage.t1
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public aq3 T() {
        return this.h0;
    }

    @Override // defpackage.f01
    public int e(e37 e37Var) {
        e37Var.getClass();
        while (this.j0 < e37Var.e()) {
            int i = this.j0;
            this.j0 = i + 1;
            String strS = S(e37Var, i);
            int i2 = this.j0 - 1;
            this.k0 = false;
            if (!T().containsKey(strS)) {
                boolean z = (this.Z.a.c || e37Var.j(i2) || !e37Var.h(i2).c()) ? false : true;
                this.k0 = z;
                if (z) {
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // defpackage.t1, defpackage.f01
    public void n(e37 e37Var) {
        Set setZ;
        e37Var.getClass();
        vm3 vm3Var = this.Z;
        if (sp3.c(vm3Var, e37Var) || (e37Var.r() instanceof qq5)) {
            return;
        }
        sp3.d(vm3Var, e37Var);
        if (this.g0.f) {
            Set setO = wl7.o(e37Var);
            Map map = (Map) ((ConcurrentHashMap) vm3Var.c.Y).get(e37Var);
            Object obj = map != null ? map.get(sp3.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = m02.X;
            }
            setZ = q57.Z(setO, setKeySet);
        } else {
            setZ = wl7.o(e37Var);
        }
        for (String str : T().X.keySet()) {
            if (!setZ.contains(str) && !dh3.f(str, this.f0)) {
                throw new vn3(ys0.t(-1, p61.l('\'', "Encountered an unknown key '", str), V(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", vm3Var.a.h ? ys0.J(T().toString(), -1).toString() : null));
            }
        }
    }

    @Override // defpackage.t1, defpackage.rd1
    public final f01 t(e37 e37Var) {
        e37Var.getClass();
        e37 e37Var2 = this.i0;
        if (e37Var != e37Var2) {
            return super.t(e37Var);
        }
        ao3 ao3VarG = G();
        String strA = e37Var2.a();
        boolean z = ao3VarG instanceof aq3;
        vm3 vm3Var = this.Z;
        if (z) {
            return new ir3(vm3Var, (aq3) ao3VarG, this.f0, e37Var2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        zb6 zb6Var = yb6.a;
        sb.append(zb6Var.b(aq3.class).E());
        sb.append(", but had ");
        sb.append(zb6Var.b(ao3VarG.getClass()).E());
        throw new vn3(ys0.t(-1, oi0.p(sb, " as the serialized body of ", strA), V(), null, vm3Var.a.h ? ys0.J(ao3VarG.toString(), -1).toString() : null));
    }

    @Override // defpackage.t1, defpackage.rd1
    public final boolean w() {
        return !this.k0 && super.w();
    }

    public /* synthetic */ ir3(vm3 vm3Var, aq3 aq3Var, String str, int i) {
        this(vm3Var, aq3Var, (i & 4) != 0 ? null : str, (e37) null);
    }
}
