.class public final Lwq8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqq8;


# static fields
.field public static final l:Lux0;

.field public static final m:Lux0;


# instance fields
.field public final a:Lv06;

.field public final b:Lv06;

.field public final c:Ljr8;

.field public final d:Lv06;

.field public final e:Lpr8;

.field public final f:Lbm0;

.field public volatile g:Z

.field public final h:Lvz7;

.field public final i:Lvz7;

.field public final j:Lvz7;

.field public final k:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ltj6;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Ltj6;-><init>(ILee;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lvr3;->a(Ljava/lang/Object;)Lux0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lwq8;->l:Lux0;

    .line 13
    .line 14
    new-instance v0, Lux0;

    .line 15
    .line 16
    invoke-direct {v0}, Lux0;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lwq8;->m:Lux0;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lv06;Lv06;Ljr8;Lv06;Lpr8;Lbm0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lwq8;->a:Lv06;

    .line 20
    .line 21
    iput-object p2, p0, Lwq8;->b:Lv06;

    .line 22
    .line 23
    iput-object p3, p0, Lwq8;->c:Ljr8;

    .line 24
    .line 25
    iput-object p4, p0, Lwq8;->d:Lv06;

    .line 26
    .line 27
    iput-object p5, p0, Lwq8;->e:Lpr8;

    .line 28
    .line 29
    iput-object p6, p0, Lwq8;->f:Lbm0;

    .line 30
    .line 31
    const-string p1, "CXCP"

    .line 32
    .line 33
    invoke-static {p1}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    new-instance p1, Lrq8;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-direct {p1, p0, p2}, Lrq8;-><init>(Lwq8;B)V

    .line 40
    .line 41
    .line 42
    new-instance p2, Lvz7;

    .line 43
    .line 44
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lwq8;->h:Lvz7;

    .line 48
    .line 49
    new-instance p1, Lrq8;

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    invoke-direct {p1, p0, p2}, Lrq8;-><init>(Lwq8;B)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lvz7;

    .line 56
    .line 57
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lwq8;->i:Lvz7;

    .line 61
    .line 62
    new-instance p1, Lrq8;

    .line 63
    .line 64
    const/4 p2, 0x2

    .line 65
    invoke-direct {p1, p0, p2}, Lrq8;-><init>(Lwq8;B)V

    .line 66
    .line 67
    .line 68
    new-instance p2, Lvz7;

    .line 69
    .line 70
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lwq8;->j:Lvz7;

    .line 74
    .line 75
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    return-void
.end method

.method public static j(Ljava/util/LinkedHashMap;)Lsq8;
    .locals 5

    .line 1
    new-instance v0, Lsq8;

    .line 2
    .line 3
    new-instance v1, Lwe6;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Lwe6;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x7

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v3, v3, v1, v2}, Lsq8;-><init>(Lfg0;Ljava/util/LinkedHashMap;Lwe6;I)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lpq8;->g0:Ln22;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v2, Lw1;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, v1, v3}, Lw1;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v2}, Lw1;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Lw1;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lpq8;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lsq8;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    iget-object v3, v1, Lsq8;->a:Lfg0;

    .line 46
    .line 47
    iget-object v3, v3, Lfg0;->Y:Lk05;

    .line 48
    .line 49
    iget-object v4, v0, Lsq8;->a:Lfg0;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Lfg0;->c(Ll11;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v0, Lsq8;->b:Ljava/util/Map;

    .line 55
    .line 56
    iget-object v4, v1, Lsq8;->b:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v1, Lsq8;->c:Ljava/util/Set;

    .line 62
    .line 63
    check-cast v3, Ljava/util/Collection;

    .line 64
    .line 65
    iget-object v4, v0, Lsq8;->c:Ljava/util/Set;

    .line 66
    .line 67
    invoke-interface {v4, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    iget-object v1, v1, Lsq8;->d:Lwe6;

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    iput-object v1, v0, Lsq8;->d:Lwe6;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a()Lxg1;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lrf0;

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-direct {v0, p0, v1, v2}, Lrf0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lwq8;->k(Lgn2;)Lux0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object p0, Lwq8;->l:Lux0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v1
.end method

.method public final b(Luy7;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lwq8;->i:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lor8;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Lor8;->a(Lor8;Ls51;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final c(Lgg0;Ljava/util/Map;)Lxg1;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lga;

    .line 7
    .line 8
    const/4 v6, 0x3

    .line 9
    move-object v2, p0

    .line 10
    move-object v3, p1

    .line 11
    move-object v4, p2

    .line 12
    invoke-direct/range {v1 .. v6}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lwq8;->k(Lgn2;)Lux0;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    :cond_0
    if-nez v5, :cond_1

    .line 20
    .line 21
    sget-object p0, Lwq8;->m:Lux0;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    return-object v5
.end method

.method public final close()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lwq8;->g:Z

    .line 3
    .line 4
    const-string v0, "CXCP"

    .line 5
    .line 6
    invoke-static {v0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lwq8;->j:Lvz7;

    .line 10
    .line 11
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lbr8;

    .line 16
    .line 17
    iget-object v0, p0, Lbr8;->c:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    iget-boolean v1, p0, Lbr8;->g:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-boolean v1, p0, Lbr8;->g:Z

    .line 26
    .line 27
    iget-object v1, p0, Lbr8;->d:Lux0;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 32
    .line 33
    const-string v3, "UseCaseCameraState closed"

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 45
    iput-object v1, p0, Lbr8;->d:Lux0;

    .line 46
    .line 47
    :cond_1
    :goto_1
    iget-object v1, p0, Lbr8;->f:Lkt;

    .line 48
    .line 49
    invoke-virtual {v1}, Lkt;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Lbr8;->f:Lkt;

    .line 56
    .line 57
    invoke-virtual {v1}, Lkt;->removeFirst()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lyq8;

    .line 62
    .line 63
    iget-object v1, v1, Lyq8;->b:Lux0;

    .line 64
    .line 65
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 66
    .line 67
    const-string v3, "UseCaseCameraState closed"

    .line 68
    .line 69
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lbr8;->q:Lqv;

    .line 76
    .line 77
    invoke-virtual {v1}, Lqv;->a()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    monitor-exit v0

    .line 82
    return-void

    .line 83
    :goto_2
    monitor-exit v0

    .line 84
    throw p0
.end method

.method public final d(I)Lxg1;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ltq8;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, v1}, Ltq8;-><init>(Lwq8;ILq51;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lwq8;->k(Lgn2;)Lux0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    sget-object p0, Lwq8;->l:Lux0;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    return-object v1
.end method

.method public final e(Ljava/util/List;)Lxg1;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lda;

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-direct {v0, p0, p1, v1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lwq8;->k(Lgn2;)Lux0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object p0, Lwq8;->m:Lux0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v1
.end method

.method public final f(Ljava/util/LinkedHashSet;Z)Lxg1;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lvq8;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p0, v1}, Lvq8;-><init>(Ljava/util/LinkedHashSet;ZLwq8;Lq51;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lwq8;->k(Lgn2;)Lux0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    sget-object p0, Lwq8;->m:Lux0;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    return-object v1
.end method

.method public final g(Ljava/util/Map;Lpq8;Lk11;)Lxg1;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lwq8;->m:Lux0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Lwq8;->e:Lpr8;

    .line 15
    .line 16
    iget-object v0, v0, Lpr8;->d:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lwq8;->e:Lpr8;

    .line 32
    .line 33
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 34
    .line 35
    new-instance v2, Lwu1;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/16 v8, 0xc

    .line 39
    .line 40
    move-object v3, p0

    .line 41
    move-object v5, p1

    .line 42
    move-object v4, p2

    .line 43
    move-object v6, p3

    .line 44
    invoke-direct/range {v2 .. v8}, Lwu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    invoke-static {v0, v1, v2, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: "

    .line 62
    .line 63
    invoke-static {p0, p1}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1
.end method

.method public final h(Ljava/util/Map;Lk11;)Lxg1;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lga;

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    move-object v4, p2

    .line 15
    invoke-direct/range {v1 .. v6}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1}, Lwq8;->k(Lgn2;)Lux0;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    :cond_0
    if-nez v5, :cond_1

    .line 23
    .line 24
    sget-object p0, Lwq8;->m:Lux0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    return-object v5
.end method

.method public final i()Lxg1;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwq8;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcb1;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v0, p0, v1, v2}, Lcb1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lwq8;->k(Lgn2;)Lux0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object p0, Lwq8;->l:Lux0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v1
.end method

.method public final k(Lgn2;)Lux0;
    .locals 5

    .line 1
    iget-object p0, p0, Lwq8;->e:Lpr8;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpr8;->d:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Le71;->f0:Le71;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, Le71;->X:Le71;

    .line 24
    .line 25
    :goto_0
    new-instance v1, Lux0;

    .line 26
    .line 27
    invoke-direct {v1}, Lux0;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lpr8;->f:Lm51;

    .line 31
    .line 32
    new-instance v2, Lt17;

    .line 33
    .line 34
    const/16 v3, 0x13

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v2, p1, v1, v4, v3}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    invoke-static {p0, v4, v0, v2, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 42
    .line 43
    .line 44
    return-object v1
.end method

.method public final l(Lpq8;Ljava/util/Map;Lk11;Luy7;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "CXCP"

    .line 2
    .line 3
    invoke-static {v0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    new-instance v1, Lsq8;

    .line 28
    .line 29
    const/16 v3, 0xf

    .line 30
    .line 31
    invoke-direct {v1, v2, v2, v2, v3}, Lsq8;-><init>(Lfg0;Ljava/util/LinkedHashMap;Lwe6;I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    check-cast v1, Lsq8;

    .line 38
    .line 39
    new-instance v3, Lfg0;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v3, v4}, Lfg0;-><init>(B)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v1, Lsq8;->a:Lfg0;

    .line 46
    .line 47
    iget-object v4, v4, Lfg0;->Y:Lk05;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Lfg0;->c(Ll11;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v5}, Lw45;->B(Landroid/hardware/camera2/CaptureRequest$Key;)Lzx;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iget-object v6, v3, Lfg0;->Y:Lk05;

    .line 90
    .line 91
    invoke-virtual {v6, v5, p3, v4}, Lk05;->l(Lzx;Lk11;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-object p2, v1, Lsq8;->b:Ljava/util/Map;

    .line 96
    .line 97
    invoke-static {p2}, Lzp4;->S(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iget-object p3, v1, Lsq8;->c:Ljava/util/Set;

    .line 102
    .line 103
    check-cast p3, Ljava/lang/Iterable;

    .line 104
    .line 105
    invoke-static {p3}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    iget-object v1, v1, Lsq8;->d:Lwe6;

    .line 110
    .line 111
    new-instance v4, Lsq8;

    .line 112
    .line 113
    invoke-direct {v4, v3, p2, p3, v1}, Lsq8;-><init>(Lfg0;Ljava/util/Map;Ljava/util/Set;Lwe6;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lwq8;->j(Ljava/util/LinkedHashMap;)Lsq8;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p0, p1, v2, p4}, Lwq8;->m(Lsq8;Ljava/util/LinkedHashSet;Ls51;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method

.method public final m(Lsq8;Ljava/util/LinkedHashSet;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Luq8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Luq8;

    .line 7
    .line 8
    iget v1, v0, Luq8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luq8;->h0:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Luq8;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Luq8;-><init>(Lwq8;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v7, Luq8;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lc71;->X:Lc71;

    .line 30
    .line 31
    iget v1, v7, Luq8;->h0:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-boolean p3, p0, Lwq8;->g:Z

    .line 54
    .line 55
    if-nez p3, :cond_7

    .line 56
    .line 57
    iget-object p3, p0, Lwq8;->f:Lbm0;

    .line 58
    .line 59
    sget-object v1, Lpf0;->a:Lzx;

    .line 60
    .line 61
    iget-object p3, p3, Lbm0;->X:Lqd5;

    .line 62
    .line 63
    sget-object v1, Lpf0;->a:Lzx;

    .line 64
    .line 65
    invoke-virtual {p3, v1, v2}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    if-nez p3, :cond_6

    .line 70
    .line 71
    iget-object p3, p0, Lwq8;->h:Lvz7;

    .line 72
    .line 73
    invoke-virtual {p3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Len0;

    .line 78
    .line 79
    iget-object v1, p1, Lsq8;->d:Lwe6;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget v1, v1, Lwe6;->a:I

    .line 85
    .line 86
    const/4 v2, -0x1

    .line 87
    if-eq v1, v2, :cond_3

    .line 88
    .line 89
    iget-object v1, p1, Lsq8;->d:Lwe6;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget v1, v1, Lwe6;->a:I

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move v1, v3

    .line 98
    :goto_2
    invoke-interface {p3, v1}, Len0;->a(I)V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, Lwq8;->j:Lvz7;

    .line 102
    .line 103
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    move-object v1, p0

    .line 108
    check-cast v1, Lbr8;

    .line 109
    .line 110
    iget-object p0, p1, Lsq8;->a:Lfg0;

    .line 111
    .line 112
    invoke-virtual {p0}, Lfg0;->a()Lgg0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Lw45;->V(Ll11;)Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object p0, Le18;->a:Lxu4;

    .line 121
    .line 122
    invoke-static {}, La15;->a()La15;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    iget-object v4, p1, Lsq8;->b:Ljava/util/Map;

    .line 127
    .line 128
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_4

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Ljava/util/Map$Entry;

    .line 147
    .line 148
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    iget-object v8, p3, Ld18;->a:Landroid/util/ArrayMap;

    .line 159
    .line 160
    invoke-virtual {v8, v6, v5}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_4
    invoke-static {p0, p3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v5, p1, Lsq8;->d:Lwe6;

    .line 172
    .line 173
    iget-object v6, p1, Lsq8;->c:Ljava/util/Set;

    .line 174
    .line 175
    iput v3, v7, Luq8;->h0:I

    .line 176
    .line 177
    move-object v3, p0

    .line 178
    move-object v4, p2

    .line 179
    invoke-virtual/range {v1 .. v7}, Lbr8;->c(Ljava/util/LinkedHashMap;Ljava/util/Map;Ljava/util/Set;Lwe6;Ljava/util/Set;Ls51;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    if-ne p3, v0, :cond_5

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_5
    :goto_4
    move-object v2, p3

    .line 187
    check-cast v2, Lxg1;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_6
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 191
    .line 192
    .line 193
    return-object v2

    .line 194
    :cond_7
    :goto_5
    if-nez v2, :cond_8

    .line 195
    .line 196
    sget-object p0, Lwq8;->m:Lux0;

    .line 197
    .line 198
    return-object p0

    .line 199
    :cond_8
    return-object v2
.end method
