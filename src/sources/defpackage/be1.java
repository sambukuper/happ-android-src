package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 extends ce1 {
    public final Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(l37 l37Var, al alVar) {
        super(l37Var, null);
        String[] strArr = null;
        Class cls = alVar.C0;
        RuntimeException runtimeException = aj3.e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        aj3 aj3Var = aj3.d;
        Object[] objArrA = aj3Var.a(cls);
        if (objArrA != null) {
            String[] strArr2 = new String[objArrA.length];
            for (int i = 0; i < objArrA.length; i++) {
                try {
                    strArr2[i] = (String) aj3Var.b.invoke(objArrA[i], null);
                } catch (Exception e) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrA.length), it0.u(cls)), e);
                }
            }
            strArr = strArr2;
        }
        this.d = strArr == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(strArr));
    }

    @Override // defpackage.ce1
    public final String c(hl hlVar, String str) {
        return this.d.contains(str) ? str : super.c(hlVar, str);
    }
}
