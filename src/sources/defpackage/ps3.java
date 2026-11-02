package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ps3 implements dn2 {
    public final /* synthetic */ byte X;
    public final wx4 Y;

    public /* synthetic */ ps3(wx4 wx4Var, byte b) {
        this.X = b;
        this.Y = wx4Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        wx4 wx4Var = this.Y;
        switch (b) {
            case 0:
                return new qs3(wx4Var);
            case 1:
                ux4 ux4Var = wx4Var.k0;
                if (ux4Var == null) {
                    String str = wx4Var.getName().X;
                    str.getClass();
                    xw3.l("Dependencies of module ", str, " were not set before querying module content");
                    return null;
                }
                List list = ux4Var.a;
                wx4Var.G0();
                list.contains(wx4Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((wx4) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    wf5 wf5Var = ((wx4) it2.next()).l0;
                    wf5Var.getClass();
                    arrayList.add(wf5Var);
                }
                return new j01(arrayList, "CompositeProvider@ModuleDescriptor for " + wx4Var.getName());
            default:
                return wx4Var.b0(ug7.i).k0;
        }
    }
}
