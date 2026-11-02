package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aa7 extends mo8 implements da7, ah8 {
    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", wk1.e.o((gm) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(n0());
        if (!l0().isEmpty()) {
            wv0.x0(l0(), sb, ", ", "<", ">", null, 112);
        }
        if (o0()) {
            sb.append("?");
        }
        return sb.toString();
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public abstract aa7 r0(boolean z);

    public aa7 v0(ch8 ch8Var) {
        ch8Var.getClass();
        return this;
    }
}
