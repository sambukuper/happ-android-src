.class public final Lrp0;
.super Lmp0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lsn2;


# direct methods
.method public constructor <init>(Lsn2;Lxe2;Ls61;ILl90;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p5, p3, p2}, Lmp0;-><init>(ILl90;Ls61;Lxe2;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrp0;->g0:Lsn2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f(Ls61;ILl90;)Lkp0;
    .locals 6

    .line 1
    new-instance v0, Lrp0;

    .line 2
    .line 3
    iget-object v1, p0, Lrp0;->g0:Lsn2;

    .line 4
    .line 5
    iget-object v2, p0, Lmp0;->f0:Lxe2;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Lrp0;-><init>(Lsn2;Lxe2;Ls61;ILl90;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final i(Lze2;Lq51;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lop0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lop0;-><init>(Lrp0;Lze2;Lq51;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lc71;->X:Lc71;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 17
    .line 18
    return-object p0
.end method
