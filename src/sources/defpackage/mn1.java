package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.Iterator;
import su.happ.proxyutility.dto.enums.EConfigObservatoryType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mn1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ String[] X;
    public final /* synthetic */ nn1 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mn1(String[] strArr, nn1 nn1Var) {
        this.X = strArr;
        this.Y = nn1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object next;
        if (i >= 0) {
            String[] strArr = this.X;
            if (i < strArr.length) {
                EConfigObservatoryType.Companion companion = EConfigObservatoryType.INSTANCE;
                String str = strArr[i];
                str.getClass();
                companion.getClass();
                Iterator it = EConfigObservatoryType.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!dh3.f(((EConfigObservatoryType) next).getCoreValue(), str));
                EConfigObservatoryType eConfigObservatoryType = (EConfigObservatoryType) next;
                if (eConfigObservatoryType == null) {
                    eConfigObservatoryType = EConfigObservatoryType.LEAST_PING;
                }
                this.Y.F1 = eConfigObservatoryType;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
