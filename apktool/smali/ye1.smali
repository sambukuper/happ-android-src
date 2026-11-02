.class public final Lye1;
.super Ls52;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final Z:Lye1;

.field public static final f0:Lu61;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lye1;

    .line 2
    .line 3
    invoke-direct {v0}, Lu61;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lye1;->Z:Lye1;

    .line 7
    .line 8
    sget-object v0, Lln8;->Z:Lln8;

    .line 9
    .line 10
    sget v1, Lr08;->a:I

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    const/16 v2, 0xc

    .line 19
    .line 20
    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 21
    .line 22
    invoke-static {v1, v2, v3}, Ls08;->j(IILjava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lln8;->c1(I)Lu61;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lye1;->f0:Lu61;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final Z0(Ls61;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lye1;->f0:Lu61;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu61;->Z0(Ls61;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a1(Ls61;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lye1;->f0:Lu61;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu61;->a1(Ls61;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c1(I)Lu61;
    .locals 0

    .line 1
    sget-object p0, Lln8;->Z:Lln8;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lln8;->c1(I)Lu61;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot be invoked on Dispatchers.IO"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final d1()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lb02;->X:Lb02;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lye1;->Z0(Ls61;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method
