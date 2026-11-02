package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t45 extends v45 {
    public final FileSystem X;

    public t45(FileSystem fileSystem) {
        this.X = fileSystem;
    }

    @Override // defpackage.s92
    public final sa7 appendingSink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        gb4 gb4VarR = i21.r();
        gb4VarR.add(StandardOpenOption.APPEND);
        if (!z) {
            gb4VarR.add(StandardOpenOption.CREATE);
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        Path pathU = u(oi5Var);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) gb4VarJ.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathU, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        outputStreamNewOutputStream.getClass();
        return new lv(outputStreamNewOutputStream, new ta8(), (byte) 1);
    }

    @Override // defpackage.v45, defpackage.s92
    public final void atomicMove(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        try {
            Files.move(u(oi5Var), u(oi5Var2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)).getClass();
        } catch (UnsupportedOperationException unused) {
            u52.s("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.s92
    public final oi5 canonicalize(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        try {
            String str = oi5.Y;
            Path realPath = u(oi5Var).toRealPath(new LinkOption[0]);
            realPath.getClass();
            return g55.t(realPath);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
        }
    }

    @Override // defpackage.s92, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // defpackage.ou3, defpackage.s92
    public final void createDirectory(oi5 oi5Var, boolean z) throws IOException {
        boolean z2;
        oi5Var.getClass();
        i92 i92VarK = v45.k(u(oi5Var));
        if (i92VarK != null) {
            z2 = i92VarK.b;
        }
        if (z2 && z) {
            u52.i(oi5Var, " already exists.");
            return;
        }
        try {
            Files.createDirectory(u(oi5Var), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
        } catch (IOException e) {
            if (!z2) {
                throw new IOException(oi0.i(oi5Var, "failed to create directory: "), e);
            }
        }
    }

    @Override // defpackage.v45, defpackage.s92
    public final void createSymlink(oi5 oi5Var, oi5 oi5Var2) {
        oi5Var.getClass();
        oi5Var2.getClass();
        Files.createSymbolicLink(u(oi5Var), u(oi5Var2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
    }

    @Override // defpackage.s92
    public final void delete(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathU = u(oi5Var);
        try {
            Files.delete(pathU);
        } catch (NoSuchFileException unused) {
            if (z) {
                throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(pathU, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                u52.s(oi0.i(oi5Var, "failed to delete "));
            }
        }
    }

    @Override // defpackage.s92
    public final List list(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        ArrayList arrayListP = p(oi5Var, true);
        arrayListP.getClass();
        return arrayListP;
    }

    @Override // defpackage.s92
    public final List listOrNull(oi5 oi5Var) {
        oi5Var.getClass();
        return p(oi5Var, false);
    }

    @Override // defpackage.v45, defpackage.s92
    public final i92 metadataOrNull(oi5 oi5Var) {
        oi5Var.getClass();
        return v45.k(u(oi5Var));
    }

    @Override // defpackage.s92
    public final g92 openReadOnly(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        try {
            FileChannel fileChannelOpen = FileChannel.open(u(oi5Var), StandardOpenOption.READ);
            fileChannelOpen.getClass();
            return new ct3(fileChannelOpen, (byte) 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
        }
    }

    @Override // defpackage.s92
    public final g92 openReadWrite(oi5 oi5Var, boolean z, boolean z2) throws IOException {
        oi5Var.getClass();
        if (z && z2) {
            bt.q("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        gb4 gb4VarR = i21.r();
        gb4VarR.add(StandardOpenOption.READ);
        gb4VarR.add(StandardOpenOption.WRITE);
        if (z) {
            gb4VarR.add(StandardOpenOption.CREATE_NEW);
        } else if (!z2) {
            gb4VarR.add(StandardOpenOption.CREATE);
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        try {
            Path pathU = u(oi5Var);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) gb4VarJ.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathU, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            fileChannelOpen.getClass();
            return new ct3(fileChannelOpen, (byte) 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
        }
    }

    public final ArrayList p(oi5 oi5Var, boolean z) throws IOException {
        Path pathU = u(oi5Var);
        try {
            DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(pathU, "*");
            try {
                directoryStreamNewDirectoryStream.getClass();
                List<Path> listY0 = wv0.Y0(directoryStreamNewDirectoryStream);
                directoryStreamNewDirectoryStream.close();
                ArrayList arrayList = new ArrayList();
                for (Path path : listY0) {
                    String str = oi5.Y;
                    arrayList.add(g55.t(path));
                }
                aw0.b0(arrayList);
                return arrayList;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(directoryStreamNewDirectoryStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (!Files.exists(pathU, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
            }
            u52.s(oi0.i(oi5Var, "failed to list "));
            return null;
        }
    }

    @Override // defpackage.s92
    public final sa7 sink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        gb4 gb4VarR = i21.r();
        if (z) {
            gb4VarR.add(StandardOpenOption.CREATE_NEW);
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        try {
            Path pathU = u(oi5Var);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) gb4VarJ.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathU, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            outputStreamNewOutputStream.getClass();
            return new lv(outputStreamNewOutputStream, new ta8(), (byte) 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
        }
    }

    @Override // defpackage.s92
    public final je7 source(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(u(oi5Var), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            inputStreamNewInputStream.getClass();
            return dh3.Q(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
        }
    }

    @Override // defpackage.v45, defpackage.ou3
    public final String toString() {
        String strE = yb6.a.b(this.X.getClass()).E();
        strE.getClass();
        return strE;
    }

    public final Path u(oi5 oi5Var) {
        Path path = this.X.getPath(oi5Var.X.t(), new String[0]);
        path.getClass();
        return path;
    }
}
