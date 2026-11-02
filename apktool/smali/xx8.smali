.class public final Lxx8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lre6;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final X:Lv76;

.field public final Y:Lv63;

.field public final Z:Llq2;

.field public final f0:Lg94;

.field public final g0:Lbm3;


# direct methods
.method public constructor <init>(Lv76;Lv63;Llq2;Lg94;Lbm3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxx8;->X:Lv76;

    .line 5
    .line 6
    iput-object p2, p0, Lxx8;->Y:Lv63;

    .line 7
    .line 8
    iput-object p3, p0, Lxx8;->Z:Llq2;

    .line 9
    .line 10
    iput-object p4, p0, Lxx8;->f0:Lg94;

    .line 11
    .line 12
    iput-object p5, p0, Lxx8;->g0:Lbm3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lu76;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxx8;->f0:Lg94;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, Lw51;->k(Lg94;Ls51;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 11
    .line 12
    return-object p0
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxx8;->Z:Llq2;

    .line 2
    .line 3
    invoke-virtual {v0}, Llq2;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Llq2;->getView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lbs7;->d(Landroid/view/View;)Lyx8;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, v0, Lyx8;->Z:Lxx8;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v2, v1, Lxx8;->f0:Lg94;

    .line 27
    .line 28
    iget-object v3, v1, Lxx8;->g0:Lbm3;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-interface {v3, v4}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Lxx8;->Z:Llq2;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Lg94;->f(Lc94;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lg94;->f(Lc94;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iput-object p0, v0, Lyx8;->Z:Lxx8;

    .line 49
    .line 50
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 51
    .line 52
    const-string v0, "\'ViewTarget.view\' must be attached to a window."

    .line 53
    .line 54
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0
.end method

.method public final onDestroy(Ld94;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lxx8;->Z:Llq2;

    .line 2
    .line 3
    invoke-virtual {p0}, Llq2;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lbs7;->d(Landroid/view/View;)Lyx8;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget-object p1, p0, Lyx8;->Y:Log7;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    sget-object p1, Lcs2;->X:Lcs2;

    .line 24
    .line 25
    sget-object v1, Ltp1;->a:Lnf1;

    .line 26
    .line 27
    sget-object v1, Ldm4;->a:Lhv2;

    .line 28
    .line 29
    iget-object v1, v1, Lhv2;->h0:Lhv2;

    .line 30
    .line 31
    new-instance v2, Ll40;

    .line 32
    .line 33
    const/16 v3, 0x13

    .line 34
    .line 35
    invoke-direct {v2, p0, v0, v3}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-static {p1, v1, v0, v2, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lyx8;->Y:Log7;

    .line 44
    .line 45
    iput-object v0, p0, Lyx8;->X:Ln97;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p1
.end method

.method public final start()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxx8;->f0:Lg94;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lg94;->a(Lc94;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v1, p0, Lxx8;->Z:Llq2;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lg94;->f(Lc94;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lg94;->a(Lc94;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {v1}, Llq2;->getView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lbs7;->d(Landroid/view/View;)Lyx8;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, v0, Lyx8;->Z:Lxx8;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget-object v2, v1, Lxx8;->f0:Lg94;

    .line 33
    .line 34
    iget-object v3, v1, Lxx8;->g0:Lbm3;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-interface {v3, v4}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v1, Lxx8;->Z:Llq2;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lg94;->f(Lc94;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Lg94;->f(Lc94;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iput-object p0, v0, Lyx8;->Z:Lxx8;

    .line 55
    .line 56
    return-void
.end method
