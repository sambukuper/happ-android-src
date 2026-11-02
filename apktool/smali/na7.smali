.class public final Lna7;
.super Lcw0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;

.field public h0:Lt05;

.field public i0:Lt05;

.field public j0:Ln17;

.field public final k0:Lt16;

.field public final l0:Lo61;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lcw0;-><init>(B)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lt16;

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lna7;->k0:Lt16;

    .line 13
    .line 14
    new-instance v0, Lb1;

    .line 15
    .line 16
    const/16 v1, 0x15

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lkd7;->a:Lzx6;

    .line 22
    .line 23
    invoke-static {v1}, Lkd7;->b(Lgn2;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v1, Lkd7;->c:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    sget-object v2, Lkd7;->h:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v2, v0}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    sput-object v2, Lkd7;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit v1

    .line 38
    new-instance v1, Lo61;

    .line 39
    .line 40
    const/16 v2, 0x1a

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lna7;->l0:Lo61;

    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    monitor-exit v1

    .line 50
    throw p0
.end method


# virtual methods
.method public final B0(Ln17;)Lgn2;
    .locals 1

    .line 1
    iget-object v0, p0, Lna7;->j0:Ln17;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 13
    .line 14
    invoke-static {v0}, Lwr5;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p1, p0, Lna7;->j0:Ln17;

    .line 18
    .line 19
    iget-object p0, p0, Lna7;->k0:Lt16;

    .line 20
    .line 21
    return-object p0
.end method

.method public final C0(Ljp0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lna7;->j0:Ln17;

    .line 3
    .line 4
    iput-object p1, p0, Lna7;->g0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p1, p0, Lna7;->i0:Lt05;

    .line 7
    .line 8
    invoke-virtual {p0}, Lna7;->p0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g0(Ln17;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lna7;->g0:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object p1, p0, Lna7;->i0:Lt05;

    .line 5
    .line 6
    return-void
.end method

.method public final p0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcw0;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lna7;->g0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v1, p0, Lna7;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lna7;->i0:Lt05;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lna7;->h0:Lt05;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Lna7;->h0:Lt05;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lvw6;->a:Lt05;

    .line 23
    .line 24
    new-instance v1, Lt05;

    .line 25
    .line 26
    invoke-direct {v1}, Lt05;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lna7;->h0:Lt05;

    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lna7;->i0:Lt05;

    .line 32
    .line 33
    iput-object v2, p0, Lna7;->h0:Lt05;

    .line 34
    .line 35
    iput-object v1, p0, Lna7;->i0:Lt05;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0

    .line 40
    throw p0
.end method

.method public final r0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lna7;->l0:Lo61;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo61;->h()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lna7;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lna7;->i0:Lt05;

    .line 10
    .line 11
    iget-object v1, p0, Lcw0;->X:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iput-object v0, p0, Lna7;->j0:Ln17;

    .line 15
    .line 16
    iput-object v0, p0, Lna7;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v0, p0, Lna7;->h0:Lt05;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v1

    .line 24
    throw p0
.end method
