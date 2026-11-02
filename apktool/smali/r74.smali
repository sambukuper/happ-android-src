.class public final Lr74;
.super Log7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lq51;


# direct methods
.method public constructor <init>(Ls61;Lrn2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Le1;-><init>(Ls61;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, Lmb6;->w(Lq51;Lq51;Lrn2;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lr74;->g0:Lq51;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final e0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr74;->g0:Lq51;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lmb6;->H(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lop1;->a(Lq51;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    instance-of v1, v0, Lmp1;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Lmp1;

    .line 19
    .line 20
    iget-object v0, v0, Lmp1;->X:Ljava/lang/Throwable;

    .line 21
    .line 22
    :cond_0
    new-instance v1, Lrj6;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Le1;->f(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method
