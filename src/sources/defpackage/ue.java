package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ue implements mn0 {
    public final /* synthetic */ byte a;
    public final cl7 b;
    public final hi0 c;

    public ue(s98 s98Var, cl7 cl7Var, hi0 hi0Var, byte b) {
        this.a = b;
        s98Var.getClass();
        switch (b) {
            case 1:
                this.b = cl7Var;
                this.c = hi0Var;
                break;
            default:
                this.b = cl7Var;
                this.c = hi0Var;
                break;
        }
    }

    @Override // defpackage.mn0
    public final ln0 a(yh0 yh0Var, Map map, sn0 sn0Var) throws Exception {
        boolean zG;
        byte b = this.a;
        e02 e02Var = e02.X;
        cl7 cl7Var = this.b;
        hi0 hi0Var = this.c;
        switch (b) {
            case 0:
                oy1 oy1Var = oy1.k0;
                sn0Var.getClass();
                ArrayList arrayList = hi0Var.d;
                if (arrayList != null) {
                    ze5 ze5Var = (ze5) wv0.O0(((be3) wv0.O0(arrayList)).a.a);
                    InputConfiguration inputConfiguration = new InputConfiguration(ze5Var.a.getWidth(), ze5Var.a.getHeight(), ze5Var.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!yh0Var.u(inputConfiguration, arrayList2, sn0Var)) {
                        yh0Var.toString();
                        sn0Var.toString();
                        sn0Var.a();
                        return oy1Var;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!yh0Var.c0(arrayList3, sn0Var)) {
                        yh0Var.toString();
                        sn0Var.toString();
                        sn0Var.a();
                        return oy1Var;
                    }
                }
                return new kn0(e02Var, w51.m(map, cl7Var));
            default:
                oy1 oy1Var2 = oy1.k0;
                sn0Var.getClass();
                le5 le5VarL = w51.l(hi0Var, cl7Var, map);
                ArrayList arrayList4 = le5VarL.a;
                if (arrayList4.isEmpty()) {
                    Objects.toString(hi0Var);
                    sn0Var.a();
                    return oy1Var2;
                }
                ArrayList arrayList5 = hi0Var.d;
                if (arrayList5 == null) {
                    zG = yh0Var.k(arrayList4, sn0Var);
                } else {
                    ze5 ze5Var2 = (ze5) wv0.O0(((be3) wv0.O0(arrayList5)).a.a);
                    zG = yh0Var.g(new hd3(ze5Var2.a.getWidth(), ze5Var2.a.getHeight(), ze5Var2.b), arrayList4, sn0Var);
                }
                if (zG) {
                    return new kn0(e02Var, le5VarL.d);
                }
                yh0Var.toString();
                sn0Var.toString();
                sn0Var.a();
                return oy1Var2;
        }
    }
}
