package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lwm1;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wm1 extends RuntimeException {
    public final rz0 X;

    public wm1(rz0 rz0Var) {
        this.X = rz0Var;
        if (rz0Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE};
        List list = rz0Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            tz0 tz0Var = (tz0) list.get(i);
            if (!eu.a0(iArr, tz0Var.a)) {
                if (tz0Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((tz0) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        bw0.k0(arrayList);
                    }
                } else {
                    arrayList.add(tz0Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", pc6.j(((tz0) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        rz0 rz0Var = this.X;
        if (!rz0Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        gb4 gb4VarR = i21.r();
        List list = rz0Var.a;
        list.getClass();
        dq4 dq4Var = new dq4(list);
        int iA = dq4Var.a();
        for (int i = 0; i < iA; i++) {
            ((tz0) dq4Var.get(i)).getClass();
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        gb4VarJ.getClass();
        dq4 dq4Var2 = new dq4(gb4VarJ);
        int iA2 = dq4Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) dq4Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
