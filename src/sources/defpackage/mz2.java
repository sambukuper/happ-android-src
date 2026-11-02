package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz2 extends kb8 {
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz2(byte b) {
        super(lz2.class, (byte) 1);
        this.f0 = b;
        switch (b) {
            case 1:
                super(pj5.class, (byte) 1);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // defpackage.kb8
    public void q(Map.Entry entry, ro3 ro3Var) throws IOException {
        switch (this.f0) {
            case 1:
                if (!"aud".equals(entry.getKey())) {
                    super.q(entry, ro3Var);
                } else if (entry.getValue() instanceof String) {
                    ro3Var.U((String) entry.getKey());
                    ro3Var.c1((String) entry.getValue());
                } else {
                    ?? arrayList = new ArrayList();
                    if (entry.getValue() instanceof String[]) {
                        arrayList = Arrays.asList((String[]) entry.getValue());
                    } else if (entry.getValue() instanceof List) {
                        for (Object obj : (List) entry.getValue()) {
                            if (obj instanceof String) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                    if (arrayList.size() == 1) {
                        ro3Var.U((String) entry.getKey());
                        ro3Var.c1((String) arrayList.get(0));
                    } else if (arrayList.size() > 1) {
                        ro3Var.U((String) entry.getKey());
                        ro3Var.H0();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ro3Var.c1((String) it.next());
                        }
                        ro3Var.D();
                    }
                }
                break;
            default:
                super.q(entry, ro3Var);
                break;
        }
    }
}
