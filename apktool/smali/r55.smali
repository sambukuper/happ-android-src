.class public final Lr55;
.super Lf1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbm3;


# static fields
.field public static final Y:Lr55;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr55;

    .line 2
    .line 3
    sget-object v1, Loy1;->E0:Loy1;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf1;-><init>(Lr61;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr55;->Y:Lr55;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final C(Lrm3;)Lir0;
    .locals 0

    .line 1
    sget-object p0, Lt55;->X:Lt55;

    .line 2
    .line 3
    return-object p0
.end method

.method public final C0()Ly45;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final D(Lgn2;)Lgq1;
    .locals 0

    .line 1
    sget-object p0, Lt55;->X:Lt55;

    .line 2
    .line 3
    return-object p0
.end method

.method public final R()Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final V0(Ls51;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final Y(ZZLd0;)Lgq1;
    .locals 0

    .line 1
    sget-object p0, Lt55;->X:Lt55;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Lu27;
    .locals 0

    .line 1
    sget-object p0, Ll02;->a:Ll02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isCancelled()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final m(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method
