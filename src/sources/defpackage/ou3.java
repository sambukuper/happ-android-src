package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ou3 extends s92 {
    public static ArrayList g(oi5 oi5Var, boolean z) {
        File file = oi5Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (!file.exists()) {
                throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
            }
            u52.s(oi0.i(oi5Var, "failed to list "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(oi5Var.f(str));
        }
        aw0.b0(arrayList);
        return arrayList;
    }

    @Override // defpackage.s92
    public void createDirectory(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        if (oi5Var.toFile().mkdir()) {
            return;
        }
        i92 i92VarMetadataOrNull = metadataOrNull(oi5Var);
        if (i92VarMetadataOrNull == null || !i92VarMetadataOrNull.b) {
            u52.s(oi0.i(oi5Var, "failed to create directory: "));
        } else if (z) {
            u52.i(oi5Var, " already exists.");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
