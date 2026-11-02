.class public final Lnf1;
.super Ls52;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final f0:Lnf1;


# instance fields
.field public Z:La71;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnf1;

    .line 2
    .line 3
    sget v5, Lh28;->c:I

    .line 4
    .line 5
    sget v6, Lh28;->d:I

    .line 6
    .line 7
    sget-wide v2, Lh28;->e:J

    .line 8
    .line 9
    sget-object v4, Lh28;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lu61;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, La71;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, La71;-><init>(JLjava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lnf1;->Z:La71;

    .line 20
    .line 21
    sput-object v0, Lnf1;->f0:Lnf1;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final Z0(Ls61;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnf1;->Z:La71;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-static {p0, p2, p1}, La71;->m(La71;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final a1(Ls61;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnf1;->Z:La71;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-static {p0, p2, p1}, La71;->m(La71;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c1(I)Lu61;
    .locals 1

    .line 1
    invoke-static {p1}, Lz51;->r(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lh28;->c:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lu61;->c1(I)Lu61;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final d1()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnf1;->Z:La71;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method
