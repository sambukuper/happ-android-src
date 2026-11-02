package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uh1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((vh1) obj3).X.submit(new sc((Callable) obj2, (wl6) obj, (byte) 20));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((fv5) obj3).e;
                p49 p49VarY = workDatabase.y();
                p49VarY.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) u15.G(p49VarY.a, true, false, new nm7(str, (byte) 18)));
                return workDatabase.x().c(str);
        }
    }
}
